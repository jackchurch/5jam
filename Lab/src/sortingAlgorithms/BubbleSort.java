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
public class BubbleSort
{
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

    public static void bubbleSortStudent(Student[] array)
    {
        Student s;
        for (int j = 0; j <= array.length - 2; j++)
        {
            for (int i = 0; i <= array.length - 2; i++)
            {
                if(array[i].studentId > array[i + 1].studentId)
                {
                    s = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = s;
                }
            }
        }
    }

 public static void bubbleSortCourse(Course[] array)
    {
        Course c;
        for (int j = 0; j <= array.length - 2; j++)
        {
            for (int i = 0; i <= array.length - 2; i++)
            {
                if(array[i].courseCode > array[i + 1].courseCode)
                {
                    c = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = c;
                }
            }
        }
    }
 
 
  public static void bubbleSortEnrollment(Enrollment[] array)
    {
        Enrollment e;
        for (int j = 0; j <= array.length - 2; j++)
        {
            for (int i = 0; i <= array.length - 2; i++)
            {
                if(array[i].enrollmentId> array[i + 1].enrollmentId);
                {
                    e = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = e;
                }
            }
        }
    }


}
