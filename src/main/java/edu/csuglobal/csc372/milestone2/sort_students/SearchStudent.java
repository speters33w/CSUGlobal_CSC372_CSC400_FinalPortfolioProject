package edu.csuglobal.csc372.milestone2.sort_students;

import java.util.ArrayList;

/**
 * Searches if a query term exists in a list of students.
 */
public class SearchStudent {
    public static Student searchStudent(ArrayList<Student> students, String query) {
        for (Student student : students) {
            if (String.valueOf(student.getRollno()).contains(query) ||
                student.getName().contains(query) ||
                student.getAddress().contains(query)) {
                return student;
            }
        }
        return null;
    }
}
