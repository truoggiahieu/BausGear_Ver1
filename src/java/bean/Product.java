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
public class Product {

    private int idProduct;
    private String nameProduct;
    private String imageProduct;
    private int idCatagories;
    private String statusProduct;
    private int quantityProduct;
    private int priceProduct;
    private String tagProduct;
    private String descriptionProduct;
    private int guaranteeProduct;
    private int idAdmin;

    public Product() {
    }

    public Product(String nameProduct, String imageProduct, int idCatagories, String statusProduct, int quantityProduct, int priceProduct, String tagProduct, String descriptionProduct, int guaranteeProduct, int idAdmin) {
        this.nameProduct = nameProduct;
        this.imageProduct = imageProduct;
        this.idCatagories = idCatagories;
        this.statusProduct = statusProduct;
        this.quantityProduct = quantityProduct;
        this.priceProduct = priceProduct;
        this.tagProduct = tagProduct;
        this.descriptionProduct = descriptionProduct;
        this.guaranteeProduct = guaranteeProduct;
        this.idAdmin = idAdmin;
    }

    
    
    public Product(int idProduct, String nameProduct, String imageProduct, int idCatagories, String statusProduct, int quantityProduct, int priceProduct, String tagProduct, String descriptionProduct, int guaranteeProduct, int idAdmin) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.imageProduct = imageProduct;
        this.idCatagories = idCatagories;
        this.statusProduct = statusProduct;
        this.quantityProduct = quantityProduct;
        this.priceProduct = priceProduct;
        this.tagProduct = tagProduct;
        this.descriptionProduct = descriptionProduct;
        this.guaranteeProduct = guaranteeProduct;
        this.idAdmin = idAdmin;
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

    public String getImageProduct() {
        return imageProduct;
    }

    public void setImageProduct(String imageProduct) {
        this.imageProduct = imageProduct;
    }

    public int getIdCatagories() {
        return idCatagories;
    }

    public void setIdCatagories(int idCatagories) {
        this.idCatagories = idCatagories;
    }

    public String getStatusProduct() {
        return statusProduct;
    }

    public void setStatusProduct(String statusProduct) {
        this.statusProduct = statusProduct;
    }

    public int getQuantityProduct() {
        return quantityProduct;
    }

    public void setQuantityProduct(int quantityProduct) {
        this.quantityProduct = quantityProduct;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getTagProduct() {
        return tagProduct;
    }

    public void setTagProduct(String tagProduct) {
        this.tagProduct = tagProduct;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public int getGuaranteeProduct() {
        return guaranteeProduct;
    }

    public void setGuaranteeProduct(int guaranteeProduct) {
        this.guaranteeProduct = guaranteeProduct;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    

    
}
