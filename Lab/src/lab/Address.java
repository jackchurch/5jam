/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 *
 * @author 000080409
 */
public class Address {
    
    public static final String DEFUALT_NUMBER = "NO NUMBER DEFINED";
    public static final String DEFUALT_STREET = "NO STREET DEFINED";
    public static final String DEFUALT_SUBURB = "NO SUBURB DEFINED";
    public static final String DEFUALT_POSTCODE = "NO POSTCODE DEFINED";
    public static final String DEFUALT_STATE = "NO STATE DEFINED";
    

    String number;
    String street;
    String suburb;
    String postcode;
    String state;

    @Override
    public String toString() {
        return "\nNumber: " + number + "\tStreet: " + street + "\tSuburb:" + suburb + "\tPostcode: " + postcode + "\tState:" + state ;
    }
    
    public String allToString() {
                return "\nCLASS Address:    " + "Number: " + number + ", Street: " + street + ", Suburb:" + suburb + ", Postcode: " + postcode + ", State:" + state ;
    }

    
    
    
    public Address(String number, String street, String suburb, String postcode, String state) {
        this.number = number;
        this.street = street;
        this.suburb = suburb;
        this.postcode = postcode;
        this.state = state;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    
    
    
}
