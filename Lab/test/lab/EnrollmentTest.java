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
public class EnrollmentTest {

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
    public EnrollmentTest() {
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
     * Test of hashCode method, of class Enrollment.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Enrollment instance = s1.enrollment;
        int expResult = 36;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Enrollment.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new Enrollment(36, LocalDate.parse("1967-09-29"), "F", "1", c1);
        Enrollment instance = s1.enrollment;
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of getEnrollmentId method, of class Enrollment.
     */
    @Test
    public void testGetEnrollmentId() {
        System.out.println("getEnrollmentId");
        Enrollment instance = s1.getEnrollment();
        int expResult = 36;
        int result = instance.getEnrollmentId();
        assertEquals(expResult, result);

    }

    /**
     * Test of setEnrollmentId method, of class Enrollment.
     */
    @Test
    public void testSetEnrollmentId() {
        System.out.println("setEnrollmentId");
        int enrollmentId = 3636;
        Enrollment instance = s1.getEnrollment();
        instance.setEnrollmentId(enrollmentId);
    }

    /**
     * Test of getDateEnrolled method, of class Enrollment.
     */
    @Test
    public void testGetDateEnrolled() {
        System.out.println("getDateEnrolled");
        Enrollment instance = s1.getEnrollment();
        LocalDate expResult = LocalDate.parse("1967-09-29");
        LocalDate result = instance.getDateEnrolled();
        assertEquals(expResult, result);

    }

    /**
     * Test of setDateEnrolled method, of class Enrollment.
     */
    @Test
    public void testSetDateEnrolled() {
        System.out.println("setDateEnrolled");
        LocalDate dateEnrolled = LocalDate.parse("1800-01-01");
        Enrollment instance = s1.getEnrollment();
        instance.setDateEnrolled(dateEnrolled);

    }

    /**
     * Test of getGrade method, of class Enrollment.
     */
    @Test
    public void testGetGrade() {
        System.out.println("getGrade");
        Enrollment instance = s1.getEnrollment();
        String expResult = "F";
        String result = instance.getGrade();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGrade method, of class Enrollment.
     */
    @Test
    public void testSetGrade() {
        System.out.println("setGrade");
        String grade = "A";
        Enrollment instance = s1.getEnrollment();
        instance.setGrade(grade);

    }

    /**
     * Test of getSemester method, of class Enrollment.
     */
    @Test
    public void testGetSemester() {
        System.out.println("getSemester");
        Enrollment instance = s1.getEnrollment();
        String expResult = "1";
        String result = instance.getSemester();
        assertEquals(expResult, result);

    }

    /**
     * Test of setSemester method, of class Enrollment.
     */
    @Test
    public void testSetSemester() {
        System.out.println("setSemester");
        String semester = "2";
        Enrollment instance = s1.getEnrollment();
        instance.setSemester(semester);
    }

    /**
     * Test of getCourse method, of class Enrollment.
     */
    @Test
    public void testGetCourse() {
        System.out.println("getCourse");
        Enrollment instance = s1.getEnrollment();
        Course expResult = c1;
        Course result = instance.getCourse();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCourse method, of class Enrollment.
     */
    @Test
    public void testSetCourse() {
        System.out.println("setCourse");
        Course course = c2;
        Enrollment instance = s1.getEnrollment();
        instance.setCourse(course);

    }

}
