/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchingAlgorithms;

import lab.Student;

/**
 *
 * @author jackc
 */
public class MergeSort
{
    //int n = array length. 
    public static void studentSort(Student[] a, int n)
    {
        //IF array length is 1 then return only item, array[0]
        if (n < 2) 
        {
            return;
        }
        
        //Mid is array divided by 2 (array length of 6/2 will = 
        //If n is odd number, round down. 
        int mid = n /2;
        
        //l array is studnet array starting from mid point (3). 
        //r array is studnet array starting from...
        //student array length(6) - mid(3), 3. 
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];
        
        //Reminder that a = the studnet array. 
        //For each item in 'a' array, copy to 'l' array untill...
        //one less than mid point. ie copy a[0], a[1], a[2]. But not a[3]. 
        for (int i = 0; i < mid; i++) 
        {
            l[i] = a[i];
        }
        
        //For each item in 'a' array, copy to 'r' array from... 
        //mid point 3 (r[2], r[1], r[0]) backwards. 
        //i.e. it is the last half of array 'a' but backwards. 
        for (int i = mid; i < n; i++)
        {
            r[i - mid] = a[i];
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
        studentSort(r, n-mid);
        //This will result in the mid being 1 for each array. 
        //https://youtu.be/Zcq_xLi2NGo
        
        //Now it's split, we merge them back. 
        mergeStudent(a, l, r, mid, n - mid);
    }
    
    private static void mergeStudent (Student[] a, Student[] l, Student[] r, int left, int right) 
    {
        int i = 0;
        int j = 0;
        int k = 0;
        
        while (i < left && j < right) 
        {
            if (l[i].studentId <= r[j].studentId)
            {
                a[k++] = l[i++];
            }
            else 
            {
                a[k++] = r[j++];
            }
        }
        
        while (i < left) 
        {
            a[k++] = l[i++];
        }
        
        while (j < right) 
        {
            a[k++] = r[j++];
        }
    }
}
