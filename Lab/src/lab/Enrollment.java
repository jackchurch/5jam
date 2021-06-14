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
 * @author 000080409
 */
public class Enrollment {

    /**
     *
     */
    public int enrollmentId;

    /**
     *
     */
    public LocalDate dateEnrolled;

    /**
     *
     */
    public String grade;

    /**
     *
     */
    public String semester;

    /**
     *
     */
    public Course course;

    /**
     *
     * @param enrollmentId
     * @param dateEnrolled
     * @param grade
     * @param semester
     * @param course
     */
    public Enrollment(int enrollmentId, LocalDate dateEnrolled, String grade, String semester, Course course) {
        this.enrollmentId = enrollmentId;
        this.dateEnrolled = dateEnrolled;
        this.grade = grade;
        this.semester = semester;
        this.course = course;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "\nEnrollment ID: " + this.enrollmentId
                + "\tDate Enrolled: " + this.dateEnrolled
                + "\tGrade: " + this.grade;
    }

    /**
     *
     * @return
     */
    public String allToString() {
        return super.toString()
                + "\nCLASS Enrollment: Enrollment ID: " + this.enrollmentId
                + ", Date Enrolled: " + this.dateEnrolled
                + ", Grade: " + this.grade
                + ", Semester: " + this.semester
                + ", Course: " + this.course.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    //Enrollment id is sufficient. 

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {

        return this.enrollmentId;

    }

    //Enrollment id is sufficient. 

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
        final Enrollment other = (Enrollment) obj;
        if (!Objects.equals(this.enrollmentId, other.enrollmentId)) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return
     */
    public int getEnrollmentId() {
        return enrollmentId;
    }

    /**
     *
     * @param enrollmentId
     */
    public void setEnrollmentId(int enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    /**
     *
     * @return
     */
    public LocalDate getDateEnrolled() {
        return dateEnrolled;
    }

    /**
     *
     * @param dateEnrolled
     */
    public void setDateEnrolled(LocalDate dateEnrolled) {
        this.dateEnrolled = dateEnrolled;
    }

    /**
     *
     * @return
     */
    public String getGrade() {
        return grade;
    }

    /**
     *
     * @param grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     *
     * @return
     */
    public String getSemester() {
        return semester;
    }

    /**
     *
     * @param semester
     */
    public void setSemester(String semester) {
        this.semester = semester;
    }

    /**
     *
     * @return
     */
    public Course getCourse() {
        return course;
    }

    /**
     *
     * @param course
     */
    public void setCourse(Course course) {
        this.course = course;
    }

}
