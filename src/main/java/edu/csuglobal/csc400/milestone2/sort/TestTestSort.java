/*
CSU Global CSC400 Module 6: Critical Thinking

Critical Thinking Assignment (70 Points)

Program 4 (Exercise #11)

Implement the algorithm outlined in Exercise # 11 (Chapter 15 of Carrano & Henry, p. 458) in Java:

"Devise an algorithm that detects whether a given array is sorted into ascending order. Write a Java method that
implements your algorithm. You can use your method to test whether a sort method has executed correctly."

Ensure that your program has the required class and a test class.
 */
package edu.csuglobal.csc400.milestone2.sort;

import util.speters33w.sort.HeapSort;
import util.speters33w.sort.TestSort;  // This is the required class.
import edu.csuglobal.csc372.milestone2.sort_students.Main; //this is the required test class.

import java.util.Arrays;

/**
 * This class uses methods contained in edu.csuglobal.csc372.milestone1.sort_students
 * and util.speters33w.sort to test the assignment.
 */
public class TestTestSort {
    public static void main(String[] args) {
        Main.main(args);
        System.out.println("\nTesting with an unsorted Integer array:");
        Integer[] array = new Integer[]{2, 3, 1, 6, 8, 9, 3, 6, 2, 9, 2};
        System.out.println(Arrays.toString(array));
        TestSort.isSorted(array);
        HeapSort.heapSort(array);
        System.out.println("\nTesting with a sorted Integer array:");
        System.out.println(Arrays.toString(array));
        TestSort.isSorted(array);
    }
}
