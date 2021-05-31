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
public class SelectionSort
{
//    public static void student(Student[] array)
//    {
//        Student s;
//        int min;
//
//        for (int j = 0; j < array.length - 1; j++)
//        {
//            min = j;
//
//            for (int k = j + 1; k < array.length; k++)
//            {
//                if (array[k].studentId < array[min].studentId)
//                {
//                    min = k;
//                }
//            }
//            s = array[min];
//            array[min] = array[j];
//            array[j] = s;
//        }
//    }

    //     public static void enrollment(Enrollment[] array)
//    {
//        Enrollment e;
//        int min;
//
//        for (int j = 0; j < array.length - 1; j++)
//        {
//            min = j;
//
//            for (int k = j + 1; k < array.length; k++)
//            {
//                if (array[k].enrollmentId < array[min].enrollmentId)
//                {
//                    min = k;
//                }
//            }
//            e = array[min];
//            array[min] = array[j];
//            array[j] = e;
//        }
//    }
    
    
//    public static void course(Course[] array)
//    {
//        Course c;
//        int min;
//
//        for (int j = 0; j < array.length - 1; j++)
//        {
//            min = j;
//
//            for (int k = j + 1; k < array.length; k++)
//            {
//                if (array[k].courseCode < array[min].courseCode)
//                {
//                    min = k;
//                }
//            }
//            c = array[min];
//            array[min] = array[j];
//            array[j] = c;
//        }
//    }
    
    public static void student(List<Student> list)
    {
        Student temp;
        int min;

        for (int j = 0; j < list.size() - 1; j++)
        {
            min = j;
            for (int k = j + 1; k < list.size(); k++)
            {
                if (list.get(k).studentId < list.get(min).studentId)
                {
                    min = k;
                }
            }
            temp = list.get(min);
            list.set(min, list.get(j));
            list.set(j, (temp));
        }
    }

    public static void enrollment(List<Enrollment> list)
    {
        Enrollment temp;
        int min;

        for (int j = 0; j < list.size() - 1; j++)
        {
            min = j;
            for (int k = j + 1; k < list.size(); k++)
            {
                if (list.get(k).enrollmentId < list.get(min).enrollmentId)
                {
                    min = k;
                }
            }
            temp = list.get(min);
            list.set(min, list.get(j));
            list.set(j, (temp));
        }
    }

    public static void course(List<Course> list)
    {
        Course temp;
        int min;

        for (int j = 0; j < list.size() - 1; j++)
        {
            min = j;
            for (int k = j + 1; k < list.size(); k++)
            {
                if (list.get(k).courseCode < list.get(min).courseCode)
                {
                    min = k;
                }
            }
            temp = list.get(min);
            list.set(min, list.get(j));
            list.set(j, (temp));
        }
    }

}
