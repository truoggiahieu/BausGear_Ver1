/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerAdmin;

import model.*;
import bean.*;
import static controllerAdmin.LoginAdminController.userLogin;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import static model.AdminDAO.emailAdmin;
import static model.AdminDAO.imageAdmin;
import static model.AdminDAO.role;
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
public class OrderController {

    OrderDAO orDAO = new OrderDAO();

    //Trả về trang Sales
    @RequestMapping("Orders")
    public String productPage(ModelMap model) {
        if (role == 1) {
            List<Order> list = new ArrayList<Order>();
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

    //Lấy dữ liệu từ table trả vào Field tương ứng
    @RequestMapping("editOrder")
    public String edit(HttpServletRequest request, ModelMap model, Order ord) {
        int idOrder = Integer.parseInt(request.getParameter("txtIdOrder"));
        String nameCustomer = request.getParameter("txtNameCustomer");
        String addressCustomer = request.getParameter("txtAddressCustomer");
        String emailCustomer = request.getParameter("txtEmailCustomer");
        String phoneCustomer = request.getParameter("txtPhoneCustomer");
        String statusOrder = request.getParameter("txtStatusOrder");
        int totalOrder = Integer.parseInt(request.getParameter("txtTotalOrder"));
        String dateStartOrder = request.getParameter("txtDateStartOrder");
        String paymentOrder = request.getParameter("txtPaymentOrder");
        String dateEndOrder = request.getParameter("txtDateEndOrder");
        String phoneOrder = request.getParameter("txtPhoneOrder");
        String addressOrder = request.getParameter("txtAddressOrder");
        String emailOrder = request.getParameter("txtEmailOrder");
        String nameOrder = request.getParameter("txtNameOrder");
        String nameAdmin = request.getParameter("txtNameAdmin");
        List<Order> list = new ArrayList<Order>();
        Order or = new Order(idOrder, statusOrder, totalOrder, dateStartOrder, dateEndOrder, paymentOrder, phoneOrder, addressOrder, emailOrder, nameOrder, nameCustomer, addressCustomer, phoneCustomer, emailCustomer, nameAdmin);
        model.addAttribute("Order", or);
        list.add(or);
        model.addAttribute("listOrder", list);
        ord.setIdOrder(Integer.parseInt(request.getParameter("txtIdOrder")));
        List<Order> listt = new ArrayList<Order>();
        listt = orDAO.showOrderDetails(ord);
        model.addAttribute("listOrderDetails", listt);

        if (role == 1) {
            model.addAttribute("role", "Admin");
        } else {
            model.addAttribute("role", "Staff");
        }
        model.addAttribute("image", imageAdmin);
        model.addAttribute("email", emailAdmin);
        model.addAttribute("username", userLogin);
        return "LoginAdmin/admin/SalesDetails";
    }

    //Update loại sản phẩm theo ID và các field cập nhập
    @RequestMapping(params = "btnUpdateOrder")
    public String updateOrder(ModelMap model, HttpServletRequest request, Order or) {
        if (role == 1) {
            or.setIdOrder(Integer.parseInt(request.getParameter("txtIdOrder")));
            or.setStatusOrder(request.getParameter("txtStatusOrder"));
            orDAO.updateOrder(or);
            List<Order> list = new ArrayList<Order>();
            list = orDAO.showOrder();
            model.addAttribute("listOrder", list);
            if (role == 1) {
                model.addAttribute("role", "Admin");
            } else {
                model.addAttribute("role", "Staff");
            }
            model.addAttribute("image", imageAdmin);
            model.addAttribute("email", emailAdmin);
            model.addAttribute("message", "SUCCESS: Update Order Success");
            model.addAttribute("username", userLogin);
            return "LoginAdmin/admin/Sales";
        } else {
            or.setIdOrder(Integer.parseInt(request.getParameter("txtIdOrder")));
            or.setStatusOrder(request.getParameter("txtStatusOrder"));
            orDAO.updateOrder(or);
            List<Order> list = new ArrayList<Order>();
            list = orDAO.showOrderLikeStaff();
            model.addAttribute("listOrder", list);
            if (role == 1) {
                model.addAttribute("role", "Admin");
            } else {
                model.addAttribute("role", "Staff");
            }
            model.addAttribute("image", imageAdmin);
            model.addAttribute("email", emailAdmin);
            model.addAttribute("message", "SUCCESS: Update Order Success");
            model.addAttribute("username", userLogin);
            return "LoginAdmin/admin/SalesStaff";
        }
    }

    @RequestMapping("deleteOrder")
    public String deleteOrders(HttpServletRequest request, ModelMap model, Order or) {
        or.setIdOrder(Integer.parseInt(request.getParameter("idOrder")));
        orDAO.deleteOrdersDetails(or);
        orDAO.deleteOrders(or);
        List<Order> list = new ArrayList<Order>();
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
    }
}
