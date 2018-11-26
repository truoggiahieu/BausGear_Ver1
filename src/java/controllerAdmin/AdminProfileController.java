/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerAdmin;

import bean.Admin;
import bean.*;
import static controllerAdmin.LoginAdminController.userLogin;
import static model.AdminDAO.idAdmin;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import model.AdminDAO;
import static model.AdminDAO.emailAdmin;
import static model.AdminDAO.emailAdmin2;
import static model.AdminDAO.imageAdmin;
import static model.AdminDAO.imageAdmin2;
import static model.AdminDAO.role;
import model.TypeProductDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Gia Hieu
 */
@Controller
public class AdminProfileController {

    //Trả vể trang Catagories
    AdminDAO adDAO = new AdminDAO();

    @RequestMapping("btnAdminProfile")
    public String AdminPage(ModelMap model) {
        List<Admin> list = new ArrayList<Admin>();
        Admin ad = new Admin(idAdmin);
        list = adDAO.showAdminLike(ad);
        model.addAttribute("listAdminProfile", list);
        if (role == 1) {
            model.addAttribute("role", "Admin");
        } else {
            model.addAttribute("role", "Staff");
        }
        model.addAttribute("image2", imageAdmin2);
        model.addAttribute("email2", emailAdmin2);
        model.addAttribute("image", imageAdmin);
        model.addAttribute("email", emailAdmin);
        model.addAttribute("username", userLogin);
        return "LoginAdmin/admin/AdminProfile";
    }

    @RequestMapping(params = "btnUpdateProfileAdmin")
    public String updateProfile(ModelMap model, HttpServletRequest request, Admin admin) {
        admin.setUsernameAdmin(request.getParameter("txtUsernameAdmin"));
        admin.setPasswordAdmin(request.getParameter("txtPasswordAdmin"));
        admin.setNameAdmin(request.getParameter("txtNameAdmin"));
        admin.setEmailAdmin(request.getParameter("txtEmailAdmin"));
        admin.setAddressAdmin(request.getParameter("txtAddressAdmin"));
        admin.setPhoneAdmin(request.getParameter("txtPhoneAdmin"));
        admin.setIdAdmin(idAdmin);
        adDAO.updateProfile(admin);
        List<Admin> list = new ArrayList<Admin>();
        Admin ad = new Admin(idAdmin);
        list = adDAO.showAdminLike(ad);
        model.addAttribute("listAdminProfile", list);
        if (role == 1) {
            model.addAttribute("role", "Admin");
        } else {
            model.addAttribute("role", "Staff");
        }
        model.addAttribute("image", imageAdmin);
        model.addAttribute("message", "SUCCESS: Update Success Full");
        model.addAttribute("username", userLogin);
        return "LoginAdmin/admin/AdminProfile";
    }

}
