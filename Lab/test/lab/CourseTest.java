/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

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
public class CourseTest {

    Course c1 = new Course(101, "Tell All 101", 0.0);
    //Make course c2 Course----------------------------|
    Course c2 = new Course(200, "Insolence Training", 1000.0);
    //Make course c3 Course----------------------------|
    Course c3 = new Course(301, "How to be happy", 550.0);

    /**
     *
     */
    public CourseTest() {
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
     * Test of hashCode method, of class Course.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Course instance = c1;
        int expResult = 101;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Course.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = c1;
        Course instance = new Course(101, "Tell All 101", 0.0);
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of getCourseCode method, of class Course.
     */
    @Test
    public void testGetCourseCode() {
        System.out.println("getCourseCode");
        Course instance = c1;
        int expResult = 101;
        int result = instance.getCourseCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCourseCode method, of class Course.
     */
    @Test
    public void testSetCourseCode() {
        System.out.println("setCourseCode");
        int courseCode = 102;
        Course instance = c1;
        instance.setCourseCode(courseCode);
    }

    /**
     * Test of getCourseName method, of class Course.
     */
    @Test
    public void testGetCourseName() {
        System.out.println("getCourseName");
        Course instance = c1;
        String expResult = "Tell All 101";
        String result = instance.getCourseName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCourseName method, of class Course.
     */
    @Test
    public void testSetCourseName() {
        System.out.println("setCourseName");
        String courseName = "Being Happy";
        Course instance = c1;
        instance.setCourseName(courseName);
    }

    /**
     * Test of getCost method, of class Course.
     */
    @Test
    public void testGetCost() {
        System.out.println("getCost");
        Course instance = c1;
        Double expResult = 0.0;
        Double result = instance.getCost();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCost method, of class Course.
     */
    @Test
    public void testSetCost() {
        System.out.println("setCost");
        Double cost = 1.5;
        Course instance = c1;
        instance.setCost(cost);
    }

}
