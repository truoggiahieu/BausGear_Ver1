/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;


import bean.CustomerAdmin;
import bean.Staff;
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
public class CustomerDAO {

    private ResultSet rs;
    private PreparedStatement pstm;
    private String statusCustomer;

    public CustomerDAO() {
    }

    public List<CustomerAdmin> showCustomer(String name) {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "Select * from Customers";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            List<CustomerAdmin> list = new ArrayList<CustomerAdmin>();
            while (rs.next()) {
                int idCustomer = rs.getInt(1);
                String usernameCustomer = rs.getString(2);
                String passwordCustomer = rs.getString(3);
                String nameCustomer = rs.getString(4);
                String emailCustomer = rs.getString(5);
                String phoneCustomer = rs.getString(6);
                String addressCustomer = rs.getString(7);
                int status = rs.getInt(8);
                if (status == 1) {
                    statusCustomer = "Enable";
                } else {
                    statusCustomer = "Disable";
                }
                String imageCustomer = rs.getString(9);
                CustomerAdmin cs = new CustomerAdmin(idCustomer, usernameCustomer, passwordCustomer, nameCustomer, emailCustomer, phoneCustomer, addressCustomer, statusCustomer, imageCustomer);
                list.add(cs);
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

    public void updateCustomer(CustomerAdmin cs) {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "update Customers set passwordCustomer = ?, nameCustomer = ?, "
                    + "statusCustomer =?, emailCustomer=?,phoneCustomer=?, "
                    + "addressCustomer=? where id=?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cs.getPasswordCustomer());
            pstm.setString(2, cs.getNameCustomer());
            pstm.setString(3, cs.getStatusCustomer());

            pstm.setString(4, cs.getEmailCustomer());
            pstm.setString(5, cs.getPhoneCustomer());
            pstm.setString(6, cs.getAddressCustomer());
            pstm.setInt(7, cs.getIdCustomer());
            pstm.executeUpdate();
            pstm.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertCustomer(CustomerAdmin cs) {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "insert into Customers values (?,?,?,?,?,?,?,?)";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cs.getUsernameCustomer());
            pstm.setString(2, cs.getPasswordCustomer());
            pstm.setString(3, cs.getNameCustomer());
            pstm.setString(4, cs.getEmailCustomer());
            pstm.setString(5, cs.getPhoneCustomer());
            pstm.setString(6, cs.getAddressCustomer());
            pstm.setString(7, cs.getStatusCustomer());
            pstm.setString(8, cs.getImageCustomer());
            pstm.executeUpdate();
            pstm.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
