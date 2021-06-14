/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparatorSorting;

import java.util.Comparator;
import lab.Course;

/**
 *
 * @author jackc
 */
public class SortCourseByCost implements Comparator<Course> {

    /**
     * Compare two courses by cost. 
     * @param c1
     * @param c2
     * @return
     */
    public int compare(Course c1, Course c2) {
        double delta = c1.cost - c2.cost;
        if (delta > 0) {
            return 1;
        }
        if (delta < 0) {
            return -1;
        }
        return 0;
    }

}
