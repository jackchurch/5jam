package lab;


import lab.Address;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, chsoose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 000080409
 */
public class Person {

    public int id;
    public String name;
    public String email;
    public String telNum;
    public Address address;

    
    
    public Person(int id, String name, String email, String telNum, Address address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.telNum = telNum;
        this.address = address;
    }

    
    @Override
    public String toString() {
        return "\nID: " + id + "\tName: " + name + "\tEmail: " + email + "\tTelNum: " + telNum;
    }

    
    public String allToString() {
        return "\nCLASS Person:     " + "ID: " + id + ", name: " + name + ", email: " + email + ", telNum: " + telNum + ", address:" + address.toString();
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
        
    
}
