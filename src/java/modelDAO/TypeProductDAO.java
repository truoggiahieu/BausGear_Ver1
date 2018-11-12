/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import bean.*;
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
public class TypeProductDAO {

    private ResultSet rs;
    private PreparedStatement pstm;

    public TypeProductDAO() {
    }

    public List<Catagories> showTypeProduct(String name) {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "select * from Catagories";
            if (name.length() > 0) {
                sql += "where nameCatagories like '%" + name + "%' order by id asc";
            }
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            List<Catagories> list = new ArrayList<Catagories>();
            while (rs.next()) {
                int idCatagories = rs.getInt(1);
                String nameCatagories = rs.getString(2);
                String nameBrand = rs.getString(3);
                Catagories ct = new Catagories(idCatagories, nameCatagories, nameBrand);
                list.add(ct);
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

    public List<Catagories> showTypeProductCombobox() {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "Select * from Catagories";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            List<Catagories> list = new ArrayList<Catagories>();
            while (rs.next()) {
                int idCatagories = rs.getInt(1);
                String nameCatagories = rs.getString(2);
                Catagories ct = new Catagories(idCatagories, nameCatagories);
                list.add(ct);
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

    public void insertTypeProduct(Catagories ct) {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "insert into Catagories values (?,?)";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, ct.getNameCatagories());
            pstm.setString(2, ct.getNameBrand());
            pstm.executeUpdate();
            pstm.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteTypeProduct(Catagories ct) {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "delete from Catagories where id = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, ct.getIdCatagories());
            pstm.executeUpdate();
            pstm.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateTypeProduct(Catagories ct) {
        try {
            Connection conn = ConnectionDB.getConn();
            String sql = "update Catagories set nameCatagories= ?, nameBrand=?  where id=?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, ct.getNameCatagories());
            pstm.setString(2, ct.getNameBrand());
            pstm.setInt(3, ct.getIdCatagories());
            pstm.executeUpdate();
            pstm.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
