/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingAlgorithms;

import java.util.ArrayList;
import java.util.List;
import lab.Course;
import lab.Enrollment;
import lab.Student;

/**
 *
 * @author jackc
 */
public class MergeSort
{
    
//    
//      //int n = array length. 
//    public static void studentSort(Student[] a, int n)
//    {
//        //IF array length is 1 then return only item, array[0]
//        //SECOND ROUND OF L: n=3
//        if (n < 2) 
//        {
//            return;
//        }
//        
//        //Mid is array divided by 2 (array length of 6/2 will = 
//        //If n is odd number, round down. 
//        int mid = n /2;
//        
//        //l array is studnet array starting from mid point (3). 
//        //r array is studnet array starting from...
//        //student array length(6) - mid(3), 3. 
//
//        Student[] l = new Student[mid];
//        Student[] r = new Student[n - mid];
//        
//        //Reminder that a = the studnet array. 
//        //For each item in 'a' array, copy to 'l' array untill...
//        //one less than mid point. ie copy a[0], a[1], a[2]. But not a[3]. 
//        for (int i = 0; i < mid; i++) 
//        {
//            l[i] = a[i];
//        }
//        
//        //For each item in 'a' array, copy to 'r' array from... 
//        //mid point 3 (r[2], r[1], r[0]) backwards. 
//        //i.e. it is the last half of array 'a' but backwards. 
//        for (int i = mid; i < n; i++)
//        {
//            r[i - mid] = a[i];
//        }
//        
//        /*
//        Current status of 'l' and 'r' in comparison to 'a': 
//        a(0 1 2      3 4 5)
//        l(0 1 2)  r (5 4 3)
//        
//        */
//        
//        //Now it gets confusing: 
//        //Repeat the process but with the 'l' array and...
//        //the length is mid (3)
//        studentSort(l, mid);
//        //Repeat the process but with the 'r' array and...
//        //the length is 'a' - mid, 6-3 - 3
//        studentSort(r, n-mid);
//        //This will result in the mid being 1 for each array. 
//
//        
//        //Now it's split, we merge them back. 
//        mergeStudent(a, l, r, mid, n - mid);
//    }
//    
//    private static void mergeStudent (Student[] a, Student[] l, Student[] r, int left, int right) 
//    {
//        int i = 0;
//        int j = 0;
//        int k = 0;
//        
//        while (i < left && j < right) 
//        {
//            if (l[i].studentId <= r[j].studentId)
//            {
//                a[k++] = l[i++];
//            }
//            else 
//            {
//                a[k++] = r[j++];
//            }
//        }
//        
//        while (i < left) 
//        {
//            a[k++] = l[i++];
//        }
//        
//        while (j < right) 
//        {
//            a[k++] = r[j++];
//        }
//    }
    

   
        
        //STUDENT ↓↓↓↓↓ STUDENT ↓↓↓↓↓ STUDENT ↓↓↓↓↓ STUDENT ↓↓↓↓↓ STUDENT ↓↓↓↓↓ 
    //int n = list size. 
    public static void studentSort(List<Student> list, int size)
    {
        //IF array length is 1 then return only item, array[0]
        //SECOND ROUND OF L: n=3
        if (size < 2) 
        {
            return;
        }
        
        //Mid is array divided by 2 (array length of 6/2 will = 
        //If n is odd number, round down. 
        int mid = size /2;
        
        //l array is studnet array starting from mid point (3). 
        //r array is studnet array starting from...
        //student array length(6) - mid(3), 3. 

        List<Student> l = new ArrayList<>(); 
        List<Student> r = new ArrayList<>(); 
        
        //Reminder that a = the studnet array. 
        //For each item in 'a' array, copy to 'l' array untill...
        //one less than mid point. ie copy a[0], a[1], a[2]. But not a[3]. 
        for (int i = 0; i < mid; i++) 
        {
            l.add(i, list.get(i));
        }
        
        //For each item in 'a' array, copy to 'r' array from... 
        //mid point 3 (r[2], r[1], r[0]) backwards. 
        //i.e. it is the last half of array 'a' but backwards. 
        for (int i = mid; i < size; i++)
        {
            r.add(i-mid, list.get(i));
        }
        
        /*
        Current status of 'l' and 'r' in comparison to 'a': 
        a(0 1 2      3 4 5)
        l(0 1 2)  r (5 4 3)
        
        */
        
        //Now it gets confusing: 
        //Repeat the process but with the 'l' array and...
        //the length is mid (3)
        studentSort(l, mid);
        //Repeat the process but with the 'r' array and...
        //the length is 'a' - mid, 6-3 - 3
        studentSort(r, size-mid);
        //This will result in the mid being 1 for each array. 

        
        //Now it's split, we merge them back. 
        mergeStudent(list, l, r, mid, size - mid);
    }
    
    private static void mergeStudent (List <Student> list, List <Student> l, List <Student> r, int left, int right) 
    {
        int i = 0;
        int j = 0;
        int k = 0;
        
        while (i < left && j < right) 
        {
            if (l.get(i).studentId <= r.get(j).studentId) 
            {
                list.set(k++, l.get(i++));
            }
            else 
            {
                list.set(k++, r.get(j++));
            }            
        }
        
        while (i < left) 
        {
            list.set(k++, l.get(i++));
        }
        
        while (j < right) 
        {            
            list.set(k++, r.get(j++));
        }
    }   
    
    //STUDENT ↑↑↑↑↑ STUDENT ↑↑↑↑↑ STUDENT ↑↑↑↑↑ STUDENT ↑↑↑↑↑ STUDENT ↑↑↑↑↑ 
    
    
    
