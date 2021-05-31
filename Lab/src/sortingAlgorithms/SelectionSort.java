/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingAlgorithms;

import lab.Course;
import lab.Enrollment;
import lab.Student;

/**
 *
 * @author jackc
 */
public class SelectionSort {

    public static void student(Student[] array) {
        Student s;
        int min;

        for (int j = 0; j < array.length - 1; j++) {
            min = j;

            for (int k = j + 1; k < array.length; k++) {
                if (array[k].studentId < array[min].studentId) {
                    min = k;
                }
            }
            s = array[min];
            array[min] = array[j];
            array[j] = s;
        }
    }

    public static void enrollment(Enrollment[] array) {
        Enrollment e;
        int min;

        for (int j = 0; j < array.length - 1; j++) {
            min = j;

            for (int k = j + 1; k < array.length; k++) {
                if (array[k].enrollmentId < array[min].enrollmentId) {
                    min = k;
                }
            }
            e = array[min];
            array[min] = array[j];
            array[j] = e;
        }
    }

    public static void course(Course[] array) {
        Course c;
        int min;

        for (int j = 0; j < array.length - 1; j++) {
            min = j;

            for (int k = j + 1; k < array.length; k++) {
                if (array[k].courseCode < array[min].courseCode) {
                    min = k;
                }
            }
            c = array[min];
            array[min] = array[j];
            array[j] = c;
        }
    }
}
