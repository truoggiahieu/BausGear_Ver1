/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.CheckoutDAO;
import DAO.CustomerDAO;
import DAO.ProductsDAO;
import bean.Mailer;
import cart.CartBean;
import cart.ProductDTO;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import model.Customer;
import model.OrderDetail;
import model.Orders;
import model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ThanhLich
 */
@Controller
@RequestMapping(value = "/checkout/")
public class CheckoutController {

    @Autowired
    Mailer mailer;

    private String from = "bausgear@gmail.com";
    private String subject ;
    private String to;
    private String body;

    CustomerDAO customerDAO = new CustomerDAO();
    ProductsDAO prDAO = new ProductsDAO();

    @RequestMapping("checkout")
    public String view(ModelMap model, HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        session.getAttribute("listUser");
        return "user/checkout";
    }

    @RequestMapping(value = "add_orders", method = RequestMethod.GET) // post hay get
    public String add_orders(ModelMap model, HttpServletRequest request, HttpSession session) {
        LocalDate now = LocalDate.now();
        LocalDate endday = now.plusDays(10);
        String idcus = request.getParameter("txtID");
        int id = Integer.parseInt(idcus);
        String name = request.getParameter("txtName");
        String phone = request.getParameter("txtPhone");
        String address = request.getParameter("txtAddress");
        String email = request.getParameter("txtEmail");
        String total = request.getParameter("txtTotalPrice");
        Orders order = new Orders(name, 1, Integer.parseInt(total), true, now.toString(),
                id, endday.toString(), phone, address, email, 1);
        CheckoutDAO list = new CheckoutDAO();
        list.add_order(order);

        CartBean cartBean = (CartBean) session.getAttribute("SHOP");
        for (ProductDTO productDTO : cartBean.values()) {
            int sl = productDTO.getQuantity();
            int gia = productDTO.getSanpham().getPrice();
            int giaorder = sl * gia;
            OrderDetail orderdetail = new OrderDetail(list.select_id_just_added_to_order(),
                    productDTO.getQuantity(), productDTO.getSanpham().getId(), giaorder);
            list.add_orderdetail(orderdetail);
        }
        // Lấy ID mới nhất
        int lastId = list.select_id_just_added_to_order();
        to = request.getParameter("txtEmail");
        body = "Hello ! Your Order(#" + lastId + ") has been processing ! Thank you because choose our product";
        session.removeAttribute("CARTSIZE");
        session.removeAttribute("SHOP");
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = formatter.format(date);
        subject = "BAU'S GEAR || YOUR ORDER IN " + strDate + " HAS SUCCESS ";
        mailer.send(from, to, subject, body);
        return "user/thankyou";
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
            return "user/checkout";
        }
        // Trả về False
        model.addAttribute("message", "Đăng nhập không thành công - Vui lòng kiểm tra lại");
        return "user/checkout";
    }

    @RequestMapping("btnLogoutCustomer")
    public String Logout(ModelMap model, HttpSession session) {
        session.removeAttribute("USER");
        session.removeAttribute("listCustomer");
        return "user/index";
    }

    @RequestMapping("registerCus")
    public String Register() {
        return "user/register";
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
