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
public class Order {

    private int idOrder;
    private String statusOrder;
    private int totalOrder;
    private String dateStartOrder;
    private String dateEndOrder;
    private String paymentOrder;
    private int quantityOrder;
    private String phoneOrder;
    private String addressOrder;
    private String emailOrder;
    private String nameOrder;
    
    private int idCustomer;
    private String nameCustomer;
    private String addressCustomer;
    private String phoneCustomer;
    private String emailCustomer;
    
    private int idProduct;
    private String nameProduct;
    private int priceProduct;
    
    private int idAdmin;
    private String nameAdmin;

    public Order() {
    }

    public Order(int idOrder, int quantityOrder, String nameProduct, int priceProduct) {
        this.idOrder = idOrder;
        this.quantityOrder = quantityOrder;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public Order(int idOrder, String statusOrder, int totalOrder, String dateStartOrder, String dateEndOrder, String paymentOrder, String phoneOrder, String addressOrder, String emailOrder, String nameOrder, String nameCustomer, String addressCustomer, String phoneCustomer, String emailCustomer,String nameAdmin) {
        this.idOrder = idOrder;
        this.statusOrder = statusOrder;
        this.totalOrder = totalOrder;
        this.dateStartOrder = dateStartOrder;
        this.dateEndOrder = dateEndOrder;
        this.paymentOrder = paymentOrder;
        this.phoneOrder = phoneOrder;
        this.addressOrder = addressOrder;
        this.emailOrder = emailOrder;
        this.nameOrder = nameOrder;
        this.nameCustomer = nameCustomer;
        this.addressCustomer = addressCustomer;
        this.phoneCustomer = phoneCustomer;
        this.emailCustomer = emailCustomer;
        this.nameAdmin = nameAdmin;
    }

    
    
    
    public Order(int idOrder, String statusOrder) {
        this.idOrder = idOrder;
        this.statusOrder = statusOrder;
    }

    public Order(int idOrder, String statusOrder, int totalOrder, String dateStartOrder, String dateEndOrder, String paymentOrder, int quantityOrder, String phoneOrder, String addressOrder, int idCustomer, String nameCustomer, int idProduct, String nameProduct, int priceProduct , String nameAdmin) {
        this.idOrder = idOrder;
        this.statusOrder = statusOrder;
        this.totalOrder = totalOrder;
        this.dateStartOrder = dateStartOrder;
        this.dateEndOrder = dateEndOrder;
        this.paymentOrder = paymentOrder;
        this.quantityOrder = quantityOrder;
        this.phoneOrder = phoneOrder;
        this.addressOrder = addressOrder;
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.nameAdmin = nameAdmin;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public String getPhoneCustomer() {
        return phoneCustomer;
    }

    public void setPhoneCustomer(String phoneCustomer) {
        this.phoneCustomer = phoneCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    
    
    public String getEmailOrder() {
        return emailOrder;
    }

    public void setEmailOrder(String emailOrder) {
        this.emailOrder = emailOrder;
    }

    public String getNameOrder() {
        return nameOrder;
    }

    public void setNameOrder(String nameOrder) {
        this.nameOrder = nameOrder;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNameAdmin() {
        return nameAdmin;
    }

    public void setNameAdmin(String nameAdmin) {
        this.nameAdmin = nameAdmin;
    }
 
   
    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public String getStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(String statusOrder) {
        this.statusOrder = statusOrder;
    }

    public int getTotalOrder() {
        return totalOrder;
    }

    public void setTotalOrder(int totalOrder) {
        this.totalOrder = totalOrder;
    }

    public String getDateStartOrder() {
        return dateStartOrder;
    }

    public void setDateStartOrder(String dateStartOrder) {
        this.dateStartOrder = dateStartOrder;
    }

    public String getDateEndOrder() {
        return dateEndOrder;
    }

    public void setDateEndOrder(String dateEndOrder) {
        this.dateEndOrder = dateEndOrder;
    }

    public String getPhoneOrder() {
        return phoneOrder;
    }

    public void setPhoneOrder(String phoneOrder) {
        this.phoneOrder = phoneOrder;
    }

    public String getAddressOrder() {
        return addressOrder;
    }

    public void setAddressOrder(String addressOrder) {
        this.addressOrder = addressOrder;
    }

   

    public String getPaymentOrder() {
        return paymentOrder;
    }

    public void setPaymentOrder(String paymentOrder) {
        this.paymentOrder = paymentOrder;
    }

  

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getQuantityOrder() {
        return quantityOrder;
    }

    public void setQuantityOrder(int quantityOrder) {
        this.quantityOrder = quantityOrder;
    }

   
    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

  
    
    
   

  
}
