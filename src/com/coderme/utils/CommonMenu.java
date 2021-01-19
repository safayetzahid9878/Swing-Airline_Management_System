
package com.coderme.utils;

import com.coderme.view.AddCustomerView;
import com.coderme.view.UserView;
import com.coderme.view.flightView;
import com.coderme.view.loging;
import com.coderme.view.scerchCustomerView;
import com.coderme.view.ticketView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class CommonMenu {
    public void getCommonMenu(JFrame f) {
        JMenuBar menuBar = new JMenuBar();
      
        
        JMenu file = new JMenu("Customer");
        JMenuItem addCustomer = new JMenuItem("Add Customer");
        addCustomer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
               new AddCustomerView().setVisible(true);
              //f.setVisible(false);
            }
        });
        JMenuItem serchCustomer = new JMenuItem("Serch Customer");
        serchCustomer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
               new scerchCustomerView().setVisible(true);
               //f.setVisible(false);
            }
        });
             
        file.add(addCustomer);
        file.add(serchCustomer);

        menuBar.add(file);
        ////////////////////////////////////////
          JMenu flight = new JMenu("Flight");
        JMenuItem addFlight = new JMenuItem("Add Flight");
        addFlight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
               new flightView().setVisible(true);
               //f.setVisible(false);
            }
        });
              
        flight.add(addFlight);        
        menuBar.add(flight);
        //////////////////////////////////////
        JMenu tic = new JMenu("Ticket");
        JMenuItem bookTicket = new JMenuItem("Book Ticket");
        bookTicket.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                new ticketView().setVisible(true);
               //f.setVisible(false);
            }
        });
        tic.add(bookTicket);
        menuBar.add(tic);
        
        
        /////////////////////////////////////////////
       
        
        JMenu user = new JMenu("Users");
        JMenuItem userCreat = new JMenuItem("User Creation");
        userCreat.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                new UserView().setVisible(true);
              // f.setVisible(false);
            }
        });
        user.add(userCreat);
        menuBar.add(user);
  
       
     
       JMenu log = new JMenu("Log");
        JMenuItem logout = new JMenuItem("Log Out");
        logout.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                new loging().setVisible(true);
               f.setVisible(false);
            }
        });
        log.add(logout);
        menuBar.add(log);
        f.setJMenuBar(menuBar);
    }
        
        
}        
      
    

