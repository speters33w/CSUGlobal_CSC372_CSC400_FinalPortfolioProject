/*

CSU Global CSC372 Module 6: Critical Thinking

Critical Thinking Assignment (70 Points)

Create a Java program that will store 10 student objects in an ArrayList, ArrayList<Student>.
A student object consists of the following fields:

    int rollno
    String name
    String address

CSU Global CSC372 Module 8: Final Program

Portfolio Project (300 Points)

Write a Java program that incorporates a loop that prompts the user for student data.
Student data are private fields in a student class including:

    String name
    String address
    double GPA
*/
package edu.csuglobal.csc372.milestone2.sort_students;

/*
        <!-- https://mvnrepository.com/artifact/com.tupilabs/human-name-parser -->
        <dependency>
            <groupId>com.tupilabs</groupId>
            <artifactId>human-name-parser</artifactId>
            <version>0.2</version>
        </dependency>
 */
import com.tupilabs.human_name_parser.HumanNameParserBuilder;
import com.tupilabs.human_name_parser.HumanNameParserParser;
import com.tupilabs.human_name_parser.Name;

import java.util.ArrayList;

/**
 * A student object consisting of the following fields:
 *     int rollno
 *     String name
 *     String address
 *     double GPA
 */
@SuppressWarnings("unused")
public class Student implements Comparable<Student>, Cloneable   {

    /**
     * The roll number of the student.
     */
    private int rollno;
    /**
     * The first and last name of the student.
     */
    private String name;
    /**
     * The mailing address of the student.
     */
    private String address;
    /**
     * The GPA of the student.
     */
    private double gpa;

    /**
     * Construct a new student object.
     * @param rollno The rollno of the student.
     * @param name The first and last name of the student.
     * @param address The mailing address of the student.
     */
    public Student(int rollno, String name, String address) {
        super();
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    /**
     * Construct a new student object.
     * @param name The first and last name of the student.
     * @param address The mailing address of the student.
     * @param gpa The GPA of the student.
     */
    public Student(String name, String address, double gpa) {
        super();
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }

    /**
     * Returns the roll number of the student.
     * @return the roll number of the student.
     */
    public int getRollno() {
        return rollno;
    }

    /**
     * Returns the name of the student.
     * @return the name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     Parses a human name that can include prefixes, Dr, Fr, Mr, Miss, The Honorable, etc.
     * Uses the <a href = "https://github.com/tupilabs/HumanNameParser.java">
     *     com.tupilabs.human_name_parser
     * </a> library to parse a human name that can include prefixes, Dr, Fr, Mr, Miss, The Honorable, etc.
     * and return the first name of the student.
     *
     * @return The first as a string, depending on the boolean lastName argument.
     * @see com.tupilabs.human_name_parser.HumanNameParserParser
     */
    public String getFirstName() {
        Name parsedName = new Name(name);
        HumanNameParserBuilder builder = new HumanNameParserBuilder(name);
        HumanNameParserParser parser = builder.build();
        return parser.getFirst();
    }

    /**
     Parses a human name that can include prefixes, Dr, Fr, Mr, Miss, The Honorable, etc.
     * Uses the <a href = "https://github.com/tupilabs/HumanNameParser.java">
     *     com.tupilabs.human_name_parser
     * </a> library to parse a human name that can include suffixes, Jr, III, MD, etc.
     * and return the last name of the student.
     *
     * @return The first as a string, depending on the boolean lastName argument.
     * @see com.tupilabs.human_name_parser.HumanNameParserParser
     */
    public String getLastName() {
        Name parsedName = new Name(name);
        HumanNameParserBuilder builder = new HumanNameParserBuilder(name);
        HumanNameParserParser parser = builder.build();
        return parser.getLast();
    }

    /**
     * Returns the mailing address of the student.
     * @return the mailing address of the student.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Returns the GPA of the student.
     * @return the GPA of the student.
     */
    public double getGPA() {
        return gpa;
    }

    /**
     * Sets the roll number of the student.
     * This method is private to avoid conflicts in the CompareTo() method.
     * @param rollno the new roll number of the student.
     */
    private void setRollno(int rollno) {
        this.rollno = rollno;
    }

    /**
     * Sets the name of the student (first and last name).
     * @param name the new name of the student.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the mailing address of the student.
     * @param address the new mailing address of the student.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Sets the GPA of the student.
     * @param gpa the new GPA of the student.
     */
    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    /**
     * Converts an ArrayList of Student objects into an array of Student objects.
     * @param students the ArrayList of Student objects to be converted.
     * @return the array of Student objects.
     */
    public static Student[] studentArrayListToArray(ArrayList<Student> students) {
        Student[] studentArray = new Student[students.size()];
        for (int index = 0; index < students.size(); index++) {
            studentArray[index] = students.get(index);
        }
        return studentArray;
    }

    /**
     * Converts an array of Student objects into an ArrayList of Student objects.
     * @param studentArray the array of Student objects to be converted.
     * @return the ArrayList of Student objects.
     */
    public static ArrayList<Student> arrayToStudentArrayList(Student[] studentArray) {
        ArrayList<Student> students = new ArrayList<>();
        // Assignment requires no usage of java.util.Collections. The following lines could be shortened otherwise.
        //noinspection ManualArrayToCollectionCopy
        for (Student student : studentArray) {
            //noinspection UseBulkOperation
            students.add(student);
        }
        return students;
    }

    /**
     * Returns a string representation of the student object.
     * @return a string representation of the student object.
     */
    @Override
    public String toString() {
        if (this.rollno != 0) {
            return String.format("Roll Number: %d %n%s %n%s%n", this.rollno, this.name, this.address);
        } else {
            return String.format("%s %n%s %nGPA: %.1f%n", this.name, this.address, this.gpa);
        }
    }

    /**
     * Checks to see if two students are equal.
     * @param other the other student to be compared.
     * @return true if the two students are equal, false otherwise.
     */
    public boolean equals(Student other)  {
        if (this == other)
            return true;
        if (other == null)
            return false;
        if (getClass()!= other.getClass())
            return false;
        if (name == null) {
            if (other.name!= null)
                return false;
        if (rollno!= other.rollno)
            return false;
        if (gpa!= other.gpa)
            return false;
        } else if (!name.equals(other.name))
            return false;
        if (address == null) {
            return other.address == null;
        } else return address.equals(other.address);
    }

    /**
     * This method is designed specifically for use with CSU Global CSC 372 Assignment 6
     * (sort by roll number) and the CSC 372 final program (sort by last name).
     * If used to sort by roll number, all students must be assigned a roll number.
     * Compares this student's last name with the other specified student's name,
     * unless both students have a roll number, then compares this student's roll number
     * with the specified object's roll number.
     *
     * @param other the student object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     * @see Comparable#compareTo(Object)
     * @see Integer#compare(int, int)
     */
    @Override
    public int compareTo(Student other) {
        // if this is for Critical Thinking Assignment 6
        if (this.rollno != 0 && other.rollno != 0) {
            return Integer.compare(this.rollno, other.rollno);
        // if this is for Final Program
        } else {
            return this.getLastName().compareTo(other.getLastName());
        }
    }

    /**
     * Returns a clone of this student object.
     * @return a clone of this student object.
     */
    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}
