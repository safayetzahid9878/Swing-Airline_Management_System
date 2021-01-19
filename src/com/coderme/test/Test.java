
package com.coderme.test;

import com.coderme.connection.DbConnection;
import com.coderme.service.CommonService;
import com.coderme.serviceImpl.AddCustomerServiceImpl;
import com.coderme.serviceImpl.TicketSirviceImpl;
import com.coderme.serviceImpl.flightServiceImpl;
import java.sql.Connection;

public class Test {
      public static void main(String[] args) {
        //Connection con=DbConnection.getInstance();
       CommonService flightService = new flightServiceImpl();
       // CommonService customerService = new AddCustomerServiceImpl();
        //CommonService ticketService = new TicketSirviceImpl();
        
        
        
        //ticketService.createTable();
         //customerService.createTable();
         flightService.createTable();
         
       }
    }
    

