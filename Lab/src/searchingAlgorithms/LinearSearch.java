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
public class LinearSearch
{

    public static <E extends Comparable<E>> Integer linearSearch(E[] genericArray, E key)
    {
        for (int i = 0; i < genericArray.length; i++) {
            if (genericArray[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

        
    public static int LinearSearchStudent(Student arr[], int key)
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].studentId == key) {
                return i;
            }
        }
        return -1;
    }
}
