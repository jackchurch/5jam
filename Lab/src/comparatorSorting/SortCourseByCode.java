/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparatorSorting;

import java.util.Comparator;
import lab.Course;
import lab.Student;

/**
 *
 * @author jackc
 */
public class SortCourseByCode implements Comparator<Course> {

    /**
     * Compare two courses by courseCode. 
     * @param c1
     * @param c2
     * @return
     */
    public int compare(Course c1, Course c2) {
        return c1.courseCode - c2.courseCode;
    }

}
