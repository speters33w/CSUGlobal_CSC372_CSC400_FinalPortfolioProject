package edu.csuglobal.csc372.milestone2.sort_students;

import util.speters33w.sort.*;
import edu.princeton.cs.algs4.Shell;

import java.util.ArrayList;

/**
 * This class contains static methods for sorting students.
 */
public final class SortStudents {

    @SuppressWarnings("unused")
    private SortStudents() {}

    /* ***** USING SELECTION SORT ***** */
    public static Student[] sortByRollNumberWithSelectionSort(ArrayList<Student> students) {
        Student[] studentArray = Student.studentArrayListToArray(students);

        // Sort the array of Student objects.
        SelectionSort.selectionSort(studentArray);
        System.out.println("\nStudents sorted by Roll Number using Selection Sort");
        for (Student student : studentArray) {
            System.out.printf("Roll Number: %d; Name: %s.%n", student.getRollno(), student.getName());
        }
        return studentArray;
    }

    public static Student[] sortByLastNameWithSelectionSort(ArrayList<Student> students) {
        Student[] studentArray = Student.studentArrayListToArray(students);

        // Sort the array of Student objects by last name.
        SelectionSortStudent.sortStudentsByLastName(studentArray);
        System.out.println("\nStudents sorted by Last Name using Selection Sort");
        for (Student student : studentArray) {
            System.out.printf("Name: %-16s Roll Number: %d.%n", student.getName() + ";", student.getRollno());
        }
        return studentArray;
    }

    /* ***** USING MERGE SORT ***** */
    public static Student[] sortByRollNumberWithMergeSort(ArrayList<Student> students) {
        Student[] studentArray = Student.studentArrayListToArray(students);

        // Sort the array of Student objects.
        MergeSort.mergeSort(studentArray);
        System.out.println("\nStudents sorted by Roll Number using Merge Sort");
        for (Student student : studentArray) {
            System.out.printf("Roll Number: %d; Name: %s.%n", student.getRollno(), student.getName());
        }
        return studentArray;
    }

    /* ***** USING BUBBLE SORT ***** */
    public static Student[] sortByRollnoWithBubbleSort(ArrayList<Student> students){
        Student[] studentArray = Student.studentArrayListToArray(students);

        BubbleSort.bubbleSort(studentArray);
        System.out.println("\nStudents sorted by Roll Number using Bubble Sort");
        for (Student student : studentArray) {
            System.out.printf("Roll Number: %d; Name: %s.%n", student.getRollno(), student.getName());
        }
        return studentArray;
    }

    public static void sortByLastNameWithBubbleSort(ArrayList<Student> students){
        ArrayList<Student> sortedStudents = BubbleSortStudent.sortByRollno(students);
        BubbleSortStudent.sortByLastName(sortedStudents);
        System.out.println("\nStudents sorted by Last Name:");
        for (Student student : sortedStudents) {
            System.out.printf("Name: %-16s Roll Number: %d.%n", student.getName() + ";", student.getRollno());
        }
    }

    /* ***** USING SHELL SORT ***** */
    public static Student[] sortByRollNumberWithShellSort(ArrayList<Student> students) {
        Student[] studentArray = Student.studentArrayListToArray(students);

        // Sort the array of Student objects.
        Shell.sort(studentArray);
        System.out.println("\nStudents sorted by Roll Number using Shell Sort");
        for (Student student : studentArray) {
            System.out.printf("Roll Number: %d; Name: %s.%n", student.getRollno(), student.getName());
        }
        return studentArray;
    }

    public static Student[] sortByRollNumberWithInsertionSort(ArrayList<Student> students) {
        Student[] studentArray = Student.studentArrayListToArray(students);

        // Sort the array of Student objects.
        InsertionSort.insertionSort(studentArray);
        System.out.println("\nStudents sorted by Roll Number using Insertion Sort");
        for (Student student : studentArray) {
            System.out.printf("Roll Number: %d; Name: %s.%n", student.getRollno(), student.getName());
        }
        return studentArray;
    }

    public static Student[] sortByRollNumberWithHeapSort(ArrayList<Student> students) {
        Student[] studentArray = Student.studentArrayListToArray(students);

        // Sort the array of Student objects.
        HeapSort.heapSort(studentArray);
        System.out.println("\nStudents sorted by Roll Number using Heap Sort");
        for (Student student : studentArray) {
            System.out.printf("Roll Number: %d; Name: %s.%n", student.getRollno(), student.getName());
        }
        return studentArray;
    }
}
