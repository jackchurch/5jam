/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparatorSorting;

import java.util.Comparator;
import lab.Enrollment;

/**
 *
 * @author jackc
 */
public class SortEnrollmentById implements Comparator<Enrollment> {

    /**
     * Compare enrollments by ID. 
     * @param e1
     * @param e2
     * @return
     */
    public int compare(Enrollment e1, Enrollment e2) {
        return e1.enrollmentId - e2.enrollmentId;
    }

}
