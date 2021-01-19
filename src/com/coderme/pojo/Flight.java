
package com.coderme.pojo;

public class Flight {
     private int flight_id;
    private String flightName;
    private String source;
    private String departure;
    private String depTime;
    private String arrTime;
    private String flightCharge;
    private String date;
    
    public Flight() {
    }

    public Flight(int flight_id, String flightName, String source, String departure, String depTime, String arrTime, String flightCharge, String date) {
        this.flight_id = flight_id;
        this.flightName = flightName;
        this.source = source;
        this.departure = departure;
        this.depTime = depTime;
        this.arrTime = arrTime;
        this.flightCharge = flightCharge;
        this.date = date;
    }

    public Flight(String flightName, String source, String departure, String depTime, String arrTime, String flightCharge, String date) {
        this.flightName = flightName;
        this.source = source;
        this.departure = departure;
        this.depTime = depTime;
        this.arrTime = arrTime;
        this.flightCharge = flightCharge;
        this.date = date;
    }

    public Flight(String trim, String trim0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getFlight_id() {
        return flight_id;
    }

    public String getFlightName() {
        return flightName;
    }

    public String getSource() {
        return source;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDepTime() {
        return depTime;
    }

    public String getArrTime() {
        return arrTime;
    }

    public String getFlightCharge() {
        return flightCharge;
    }

    public String getDate() {
        return date;
    }
    

    public Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

   

    
}
