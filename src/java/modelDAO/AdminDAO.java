/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import bean.Admin;
import bean.*;
import conection.ConnectionDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gia Hieu
 */
public class AdminDAO {

    private ResultSet rs;
    private PreparedStatement pstm;
    public boolean login;
    public boolean user;
    public static int role;
    public static int idAdmin;
    public static String emailAdmin;
    public static String imageAdmin;
    public static String emailAdmin2;
    public static String imageAdmin2;

    public AdminDAO() {
    }

    public List<Admin> showAdminLike(Admin ad) {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "select * from Admin where id = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, ad.getIdAdmin());
            rs = pstm.executeQuery();
            List<Admin> list = new ArrayList<Admin>();
            while (rs.next()) {
                String usernameAdmin = rs.getString("usernameAdmin");
                String passwordAdmin = rs.getString("passwordAdmin");
                String nameAdmin = rs.getString("nameAdmin");
                String emailAdmin = rs.getString("emailAdmin");
                String addressAdmin = rs.getString("addressAdmin");
                String phoneAdmin = rs.getString("phoneAdmin");
                String imageAdmin = rs.getString("imageAdmin");
                Admin adm = new Admin(usernameAdmin, passwordAdmin, nameAdmin, emailAdmin, phoneAdmin, addressAdmin, imageAdmin);
                list.add(adm);
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

    public boolean checkLogin(Admin admin) {
        login = false;
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "select * from Admin where usernameAdmin = ? and passwordAdmin = ? and statusAdmin = 1";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, admin.getUsernameAdmin());
            pstm.setString(2, admin.getPasswordAdmin());
            rs = pstm.executeQuery();
            if (rs.next()) {
                idAdmin = rs.getInt("id");
                role = rs.getInt("role");
                emailAdmin = rs.getString("emailAdmin");
                imageAdmin = rs.getString("imageAdmin");
                emailAdmin2 = rs.getString("emailAdmin");
                imageAdmin2 = rs.getString("imageAdmin");
                admin.setRoleAdmin(role);
                admin.setIdAdmin(idAdmin);
                admin.setEmailAdmin(emailAdmin);
                admin.setImageAdmin(imageAdmin);
                admin.setEmailAdmin(emailAdmin2);
                admin.setImageAdmin(imageAdmin2);
                login = true;
            }
            conn.close();
            rs.close();
            pstm.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return login;
    }

    public boolean checkEmailAndUsernam(Admin admin) {
        user = false;
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "select * from  Admin where  emailAdmin = ? ";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, admin.getEmailAdmin());
            rs = pstm.executeQuery();
            if (rs.next()) {
                user = true;
            }
            conn.close();
            rs.close();
            pstm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;

    }

    public void updatePasswordAdmin(Admin admin) {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "Update Admin set passwordAdmin = ? where emailAdmin = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, admin.getPasswordAdmin());
            pstm.setString(2, admin.getEmailAdmin());
            pstm.executeUpdate();
            conn.close();
            pstm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateProfile(Admin admin) {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "Update Admin set usernameAdmin=?, passwordAdmin=?"
                    + ",nameAdmin=?,emailAdmin=?,addressAdmin=?, phoneAdmin=? where id =?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, admin.getUsernameAdmin());
            pstm.setString(2, admin.getPasswordAdmin());
            pstm.setString(3, admin.getNameAdmin());
            pstm.setString(4, admin.getEmailAdmin());
            pstm.setString(5, admin.getAddressAdmin());
            pstm.setString(6, admin.getPhoneAdmin());
            pstm.setInt(7, admin.getIdAdmin());
            pstm.executeUpdate();
            pstm.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
