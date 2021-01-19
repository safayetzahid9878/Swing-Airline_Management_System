
package com.coderme.pojo;


public class Ticket {
      private int ticket_id;
    private String flight_id;
    private String cust_id;
    private String categroy;
    private String price;
    private String seats;
    private String date;

    public Ticket() {
    }

    public Ticket(int ticket_id, String flight_id, String cust_id, String categroy, String price, String seats, String date) {
        this.ticket_id = ticket_id;
        this.flight_id = flight_id;
        this.cust_id = cust_id;
        this.categroy = categroy;
        this.price = price;
        this.seats = seats;
        this.date = date;
    }

    public Ticket(String flight_id, String cust_id, String categroy, String price, String seats, String date) {
        this.flight_id = flight_id;
        this.cust_id = cust_id;
        this.categroy = categroy;
        this.price = price;
        this.seats = seats;
        this.date = date;
    }

    public int getTicket_id() {
        return ticket_id;
    }

    public String getFlight_id() {
        return flight_id;
    }

    public String getCust_id() {
        return cust_id;
    }

    public String getCategroy() {
        return categroy;
    }

    public String getPrice() {
        return price;
    }

    public String getSeats() {
        return seats;
    }

    public String getDate() {
        return date;
    }

   
    
    
}
