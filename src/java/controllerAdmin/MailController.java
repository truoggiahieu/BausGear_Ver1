/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerAdmin;

import bean.Mailer;
import static controllerAdmin.LoginAdminController.userLogin;
import static model.AdminDAO.emailAdmin;
import static model.AdminDAO.imageAdmin;
import static model.AdminDAO.role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Gia Hieu
 */
@Controller
public class MailController {

    @Autowired
    Mailer mailer;

    public String from = "giahieu0201@gmail.com";

    @RequestMapping(params = "btnSendMailTo")
    public String send(ModelMap model,
            @RequestParam("to") String to,
            @RequestParam("subject") String subject,
            @RequestParam("body") String body) {
        try {
            //Gửi mail
            mailer.send(from, to, subject, body);
            if (role == 1) {
                model.addAttribute("role", "Admin");
            } else {
                model.addAttribute("role", "Staff");
            }

            model.addAttribute("username", userLogin);
            model.addAttribute("message", "Send Mail Success");
        } catch (Exception e) {
            e.printStackTrace();
            if (role == 1) {
                model.addAttribute("role", "Admin");
            } else {
                model.addAttribute("role", "Staff");
            }
            model.addAttribute("username", userLogin);
            model.addAttribute("message", "Send Mail Failed");
        }
        model.addAttribute("image", imageAdmin);
        model.addAttribute("email", emailAdmin);
        return "LoginAdmin/admin/Mail";
    }
}