            //ENROLLMENT ↓↓↓↓↓ ENROLLMENT ↓↓↓↓↓ ENROLLMENT ↓↓↓↓↓ ENROLLMENT ↓↓↓↓↓ ENROLLMENT ↓↓↓↓↓ 
    //int n = list size. 
    public static void enrollmentSort(List<Enrollment> list, int size)
    {
        //IF array length is 1 then return only item, array[0]
        //SECOND ROUND OF L: n=3
        if (size < 2) 
        {
            return;
        }
        
        //Mid is array divided by 2 (array length of 6/2 will = 
        //If n is odd number, round down. 
        int mid = size /2;
        
        //l array is studnet array starting from mid point (3). 
        //r array is studnet array starting from...
        //student array length(6) - mid(3), 3. 

        List<Enrollment> l = new ArrayList<>(); 
        List<Enrollment> r = new ArrayList<>(); 
        
        //Reminder that a = the studnet array. 
        //For each item in 'a' array, copy to 'l' array untill...
        //one less than mid point. ie copy a[0], a[1], a[2]. But not a[3]. 
        for (int i = 0; i < mid; i++) 
        {
            l.set(i, list.get(i));
        }
        
        //For each item in 'a' array, copy to 'r' array from... 
        //mid point 3 (r[2], r[1], r[0]) backwards. 
        //i.e. it is the last half of array 'a' but backwards. 
        for (int i = mid; i < size; i++)
        {
            r.set(i-mid, list.get(i));
        }
        
        /*
        Current status of 'l' and 'r' in comparison to 'a': 
        a(0 1 2      3 4 5)
        l(0 1 2)  r (5 4 3)
        
        */
        
        //Now it gets confusing: 
        //Repeat the process but with the 'l' array and...
        //the length is mid (3)
        enrollmentSort(l, mid);
        //Repeat the process but with the 'r' array and...
        //the length is 'a' - mid, 6-3 - 3
        enrollmentSort(r, size-mid);
        //This will result in the mid being 1 for each array. 

        
        //Now it's split, we merge them back. 
        mergeEnrollment(list, l, r, mid, size - mid);
    }
    
    private static void mergeEnrollment (List <Enrollment> list, List <Enrollment> l, List <Enrollment> r, int left, int right) 
    {
        int i = 0;
        int j = 0;
        int k = 0;
        
        while (i < left && j < right) 
        {
            if (l.get(i).enrollmentId <= r.get(j).enrollmentId) 
            {
                list.set(k++, l.get(i++));
            }
            else 
            {
                list.set(k++, r.get(j++));
            }            
        }
        
        while (i < left) 
        {
            list.set(k++, l.get(i++));
        }
        
        while (j < right) 
        {            
            list.set(k++, r.get(j++));
        }
    }   
    
    //ENROLLMENT ↑↑↑↑↑ ENROLLMENT ↑↑↑↑↑ ENROLLMENT ↑↑↑↑↑ ENROLLMENT ↑↑↑↑↑ ENROLLMENT ↑↑↑↑↑ 
    
    
    
            //COURSE ↓↓↓↓↓ COURSE ↓↓↓↓↓ COURSE ↓↓↓↓↓ COURSE ↓↓↓↓↓ COURSE ↓↓↓↓↓ 
    //int n = list size. 
    public static void courseSort(List<Course> list, int size)
    {
        //IF array length is 1 then return only item, array[0]
        //SECOND ROUND OF L: n=3
        if (size < 2) 
        {
            return;
        }
        
        //Mid is array divided by 2 (array length of 6/2 will = 
        //If n is odd number, round down. 
        int mid = size /2;
        
        //l array is studnet array starting from mid point (3). 
        //r array is studnet array starting from...
        //student array length(6) - mid(3), 3. 

        List<Course> l = new ArrayList<>(); 
        List<Course> r = new ArrayList<>(); 
        
        //Reminder that a = the studnet array. 
        //For each item in 'a' array, copy to 'l' array untill...
        //one less than mid point. ie copy a[0], a[1], a[2]. But not a[3]. 
        for (int i = 0; i < mid; i++) 
        {
            l.set(i, list.get(i));
        }
        
        //For each item in 'a' array, copy to 'r' array from... 
        //mid point 3 (r[2], r[1], r[0]) backwards. 
        //i.e. it is the last half of array 'a' but backwards. 
        for (int i = mid; i < size; i++)
        {
            r.set(i-mid, list.get(i));
        }
        
        /*
        Current status of 'l' and 'r' in comparison to 'a': 
        a(0 1 2      3 4 5)
        l(0 1 2)  r (5 4 3)
        
        */
        
        //Now it gets confusing: 
        //Repeat the process but with the 'l' array and...
        //the length is mid (3)
        courseSort(l, mid);
        //Repeat the process but with the 'r' array and...
        //the length is 'a' - mid, 6-3 - 3
        courseSort(r, size-mid);
        //This will result in the mid being 1 for each array. 

        
        //Now it's split, we merge them back. 
        mergeCourse(list, l, r, mid, size - mid);
    }
    
    private static void mergeCourse (List <Course> list, List <Course> l, List <Course> r, int left, int right) 
    {
        int i = 0;
        int j = 0;
        int k = 0;
        
        while (i < left && j < right) 
        {
            if (l.get(i).courseCode <= r.get(j).courseCode) 
            {
                list.set(k++, l.get(i++));
            }
            else 
            {
                list.set(k++, r.get(j++));
            }            
        }
        
        while (i < left) 
        {
            list.set(k++, l.get(i++));
        }
        
        while (j < right) 
        {            
            list.set(k++, r.get(j++));
        }
    }   
    
    //COURSE ↑↑↑↑↑ COURSE ↑↑↑↑↑ COURSE ↑↑↑↑↑ COURSE ↑↑↑↑↑ COURSE ↑↑↑↑↑ 
    
    
}
