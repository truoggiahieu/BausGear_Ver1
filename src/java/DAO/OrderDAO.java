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
import model.Orders;
import static DAO.CustomerDAO.idCustomer;

/**
 *
 * @author tanks
 */
public class OrderDAO {

    private String statusOrder;

    public OrderDAO() {
    }

    public List<Orders> listOrders(String iduser) {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "select * from Orders where idCustomer = '" + iduser + "'";

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<Orders> list = new ArrayList<>();
            // cax
            while (rs.next()) {
                int id = rs.getInt(1);
                int status = rs.getInt(2);
                if (status == 1) {
                    statusOrder = "Processing";
                } else if (status == 2) {
                    statusOrder = "Delivering";
                } else if (status == 3) {
                    statusOrder = "Delivered";
                } else {
                    statusOrder = "Canceled";
                }
                int total = rs.getInt(3);
                boolean payment = rs.getBoolean(4);
                String date = rs.getString(5);
                int idcus = rs.getInt(6);
                String enddate = rs.getString(7);
                String phone = rs.getString(8);
                String address = rs.getString(9);
                String email = rs.getString(10);
                String name = rs.getString(11);
                int idadmin = rs.getInt(12);
                Orders a = new Orders(id, name, statusOrder, total, payment, date, idcus, enddate, phone, address, email, idadmin);

                list.add(a);
            }
            return list;
        } catch (Exception e) {
            System.out.println("listOrders(DAO)");
            e.printStackTrace();
        }
        return null;
    }
}
