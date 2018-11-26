/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerAdmin;

import bean.Admin;
import bean.Order;
import bean.Product;
import bean.*;
import static controllerAdmin.LoginAdminController.userLogin;
import static model.AdminDAO.role;
import java.util.ArrayList;
import java.util.List;
import model.*;
import static model.AdminDAO.emailAdmin;
import static model.AdminDAO.imageAdmin;
import static modelDAO.StatisticalDAO.canceled;
import static modelDAO.StatisticalDAO.customer;
import static modelDAO.StatisticalDAO.delivered;
import static modelDAO.StatisticalDAO.delivering;
import static modelDAO.StatisticalDAO.orders;
import static modelDAO.StatisticalDAO.ordersOnDay;
import static modelDAO.StatisticalDAO.processing;
import static modelDAO.StatisticalDAO.totalOrder;
import modelDAO.CustomerDAO;
import modelDAO.StatisticalDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Gia Hieu
 */
@Controller
public class ChangePageController {

    //Trả về trang Dashboard
    @RequestMapping("btnDashboard")
    public String dashboardPage(ModelMap model) {
        StatisticalDAO staDAO = new StatisticalDAO();
        staDAO.countOrders();
        staDAO.countOrdersDay();
        staDAO.sumCustomer();
        staDAO.totalOrder();
        staDAO.countCanceled();
        staDAO.countDelivered();
        staDAO.countDelivering();
        staDAO.countProcessing();
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

    //Trả về trang AddCatagories
    @RequestMapping("btnAddCatagories")
    public String addCatagoriesPage(ModelMap model) {
        if (role == 1) {
            model.addAttribute("role", "Admin");
        } else {
            model.addAttribute("role", "Staff");
        }
        model.addAttribute("image", imageAdmin);
        model.addAttribute("email", emailAdmin);
        model.addAttribute("username", userLogin);
        return "LoginAdmin/admin/AddCatagories";
    }

    //Trả về trang AddStaff
    @RequestMapping("btnAddStaff")
    public String addStaffPage(ModelMap model) {
        if (role == 1) {
            model.addAttribute("role", "Admin");
        } else {
            model.addAttribute("role", "Staff");
        }
        model.addAttribute("image", imageAdmin);
        model.addAttribute("email", emailAdmin);
        model.addAttribute("username", userLogin);
        return "LoginAdmin/admin/AddStaff";
    }

    @RequestMapping("btnAddCustomer")
    public String addGiftVoucherPage(ModelMap model) {
        model.addAttribute("image", imageAdmin);
        model.addAttribute("email", emailAdmin);
        model.addAttribute("username", userLogin);
        return "LoginAdmin/admin/AddCustomer";
    }

    //Trả về trang Catagories với dữ liệu được load
    @RequestMapping("btnCatagories")
    public String catalogPage(ModelMap model) {
        List<Catagories> list = new ArrayList<Catagories>();
        TypeProductDAO tpDAO = new TypeProductDAO();
        list = tpDAO.showTypeProduct("");
        model.addAttribute("listCatagories", list);
        if (role == 1) {
            model.addAttribute("role", "Admin");
        } else {
            model.addAttribute("role", "Staff");
        }
        model.addAttribute("image", imageAdmin);
        model.addAttribute("email", emailAdmin);
        model.addAttribute("username", userLogin);
        return "LoginAdmin/admin/Catagories";
    }

    //Trả về trang Customer
    @RequestMapping("btnCustomers")
    public String customersPage(ModelMap model) {
        List<CustomerAdmin> list = new ArrayList<CustomerAdmin>();
        CustomerDAO csDAO = new CustomerDAO();
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

    @RequestMapping("btnOrderLikeStaff")
    public String salesPageLikeStaffWhere(ModelMap model) {
        List<Order> list = new ArrayList<Order>();
        OrderDAO orDAO = new OrderDAO();
        list = orDAO.showOrderLikeStaff();
        model.addAttribute("listOrder", list);
        if (role == 1) {
            model.addAttribute("role", "Admin");
        } else {
            model.addAttribute("role", "Staff");
        }
        model.addAttribute("image", imageAdmin);
        model.addAttribute("email", emailAdmin);
        model.addAttribute("username", userLogin);
        return "LoginAdmin/admin/SalesStaff";
    }

    //Trả về trang Sales
    @RequestMapping("btnSales")
    public String salesPage(ModelMap model) {
        if (role == 1) {
            List<Order> list = new ArrayList<Order>();
            OrderDAO orDAO = new OrderDAO();
            list = orDAO.showOrder();
            model.addAttribute("listOrder", list);
            if (role == 1) {
                model.addAttribute("role", "Admin");
            } else {
                model.addAttribute("role", "Staff");
            }
            model.addAttribute("image", imageAdmin);
            model.addAttribute("email", emailAdmin);
            model.addAttribute("username", userLogin);
            return "LoginAdmin/admin/Sales";
        } else {
            List<Order> list = new ArrayList<Order>();
            OrderDAO orDAO = new OrderDAO();
            list = orDAO.showOrderLikeStaffWhereStatus();
            model.addAttribute("listOrder", list);
            if (role == 1) {
                model.addAttribute("role", "Admin");
            } else {
                model.addAttribute("role", "Staff");
            }
            model.addAttribute("image", imageAdmin);
            model.addAttribute("email", emailAdmin);
            model.addAttribute("username", userLogin);
            return "LoginAdmin/admin/SalesStaff";
        }
    }

    //Trả về trang Staff
    @RequestMapping("btnStaff")
    public String staffPage(ModelMap model) {
        if (role == 1) {
            List<Staff> list = new ArrayList<Staff>();
            StaffDAO stDAO = new StaffDAO();
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
        } else {
            if (role == 1) {
                model.addAttribute("role", "Admin");
            } else {
                model.addAttribute("role", "Staff");
            }
            model.addAttribute("image", imageAdmin);
            model.addAttribute("email", emailAdmin);
            model.addAttribute("username", userLogin);
            model.addAttribute("message", "Bạn không có quyền truy cập trang web này");
            return "LoginAdmin/admin/PermissionStaff";
        }
    }

    //Trả về trang Mail
    @RequestMapping("btnSendMail")
    public String mailPage(ModelMap model) {
        if (role == 1) {
            model.addAttribute("role", "Admin");
        } else {
            model.addAttribute("role", "Staff");
        }
        model.addAttribute("image", imageAdmin);
        model.addAttribute("email", emailAdmin);
        model.addAttribute("username", userLogin);
        return "LoginAdmin/admin/Mail";
    }

    //Trả về trang Product
    @RequestMapping("btnProducts")
    public String productPage(ModelMap model) {
        List<Product> list = new ArrayList<Product>();
        ProductDAO prDAO = new ProductDAO();
        list = prDAO.showProduct("");
        model.addAttribute("listProduct", list);
        if (role == 1) {
            model.addAttribute("role", "Admin");
        } else {
            model.addAttribute("role", "Staff");
        }
        model.addAttribute("image", imageAdmin);
        model.addAttribute("email", emailAdmin);
        model.addAttribute("username", userLogin);
        return "LoginAdmin/admin/Products";
    }

}
