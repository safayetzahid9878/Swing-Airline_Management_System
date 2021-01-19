
package com.coderme.serviceImpl;

import com.coderme.connection.DbConnection;
import com.coderme.pojo.Flight;
import com.coderme.service.CommonServiceAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class flightServiceImpl extends CommonServiceAdapter<Flight>{
static Connection con=DbConnection.getInstance();
    @Override
    public void createTable() {
       String sql="create table flight(flight_id int(5) primary key auto_increment,"
               + "flight_name varchar(100),"
               + "source varchar(100),"
               + "departur varchar(50),"
               + "dep_time varchar(200),"
               + "arr_time varchar(50),"
               + "flight_charge varchar(50),"
               + "date varchar(11))";
       
       try{
           PreparedStatement ps=con.prepareStatement(sql);
           ps.execute();
           System.out.println("Table Created");
       } catch (SQLException e) {
        e.printStackTrace();
    }
    }

    @Override
    public void save(Flight t) {
       String sql = "insert into flight(flight_name, source, departur, dep_time, arr_time, flight_charge, date) values(?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
                  
            ps.setString(1, t.getFlightName());
            ps.setString(2, t.getSource());
            ps.setString(3, t.getDeparture());
            ps.setString(4, t.getDepTime());
            ps.setString(5, t.getArrTime());
            ps.setString(6, t.getFlightCharge());
             ps.setString(7, t.getDate());
            ps.executeUpdate();
            System.out.println("Data insert successfully");

        } catch (SQLException ex) {
            Logger.getLogger(flightServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 

    @Override
    public void update(Flight t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    
 

    @Override
    public List<Flight> getListByFlight(int id) {
        ArrayList<Flight> flights = new ArrayList<Flight>();
        String sql = "select * from flight where source=? and departur=?";
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            
            while (rs.next()) {
                Flight flight = new Flight(rs.getInt("id"),rs.getString("flight_name"), rs.getString("source"), rs.getString("departur"), rs.getString("dep_time"), rs.getString("arr_time"), rs.getString("flight_charge"), rs.getString("date"));
                flights.add(flight);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(flightServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return flights;
    }

    @Override
    public List<Flight> getListBySourceAndDepartur(String source, String departur) {
        List<Flight> flights = new ArrayList<>();
        String sql = "select * from flight where source=? and departur=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, source);
            ps.setString(2, departur);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Flight flight= new Flight(rs.getInt("flight_id"), rs.getString("flight_name"), rs.getString("source"),  rs.getString("departur"), rs.getString("dep_time"), rs.getString("arr_time"), rs.getString("flight_charge"), rs.getString("date"));
                flights.add(flight);
            }

        } catch (SQLException ex) {
            Logger.getLogger(flightServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return flights;
    }

    @Override
    public List<Flight> getList() {
       List<Flight> flights = new ArrayList<>();
        String sql = "select * from flight";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
           
            while (rs.next()) {
               Flight flight= new Flight(rs.getInt("flight_id"), rs.getString("flight_name"), rs.getString("source"), rs.getString("departur"), rs.getString("dep_time"), rs.getString("arr_time"), rs.getString("flight_charge"), rs.getString("date"));
                flights.add(flight);
            }

        } catch (SQLException ex) {
            Logger.getLogger(flightServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return flights;
    }
    
    
    }

  
 

