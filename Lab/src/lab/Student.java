/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author 000080409s
 *
 */
public class Student extends Person {

    /**
     *
     */
    public int studentId;

    /**
     *
     */
    public String program;

    /**
     *
     */
    public LocalDate dateRegistered;

    /**
     *
     */
    public Enrollment enrollment;

    //              Student class-------------------------|  Enrollment class----|    Person class------------------------------------ (Address class--)|

    /**
     *
     * @param program
     * @param dateRegistered
     * @param enrollment
     * @param id
     * @param name
     * @param email
     * @param telNum
     * @param address
     */
    public Student(String program, LocalDate dateRegistered, Enrollment enrollment, int id, String name, String email, String telNum, Address address) {
        super(id, name, email, telNum, address);
        this.studentId = id;
        this.program = program;
        this.dateRegistered = dateRegistered;
        this.enrollment = enrollment;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "\nStudentID: " + studentId
                + "\tProgram: " + program
                + "\tDate Registered: " + dateRegistered;
    }

    /**
     *
     * @return
     */
    public String allToString() {
        return super.toString() + "\nCLASS Student:    "
                + "StudentID: " + studentId
                + ", Program: " + program
                + ", Date Registered: " + dateRegistered
                + ", Enrollment: " + enrollment.toString();
    }

    /*Reason for hash based on id: 
    Student ID is based on Person ID, only 1 ID per person. 
    
    I could have also used Date Registered inconjunction with id 
    as each student registers with ABC Ed once in thier life. 
    Not to be confused with enrolled date for a course which can have 
    multiple enrolled dates for course though the students life. */
    //NB: I would have used more salt in the hash, but for tafe purposes, the ID will be sufficent. 

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        return this.studentId;
    }

    /*Reason for equals based on id: 
    Student ID is based on Person ID, only 1 ID per person. 
    
    I could have also used Date Registered inconjunction with id 
    as each student registers with ABC Ed once in thier life. 
    Not to be confused with enrolled date for a course which can have 
    multiple enrolled dates for course though the students life. */

    /**
     *
     * @param obj
     * @return
     */

    @Override
    public boolean equals(Object obj) {
        //IF object is the same object
        if (this == obj) {
            return true;
        }

        //IF object is non-existant
        if (obj == null) {
            return false;
        }

        //IF object class is not the same
        if (getClass() != obj.getClass()) {
            return false;
        }

        final Student other = (Student) obj;

        //IF Objects are not equal based on studentId
        if (!Objects.equals(this.studentId, other.studentId)) {
            return false;
        }

        //ELSE id and dateregistered are equal. 
        return true;
    }

    /**
     *
     * @return
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     *
     * @param studentId
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
     *
     * @return
     */
    public String getProgram() {
        return program;
    }

    /**
     *
     * @param program
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     *
     * @return
     */
    public LocalDate getDateRegistered() {
        return dateRegistered;
    }

    /**
     *
     * @param dateRegistered
     */
    public void setDateRegistered(LocalDate dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    /**
     *
     * @return
     */
    public Enrollment getEnrollment() {
        return enrollment;
    }

    /**
     *
     * @param enrollment
     */
    public void setEnrollment(Enrollment enrollment) {
        this.enrollment = enrollment;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public String getTelNum() {
        return telNum;
    }

    /**
     *
     * @param telNum
     */
    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    /**
     *
     * @return
     */
    public Address getAddress() {
        return address;
    }

    /**
     *
     * @param address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

}
