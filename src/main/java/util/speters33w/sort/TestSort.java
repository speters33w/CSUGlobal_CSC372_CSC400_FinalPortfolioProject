/*
CSU Global CSC400 Module 6: Critical Thinking

Critical Thinking Assignment (70 Points)

Program 4 (Exercise #11)

Implement the algorithm outlined in Exercise # 11 (Chapter 15 of Carrano & Henry, p. 458) in Java:

"Devise an algorithm that detects whether a given array is sorted into ascending order. Write a Java method that
implements your algorithm. You can use your method to test whether a sort method has executed correctly."

Ensure that your program has the required class and a test class.
 */
package util.speters33w.sort;

import java.util.ArrayList;

/**
 * Tests whether an array of comparables is sorted.
 */
public final class TestSort {

    @SuppressWarnings("unused")
    private TestSort() {}

    /**
     * Tests whether ArrayList of comparables is sorted.
     * @param arrayList an ArrayList of sorted comparables to test.
     * @return true if the ArrayList is sorted, false otherwise.
     * @param <T> the type of comparables in the ArrayList.
     */
    @SuppressWarnings("unchecked")
    public static <T extends Comparable<? super T>> boolean isSorted(ArrayList<T> arrayList){
        T[] array = (T[]) new Comparable[arrayList.size() - 1];
        for (int i = 0; i < arrayList.size() - 1; i++) {
            array[i] = arrayList.get(i);
        }
        return isSorted(array);
    }

    /**
     * Tests whether an array of comparables is sorted.
     * @param array an array of comparables to test.
     * @return true if the array is sorted, false otherwise.
     * @param <T> the type of comparables in the array.
     */
    public static <T extends Comparable<? super T>> boolean isSorted(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                System.out.printf("!!!!!!!!!!! FAILED SORT TEST !!!!!!!!!!" +
                                  "%n%s>>>>>>>>>>>%n%s%n" +
                                  "!!!!!!!!!!! FAILED SORT TEST !!!!!!!!!!%n",
                        array[i], array[i + 1]);
                return false; // This will only show the first occurrence of failure on the console.
            }
        }
        System.out.println("Sort Test Passed!");
        return true;
    }

    /**
     * Tests whether ArrayList of comparables is sorted.
     * @param arrayList an ArrayList of sorted comparables to test.
     * @param ascending true if the array should be sorted in ascending order, false otherwise.
     * @return true if the ArrayList is sorted, false otherwise.
     * @param <T> the type of comparables in the ArrayList.
     */
    @SuppressWarnings("unchecked")
    public static <T extends Comparable<? super T>> boolean isSorted(ArrayList<T> arrayList, boolean ascending) {
        if (ascending) {
            return isSorted(arrayList);
        } else {
            T[] array = (T[]) new Comparable[arrayList.size() - 1];
            for (int i = 0; i < arrayList.size() - 1; i++) {
                array[i] = arrayList.get(i);
            }
            return isSorted(array, false);
        }
    }

    /**
     * Tests whether an array of comparables is sorted.
     * @param array an array of comparables to test.
     * @param ascending true if the array should be sorted in ascending order, false otherwise.
     * @return true if the array is sorted, false otherwise.
     * @param <T> the type of comparables in the array.
     */
    public static <T extends Comparable<? super T>> boolean isSorted(T[] array, boolean ascending) {
        if (ascending) {
            return isSorted(array);
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareTo(array[i + 1]) < 0) {
                    System.out.printf("!!!!!!!!!!! FAILED SORT TEST !!!!!!!!!!" +
                                      "%n%s>>>>>>>>>>>%n%s%n" +
                                      "!!!!!!!!!!! FAILED SORT TEST !!!!!!!!!!%n",
                            array[i], array[i + 1]);
                    return false; // This will only show the first occurrence of failure on the console.
                }
            }
        }
        System.out.println("Sort Test Passed!");
        return true;
    }
}
