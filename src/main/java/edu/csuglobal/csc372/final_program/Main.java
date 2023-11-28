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

    /**
     * Main user interface.
     * Allows a default list of students to be generated,
     *     or allows the user to manually enter student data.
     * If user selects manual, the user will be prompted to enter student data.
     * GPA must be between 0.0 to 4.0, input validated by RegEx Pattern matching.
     * The user may enter as many student's data entries as desired.
     * The student array is then sorted in natural order by last name.
     *
     * @param args Command line arguments (not used).
     */
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
        if (input.toUpperCase().charAt(0) == 'M') {
            while (true) {
                System.out.println("Enter the student's full name: ");
                String name = scanner.nextLine().strip();
                // todo will not handle surnames like MacDonald, McMillan, OBrien, O'Neil, etc.
                String[] names = name.split(" ");
                for (int i = 0; i < names.length; i++) {
                    names[i] = names[i].substring(0, 1).toUpperCase() + names[i].substring(1).toLowerCase();
                }
                name = String.join(" ", names);
                System.out.println("Enter the student's street address: ");
                String Address = scanner.nextLine().strip();
                System.out.println("Enter the student's city, state, and zip code: ");
                Address = Address + "\n" + scanner.nextLine().strip();
                String gpaString;
                // RegEx Pattern https://regexr.com/7nptq allows GPA entry from 0.0 to 4.99.
                // These patterns restrict to 0.0 to 3.99 and 4.0.
                while (true) {
                    System.out.println("Enter the student's grade point average: ");
                    gpaString = scanner.nextLine().strip();
                    if (gpaString.matches("[0-3]\\.\\d+") || gpaString.matches("4\\.0+")) {
                        break;
                    }
                    System.out.println("Please enter a valid GPA in the format n.n, n.nn, or n.nnn.");
                }
                Student newStudent = new Student(name, Address, Double.parseDouble(gpaString));
                String response;
                while(true) {
                    System.out.printf("You entered: %s%nAdd this student? (Y/N) ", newStudent);
                    response = scanner.nextLine().toUpperCase();
                    if (response.charAt(0) == 'Y') {
                        students.add(newStudent);
                        System.out.printf("Student %s added successfully.%n", newStudent.getName());
                        break;
                    } else if (response.charAt(0) == 'N') {
                        break;
                    }
                }
                do {
                    System.out.print("Add another student? (Y/N) ");
                    response = scanner.nextLine().toUpperCase();
                } while (response.charAt(0) != 'Y' && response.charAt(0) != 'N');
                if (response.charAt(0) == 'Y') {
                    continue;
                }
                break;
            }
        }
        students.sort(null);  // Natural order is by last name, built in to the Student Class.
        printStudentList(students);
        scanner.close();
    }

    /**
     * Prints a Linked List of Students to the console and a text file.
     * @param students the student list to print.
     */
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

    /**
     * Generates a Linked List of 10 Student objects based on the list
     * <a href="https://www.summet.com/dmsi/html/codesamples/addresses.html">
     *     available here.</a>
     * with zip codes validated.
     */
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