/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import bean.Order;
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
public class StaffDAO {

    private ResultSet rs;
    private PreparedStatement pstm;
    private String statusAdmin;

    public StaffDAO() {
    }

    public List<Staff> showStaff(String name) {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "Select * from Admin where role = 0";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            List<Staff> list = new ArrayList<Staff>();
            while (rs.next()) {
                int idAdmin = rs.getInt(1);
                String usernameAdmin = rs.getString(2);
                String passwordAdmin = rs.getString(3);
                String nameAdmin = rs.getString(4);
                String emailAdmin = rs.getString(5);
                String addressAdmin = rs.getString(6);
                String phoneAdmin = rs.getString(7);
                int status = rs.getInt(8);
                String imageAdminST = rs.getString(10);
                if (status == 1) {
                    statusAdmin = "Enable";
                } else {
                    statusAdmin = "Disable";
                }
                Staff st = new Staff(idAdmin, usernameAdmin, passwordAdmin, nameAdmin, emailAdmin, addressAdmin, phoneAdmin, statusAdmin, imageAdminST);
                list.add(st);
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

    public void insertStaff(Staff st) {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "insert into Admin values (?,?,?,?,?,?,?,?,?)";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, st.getUsernameAdmin());
            pstm.setString(2, st.getPasswordAdmin());
            pstm.setString(3, st.getNameAdmin());
            pstm.setString(4, st.getEmailAdmin());
            pstm.setString(5, st.getAddressAdmin());
            pstm.setString(6, st.getPhoneAdmin());
            pstm.setString(7, st.getStatusAdmin());
            pstm.setInt(8, st.getRole());
            pstm.setString(9, st.getImageAdminST());
            pstm.executeUpdate();
            pstm.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateStaff(Staff st) {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "update Admin set passwordAdmin= ? ,nameAdmin= ? ,emailAdmin= ?, addressAdmin=?"
                    + ",phoneAdmin= ?, statusAdmin= ? where id=?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, st.getPasswordAdmin());
            pstm.setString(2, st.getNameAdmin());
            pstm.setString(3, st.getEmailAdmin());
            pstm.setString(4, st.getAddressAdmin());
            pstm.setString(5, st.getPhoneAdmin());
            pstm.setString(6, st.getStatusAdmin());
            pstm.setInt(7, st.getIdAdmin());
            pstm.executeUpdate();
            pstm.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteStaff(Staff st) {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "delete from Admin where id = ? ";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, st.getIdAdmin());
            pstm.executeUpdate();
            pstm.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
