/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conection.ConnectionDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import model.Products;

/**
 *
 * @author ThanhLich
 */
public class ProductsDAO {

    private ResultSet rs;
    private PreparedStatement pstm;
    private String statusProduct;

    public List<Products> showproducts() {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "Select * from Products Where statusProduct = 1";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<Products> list = new ArrayList<Products>();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String image = rs.getString(3);
                String status = rs.getString(4);
                int quantity = rs.getInt(5);
                int price = rs.getInt(6);
                String tag = rs.getString(7);
                String des = rs.getString(8);
                int ganrantee = rs.getInt(9);
                int iscatalog = rs.getInt(10);
                int isadmin = rs.getInt(11);
                Products a = new Products(id, name, image, status, quantity, price, tag, des, ganrantee, iscatalog, isadmin);
                list.add(a);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public List<Products> SearchProduct(String txtSearch) {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "Select * from Products \n"
                    + "where nameProduct like '%" + txtSearch + "%' or tagProduct like '%" + txtSearch + "%' or priceProduct like '%" + txtSearch + "%'";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            List<Products> list = new ArrayList<Products>();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String image = rs.getString(3);
                String status = rs.getString(4);
                int quantity = rs.getInt(5);
                int price = rs.getInt(6);
                String tag = rs.getString(7);
                String des = rs.getString(8);
                int ganrantee = rs.getInt(9);
                int iscatalog = rs.getInt(10);
                int isadmin = rs.getInt(11);
                Products pr = new Products(id, name, image, iscatalog, status, quantity, price, tag, des, ganrantee, isadmin);
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
}
