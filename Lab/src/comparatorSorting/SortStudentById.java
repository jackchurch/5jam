/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparatorSorting;

import java.util.Comparator;
import lab.Student;

/**
 *
 * @author jackc
 */
public class SortStudentById implements Comparator<Student> {

    /**
     * Compare 2 students by ID. 
     * @param s1
     * @param s2
     * @return
     */
    public int compare(Student s1, Student s2) {
        return s1.id - s2.id;
    }

}
