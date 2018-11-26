/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerAdmin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import bean.*;
import static controllerAdmin.LoginAdminController.userLogin;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import model.*;
import static model.AdminDAO.emailAdmin;
import static model.AdminDAO.role;
import static model.AdminDAO.idAdmin;
import static model.AdminDAO.imageAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Gia Hieu
 */
@Controller

public class AdminProductController {
    
 

    ProductDAO prDAO = new ProductDAO();

    
    //Trả về trang thêm sản phẩm
    @RequestMapping("btnAddProduct")
    public String addProductPage(ModelMap model) {
        //Role tương ứng với người đăng nhập
        if (role == 1) {
            model.addAttribute("role", "Admin");
        } else {
            model.addAttribute("role", "Staff");
        }
        //Hình của Admin đăng nhập
        model.addAttribute("image", imageAdmin);
        //Email của Admin đăng nhập
        model.addAttribute("email", emailAdmin);
        //Username của Admin đăng nhập
        model.addAttribute("username", userLogin);
        return "LoginAdmin/admin/AddProduct";
    }

    //Trả về trang List Product
    @RequestMapping("Product")
    public String productPage(ModelMap model) {
        List<Product> list = new ArrayList<Product>();
        list = prDAO.showProduct("");
        model.addAttribute("listProduct", list);
        if (role == 1) {
            model.addAttribute("role", "Admin");
        } else {
            model.addAttribute("role", "Staff");
        }
        model.addAttribute("image", imageAdmin);
        model.addAttribute("email", emailAdmin);
        model.addAttribute("roleAdmin1", role);
        model.addAttribute("username", userLogin);
        return "LoginAdmin/admin/Products";
    }

    @ModelAttribute("codeCatagories")
    public List<Catagories> getCodeTypeProduct() {
        TypeProductDAO tpDAO = new TypeProductDAO();
        List<Catagories> tp = new ArrayList<>();
        tp = tpDAO.showTypeProductCombobox();
        return tp;
    }
//

    @RequestMapping("editProduct")
    public String edit(HttpServletRequest request, ModelMap model) {
        int idProduct = Integer.parseInt(request.getParameter("txtIdProduct"));
        String nameProduct = request.getParameter("txtNameProduct");
        String imageProduct = request.getParameter("txtImageProduct");
        String statusProduct = request.getParameter("txtStatusProduct");
        int priceProduct = Integer.parseInt(request.getParameter("txtPriceProduct"));
        int quantityProduct = Integer.parseInt(request.getParameter("txtQuantityProduct"));
        int idCatagories = Integer.parseInt(request.getParameter("txtIdCatagories"));
        String tagProduct = request.getParameter("txtTagProduct");
        String descriptionProduct = request.getParameter("txtDescriptionProduct");
        int guarateeProduct = Integer.parseInt(request.getParameter("txtGuaranteeProduct"));
        int idAdmin = Integer.parseInt(request.getParameter("txtIdAdmin"));
        List<Product> list = new ArrayList<Product>();
        Product pr = new Product(idProduct, nameProduct, imageProduct, idCatagories, statusProduct, quantityProduct, priceProduct, tagProduct, descriptionProduct, guarateeProduct, idAdmin);
        list.add(pr);
        model.addAttribute("listProductEdit", list);
        if (role == 1) {
            model.addAttribute("role", "Admin");
        } else {
            model.addAttribute("role", "Staff");
        }
        model.addAttribute("image", imageAdmin);
        model.addAttribute("email", emailAdmin);
        model.addAttribute("username", userLogin);
        return "LoginAdmin/admin/ProductDetails";
    }

    //Thêm sản phản
    @RequestMapping(params = "btnSaveProduct")
    public String insertTypeProduct(ModelMap model, HttpServletRequest request) {
        String nameProduct = request.getParameter("txtNameProduct");
        String imageProduct = request.getParameter("txtImageProduct");
        String statusProduct = request.getParameter("txtStatusProduct");
        int quantityProduct = Integer.parseInt(request.getParameter("txtQuantityProduct"));
        int priceProduct = Integer.parseInt(request.getParameter("txtPriceProduct"));
        String tagProduct = request.getParameter("txtTagProduct");
        String descriptionProduct = request.getParameter("txtDescriptionProduct");
        int guaranteeProduct = Integer.parseInt(request.getParameter("txtGuaranteeProduct"));
        int idCatagories = Integer.parseInt(request.getParameter("txtIdCatagories"));
        Product pr = new Product(nameProduct, imageProduct, idCatagories, statusProduct, quantityProduct, priceProduct, tagProduct, descriptionProduct, guaranteeProduct, idAdmin);
        prDAO.insertProducts(pr);
        List<Product> list = new ArrayList<Product>();
        list = prDAO.showProduct("");
        model.addAttribute("listProduct", list);
        if (role == 1) {
            model.addAttribute("role", "Admin");
        } else {
            model.addAttribute("role", "Staff");
        }
        model.addAttribute("image", imageAdmin);
        model.addAttribute("email", emailAdmin);
        model.addAttribute("message", "SUCCESS: Create new product success");
        model.addAttribute("username", userLogin);
        return "LoginAdmin/admin/AddProduct";
    }

    //Xóa sản phẩm theo ID
    @RequestMapping("deleteProduct")
    public String deleteProduct(HttpServletRequest request, ModelMap model, Product pr) {
        try {
            pr.setIdProduct(Integer.parseInt(request.getParameter("idProduct")));
            prDAO.deleteProducts(pr);
            List<Product> list = new ArrayList<Product>();
            list = prDAO.showProduct("");
            model.addAttribute("listProduct", list);

            model.addAttribute("message", "SUCCESS : Delete Product Success");

        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("message", "ERROR : Delete Product Fail !");
        }
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

    //Update loại sản phẩm theo ID và các field cập nhập
    @RequestMapping(params = "btnUpdateProduct")
    public String updateProduct(ModelMap model, Product pr, HttpServletRequest request) {
        pr.setIdProduct(Integer.parseInt(request.getParameter("txtIdProduct")));
        pr.setNameProduct(request.getParameter("txtNameProduct"));
        pr.setImageProduct(request.getParameter("txtImageProduct"));
        pr.setStatusProduct(request.getParameter("txtStatusProduct"));
        pr.setPriceProduct(Integer.parseInt(request.getParameter("txtPriceProduct")));
        pr.setQuantityProduct(Integer.parseInt(request.getParameter("txtQuantityProduct")));
        pr.setIdCatagories(Integer.parseInt(request.getParameter("txtIdCatagories")));
        pr.setTagProduct(request.getParameter("txtTagProduct"));
        pr.setDescriptionProduct(request.getParameter("txtDescriptionProduct"));
        pr.setGuaranteeProduct(Integer.parseInt(request.getParameter("txtGuaranteeProduct")));
        pr.setIdAdmin(Integer.parseInt(request.getParameter("txtIdAdmin")));

        prDAO.updateProducts(pr);

        List<Product> list = new ArrayList<Product>();
        list.add(pr);
        model.addAttribute("listProductEdit", list);
        model.addAttribute("message", "SUCCESS: Update product success !");
        model.addAttribute("username", userLogin);
        model.addAttribute("image", imageAdmin);
        model.addAttribute("email", emailAdmin);
        return "LoginAdmin/admin/ProductDetails";
    }
}
