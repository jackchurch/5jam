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

    /**
     *
     */
    public static final String DEFUALT_NUMBER = "NO NUMBER DEFINED";

    /**
     *
     */
    public static final String DEFUALT_STREET = "NO STREET DEFINED";

    /**
     *
     */
    public static final String DEFUALT_SUBURB = "NO SUBURB DEFINED";

    /**
     *
     */
    public static final String DEFUALT_POSTCODE = "NO POSTCODE DEFINED";

    /**
     *
     */
    public static final String DEFUALT_STATE = "NO STATE DEFINED";

    String number;
    String street;
    String suburb;
    String postcode;
    String state;

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "\nNumber: " + number + "\tStreet: " + street + "\tSuburb:" + suburb + "\tPostcode: " + postcode + "\tState:" + state;
    }

    /**
     *
     * @return
     */
    public String allToString() {
        return "\nCLASS Address:    " + "Number: " + number + ", Street: " + street + ", Suburb:" + suburb + ", Postcode: " + postcode + ", State:" + state;
    }

    /**
     *
     * @param number
     * @param street
     * @param suburb
     * @param postcode
     * @param state
     */
    public Address(String number, String street, String suburb, String postcode, String state) {
        this.number = number;
        this.street = street;
        this.suburb = suburb;
        this.postcode = postcode;
        this.state = state;
    }

    /**
     *
     * @return
     */
    public String getNumber() {
        return number;
    }

    /**
     *
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     *
     * @return
     */
    public String getStreet() {
        return street;
    }

    /**
     *
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     *
     * @return
     */
    public String getSuburb() {
        return suburb;
    }

    /**
     *
     * @param suburb
     */
    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    /**
     *
     * @return
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     *
     * @param postcode
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     *
     * @return
     */
    public String getState() {
        return state;
    }

    /**
     *
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

}
