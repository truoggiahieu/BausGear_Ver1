/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Gia Hieu
 */
public class Staff {
    
    private int idAdmin;
    private String usernameAdmin;
    private String passwordAdmin;
    private String nameAdmin;
    private String emailAdmin;
    private String addressAdmin;
    private String phoneAdmin;
    private String statusAdmin;
    private String imageAdminST;
    private int role;

    public Staff() {
    }

    public Staff(int idAdmin, String usernameAdmin, String passwordAdmin, String nameAdmin, String emailAdmin, String addressAdmin, String phoneAdmin, String statusAdmin,String imageAdminST) {
        this.idAdmin = idAdmin;
        this.usernameAdmin = usernameAdmin;
        this.passwordAdmin = passwordAdmin;
        this.nameAdmin = nameAdmin;
        this.emailAdmin = emailAdmin;
        this.addressAdmin = addressAdmin;
        this.phoneAdmin = phoneAdmin;
        this.statusAdmin = statusAdmin;
        this.imageAdminST = imageAdminST;
     
    }

    public Staff(String usernameAdmin, String passwordAdmin, String nameAdmin, String emailAdmin, String addressAdmin, String phoneAdmin, String statusAdmin, String imageAdminST, int role) {
        this.usernameAdmin = usernameAdmin;
        this.passwordAdmin = passwordAdmin;
        this.nameAdmin = nameAdmin;
        this.emailAdmin = emailAdmin;
        this.addressAdmin = addressAdmin;
        this.phoneAdmin = phoneAdmin;
        this.statusAdmin = statusAdmin;
        this.imageAdminST = imageAdminST;
        this.role = role;
    }

  

    public String getImageAdminST() {
        return imageAdminST;
    }

    public void setImageAdmin(String imageAdminST) {
        this.imageAdminST = imageAdminST;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getUsernameAdmin() {
        return usernameAdmin;
    }

    public void setUsernameAdmin(String usernameAdmin) {
        this.usernameAdmin = usernameAdmin;
    }

    public String getPasswordAdmin() {
        return passwordAdmin;
    }

    public void setPasswordAdmin(String passwordAdmin) {
        this.passwordAdmin = passwordAdmin;
    }

    public String getNameAdmin() {
        return nameAdmin;
    }

    public void setNameAdmin(String nameAdmin) {
        this.nameAdmin = nameAdmin;
    }

    public String getEmailAdmin() {
        return emailAdmin;
    }

    public void setEmailAdmin(String emailAdmin) {
        this.emailAdmin = emailAdmin;
    }

    public String getAddressAdmin() {
        return addressAdmin;
    }

    public void setAddressAdmin(String addressAdmin) {
        this.addressAdmin = addressAdmin;
    }

    public String getPhoneAdmin() {
        return phoneAdmin;
    }

    public void setPhoneAdmin(String phoneAdmin) {
        this.phoneAdmin = phoneAdmin;
    }

    public String getStatusAdmin() {
        return statusAdmin;
    }

    public void setStatusAdmin(String statusAdmin) {
        this.statusAdmin = statusAdmin;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
    
    
}
