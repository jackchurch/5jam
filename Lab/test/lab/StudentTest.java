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

    //Made a student and enrollment: Student--------------------------------|  Enrollment-----------------------------------------------|  Person---------------------------------------| Address--------------------------------------------------------------|
    Student s3 = new Student("Business owner", LocalDate.parse("1958-09-21"), new Enrollment(100, LocalDate.parse("1944-08-29"), "B", "1", c2), 2, "Georgina Cookson", "unknown email", "+2", new Address("4", "Beach Via", "The Village", "0000", "The Island"));

    //Made a student and enrollment: Student----------------------------|  Enrollment-----------------------------------------------|  Person----------------------------------------| Address--------------------------------------------------------------|
    Student s4 = new Student("Retirement", LocalDate.parse("1958-09-21"), new Enrollment(64, LocalDate.parse("1937-12-29"), "A", "2", c3), 45, "Kenneth Griffith", "unknown email", "+45", new Address("45", "Rue Forest", "The Village", "0000", "The Island"));

    //Made a student and enrollment: Student--------------------------------|  Enrollment-----------------------------------------------|  Person---------------------------------------| Address--------------------------------------------------------------|
    Student s5 = new Student("Island Security", LocalDate.parse("1975-03-24"), new Enrollment(4, LocalDate.parse("1941-12-29"), "B", "1", c3), 2, "Anton Rodgers", "unknown email", "+44", new Address("44", "Sky Strauss", "The Village", "0000", "The Island"));

    //Made a student and enrollment: Student-------------------------------|  Enrollment-----------------------------------------------|  Person----------------------------------------| Address--------------------------------------------------------------|
    Student s6 = new Student("Island Security", LocalDate.parse("1975-03-24"), new Enrollment(5, LocalDate.parse("1941-12-29"), "B", "1", c3), 85, "Anton Rodgers", "unknown email", "+85", new Address("44", "Sky Avenue", "The Village", "0000", "The Island"));

    public StudentTest()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
    }

    @AfterClass
    public static void tearDownClass()
    {
    }

    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }

    /**
     * Test  of hashCode method, of class Student.
     */
    @Test
    public void testHashCode()
    {
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
    public void testEquals()
    {
        System.out.println("equals");
        Object obj = s1;
        Student instance = s2;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    
    
}
