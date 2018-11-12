/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.ProductDetailDAO;
import model.Products;

import java.util.ArrayList;
import java.util.List;
import DAO.ProductsDAO;
import cart.CartBean;
import cart.ProductDTO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import DAO.OrderDAO;
import model.Orders;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import static DAO.CustomerDAO.idCustomer;

/**
 *
 * @author ThanhLich
 */
@Controller
@RequestMapping(value = "/product/")
public class ProductController {

    @RequestMapping("contact")
    public String contact() {
        return "user/contact";
    }

    @RequestMapping("order")
    public String Order(HttpServletRequest request, ModelMap model) {
        HttpSession session = request.getSession(false);
        List<Orders> order = new ArrayList<>();
        OrderDAO orderdao = new OrderDAO();
        order = orderdao.listOrders(String.valueOf(idCustomer));
        session.setAttribute("ORDER_LIST", order);

        return "user/order";
    }

    @RequestMapping("index")
    public String index(ModelMap model, HttpServletRequest request) {
        HttpSession session = request.getSession(false);

        ProductsDAO products = new ProductsDAO();
        List<Products> ds = new ArrayList<>();
        ds = products.showproducts();

        session.setAttribute("listProducts", ds);
        session.setAttribute("uri", request.getRequestURI().substring(request.getContextPath().length()));// session uri được tạo ra khi chạy đúng trang /product/showproduct.htm, mặc định trang chủ được set ở redirect.jsp

        return "user/index";
    }

    @RequestMapping("cart")
    public String showcart(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        session.setAttribute("uri", request.getRequestURI().substring(request.getContextPath().length()));// session uri được tạo ra khi chạy đúng trang /product/showproduct.htm, mặc định trang chủ được set ở redirect.jsp

        return "user/cart";
    }

    @RequestMapping("shop")
    public String showpd(ModelMap model, HttpServletRequest request) {
        HttpSession session = request.getSession(false);

        ProductsDAO products = new ProductsDAO();
        List<Products> ds = new ArrayList<>();
        ds = products.showproducts();

        session.setAttribute("listProducts", ds);
        session.setAttribute("uri", request.getRequestURI().substring(request.getContextPath().length()));// session uri được tạo ra khi chạy đúng trang /product/showproduct.htm, mặc định trang chủ được set ở redirect.jsp

        return "user/shop";
    }

    @RequestMapping("SearchProduct")
    public String Search(HttpServletRequest request, ModelMap model) {
        String txtSearch = request.getParameter("txtSearch");
        HttpSession session = request.getSession(false);
        ProductsDAO products = new ProductsDAO();
        List<Products> ds = new ArrayList<>();
        ds = products.SearchProduct(txtSearch);
        if (ds.isEmpty()) {
            session.getAttribute("USER");
            return "user/false";
        } else {
            session.getAttribute("USER");
            session.setAttribute("listProducts", ds);
            return "user/shop";
        }
    }

}
