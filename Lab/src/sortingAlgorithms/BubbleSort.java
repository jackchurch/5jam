/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingAlgorithms;

import java.util.List;
import lab.Course;
import lab.Enrollment;
import lab.Student;

/**
 *
 * @author jackc
 */
public class BubbleSort {
    //Not worth the effort for a generic bubble sort
    //    public <T> void bubbleSortOfInt(T[] inputArray)
//    {
//        T temp;
//        for (int j = 0; j <= inputArray.length - 2; j++)
//        {
//            for (int i = 0; i <= inputArray.length - 2; i++)
//            {
//                if(inputArray[i] > inputArray[i + 1])
//                {
//                    temp = inputArray[i + 1];
//                    inputArray[i + 1] = inputArray[i];
//                    inputArray[i] = temp;
//                }
//            }
//        }
//    }

//    public static void bubbleSortStudent(Student[] array)
//    {
//        Student s;
//        for (int j = 0; j <= array.length - 2; j++)
//        {
//            for (int i = 0; i <= array.length - 2; i++)
//            {
//                if(array[i].studentId > array[i + 1].studentId)
//                {
//                    s = array[i + 1];
//                    array[i + 1] = array[i];
//                    array[i] = s;
//                }
//            }
//        }
//    }
//    
//    public static void bubbleSortCourse(Course[] array)
//    {
//        Course c;
//        for (int j = 0; j <= array.length - 2; j++)
//        {
//            for (int i = 0; i <= array.length - 2; i++)
//            {
//                if (array[i].courseCode > array[i + 1].courseCode)
//                {
//                    c = array[i + 1];
//                    array[i + 1] = array[i];
//                    array[i] = c;
//                }
//            }
//        }
//    }
//
//    public static void bubbleSortEnrollment(Enrollment[] array)
//    {
//        Enrollment e;
//        for (int j = 0; j <= array.length - 2; j++)
//        {
//            for (int i = 0; i <= array.length - 2; i++)
//            {
//                if (array[i].enrollmentId > array[i + 1].enrollmentId);
//                {
//                    e = array[i + 1];
//                    array[i + 1] = array[i];
//                    array[i] = e;
//                }
//            }
//        }
//    }

    /**
     * Input List of students to sort list by Bubble Sort. 
     * @param list
     */
    public static void bubbleSortStudent(List<Student> list) {
        Student temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).studentId > (list.get(i + 1).studentId)) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
    }

    /**
     * Input List of enrollments to sort list by Bubble Sort. 
     * @param list
     */
    public static void bubbleSortEnrollment(List<Enrollment> list) {
        Enrollment temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).enrollmentId > (list.get(i + 1).enrollmentId)) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    sorted = false;
                }
            }
        }

    }

    /**
     * Input List of courses to sort list by Bubble Sort. 
     * @param list
     */
    public static void bubbleSortCourse(List<Course> list) {
        Course temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).courseCode > (list.get(i + 1).courseCode)) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
    }

}
