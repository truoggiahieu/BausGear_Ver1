/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerAdmin;

import static controllerAdmin.LoginAdminController.userLogin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import bean.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import model.*;
import static model.AdminDAO.emailAdmin;
import static model.AdminDAO.imageAdmin;
import static model.AdminDAO.role;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Gia Hieu
 */
@Controller
public class CategoriesController {

    TypeProductDAO tpDAO = new TypeProductDAO();
    Catagories catalog = new Catagories();

    //Trả vể trang Catagories
    @RequestMapping("Catalog")
    public String catalogPage(ModelMap model) {

        List<Catagories> list = new ArrayList<Catagories>();
        list = tpDAO.showTypeProduct("");
        model.addAttribute("listCatagories", list);
        if (role == 1) {
            model.addAttribute("role", "Admin");
        } else {
            model.addAttribute("role", "Staff");
        }
        model.addAttribute("username", userLogin);
        model.addAttribute("image", imageAdmin);
        model.addAttribute("email", emailAdmin);
        return "LoginAdmin/admin/PermissionCatagories";

    }

    //Thêm Loại sản phẩm
    @RequestMapping(params = "btnSaveNameCatagories")
    public String insertTypeProduct(ModelMap model, HttpServletRequest request) {
        String nameCatagories = request.getParameter("txtNameCatagories");
        String nameBrand = request.getParameter("txtNameBrand");
        Catagories ct = new Catagories(nameCatagories, nameBrand);
        tpDAO.insertTypeProduct(ct);
        List<Catagories> list = new ArrayList<Catagories>();
        list = tpDAO.showTypeProduct("");
        model.addAttribute("listCatagories", list);
        if (role == 1) {
            model.addAttribute("role", "Admin");
        } else {
            model.addAttribute("role", "Staff");
        }
        model.addAttribute("message", "SUCCESS : Create new catagories success");
        model.addAttribute("image", imageAdmin);
        model.addAttribute("email", emailAdmin);
        model.addAttribute("username", userLogin);
        return "LoginAdmin/admin/AddCatagories";
    }

    //Lấy dữ liệu từ table trả vào Field tương ứng
    @RequestMapping("edit")
    public String edit(HttpServletRequest request, ModelMap model) {
        int idCatagories = Integer.parseInt(request.getParameter("txtIdCatagories"));
        String nameCatagories = request.getParameter("txtNameCatagories");
        String nameBrand = request.getParameter("txtNameBrand");
        List<Catagories> list = new ArrayList<Catagories>();
        Catagories ct = new Catagories(idCatagories, nameCatagories, nameBrand);
        list.add(ct);
        model.addAttribute("listCatagoriesEdit", list);
        if (role == 1) {
            model.addAttribute("role", "Admin");
        } else {
            model.addAttribute("role", "Staff");
        }
        model.addAttribute("image", imageAdmin);
        model.addAttribute("email", emailAdmin);
        model.addAttribute("username", userLogin);
        return "LoginAdmin/admin/CatagoriesDetails";
    }

    //Xóa loại sản phẩm theo ID
    @RequestMapping("deleteCatagories")
    public String deleteTypeProduct(HttpServletRequest request, ModelMap model, Catagories ct) {
        try {
            ct.setIdCatagories(Integer.parseInt(request.getParameter("idCatagories")));
            tpDAO.deleteTypeProduct(ct);
            List<Catagories> list = new ArrayList<Catagories>();
            list = tpDAO.showTypeProduct("");
            model.addAttribute("listCatagories", list);
            model.addAttribute("message", "Delete Catagories Success");
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("message", "Delete Catagories Fail");
        }
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

    //Update loại sản phẩm theo ID và các field cập nhập
    @RequestMapping(params = "btnUpdateCatagories")
    public String updateTypeProduct(ModelMap model, HttpServletRequest request, Catagories ct) {
        ct.setIdCatagories(Integer.parseInt(request.getParameter("txtIdCatagories")));
        ct.setNameCatagories(request.getParameter("txtNameCatagories"));
        ct.setNameBrand(request.getParameter("txtNameBrand"));
        tpDAO.updateTypeProduct(ct);
        //Load lại sản phẩm đang edit
        List<Catagories> list = new ArrayList<Catagories>();
        list.add(ct);
        model.addAttribute("listCatagoriesEdit", list);
        model.addAttribute("image", imageAdmin);
        model.addAttribute("email", emailAdmin);
        model.addAttribute("message", "SUCCESS: Update Success");
        model.addAttribute("username", userLogin);
        return "LoginAdmin/admin/CatagoriesDetails";
    }
}
