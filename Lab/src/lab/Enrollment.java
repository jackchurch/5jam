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
public class Enrollment
{

    public int enrollmentId;
    public LocalDate dateEnrolled;
    public String grade;
    public String semester;
    public Course course;

    public Enrollment(int enrollmentId, LocalDate dateEnrolled, String grade, String semester, Course course)
    {
        this.enrollmentId = enrollmentId;
        this.dateEnrolled = dateEnrolled;
        this.grade = grade;
        this.semester = semester;
        this.course = course;
    }

    @Override
    public String toString()
    {
        return "\nEnrollment ID: " + this.enrollmentId
                + "\tDate Enrolled: " + this.dateEnrolled
                + "\tGrade: " + this.grade;
    }

    public String allToString()
    {
        return super.toString()
                + "\nCLASS Enrollment: Enrollment ID: " + this.enrollmentId
                + ", Date Enrolled: " + this.dateEnrolled
                + ", Grade: " + this.grade
                + ", Semester: " + this.semester
                + ", Course: " + this.course.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    //Enrollment id is sufficient. 
    @Override
    public int hashCode()
    {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.enrollmentId);
        return hash;
    }

    //Enrollment id is sufficient. 
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Enrollment other = (Enrollment) obj;
        if (!Objects.equals(this.enrollmentId, other.enrollmentId))
        {
            return false;
        }
        return true;
    }

    public int getEnrollmentId()
    {
        return enrollmentId;
    }

    public void setEnrollmentId(int enrollmentId)
    {
        this.enrollmentId = enrollmentId;
    }

    public LocalDate getDateEnrolled()
    {
        return dateEnrolled;
    }

    public void setDateEnrolled(LocalDate dateEnrolled)
    {
        this.dateEnrolled = dateEnrolled;
    }

    public String getGrade()
    {
        return grade;
    }

    public void setGrade(String grade)
    {
        this.grade = grade;
    }

    public String getSemester()
    {
        return semester;
    }

    public void setSemester(String semester)
    {
        this.semester = semester;
    }

    public Course getCourse()
    {
        return course;
    }

    public void setCourse(Course course)
    {
        this.course = course;
    }

}
