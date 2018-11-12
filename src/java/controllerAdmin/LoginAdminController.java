/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Admin;
import bean.Mailer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Random;
import static model.AdminDAO.role;
import static model.AdminDAO.emailAdmin;
import static model.AdminDAO.imageAdmin;
import static modelDAO.StatisticalDAO.*;
import model.AdminDAO;
import modelDAO.StatisticalDAO;

/**
 *
 * @author Gia Hieu
 */
@Controller

public class LoginAdminController {

    @Autowired
    Mailer mailer;

    private String from = "giahieu0201@gmail.com";
    private String subject = "BAU'S GEAR | Order success";
    private String to;
    private String body;
    private String equalsCode;
    public static String userLogin;
    public String emailChangePassword;

    private static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static Random rnd = new Random();

    AdminDAO adminDAO = new AdminDAO();
    StatisticalDAO staDAO = new StatisticalDAO();

    //Tạo ra CODE bằng một chuỗi bất kỳ
    public void randomString() {
        StringBuilder sb = new StringBuilder(6);
        for (int i = 0; i <= 6; i++) {
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        }
        //Nội dung gửi mail + CODE được tạo ra
        equalsCode = sb.toString();
        body = "Your Privare Code: " + sb.toString() + " - Please enter CODE to reset your password !";
    }

    //Trả về trang Login
    @RequestMapping("LoginAdmin")
    public String loginAdminPage() {
        return "LoginAdmin/Login_Admin";
    }

    //Trả về trang ForgotPassword_Nhập Id
    @RequestMapping("btnForgotpassword")
    public String forgotPasswordPage() {
        return "LoginAdmin/ForgotPassword_Page1";
    }

    //Trả về trang Login_Admin sau khi gửi Password mới vào Email
    @RequestMapping(params = "btnReturn_Login")
    public String return_LoginPage() {
        return "LoginAdmin/Login_Admin";
    }

    //Kiểm tra Tài khoản và mật khẩu
    @RequestMapping(params = "btnLogin")
    public String checkLogin(ModelMap model, Admin admin, @RequestParam("txtUsername") String username,
            @RequestParam("txtPassword") String password) {
        boolean checkLg;
        admin.setUsernameAdmin(username);
        admin.setPasswordAdmin(password);
        //Kiểm tra Username và Password có trùng với dữ liệu có trong Database
        checkLg = adminDAO.checkLogin(admin);
        // Trả về True nếu có
        if (checkLg == true) {
            staDAO.countOrders();
            staDAO.countOrdersDay();
            staDAO.sumCustomer();
            staDAO.totalOrder();
            staDAO.countCanceled();
            staDAO.countDelivered();
            staDAO.countDelivering();
            staDAO.countProcessing();
            userLogin = admin.getUsernameAdmin();
            if (role == 1) {
                model.addAttribute("role", "Admin");
            } else {
                model.addAttribute("role", "Staff");
            }
            model.addAttribute("processing", processing);
            model.addAttribute("delivered", delivered);
            model.addAttribute("delivering", delivering);
            model.addAttribute("canceled", canceled);
            model.addAttribute("sumcus", customer);
            model.addAttribute("total", totalOrder);
            model.addAttribute("countorderonday", ordersOnDay);
            model.addAttribute("countorder", orders);
            model.addAttribute("image", imageAdmin);
            model.addAttribute("email", emailAdmin);
            model.addAttribute("username", userLogin);
            return "LoginAdmin/admin/Dashboard";
        }
        // Trả về False
        model.addAttribute("message", "Login fail - Please try again !");
        return "LoginAdmin/Login_Admin";
    }

    //Kiểm tra Email và gửi MÃ để đổi mật khẩu mới 
    @RequestMapping(params = "btnForgotpassword_Check_Email")
    public String checkEmailandUser(ModelMap model, Admin admin,
            @RequestParam("txtEmail") String toAdminInput) {
        //Lấy Email của ngưởi dùng nhập 
        to = toAdminInput;
        boolean checkEml;
        admin.setEmailAdmin(toAdminInput);
        checkEml = adminDAO.checkEmailAndUsernam(admin);
        //Trả về True nếu có dữ liệu
        if (checkEml == true) {
            emailChangePassword = admin.getEmailAdmin();
            // Hàm tạo ra chuỗi ngẫu nhiên 6 ký tự
            randomString();
            //Send Email về cho Admin với nội dung được gán sẵn
            mailer.send(from, to, subject, body);
            model.addAttribute("message", "Please check your Email to give Code");
            return "LoginAdmin/ForgotPassword_Page2";
        }
        //Trả về False
        model.addAttribute("message", "Please enter your Email you sign in");
        return "LoginAdmin/ForgotPassword_Page1";
    }

    //Kiểm tra mã CODE
    @RequestMapping(params = "btnCheckCode")
    public String checkCode(ModelMap model, @RequestParam("txtCode") String code) {
        if (code.isEmpty()) {
            // Code không được để trống
            model.addAttribute("message", "Please enter your code !");
            return "ForgotPassword_Page2";
        } else if (code.equals(equalsCode)) {
            //Code trùng với code hệ thống
            //Phân biệt hoa thường
            return "LoginAdmin/ForgotPassword_Page3";
        }
        // Code không trùng hoặc nhập không đủ ký tự
        model.addAttribute("message", "Code isn't correct - Please try again !");
        return "LoginAdmin/ForgotPassword_Page2";

    }

    //Gửi lại CODE mới
    @RequestMapping("btnReSendCode")
    public String sendCodeAgain(ModelMap model) {
        //Tạo ra chuỗi ngẫu nhiên 6 ký tự
        randomString();
        //Send mail với người nhận cũ
        mailer.send(from, to, subject, body);
        model.addAttribute("message", "New code has sent - Please check your email");
        return "LoginAdmin/ForgotPassword_Page2";
    }

    //Đổi mật khẩu 
    @RequestMapping(params = "btnChangePassword")
    public String changeNewPassword(ModelMap model, Admin admin,
            @RequestParam("txtPassword") String password,
            @RequestParam("txtConfirmPassword") String confirmPassword) {
        //Kiểm tra Mật khẩu và mật khẩu nhập lại trùng nhau
        if (password.equals(confirmPassword)) {
            //Thực hiện lệnh đổi password
            admin.setPasswordAdmin(password);
            admin.setEmailAdmin(emailChangePassword);
            adminDAO.updatePasswordAdmin(admin);
            //Đổi mật khẩu thành công
            model.addAttribute("message", "New Password has been update!");
            return "LoginAdmin/ForgotPassword_Page4";
        }
        model.addAttribute("message", "Password and Password Confirm is not correct - Try again !");
        return "LoginAdmin/ForgotPassword_Page3";
    }

    //Đăng xuất tài khoản
    @RequestMapping("btnLogout.htm")
    public String logoutAdmin() {
        return "LoginAdmin/Login_Admin";
    }

}
