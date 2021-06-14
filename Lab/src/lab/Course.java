/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Objects;

/**
 *
 * @author 000080409
 */
public class Course {

    /**
     *
     */
    public int courseCode;

    /**
     *
     */
    public String courseName;

    /**
     *
     */
    public double cost;

    /**
     *
     * @param courseCode
     * @param courseName
     * @param cost
     */
    public Course(int courseCode, String courseName, Double cost) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.cost = cost;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "\nCourse Code: " + courseCode + "\tCourse Name: " + courseName + "\tCost: " + cost;
    }

    /**
     *
     * @return
     */
    public String allToString() {
        return "\nCLASS Course:     " + "Course Code: " + courseCode + ", Course Name=" + courseName + ", Cost=" + cost;

    }

    //Course code is sufficent to identify the course. 
    //Updated course material can be identified by the date the student enrolled in the course. 

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        return courseCode;
    }

    //Course code is sufficent to identify the course. 
    //Updated course material can be identified by the date the student enrolled in the course. 

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Course other = (Course) obj;
        if (!Objects.equals(this.courseCode, other.courseCode)) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return
     */
    public int getCourseCode() {
        return courseCode;
    }

    /**
     *
     * @param courseCode
     */
    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    /**
     *
     * @return
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     *
     * @param courseName
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     *
     * @return
     */
    public Double getCost() {
        return cost;
    }

    /**
     *
     * @param cost
     */
    public void setCost(Double cost) {
        this.cost = cost;
    }

}
