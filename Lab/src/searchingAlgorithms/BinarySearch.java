/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchingAlgorithms;

import java.util.List;
import lab.Course;
import lab.Enrollment;
import lab.Student;
import sortingAlgorithms.BubbleSort;
import sortingAlgorithms.SelectionSort;

/**
 *
 * @author 000080409
 */
public class BinarySearch {

    /**
     * Input list of student and studentId to find. Result will be student in list if exists via binary search. 
     * @param list
     * @param searchElement
     * @return
     */
    public static int binarySearchStudent(List<Student> list, int searchElement) {
        int numElements = list.size();
        int min = 0;
        int max = numElements - 1;

        SelectionSort.student(list);
        do {
            int mid = (min + max) / 2;
            if (searchElement > list.get(mid).studentId) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
            if (list.get(mid).studentId == searchElement) {
                return mid;
            }
            if (min > max) {
                return -1;
            }
        } while (min <= max);
        return -1;
    }

    /**
     * Input list of enrollmnet and enrollmentId to find. Result will be enrollment in list if exists via binary search. 
     * @param list
     * @param searchElement
     * @return
     */
    public static int binarySearchEnrollment(List<Enrollment> list, int searchElement) {
        int numElements = list.size();
        int min = 0;
        int max = numElements - 1;

        SelectionSort.enrollment(list);
        do {
            int mid = (min + max) / 2;
            if (searchElement > list.get(mid).enrollmentId) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
            if (list.get(mid).enrollmentId == searchElement) {
                return mid;
            }
            if (min > max) {
                return -1;
            }
        } while (min <= max);
        return -1;
    }

    /**
     * Input list of course and courseCode to find. Result will be course in list if exists via binary search. 
     * @param list
     * @param searchElement
     * @return
     */
    public static int binarySearchCourse(List<Course> list, int searchElement) {
        int numElements = list.size();
        int min = 0;
        int max = numElements - 1;

        SelectionSort.course(list);
        do {
            int mid = (min + max) / 2;
            if (searchElement > list.get(mid).courseCode) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
            if (list.get(mid).courseCode == searchElement) {
                return mid;
            }
            if (min > max) {
                return -1;
            }
        } while (min <= max);
        return -1;
    }
}
