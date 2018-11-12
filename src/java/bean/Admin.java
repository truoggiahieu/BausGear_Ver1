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
public class Admin {

    private int idAdmin;
    private String usernameAdmin;
    private String passwordAdmin;
    private String nameAdmin;
    private String emailAdmin;
    private String phoneAdmin;
    private String addressAdmin;
    private String imageAdmin;
    private String statusAdmin;
    private int roleAdmin;

    public Admin() {
    }

    public Admin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public Admin(String usernameAdmin, String passwordAdmin, String nameAdmin, String emailAdmin, String phoneAdmin, String addressAdmin,String imageAdmin) {
        this.usernameAdmin = usernameAdmin;
        this.passwordAdmin = passwordAdmin;
        this.nameAdmin = nameAdmin;
        this.emailAdmin = emailAdmin;
        this.phoneAdmin = phoneAdmin;
        this.addressAdmin = addressAdmin;
        this.imageAdmin = imageAdmin;

    }

    public Admin(int idAdmin, String usernameAdmin, String passwordAdmin, String nameAdmin, String emailAdmin, String phoneAdmin, String addressAdmin, String imageAdmin, String statusAdmin, int roleAdmin) {
        this.idAdmin = idAdmin;
        this.usernameAdmin = usernameAdmin;
        this.passwordAdmin = passwordAdmin;
        this.nameAdmin = nameAdmin;
        this.emailAdmin = emailAdmin;
        this.phoneAdmin = phoneAdmin;
        this.addressAdmin = addressAdmin;
        this.imageAdmin = imageAdmin;
        this.statusAdmin = statusAdmin;
        this.roleAdmin = roleAdmin;
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

    public String getPhoneAdmin() {
        return phoneAdmin;
    }

    public void setPhoneAdmin(String phoneAdmin) {
        this.phoneAdmin = phoneAdmin;
    }

    public String getAddressAdmin() {
        return addressAdmin;
    }

    public void setAddressAdmin(String addressAdmin) {
        this.addressAdmin = addressAdmin;
    }

    public String getStatusAdmin() {
        return statusAdmin;
    }

    public void setStatusAdmin(String statusAdmin) {
        this.statusAdmin = statusAdmin;
    }

    public int getRoleAdmin() {
        return roleAdmin;
    }

    public void setRoleAdmin(int roleAdmin) {
        this.roleAdmin = roleAdmin;
    }

    public String getImageAdmin() {
        return imageAdmin;
    }

    public void setImageAdmin(String imageAdmin) {
        this.imageAdmin = imageAdmin;
    }
    

}
