package edu.csuglobal.csc372.milestone2.sort_students;

import java.util.ArrayList;

/**
 * This class uses the Bubble Sort algorithm to sort an arraylist of Student objects.
 * It contains methods to sort by rollno, first name, last name, state, or and zip code.
 * The name field may not include suffixes, Jr, III, MD, etc.
 * The last portion of the address must be in the format: "NJ 08219" or "NY 12482", etc.
 */
@SuppressWarnings({"unused"})
public class BubbleSortStudent {

    /**
     * Sorts students in order of rollno.
     * This uses the compareTo() method built in to the Student class.
     * @param students An arraylist of Student objects to be sorted.
     * @return an arraylist of Student objects sorted by rollno.
     */
    public static ArrayList<Student> sortByRollno(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(i).compareTo(students.get(j)) > 0) {
                    Student temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);
                }
            }
        }
        return students;
    }

    /**
     * Sorts students in order of first name.
     * This sorts in alphabetical order according to the first letter in the name field.
     * It will not properly sort if prefixes, Dr, Fr, Mr, Miss, The Honorable, etc.  are present in the name field.
     * @param students An arraylist of Student objects to be sorted.
     * @return an arraylist of Student objects sorted by first name.
     */
    public static ArrayList<Student> sortByFirstName(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(i).getFirstName().compareTo(students.get(i).getFirstName()) > 0) {
                    Student temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);
                }
            }
        }
        return students;
    }

    /**
     * Sorts students in order of last name.
     * This sorts in alphabetical order according to the first letter of the last element in the name field.
     * It will not properly sort if prefixes, Dr, Fr, Mr, Miss, The Honorable, etc.  are present in the name field.
     * @param students An arraylist of Student objects to be sorted.
     * @return an arraylist of Student objects sorted by first name.
     */
    public static ArrayList<Student> sortByLastName(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(i).getLastName().compareTo(students.get(i).getLastName()) > 0) {
                    Student temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);
                }
            }
        }
        return students;
    }

    /**
     * Sorts students in order of state of residence.
     * This sorts in alphabetical order according to the first letter of the second to last element in the address field.
     * It will not properly sort the data contains mixtures of different state naming conventions,
     *     e.g. "New York" and "NY", or "New Hampshire" and "NH".
     *
     * @param students An arraylist of Student objects to be sorted.
     * @return an arraylist of Student objects sorted by state of residence.
     */
    public static ArrayList<Student> sortByState(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            for (int j = i + 1; j < students.size(); j++) {
            // todo This will only work with "NY," "NH," "PA," etc., not "New York" or "New Hampshire," "Penna," etc."
                if (students.get(i).getAddress().split(" ")
                            [students.get(i).getAddress().split(" ").length - 2]
                            .compareTo(students.get(j).getAddress().split(" ")
                                    [students.get(j).getName().split(" ").length - 2]) > 0) {
                    Student temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);
                }
            }
        }
        return students;
    }

    /**
     * Sorts students in order of residence zip code.
     * This sorts in alphabetical order according to the last element in the address field.
     * It does not validate the zip code format.
     *
     * @param students An arraylist of Student objects to be sorted.
     */
    public static void sortByZip(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            for (int j = i + 1; j < students.size(); j++) {
                // todo does not validate standard 5 digit zip or zip+4 format
                if (students.get(i).getAddress().split(" ")
                            [students.get(i).getAddress().split(" ").length - 1]
                            .compareTo(students.get(j).getAddress().split(" ")
                                    [students.get(j).getName().split(" ").length - 1]) > 0) {
                    Student temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);
                }
            }
        }
    }

}
