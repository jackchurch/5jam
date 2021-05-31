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

/**
 *
 * @author jackc
 */
public class LinearSearch
{

//    public static <E extends Comparable<E>> Integer LinearSearch(E[] genericArray, E key)
//    {
//        for (int i = 0; i < genericArray.length; i++)
//        {
//            if (genericArray[i].equals(key))
//            {
//                return i;
//            }
//        }
//        return -1;
//    }

//    public static int LinearSearchStudent(Student arr[], int key)
//    {
//        for (int i = 0; i < arr.length; i++)
//        {
//            if (arr[i].studentId == key)
//            {
//                return i;
//            }
//        }
//        return -1;
//    }

//        public static int LinearSearchEnrollment(Enrollment arr[], int key)
//    {
//        for (int i = 0; i < arr.length; i++)
//        {
//            if (arr[i].enrollmentId == key)
//            {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public static int LinearSearchCourse(Course arr[], int key)
//    {
//        for (int i = 0; i < arr.length; i++)
//        {
//            if (arr[i].courseCode == key)
//            {
//                return i;
//            }
//        }
//        return -1;
//    }
    
    
    public static int LinearSearchStudent(List<Student> a, int studentId)
    {
        for (int i = 0; i < a.size(); i++)
        {
            if (a.get(i).studentId == studentId)
            {
                return i;
            }
        }
        return -1;
    }

    public static int LinearSearchEnrollment(List<Enrollment> a, int enrollmentId)
    {
        for (int i = 0; i < a.size(); i++)
        {
            if (a.get(i).enrollmentId == enrollmentId)
            {
                return i;
            }
        }
        return -1;
    }
    
    
        public static int LinearSearchCourse(List<Course> a, int courseCode)
    {
        for (int i = 0; i < a.size(); i++)
        {
            if (a.get(i).courseCode == courseCode)
            {
                return i;
            }
        }
        return -1;
    }

}
