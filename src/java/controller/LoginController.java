/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.CustomerDAO;
import DAO.ProductsDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import model.Customer;
import bean.Mailer;
import model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Huynh Phuong Duy
 */
@Controller
@RequestMapping("/product/")
public class LoginController {
    
    @Autowired
    Mailer mailer;

    private String from = "giahieu0201@gmail.com";
    private String subject = "BAU'S GEAR | CHANGE PASSWORD";
    private String to;
    private String body;
    private String equalsCode;
    public static String userLogin;
    public String emailChangePassword;

    CustomerDAO customerDAO = new CustomerDAO();
    ProductsDAO prDAO = new ProductsDAO();

    
    
    @RequestMapping("registerCus")
    public String Register() {
        return "user/register";
    }

    @RequestMapping("loginCustomer")
    public String Login() {
        return "user/login";
    }

    //Kiểm tra Tài khoản và mật khẩu
    @RequestMapping(value = "btnLoginCustomer")
    public String Login(ModelMap model, HttpServletRequest request,
            HttpSession session) {
        String username = request.getParameter("txtUsername");
        String password = request.getParameter("txtPassword");
        if (customerDAO.Login(username, password) == "customer" || customerDAO.Login(username, password) == "guest") {

            session.setAttribute("USER", username);
            session.setAttribute("PASS", password);
            session.setAttribute("ROLE", customerDAO.Login(username, password));

            List<Products> ds = new ArrayList<>();
            ds = prDAO.showproducts();

            List<Customer> cus = new ArrayList<>();
            cus = customerDAO.showCustomer(username);

            session.setAttribute("listProducts", ds);
            session.setAttribute("listCustomer", cus);

            session.setAttribute("uri", request.getRequestURI()
                    .substring(request.getContextPath().length()));
            return "user/index";
        }
        // Trả về False
        model.addAttribute("message", "Đăng nhập không thành công - Vui lòng kiểm tra lại");
        return "user/index";
    }

    @RequestMapping("btnLogoutCustomer")
    public String Logout(ModelMap model, HttpSession session) {
        session.removeAttribute("USER");
        session.removeAttribute("SHOP");
        session.removeAttribute("CARTSIZE");
        return "user/index";
    }

    private static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static Random rnd = new Random();

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

    //Trả về trang ForgotPassword_Nhập Id
    @RequestMapping("btnForgotpassword")
    public String forgotPasswordPage() {
        return "user/ForgotPassword_Page1";
    }

    //Kiểm tra Email và gửi MÃ để đổi mật khẩu mới 
    @RequestMapping(value = "btnForgotpassword_Check_Email")
    public String checkEmailandUser(ModelMap model, Customer customer,
            @RequestParam("txtEmail") String toCustomerInput) {
        //Lấy Email của ngưởi dùng nhập 
        to = toCustomerInput;
        boolean checkEml;
        customer.setEmailCustomer(toCustomerInput);
        checkEml = customerDAO.checkEmailAndUsername(customer);
        //Trả về True nếu có dữ liệu
        if (checkEml == true) {
            emailChangePassword = customer.getEmailCustomer();
            // Hàm tạo ra chuỗi ngẫu nhiên 6 ký tự
            randomString();
            //Send Email về cho Admin với nội dung được gán sẵn
            mailer.send(from, to, subject, body);
            model.addAttribute("message", "Vui lòng kiểm tra Email để nhận CODE");
            return "user/ForgotPassword_Page2";
        }
        //Trả về False
        model.addAttribute("message", "Vui lòng nhập đúng Username và Email đã đăng ký");
        return "user/ForgotPassword_Page1";
    }

    @RequestMapping(value = "btnCheckCode")
    public String checkCode(ModelMap model, @RequestParam("txtCode") String code) {
        if (code.isEmpty()) {
            // Code không được để trống
            model.addAttribute("message", "Vui lòng nhập mã");
            return "user/ForgotPassword_Page2";
        } else if (code.equals(equalsCode)) {
            //Code trùng với code hệ thống
            //Phân biệt hoa thường
            return "user/ForgotPassword_Page3";
        }
        // Code không trùng hoặc nhập không đủ ký tự
        model.addAttribute("message", "Mã nhập vào không đúng - Vui lòng thử lại");
        return "user/ForgotPassword_Page2";
    }

    //Gửi lại CODE mới
    @RequestMapping("btnReSendCode")
    public String sendCodeAgain(ModelMap model) {
        //Tạo ra chuỗi ngẫu nhiên 6 ký tự
        randomString();
        //Send mail với người nhận cũ
        mailer.send(from, to, subject, body);
        model.addAttribute("message", "Đã gửi lại CODE mới - Vui lòng kiểm tra Email");
        return "user/ForgotPassword_Page2";
    }

    //Đổi mật khẩu 
    @RequestMapping(value = "btnChangePassword")
    public String changeNewPassword(ModelMap model, Customer customer,
            @RequestParam("txtPassword") String password,
            @RequestParam("txtConfirmPassword") String confirmPassword) {
        //Kiểm tra Mật khẩu và mật khẩu nhập lại trùng nhau
        if (password.equals(confirmPassword)) {
            //Thực hiện lệnh đổi password
            customer.setPasswordCustomer(password);
            customer.setEmailCustomer(emailChangePassword);
            customerDAO.updatePasswordCustomer(customer);
            //Đổi mật khẩu thành công
            model.addAttribute("message", "Mật khẩu đã được cập nhập - Vui lòng đăng nhập lại !");
            return "user/ForgotPassword_Page4";
        }
        model.addAttribute("message", "Mật khẩu không khớp - Vui lòng nhập lại mật khẩu mới !");
        return "user/ForgotPassword_Page3";
    }

    //Trả về trang Login_Admin sau khi gửi Password mới vào Email
    @RequestMapping(value = "btnReturn_Login")
    public String return_LoginPage() {
        return "user/login";
    }

    @RequestMapping(value = "registerCustomer")
    public String Register(ModelMap model, HttpServletRequest request) {
        String usernameCustomer = request.getParameter("txtUsername");
        String passwordCustomer = request.getParameter("txtPassword");
        String nameCustomer = request.getParameter("txtName");
        String emailCustomer = request.getParameter("txtEmail");
        String phoneCustomer = request.getParameter("txtPhone");
        String addressCustomer = request.getParameter("txtAddress");
        String imageCustomer = request.getParameter("txtImage");
        Customer cus = new Customer(usernameCustomer, passwordCustomer, nameCustomer, emailCustomer, phoneCustomer, addressCustomer, imageCustomer);
        customerDAO.insertCustomer(cus);
        model.addAttribute("message", "Dang ki thanh cong");
        return "user/index";
    }

}
