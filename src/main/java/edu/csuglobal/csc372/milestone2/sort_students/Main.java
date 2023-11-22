/*
CSU Global CSC372 Module 6: Critical Thinking

Critical Thinking Assignment (70 Points)

Create a Java program that will store 10 student objects in an ArrayList, ArrayList<Student>
*/
package edu.csuglobal.csc372.milestone2.sort_students;

import edu.princeton.cs.algs4.Stopwatch;
import util.speters33w.sort.TestSort;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Stopwatch stopwatch;
        ArrayList<Student> students = generateStudents();
        System.out.println("\nStudents as an unsorted ArrayList:");
        printStudents(students);
//        TestSort.isSorted(Student.studentArrayListToArray(students));  // Used to test TestSort.

        ArrayList<Student> studentClone1 = new ArrayList<>(students);
        ArrayList<Student> studentClone2 = new ArrayList<>(students);
        ArrayList<Student> studentClone3 = new ArrayList<>(students);
        ArrayList<Student> studentClone4 = new ArrayList<>(students);
        ArrayList<Student> studentClone5 = new ArrayList<>(students);
        ArrayList<Student> studentClone6 = new ArrayList<>(students);

        // Sort using a Selection Sort algorithm.
        stopwatch = new Stopwatch();
        students =  Student.arrayToStudentArrayList(SortStudents.sortByRollNumberWithSelectionSort(studentClone1));
        System.out.printf("%nTime elapsed using Selection Sort: %s%n%n", stopwatch.elapsedTime());
        TestSort.isSorted(students);
        stopwatch = new Stopwatch();
        students =  Student.arrayToStudentArrayList(SortStudents.sortByLastNameWithSelectionSort(studentClone1));
        System.out.printf("%nTime elapsed for Sort by Last Name using Selection Sort with a Human Name Parser: %s%n%n",
                stopwatch.elapsedTime());
        String[] lastNames = new String[students.size()];
        for (int i = 0; i < students.size(); i++) {
            lastNames[i] = students.get(i).getLastName();
        }
        TestSort.isSorted(lastNames);

        // Sort using Merge sort algorithm after conversion to a Student[] array.
        stopwatch = new Stopwatch();
        students =  Student.arrayToStudentArrayList(SortStudents.sortByRollNumberWithMergeSort(studentClone2));
        System.out.printf("%nTime elapsed using Merge Sort: %s%n%n", stopwatch.elapsedTime());
        TestSort.isSorted(students);

        // Direct ArrayList sort using a Bubble sort algorithm.
        stopwatch = new Stopwatch();
        students = Student.arrayToStudentArrayList(SortStudents.sortByRollnoWithBubbleSort(studentClone3));
        System.out.printf("%nTime elapsed using Bubble Sort: %s%n%n", stopwatch.elapsedTime());
        TestSort.isSorted(students);

        // Sort using Shell sort algorithm after conversion to a Student[] array.
        stopwatch = new Stopwatch();
        students =  Student.arrayToStudentArrayList(SortStudents.sortByRollNumberWithShellSort(studentClone4));
        System.out.printf("%nTime elapsed using edu.princeton.cs.algs4 Shell Sort: %s%n%n", stopwatch.elapsedTime());
        TestSort.isSorted(students);

        // Sort using insertion sort algorithm after conversion to a Student[] array.
        stopwatch = new Stopwatch();
        students =  Student.arrayToStudentArrayList(SortStudents.sortByRollNumberWithInsertionSort(studentClone5));
        System.out.printf("%nTime elapsed using Insertion Sort: %s%n%n", stopwatch.elapsedTime());
        TestSort.isSorted(students);

        // Sort using heap sort algorithm after conversion to a Student[] array.
        stopwatch = new Stopwatch();
        students =  Student.arrayToStudentArrayList(SortStudents.sortByRollNumberWithHeapSort(studentClone6));
        System.out.printf("%nTime elapsed using Heap Sort: %s%n%n", stopwatch.elapsedTime());
        TestSort.isSorted(students);
    }

    /**
     * Prints an ArrayList of Student objects.
     *
     * @param students an ArrayList of Student objects.
     */
    public static void printStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.printf("%s%n", student);
        }
    }

    /**
     * Generates an ArrayList of 10 Student objects based on the list
     * <a href="https://www.summet.com/dmsi/html/codesamples/addresses.html">
     *     available here.</a>
     * with zip codes validated and student roll numbers generated from the random phone numbers.
     *
     * @return an ArrayList of example Student objects.
     */
    public static ArrayList<Student> generateStudents() {
        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student(5637401, "Cecilia Chapman",
                "532d MI Bn.\nAPO, AP 96301");
        students.add(student1);
        Student student2 = new Student(5872335, "Iris Watson",
                "8562 Fuchsia Rd.\nCallaway, MD 20620");
        students.add(student2);
        Student student3 = new Student(7138616, "Celeste Slater",
                "3727 Perambulator Street\nMineola, NY 11523");
        students.add(student3);
        Student student4 = new Student(1516230, "Theodore Lowe",
                "Ap #867, 859 Sit Rd.\nBiloxi, MS 39531");
        students.add(student4);
        Student student5 = new Student(7096392, "Calista Wise",
                "7292 Dictum Av.\nLafayette, IN 47096");
        students.add(student5);
        Student student6 = new Student(3935734, "Kyla Olsen",
                "Ap #651, 8679 Sodales Av.\nNew Rochelle, NY 10855");
        students.add(student6);
        Student student7 = new Student(9603807, "Forrest Ray",
                "103 Integer Rd.\nGreen Creek, NJ 08219");
        students.add(student7);
        Student student8 = new Student(2446306, "Hiroko Potter",
                "2508 Dolor. Av.\nSouth Cairo, NY 12482");
        students.add(student8);
        Student student9 = new Student(2785929, "Nyssa Vazquez",
                "5762 At Rd.\nChelsea MI 48118");
        students.add(student9);
        Student student10 = new Student(5791879, "Lawrence Moreno",
                "9940 Tort Street\nWenatchee, WA 98804");
        students.add(student10);

        return students;
    }
}
