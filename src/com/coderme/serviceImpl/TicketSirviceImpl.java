
package com.coderme.serviceImpl;

import com.coderme.connection.DbConnection;
import com.coderme.pojo.Ticket;
import com.coderme.service.CommonServiceAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



 public class TicketSirviceImpl extends CommonServiceAdapter<Ticket>{    
        static Connection con=DbConnection.getInstance(); 
    @Override
    public Ticket getFlightBySourceAndDepartur(String source, String departur) {
        return super.getFlightBySourceAndDepartur(source, departur); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ticket> getListByFlight(int id) {
        return super.getListByFlight(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ticket> getList() {
        return super.getList(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ticket getByName(String name) {
        return super.getByName(name); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ticket get(int id) {
        return super.get(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        super.delete(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Ticket t) {
        super.update(t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(Ticket t) {
         String sql = "insert into ticket(ticket_id, flight_id, cust_id, categroy, price, seats, date) values(?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
                  
            ps.setInt(1, t.getTicket_id());
            ps.setString(2, t.getFlight_id());
            ps.setString(3, t.getCust_id());
            ps.setString(4, t.getCategroy());
            ps.setString(5, t.getPrice());
            ps.setString(6, t.getSeats());
            ps.setString(7, t.getDate());
            ps.executeUpdate();
            System.out.println("Ticket Bookd");

        } catch (SQLException ex) {
            Logger.getLogger(flightServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
        
        
        
        
    

    @Override
    public void createTable() {
      String sql="create table ticket(ticket_id int(5) primary key,"
               + "flight_id varchar(100),"
               + "cust_id varchar(100),"
               + "categroy varchar(50),"
               + "price int(11),"
               + "seats int(11),"
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
    public List<Ticket> getListBySourceAndDepartur(String source, String departure) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  

    
  

    } 


