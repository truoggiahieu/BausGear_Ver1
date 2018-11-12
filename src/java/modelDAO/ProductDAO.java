/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import bean.Product;
import bean.*;
import static model.AdminDAO.idAdmin;
import conection.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gia Hieu
 */
public class ProductDAO {

    private ResultSet rs;
    private PreparedStatement pstm;
    private String statusProduct;

    public ProductDAO() {
    }

    public List<Product> showProduct(String name) {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "Select * from Products";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            List<Product> list = new ArrayList<Product>();
            while (rs.next()) {
                int idProduct = rs.getInt(1);
                String nameProduct = rs.getString(2);
                String imageProduct = rs.getString(3);
                int status = rs.getInt(4);
                if (status == 1) {
                    statusProduct = "Enable";
                } else {
                    statusProduct = "Disable";
                }
                int quantityProduct = rs.getInt(5);
                int priceProduct = rs.getInt(6);
                String tagProduct = rs.getString(7);
                String descriptionProduct = rs.getString(8);
                int gruaranteeProduct = rs.getInt(9);
                int idCatagories = rs.getInt(10);
                int idAdmin = rs.getInt(11);
                Product pr = new Product(idProduct, nameProduct, imageProduct, idCatagories, statusProduct, quantityProduct, priceProduct, tagProduct, descriptionProduct, gruaranteeProduct, idAdmin);
                list.add(pr);
            }
            conn.close();
            pstm.close();
            rs.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void insertProducts(Product pr) {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "insert into Products values (?,?,?,?,?,?,?,?,?,?)";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, pr.getNameProduct());
            pstm.setString(2, pr.getImageProduct());
            pstm.setString(3, pr.getStatusProduct());
            pstm.setInt(4, pr.getQuantityProduct());
            pstm.setInt(5, pr.getPriceProduct());
            pstm.setString(6, pr.getTagProduct());
            pstm.setString(7, pr.getDescriptionProduct());
            pstm.setInt(8, pr.getGuaranteeProduct());
            pstm.setInt(9, pr.getIdCatagories());
            pstm.setInt(10, pr.getIdAdmin());
            pstm.executeUpdate();
            pstm.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
// 

    public void deleteProducts(Product pr) {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "delete from Products where id = ? ";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, pr.getIdProduct());
            pstm.executeUpdate();
            pstm.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateProducts(Product pr) {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "update Products set nameProduct=? ,imageProduct= ?,statusProduct=? , quantityProduct = ?,priceProduct = ?,"
                    + " tagProduct = ? , descriptionProduct = ? , guaranteeProduct = ?, idCatagories = ?, idAdmin = ? where id=?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, pr.getNameProduct());
            pstm.setString(2, pr.getImageProduct());
            pstm.setString(3, pr.getStatusProduct());
            pstm.setInt(4, pr.getQuantityProduct());
            pstm.setInt(5, pr.getPriceProduct());
            pstm.setString(6, pr.getTagProduct());
            pstm.setString(7, pr.getDescriptionProduct());
            pstm.setInt(8, pr.getGuaranteeProduct());
            pstm.setInt(9, pr.getIdCatagories());
            pstm.setInt(10, pr.getIdAdmin());
            pstm.setInt(11, pr.getIdProduct());
            pstm.executeUpdate();
            pstm.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
