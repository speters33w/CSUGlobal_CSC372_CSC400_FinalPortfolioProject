/*
Write a Java program that incorporates a loop that prompts the user for student data.
Student data are private fields in a student class including:

    String name
    String address
    double GPA

Each student object is stored in a linked list.

After the user completes the data entry,
output the contents of the linked list in ascending sorted order by name
to a regular text file that can be opened and viewed using a simple plain-text editor such as notepad.

Validate numeric data for Grade Point Average (GPA).
 */
package edu.csuglobal.csc372.final_program;

import edu.csuglobal.csc372.milestone2.sort_students.Student;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    private Main() {
    } // Utility classes should not have a public or default constructor.

    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("""
                               Enter:\s
                               D for a default list of students.
                               M to manually enter student data.""");
            input = scanner.nextLine();
        } while (input.toUpperCase().charAt(0) != 'M' && input.toUpperCase().charAt(0) != 'D');
        if (input.toUpperCase().charAt(0) == 'D') {
            generateStudents(students);
            System.out.println("\nStudent list (unsorted)");
            for (Student student : students) {
                System.out.printf("%s%n", student);
            }
        }
        if (input.toUpperCase().charAt(0) == 'D') {
            // todo implement manual entry

        }
        students.sort(null);  // Natural order is by last name, built in to the Student Class.
        printStudentList(students);
        scanner.close();
    }

    public static void printStudentList(Collection<Student> students) {
        try (FileWriter fileWriter = new FileWriter("students.txt")) {
            System.out.println("\nStudent list (Sorted by Last Name)");
            for (Student student : students) {
                System.out.printf("%s%n", student);
                fileWriter.write(student.toString() + "\n");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void generateStudents(LinkedList<Student> students) {
        Student student1 = new Student("Cecilia Chapman",
                "532d MI Bn.\nAPO, AP 96301", 3.8);
        students.add(student1);
        Student student2 = new Student("Iris Watson",
                "8562 Fuchsia Rd.\nCallaway, MD 20620", 3.7);
        students.add(student2);
        Student student3 = new Student("Celeste Slater",
                "3727 Perambulator Street\nMineola, NY 11523", 3.9);
        students.add(student3);
        Student student4 = new Student("Theodore Lowe",
                "Ap #867, 859 Sit Rd.\nBiloxi, MS 39531", 2.9);
        students.add(student4);
        Student student5 = new Student("Calista Wise",
                "7292 Dictum Av.\nLafayette, IN 47096", 3.2);
        students.add(student5);
        Student student6 = new Student("Kyla Olsen, III",
                "Ap #651, 8679 Sodales Av.\nNew Rochelle, NY 10855", 3.4);
        students.add(student6);
        Student student7 = new Student("Forrest Ray, Jr.",
                "103 Integer Rd.\nGreen Creek, NJ 08219", 2.1);
        students.add(student7);
        Student student8 = new Student("Fr. Hiroko Potter",
                "2508 Dolor. Av.\nSouth Cairo, NY 12482", 3.3);
        students.add(student8);
        Student student9 = new Student("Nyssa Vazquez",
                "5762 At Rd.\nChelsea MI 48118", 2.0);
        students.add(student9);
        Student student10 = new Student("Lawrence Moreno",
                "9940 Tort Street\nWenatchee, WA 98804", 3.7);
        students.add(student10);
    }
}