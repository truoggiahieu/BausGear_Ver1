/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conection.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Customer;

/**
 *
 * @author Huynh Phuong Duy
 */
public class CustomerDAO {
    public static  int idCustomer;
    public PreparedStatement ps;
    public ResultSet rs;
    public static int idCus;
    public boolean login;
    public boolean user;
    public boolean register;

    public String Login(String username, String password) {
        try {
            try (Connection conn = ConnectionDB.getConn();) {
                String sql = "select * from Customers where usernameCustomer like ? and passwordCustomer like ? and statusCustomer = 1";
                ps = conn.prepareStatement(sql);
                ps.setString(1, username);
                ps.setString(2, password);
                rs = ps.executeQuery();
                if (rs.next()) {
                    idCustomer = rs.getInt(1);
                    int role = rs.getInt(8);
                    if (role == 1) {
                        return "customer";
                    } else if (role == 0) {
                        return "guest";
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "false";
    }

    public boolean checkLoginCustomer(Customer customer) {
        login = false;
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "select * from Customers where usernameCustomer = ? and passwordCustomer = ? and statusCustomer = 1";
            ps = conn.prepareStatement(sql);
            ps.setString(1, customer.getUsernameCustomer());
            ps.setString(2, customer.getPasswordCustomer());
            rs = ps.executeQuery();
            if (rs.next()) {
                idCus = rs.getInt("id");
                customer.setIdCustomer(idCus);
                login = true;
            }
            conn.close();
            rs.close();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return login;
    }

    public boolean checkEmailAndUsername(Customer customer) {
        user = false;
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "select * from  Customers where  emailCustomer = ? ";
            ps = conn.prepareStatement(sql);
            ps.setString(1, customer.getEmailCustomer());
            rs = ps.executeQuery();
            if (rs.next()) {
                user = true;
            }
            conn.close();
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    public void updatePasswordCustomer(Customer customer) {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "Update Customers set passwordCustomer = ? where emailCustomer = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, customer.getPasswordCustomer());
            ps.setString(2, customer.getEmailCustomer());
            ps.executeUpdate();
            conn.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateCustomer(Customer cs) {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "update Customers set passwordCustomer = ?, nameCustomer = ?, "
                    + "statusCustomer =?, imageCustomer=?,emailCustomer=?,phoneCustomer=?, "
                    + "addressCustomer=? where id=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, cs.getPasswordCustomer());
            ps.setString(2, cs.getNameCustomer());
            ps.setString(3, cs.getStatusCustomer());
            ps.setString(4, cs.getImageCustomer());
            ps.setString(5, cs.getEmailCustomer());
            ps.setString(6, cs.getPhoneCustomer());
            ps.setString(7, cs.getAddressCustomer());
            ps.setInt(8, cs.getIdCustomer());
            ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertCustomer(Customer cs) {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "insert into Customers values (?, ?, ?, ?, ?, ?, 1, ?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, cs.getUsernameCustomer());
            ps.setString(2, cs.getPasswordCustomer());
            ps.setString(3, cs.getNameCustomer());
            ps.setString(4, cs.getEmailCustomer());
            ps.setString(5, cs.getPhoneCustomer());
            ps.setString(6, cs.getAddressCustomer());
            ps.setString(7, cs.getImageCustomer());
            ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Customer> showCustomer(String username) {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "Select * from Customers where usernameCustomer like '" + username + "'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<Customer> list = new ArrayList<Customer>();
            while (rs.next()) {
                int idCustomer = rs.getInt(1);
                String usernameCustomer = rs.getString(2);
                String passwordCustomer = rs.getString(3);
                String nameCustomer = rs.getString(4);
                String emailCustomer = rs.getString(5);
                String phoneCustomer = rs.getString(6);
                String addressCustomer = rs.getString(7);
                String statusCustomer = rs.getString(8);
                String imageCustomer = rs.getString(9);
                Customer cus = new Customer(idCustomer, usernameCustomer, passwordCustomer, nameCustomer, emailCustomer, phoneCustomer, addressCustomer, statusCustomer, imageCustomer);
                list.add(cus);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
}
