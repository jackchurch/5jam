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
public class SortEnrollmentByDateEnrolled implements Comparator<Enrollment> {

    public int compare(Enrollment e1, Enrollment e2)
    {
        return e1.dateEnrolled.compareTo(e2.dateEnrolled);
    }
}
