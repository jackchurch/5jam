/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jackc
 */
public class StudentTest {

    Course c1 = new Course(101, "Tell All 101", 0.0);
    //Make course c2 Course----------------------------|
    Course c2 = new Course(200, "Insolence Training", 1000.0);
    //Make course c3 Course----------------------------|
    Course c3 = new Course(301, "How to be happy", 550.0);

    //Made a student and enrollment: Student----------------------------|  Enrollment------------------------------------------------|  Person---------------------------------------| Address--------------------------------------------------------------|
    Student s1 = new Student("New arrival", LocalDate.parse("1967-09-29"), new Enrollment(36, LocalDate.parse("1967-09-29"), "F", "1", c1), 6, "Patrick McGoohan", "unknown email", "+6", new Address("6", "Bluff Street", "The Village", "0000", "The Island"));

    //Made a student and enrollment: Student----------------------------|  Enrollment-----------------------------------------------|  Person-----------------------------------| Address--------------------------------------------------------------|
    Student s2 = new Student("Retirement", LocalDate.parse("1958-09-21"), new Enrollment(100, LocalDate.parse("1935-09-29"), "A", "2", c3), 2, "David Bauer", "unknown email", "+2", new Address("2", "Carrer de Hill", "The Village", "0000", "The Island"));

    /**
     *
     */
    public StudentTest() {
    }

    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }

    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     *
     */
    @Before
    public void setUp() {
    }

    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of hashCode method, of class Student.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Student instance = s1;
        int expResult = 6;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Student.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new Student("New arrival", LocalDate.parse("1967-09-29"), new Enrollment(36, LocalDate.parse("1967-09-29"), "F", "1", c1), 6, "Patrick McGoohan", "unknown email", "+6", new Address("6", "Bluff Street", "The Village", "0000", "The Island"));
        Student instance = s1;
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);

    }

    /**
     * Test of getStudentId method, of class Student.
     */
    @Test
    public void testGetStudentId() {
        System.out.println("getStudentId");
        Student instance = s1;
        int expResult = 6;
        int result = instance.getStudentId();
        assertEquals(expResult, result);

    }

    /**
     * Test of setStudentId method, of class Student.
     */
    @Test
    public void testSetStudentId() {
        System.out.println("setStudentId");
        int studentId = 66;
        Student instance = s1;
        instance.setStudentId(studentId);
    }

    /**
     * Test of getProgram method, of class Student.
     */
    @Test
    public void testGetProgram() {
        System.out.println("getProgram");
        Student instance = s1;
        String expResult = "New arrival";
        String result = instance.getProgram();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProgram method, of class Student.
     */
    @Test
    public void testSetProgram() {
        System.out.println("setProgram");
        String program = "Missing";
        Student instance = s1;
        instance.setProgram(program);
    }

    /**
     * Test of getDateRegistered method, of class Student.
     */
    @Test
    public void testGetDateRegistered() {
        System.out.println("getDateRegistered");
        Student instance = s1;
        LocalDate expResult = LocalDate.parse("1967-09-29");
        LocalDate result = instance.getDateRegistered();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDateRegistered method, of class Student.
     */
    @Test
    public void testSetDateRegistered() {
        System.out.println("setDateRegistered");
        LocalDate dateRegistered = LocalDate.parse("1800-01-01");
        Student instance = s1;
        instance.setDateRegistered(dateRegistered);
    }

    /**
     * Test of getEnrollment method, of class Student.
     */
    @Test
    public void testGetEnrollment() {
        System.out.println("getEnrollment");
        Student instance = s1;
        Enrollment expResult = s1.enrollment;
        Enrollment result = instance.getEnrollment();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEnrollment method, of class Student.
     */
    @Test
    public void testSetEnrollment() {
        System.out.println("setEnrollment");
        Enrollment enrollment = new Enrollment(100, LocalDate.parse("1935-09-29"), "A", "2", c3);
        Student instance = s1;
        instance.setEnrollment(enrollment);

    }

    /**
     * Test of getId method, of class Student.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Student instance = s1;
        int expResult = 6;
        int result = instance.getId();
        assertEquals(expResult, result);

    }

    /**
     * Test of setId method, of class Student.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 66;
        Student instance = s1;
        instance.setId(id);

    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = s1;
        String expResult = "Patrick McGoohan";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Jim Caviezel";
        Student instance = s1;
        instance.setName(name);
    }

    /**
     * Test of getEmail method, of class Student.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Student instance = s1;
        String expResult = "unknown email";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmail method, of class Student.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "Email doesn't exsit in The Village.";
        Student instance = s1;
        instance.setEmail(email);
    }

    /**
     * Test of getTelNum method, of class Student.
     */
    @Test
    public void testGetTelNum() {
        System.out.println("getTelNum");
        Student instance = s1;
        String expResult = "+6";
        String result = instance.getTelNum();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTelNum method, of class Student.
     */
    @Test
    public void testSetTelNum() {
        System.out.println("setTelNum");
        String telNum = "+66";
        Student instance = s1;
        instance.setTelNum(telNum);
    }

    /**
     * Test of getAddress method, of class Student.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Student instance = s1;
        Address expResult = s1.getAddress();
        Address result = instance.getAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAddress method, of class Student.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        Address address = new Address("2", "Carrer de Hill", "The Village", "0000", "The Island");
        Student instance = s1;
        instance.setAddress(address);
    }

}
