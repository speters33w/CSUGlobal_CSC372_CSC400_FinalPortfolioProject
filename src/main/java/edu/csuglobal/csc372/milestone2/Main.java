package edu.csuglobal.csc372.milestone2;

import edu.csuglobal.csc372.milestone2.recursion.RecursionRunner;
import edu.csuglobal.csc372.milestone2.shapes.ShapeArray;
import edu.csuglobal.csc372.milestone2.sort_students.SortStudents;
import edu.csuglobal.csc372.milestone2.sort_students.Student;

import static edu.csuglobal.csc372.milestone2.sort_students.Main.generateStudents;

import edu.princeton.cs.algs4.Stopwatch;
import util.speters33w.sort.TestSort;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private Main() {
    } // Utility classes should not have a public or default constructor.

    public static void main(String[] args) {
        if (args.length != 1 || args[0].equals("1") || args[0].equals("2")) {
            args = new String[1];
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("""
                                   Enter:\s
                                   4 for module 4 Creating an Abstract Class Shape
                                   5 for module 5 Implementing Recursion to Provide a Product or Sum
                                   6 for module 6 Storing an ArrayList""");
                args[0] = scanner.nextLine().substring(0, 1);
            } while (!args[0].equals("4") &&!args[0].equals("5") && !args[0].equals("6"));
        }
        switch (Integer.parseInt(args[0])) {
            case 4 -> ShapeArray.main(new String[0]); // CSC 372 Module 4 Critical Thinking
            case 5 -> RecursionRunner.main(new String[0]); // CSC 372 Module 5 Critical Thinking
            case 6 -> sort();  // CSC 372 Module 6 Critical Thinking.
            default -> System.out.println("Invalid input");
        }
    }

    /**
     * Critical Thinking 6, Options 1 and 2.
     * Sorts a list of ten students by roll number and last name using a selection sort algorithm.
     * Sorts the students by roll number using a merge sort algorithm.
     */
    public static void sort() {
        // Sort using a Selection Sort algorithm.
        ArrayList<Student> students = generateStudents();
        Stopwatch stopwatch = new Stopwatch();
        students = Student.arrayToStudentArrayList(SortStudents.sortByRollNumberWithSelectionSort(students));
        System.out.printf("%nTime elapsed using Selection Sort: %s%n%n", stopwatch.elapsedTime());
        TestSort.isSorted(students);
        // Sort students by last name using a Selection Sort algorithm.
        stopwatch = new Stopwatch();
        students = Student.arrayToStudentArrayList(SortStudents.sortByLastNameWithSelectionSort(students));
        System.out.printf("%nTime elapsed for Sort by Last Name using Selection Sort with a Human Name Parser: %s%n%n", stopwatch.elapsedTime());
        String[] lastNames = new String[students.size()];
        for (int i = 0; i < students.size(); i++) {
            lastNames[i] = students.get(i).getLastName();
        }
        TestSort.isSorted(lastNames);
        // Sort using Merge sort algorithm after conversion to a Student[] array.
        students = generateStudents();
        stopwatch = new Stopwatch();
        students = Student.arrayToStudentArrayList(SortStudents.sortByRollNumberWithMergeSort(students));
        System.out.printf("%nTime elapsed using Merge Sort: %s%n%n", stopwatch.elapsedTime());
        TestSort.isSorted(students);
    }
}
