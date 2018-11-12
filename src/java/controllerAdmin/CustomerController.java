/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerAdmin;

import bean.*;
import static controller.LoginAdminController.userLogin;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import static model.AdminDAO.emailAdmin;
import static model.AdminDAO.imageAdmin;
import static model.AdminDAO.role;
import modelDAO.CustomerDAO;
import model.StaffDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Gia Hieu
 */
@Controller
public class CustomerController {

    CustomerDAO csDAO = new CustomerDAO();

    @RequestMapping("Customer")
    public String staffPage(ModelMap model) {
        List<CustomerAdmin> list = new ArrayList<CustomerAdmin>();
        
        list = csDAO.showCustomer("");
        model.addAttribute("listCustomer", list);
        if (role == 1) {
            model.addAttribute("role", "Admin");
        } else {
            model.addAttribute("role", "Staff");
        }
        model.addAttribute("image", imageAdmin);
        model.addAttribute("email", emailAdmin);
        model.addAttribute("username", userLogin);
        return "LoginAdmin/admin/Customers";
    }

    @RequestMapping("editCustomer")
    public String edit(HttpServletRequest request, ModelMap model) {
        int idCustomer = Integer.parseInt(request.getParameter("txtIdCustomer"));
        String usernameCustomer = request.getParameter("txtUsernameCustomer");
        String passwordCustomer = request.getParameter("txtPasswordCustomer");
        String nameCustomer = request.getParameter("txtNameCustomer");
        String statusCustomer = request.getParameter("txtStatusCustomer");
        String phoneCustomer = request.getParameter("txtPhoneCustomer");
        String emailCustomer = request.getParameter("txtEmailCustomer");
        String addressCustomer = request.getParameter("txtAddressCustomer");
        String imageCustomer = request.getParameter("txtImageCustomer");
        List<CustomerAdmin> list = new ArrayList<CustomerAdmin>();
        CustomerAdmin cs = new CustomerAdmin(idCustomer, usernameCustomer, passwordCustomer, nameCustomer, emailCustomer, phoneCustomer, addressCustomer, statusCustomer, imageCustomer);
        list.add(cs);
        model.addAttribute("listCustomer", list);
        if (role == 1) {
            model.addAttribute("role", "Admin");
        } else {
            model.addAttribute("role", "Staff");
        }
        model.addAttribute("image", imageAdmin);
        model.addAttribute("email", emailAdmin);
        model.addAttribute("username", userLogin);
        return "LoginAdmin/admin/CustomerDetails";
    }

    //Update loại sản phẩm theo ID và các field cập nhập
    @RequestMapping(params = "btnUpdateCustomer")
    public String updateOrder(ModelMap model, HttpServletRequest request, CustomerAdmin cs) {
        cs.setIdCustomer(Integer.parseInt(request.getParameter("txtIdCustomer")));
        cs.setPasswordCustomer(request.getParameter("txtPasswordCustomer"));
        cs.setNameCustomer(request.getParameter("txtNameCustomer"));
        cs.setStatusCustomer(request.getParameter("txtStatusCustomer"));

        cs.setEmailCustomer(request.getParameter("txtEmailCustomer"));
        cs.setPhoneCustomer(request.getParameter("txtPhoneCustomer"));
        cs.setAddressCustomer(request.getParameter("txtAddressCustomer"));
        csDAO.updateCustomer(cs);

        List<CustomerAdmin> list = new ArrayList<CustomerAdmin>();
        list = csDAO.showCustomer("");
        model.addAttribute("listCustomer", list);
        if (role == 1) {
            model.addAttribute("role", "Admin");
        } else {
            model.addAttribute("role", "Staff");
        }
        model.addAttribute("image", imageAdmin);
        model.addAttribute("email", emailAdmin);
        model.addAttribute("message", "SUCCESS: Update Customer Success");
        model.addAttribute("username", userLogin);
        return "LoginAdmin/admin/Customers";
    }

    //Thêm nhân viên
    @RequestMapping(params = "btnSaveCustomer")
    public String insertTypeProduct(ModelMap model, HttpServletRequest request) {
        String usernameCustomer = request.getParameter("txtUsernameCustomer");
        String passwordCustomer = request.getParameter("txtPasswordCustomer");
        String nameCustomer = request.getParameter("txtNameCustomer");
        String statusCustomer = request.getParameter("txtStatusCustomer");
        String emailCustomer = request.getParameter("txtEmailCustomer");
        String addressCustomer = request.getParameter("txtAddressCustomer");
        String phoneCustomer = request.getParameter("txtPhoneCustomer");
        String imageCustomer = request.getParameter("txtImageCustomer");
        CustomerAdmin cs = new CustomerAdmin(usernameCustomer, passwordCustomer, nameCustomer, emailCustomer, phoneCustomer, addressCustomer, statusCustomer, imageCustomer);

        csDAO.insertCustomer(cs);
        if (role == 1) {
            model.addAttribute("role", "Admin");
        } else {
            model.addAttribute("role", "Staff");
        }
        model.addAttribute("image", imageAdmin);
        model.addAttribute("email", emailAdmin);
        model.addAttribute("message", "SUCCESS: Create New Customer Success");
        model.addAttribute("username", userLogin);
        return "LoginAdmin/admin/AddCustomer";
    }

}
