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
public class SortStudentByName implements Comparator<Student> {

    /**
     *Compare two students by name ignoring case and spaces before / after. 
     * @param s1
     * @param s2
     * @return
     */
    public int compare(Student s1, Student s2) {
        return s1.name.trim().compareToIgnoreCase(s2.name.trim());
    }
}
