/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerAdmin;

import bean.Order;
import bean.Product;
import bean.Staff;
import static controllerAdmin.LoginAdminController.userLogin;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import static model.AdminDAO.emailAdmin;
import static model.AdminDAO.emailAdmin2;
import static model.AdminDAO.imageAdmin;
import static model.AdminDAO.imageAdmin2;
import static model.AdminDAO.role;
import model.StaffDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Gia Hieu
 */
@Controller
public class StaffController {

    StaffDAO stDAO = new StaffDAO();

    @RequestMapping("Staff")
    public String staffPage(ModelMap model) {
        List<Staff> list = new ArrayList<Staff>();
        list = stDAO.showStaff("");
        model.addAttribute("listStaff", list);
        if (role == 1) {
            model.addAttribute("role", "Admin");
        } else {
            model.addAttribute("role", "Staff");
        }
        model.addAttribute("image", imageAdmin);
        model.addAttribute("email", emailAdmin);
        model.addAttribute("username", userLogin);
        return "LoginAdmin/admin/Staff";
    }

    //Thêm nhân viên
    @RequestMapping(params = "btnSaveStaff")
    public String insertTypeProduct(ModelMap model, HttpServletRequest request) {
        String usernameAdmin = request.getParameter("txtUsernameAdmin");
        String passwordAdmin = request.getParameter("txtPasswordAdmin");
        String nameAdmin = request.getParameter("txtNameAdmin");
        String statusAdmin = request.getParameter("txtStatusAdmin");
        String emailAdmin = request.getParameter("txtEmailAdmin");
        String addressAdmin = request.getParameter("txtAddressAdmin");
        String phoneAdmin = request.getParameter("txtPhoneAdmin");
        String imageAdminST = request.getParameter("txtImageAdmin");
        int roleAdmin = 0;
        Staff st = new Staff(usernameAdmin, passwordAdmin, nameAdmin, emailAdmin, addressAdmin, phoneAdmin, statusAdmin, imageAdminST, roleAdmin);
        stDAO.insertStaff(st);
        if (role == 1) {
            model.addAttribute("role", "Admin");
        } else {
            model.addAttribute("role", "Staff");
        }
        model.addAttribute("image2", imageAdmin);
        model.addAttribute("email2", emailAdmin);
        model.addAttribute("message", "SUCCESS: Create New Staff Success");
        model.addAttribute("username", userLogin);
        return "LoginAdmin/admin/AddStaff";
    }

    @RequestMapping("editStaff")
    public String edit(HttpServletRequest request, ModelMap model) {
        int idAdmin = Integer.parseInt(request.getParameter("txtIdAdmin"));
        String usernameAdmin = request.getParameter("txtUsernameAdmin");
        String passwordAdmin = request.getParameter("txtPasswordAdmin");
        String nameAdmin = request.getParameter("txtNameAdmin");
        String statusAdmin = request.getParameter("txtStatusAdmin");
        String phoneAdmin = request.getParameter("txtPhoneAdmin");
        String emailAdmin = request.getParameter("txtEmailAdmin");
        String addressAdmin = request.getParameter("txtAddressAdmin");
        String imageAdmin = request.getParameter("txtImageAdmin");
        List<Staff> list = new ArrayList<Staff>();
        Staff st = new Staff(idAdmin, usernameAdmin, passwordAdmin, nameAdmin, emailAdmin, addressAdmin, phoneAdmin, statusAdmin, imageAdmin);
        list.add(st);
        model.addAttribute("listStaff", list);
        if (role == 1) {
            model.addAttribute("role", "Admin");
        } else {
            model.addAttribute("role", "Staff");
        }

        model.addAttribute("username", userLogin);

        model.addAttribute("image2", imageAdmin2);
        model.addAttribute("email2", emailAdmin2);
        return "LoginAdmin/admin/StaffDetails";
    }

    //Update loại sản phẩm theo ID và các field cập nhập
    @RequestMapping(params = "btnUpdateStaff")
    public String updateOrder(ModelMap model, HttpServletRequest request, Staff st) {
        st.setIdAdmin(Integer.parseInt(request.getParameter("txtIdAdmin")));
        st.setPasswordAdmin(request.getParameter("txtPasswordAdmin"));
        st.setNameAdmin(request.getParameter("txtNameAdmin"));
        st.setStatusAdmin(request.getParameter("txtStatusAdmin"));
        st.setEmailAdmin(request.getParameter("txtEmailAdmin"));
        st.setPhoneAdmin(request.getParameter("txtPhoneAdmin"));
        st.setAddressAdmin(request.getParameter("txtAddressAdmin"));
        stDAO.updateStaff(st);
        List<Staff> list = new ArrayList<Staff>();
        list = stDAO.showStaff("");
        model.addAttribute("listStaff", list);
        if (role == 1) {
            model.addAttribute("role", "Admin");
        } else {
            model.addAttribute("role", "Staff");
        }
        model.addAttribute("image", imageAdmin);
        model.addAttribute("email", emailAdmin);
        model.addAttribute("message", "SUCCESS: Update Staff Success");
        model.addAttribute("username", userLogin);
        return "LoginAdmin/admin/Staff";
    }

    //Xóa sản phẩm theo ID
    @RequestMapping("deleteStaff")
    public String deleteStaff(HttpServletRequest request, ModelMap model, Staff st) {
        st.setIdAdmin(Integer.parseInt(request.getParameter("idAdmin")));
        stDAO.deleteStaff(st);
        List<Staff> list = new ArrayList<Staff>();
        list = stDAO.showStaff("");
        model.addAttribute("listStaff", list);
        if (role == 1) {
            model.addAttribute("role", "Admin");
        } else {
            model.addAttribute("role", "Staff");
        }
        model.addAttribute("image", imageAdmin);
        model.addAttribute("email", emailAdmin);
        model.addAttribute("username", userLogin);
        model.addAttribute("message", "SUCCESS: Delete Staff Success");
        return "LoginAdmin/admin/Staff";
    }
}
