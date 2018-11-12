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
public class CustomerAdmin {
    private int idCustomer;
    private String usernameCustomer;
    private String passwordCustomer;
    private String nameCustomer;
    private String emailCustomer;
    private String phoneCustomer;
    private String addressCustomer;
    private String statusCustomer;
    private String imageCustomer;

    public CustomerAdmin() {
    }

    public CustomerAdmin(int idCustomer, String usernameCustomer, String passwordCustomer, String nameCustomer, String emailCustomer, String phoneCustomer, String addressCustomer, String statusCustomer, String imageCustomer) {
        this.idCustomer = idCustomer;
        this.usernameCustomer = usernameCustomer;
        this.passwordCustomer = passwordCustomer;
        this.nameCustomer = nameCustomer;
        this.emailCustomer = emailCustomer;
        this.phoneCustomer = phoneCustomer;
        this.addressCustomer = addressCustomer;
        this.statusCustomer = statusCustomer;
        this.imageCustomer = imageCustomer;
    }

    public CustomerAdmin(String usernameCustomer, String passwordCustomer, String nameCustomer, String emailCustomer, String phoneCustomer, String addressCustomer, String statusCustomer, String imageCustomer) {
        this.usernameCustomer = usernameCustomer;
        this.passwordCustomer = passwordCustomer;
        this.nameCustomer = nameCustomer;
        this.emailCustomer = emailCustomer;
        this.phoneCustomer = phoneCustomer;
        this.addressCustomer = addressCustomer;
        this.statusCustomer = statusCustomer;
        this.imageCustomer = imageCustomer;
    }

    
    
    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getUsernameCustomer() {
        return usernameCustomer;
    }

    public void setUsernameCustomer(String usernameCustomer) {
        this.usernameCustomer = usernameCustomer;
    }

    public String getPasswordCustomer() {
        return passwordCustomer;
    }

    public void setPasswordCustomer(String passwordCustomer) {
        this.passwordCustomer = passwordCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getPhoneCustomer() {
        return phoneCustomer;
    }

    public void setPhoneCustomer(String phoneCustomer) {
        this.phoneCustomer = phoneCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public String getStatusCustomer() {
        return statusCustomer;
    }

    public void setStatusCustomer(String statusCustomer) {
        this.statusCustomer = statusCustomer;
    }

    public String getImageCustomer() {
        return imageCustomer;
    }

    public void setImageCustomer(String imageCustomer) {
        this.imageCustomer = imageCustomer;
    }
    
    
    
}
