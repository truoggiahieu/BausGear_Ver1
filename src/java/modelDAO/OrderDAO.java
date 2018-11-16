/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import bean.Order;
import bean.Product;
import bean.*;
import conection.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import static model.AdminDAO.idAdmin;

/**
 *
 * @author Gia Hieu
 */
public class OrderDAO {

    private ResultSet rs;
    private PreparedStatement pstm;
    private String statusOrder;
    private String paymentOrder;

    public OrderDAO() {
    }

    public List<Order> showOrder() {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "Select Customers.nameCustomer, Customers.addressCustomer, Customers.emailCustomer,\n"
                    + "Customers.phoneCustomer, Orders.* , Admin.nameAdmin\n"
                    + "From Orders\n"
                    + "inner join Customers on Customers.id = Orders.idCustomer\n"
                    + "inner join Admin on Admin.id = Orders.idAdmin";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            List<Order> list = new ArrayList<Order>();
            while (rs.next()) {
                String nameCustomer = rs.getString("nameCustomer");
                String addressCustomer = rs.getString("addressCustomer");
                String emailCustomer = rs.getString("emailCustomer");
                String phoneCustomer = rs.getString("phoneCustomer");

                int idOrder = rs.getInt("id");
                int status = rs.getInt("statusOrder");
                if (status == 1) {
                    statusOrder = "Processing";
                } else if (status == 2) {
                    statusOrder = "Delivering";
                } else if (status == 3) {
                    statusOrder = "Delivered";
                } else {
                    statusOrder = "Canceled";
                }
                int totalOrder = rs.getInt("totalOrder");
                int payment = rs.getInt("paymentOrder");
                if (payment == 1) {
                    paymentOrder = "Cash On Delivery";
                } else {
                    paymentOrder = "Creadit Transfer";
                }
                String dateStartOrder = rs.getString("dateStartOrder");
                String dateEndOrder = rs.getString("dateEndOrder");
                String phoneOrder = rs.getString("phoneOrder");
                String addressOrder = rs.getString("addressOrder");
                String emailOrder = rs.getString("emailOrder");
                String nameOrder = rs.getString("nameOrder");
                String nameAdmin = rs.getString("nameAdmin");

                Order ord = new Order(idOrder, statusOrder, totalOrder, dateStartOrder, dateEndOrder, paymentOrder, phoneOrder, addressOrder, emailOrder, nameOrder, nameCustomer, addressCustomer, phoneCustomer, emailCustomer, nameAdmin);

                list.add(ord);
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

    public List<Order> showOrderLikeStaff() {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "Select Customers.nameCustomer, Customers.addressCustomer, Customers.emailCustomer,\n"
                    + "Customers.phoneCustomer, Orders.* , Admin.nameAdmin\n"
                    + "From Orders\n"
                    + "inner join Customers on Customers.id = Orders.idCustomer\n"
                    + "inner join Admin on Admin.id = Orders.idAdmin where Orders.idAdmin = ? ";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, idAdmin);
            rs = pstm.executeQuery();

            List<Order> list = new ArrayList<Order>();
            while (rs.next()) {
                String nameCustomer = rs.getString("nameCustomer");
                String addressCustomer = rs.getString("addressCustomer");
                String emailCustomer = rs.getString("emailCustomer");
                String phoneCustomer = rs.getString("phoneCustomer");

                int idOrder = rs.getInt("id");
                int status = rs.getInt("statusOrder");
                if (status == 1) {
                    statusOrder = "Processing";
                } else if (status == 2) {
                    statusOrder = "Delivering";
                } else if (status == 3) {
                    statusOrder = "Delivered";
                } else {
                    statusOrder = "Canceled";
                }
                int totalOrder = rs.getInt("totalOrder");
                int payment = rs.getInt("paymentOrder");
                if (payment == 1) {
                    paymentOrder = "Cash On Delivery";
                } else {
                    paymentOrder = "Creadit Transfer";
                }
                String dateStartOrder = rs.getString("dateStartOrder");
                String dateEndOrder = rs.getString("dateEndOrder");
                String phoneOrder = rs.getString("phoneOrder");
                String addressOrder = rs.getString("addressOrder");
                String emailOrder = rs.getString("emailOrder");
                String nameOrder = rs.getString("nameOrder");
                String nameAdmin = rs.getString("nameAdmin");

                Order ord = new Order(idOrder, statusOrder, totalOrder, dateStartOrder, dateEndOrder, paymentOrder, phoneOrder, addressOrder, emailOrder, nameOrder, nameCustomer, addressCustomer, phoneCustomer, emailCustomer, nameAdmin);

                list.add(ord);
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

    public List<Order> showOrderLikeStaffWhereStatus() {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "Select Customers.nameCustomer, Customers.addressCustomer, Customers.emailCustomer,\n"
                    + "Customers.phoneCustomer, Orders.* , Admin.nameAdmin\n"
                    + "From Orders\n"
                    + "inner join Customers on Customers.id = Orders.idCustomer\n"
                    + "inner join Admin on Admin.id = Orders.idAdmin where Orders.statusOrder = 1 ";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            List<Order> list = new ArrayList<Order>();
            while (rs.next()) {
                String nameCustomer = rs.getString("nameCustomer");
                String addressCustomer = rs.getString("addressCustomer");
                String emailCustomer = rs.getString("emailCustomer");
                String phoneCustomer = rs.getString("phoneCustomer");

                int idOrder = rs.getInt("id");
                int status = rs.getInt("statusOrder");
                if (status == 1) {
                    statusOrder = "Processing";
                } else if (status == 2) {
                    statusOrder = "Delivering";
                } else if (status == 3) {
                    statusOrder = "Delivered";
                } else {
                    statusOrder = "Canceled";
                }
                int totalOrder = rs.getInt("totalOrder");
                int payment = rs.getInt("paymentOrder");
                if (payment == 1) {
                    paymentOrder = "Cash On Delivery";
                } else {
                    paymentOrder = "Creadit Transfer";
                }
                String dateStartOrder = rs.getString("dateStartOrder");
                String dateEndOrder = rs.getString("dateEndOrder");
                String phoneOrder = rs.getString("phoneOrder");
                String addressOrder = rs.getString("addressOrder");
                String emailOrder = rs.getString("emailOrder");
                String nameOrder = rs.getString("nameOrder");
                String nameAdmin = rs.getString("nameAdmin");

                Order ord = new Order(idOrder, statusOrder, totalOrder, dateStartOrder, dateEndOrder, paymentOrder, phoneOrder, addressOrder, emailOrder, nameOrder, nameCustomer, addressCustomer, phoneCustomer, emailCustomer, nameAdmin);

                list.add(ord);
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

    public List<Order> showOrderDetails(Order or) {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "Select  OrderDetails.idOrder,OrderDetails.quantityOrderDetails,OrderDetails.price ,Products.nameProduct  , Products.imageProduct\n"
                    + "From OrderDetails\n"
                    + "inner join Products\n"
                    + "on Products.id = OrderDetails.idProduct and OrderDetails.idOrder = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, or.getIdOrder());
            rs = pstm.executeQuery();
            List<Order> list = new ArrayList<Order>();
            while (rs.next()) {
                int idOrder = rs.getInt("idOrder");
                int quantityOrder = rs.getInt("quantityOrderDetails");
                String nameProduct = rs.getString("nameProduct");
                int priceProduct = rs.getInt("price");
                Order ord = new Order(idOrder, quantityOrder, nameProduct, priceProduct);
                list.add(ord);
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

    public void updateOrder(Order or) {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "update Orders set statusOrder = ? , idAdmin = ? where id = ? ";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, or.getStatusOrder());
            pstm.setInt(2, idAdmin);
            pstm.setInt(3, or.getIdOrder());
            pstm.executeUpdate();
            pstm.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteOrders(Order or) {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "delete from Orders where id = ? ";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, or.getIdOrder());
            pstm.executeUpdate();
            pstm.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteOrdersDetails(Order or) {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "delete from OrderDetails where idOrder = ? ";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, or.getIdOrder());
            pstm.executeUpdate();
            pstm.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
