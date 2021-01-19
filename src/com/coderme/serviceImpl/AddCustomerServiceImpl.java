/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderme.serviceImpl;

import com.coderme.connection.DbConnection;
import com.coderme.pojo.AddCustomer;
import com.coderme.service.CommonService;
import com.coderme.service.CommonServiceAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Safayet Zahid
 */

public class AddCustomerServiceImpl extends CommonServiceAdapter<AddCustomer>{
static Connection con=DbConnection.getInstance();
    @Override
    public void createTable() {
       String sql="create table add_customer(id int(11) primary key,"
               + "first_name varchar(100),"
               + "last_name varchar(100),"
               + "nid varchar(50),"
               + "pass_id varchar(50),"
               + "address varchar(200),"
               + "gender varchar(50),"
               + "contact varchar(50))";
       
       try{
           PreparedStatement ps=con.prepareStatement(sql);
           ps.execute();
           System.out.println("Table Created");
       } catch (SQLException e) {
        e.printStackTrace();
    }
    }

    @Override
    public void save(AddCustomer t) {
      String sql = "insert into add_customer(id, first_name, last_name, nid, pass_id, address, gender, contact) values(?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, t.getCustomer_id());    
            ps.setString(2, t.getFirst_name());
            ps.setString(3, t.getLast_name());
            ps.setString(4, t.getNid());
            ps.setString(5, t.getPass_id());
            ps.setString(6, t.getAddress());
            ps.setString(7, t.getGender());
            ps.setString(8, t.getContact());
            ps.executeUpdate();
            System.out.println("Data insert successfully");

        } catch (SQLException ex) {
            Logger.getLogger(AddCustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(AddCustomer t) {
       
        String sql = "update add_customer set first_name=?, last_name=?, nid=?, pass_id=?, address=?, gender=?, contact=? where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
             
            ps.setString(1, t.getFirst_name());
            ps.setString(2, t.getLast_name());
            ps.setString(3, t.getNid());
            ps.setString(4, t.getPass_id());
            ps.setString(5, t.getAddress());
            ps.setString(6, t.getGender());
            ps.setString(7, t.getContact());
            ps.setInt(8, t.getCustomer_id());
            ps.executeUpdate();
            System.out.println("::::: Data Updated Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(AddCustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AddCustomer> getList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AddCustomer get(int id) {        
        AddCustomer customer = null;
        String sql = "select * from add_customer where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //Product(int id, String name, String code, String photoUrl, Category category, boolean status, String note)
                customer= new AddCustomer(rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name"),rs.getString("nid"), rs.getString("pass_id"), rs.getString("address"), rs.getString("gender"), rs.getString("contact"));
    
            }

        } catch (SQLException ex) {
            Logger.getLogger(AddCustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customer;
    
    }   

    @Override
    public List<AddCustomer> getListBySourceAndDepartur(String source, String departure) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    
    

