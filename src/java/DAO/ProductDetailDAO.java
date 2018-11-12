/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conection.ConnectionDB;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Products;

/**
 *
 * @author tanks
 */
public class ProductDetailDAO {

    public ProductDetailDAO() {
    }

    public List<Products> findOne_Id_of_Product(int idd) {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "Select * from Products where id like +'" + idd + "'";//thieu chu~ s
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
            System.out.println("findOne_Id_of_Product(ProductDetailDAO)");
            e.printStackTrace();
        }
        return null;
    }
}
