/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderme.pojo;

/**
 *
 * @author Safayet Zahid
 */
public class AddCustomer {

    private int customer_id;
    private String first_name;
    private String last_name;
    private String nid;
    private String pass_id;
    private String address;
    private String gender;
    private String contact;

    public AddCustomer() {
    }

    public AddCustomer(String first_name, String last_name, String nid, String pass_id, String address, String gender, String contact) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.nid = nid;
        this.pass_id = pass_id;
        this.address = address;
        this.gender = gender;
        this.contact = contact;
    }

    
    
    public AddCustomer(int customer_id, String first_name, String last_name, String nid, String pass_id, String address, String gender, String contact) {
        this.customer_id = customer_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.nid = nid;
        this.pass_id = pass_id;
        this.address = address;
        this.gender = gender;
        this.contact = contact;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getNid() {
        return nid;
    }

    public String getPass_id() {
        return pass_id;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getContact() {
        return contact;
    }
    

 

    
    
}
