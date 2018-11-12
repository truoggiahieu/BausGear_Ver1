/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import conection.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Gia Hieu
 */
public class StatisticalDAO {

    private ResultSet rs;
    private PreparedStatement pstm;

    public static int orders = 0;
    public static int ordersOnDay = 0;
    public static int totalOrder = 0;
    public static int customer = 0;
    public static int processing = 0;
    public static int delivering = 0;
    public static int delivered = 0;
    public static int canceled = 0;

    public StatisticalDAO() {
    }

    public void countOrders() {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "SELECT COUNT (*) as CO FROM Orders";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            if (rs.next()) {
                orders = rs.getInt("CO");
            }
            rs.close();
            conn.close();
            pstm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void countOrdersDay() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = formatter.format(date);
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "SELECT COUNT (*) as COD FROM Orders where dateStartOrder =?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, strDate);
            rs = pstm.executeQuery();
            if (rs.next()) {
                ordersOnDay = rs.getInt("COD");
            }
            rs.close();
            conn.close();
            pstm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void totalOrder() {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "SELECT SUM(totalOrder) as TT FROM Orders";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            if (rs.next()) {
                totalOrder = rs.getInt("TT");
            }
            rs.close();
            conn.close();
            pstm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sumCustomer() {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "SELECT COUNT(id) as SC FROM Customers";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            if (rs.next()) {
                customer = rs.getInt("SC");
            }
            rs.close();
            conn.close();
            pstm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void countProcessing() {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "select COUNT(*) as Status From Orders Where statusOrder = 1";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            if (rs.next()) {
                processing = rs.getInt("Status");
            }
            rs.close();
            conn.close();
            pstm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void countDelivering() {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "select COUNT(*) as Status From Orders Where statusOrder = 2";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            if (rs.next()) {
                delivering = rs.getInt("Status");
            }
            rs.close();
            conn.close();
            pstm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void countDelivered() {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "select COUNT(*) as Status From Orders Where statusOrder = 3";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            if (rs.next()) {
                delivered = rs.getInt("Status");
            }
            rs.close();
            conn.close();
            pstm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void countCanceled() {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "select COUNT(*) as Status From Orders Where statusOrder = 4";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            if (rs.next()) {
                canceled = rs.getInt("Status");
            }
            rs.close();
            conn.close();
            pstm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
