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
public class Catagories {

    private int idCatagories;
    private String nameCatagories;
    private String nameBrand;

    public Catagories() {
    }

    public Catagories(String nameCatagories, String nameBrand) {
        this.nameCatagories = nameCatagories;
        this.nameBrand = nameBrand;
    }

    public Catagories(int idCatagories, String nameCatagories) {
        this.idCatagories = idCatagories;
        this.nameCatagories = nameCatagories;
    }

  
    
    public Catagories(int idCatagories, String nameCatagories, String nameBrand) {
        this.idCatagories = idCatagories;
        this.nameCatagories = nameCatagories;
        this.nameBrand = nameBrand;
    }

    public int getIdCatagories() {
        return idCatagories;
    }

    public void setIdCatagories(int idCatagories) {
        this.idCatagories = idCatagories;
    }

    public String getNameCatagories() {
        return nameCatagories;
    }

    public void setNameCatagories(String nameCatagories) {
        this.nameCatagories = nameCatagories;
    }

    public String getNameBrand() {
        return nameBrand;
    }

    public void setNameBrand(String nameBrand) {
        this.nameBrand = nameBrand;
    }

}
