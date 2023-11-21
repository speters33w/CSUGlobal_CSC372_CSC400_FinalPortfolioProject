/*

CSU Global CSC372 Module 6: Critical Thinking

Critical Thinking Assignment (70 Points)

Option # 1
Implement two comparator classes to sort student objects by name and by rollno (roll number).
Implement your own selection sort method and place your code in a separate Java source file.
Do not use a sort method from the Java Collections library.
*/
package edu.csuglobal.csc372.milestone2.sort_students;

public class SelectionSortStudent {
    /**
     * Sorts an array of student objects by last name alphabetically.
     * This method is specific to the Student class for the CSUGlobal assignment.
     *
     * @param students An array of Student objects.
     * @return An array of Student objects, sorted by last name.
     */
    public static Student[] sortStudentsByLastName(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            int minPosition = i;

            for (int j = i + 1; j < students.length; j++) {
                if (students[minPosition].compareLastNameTo(students[j]) > 0) {
                    minPosition = j;
                }
            }
            if (minPosition != i) {
                //swap the current item with the smallest remaining
                Student temp = students[i];
                students[i] = students[minPosition];
                students[minPosition] = temp;
            }
        }
        return students;
    }
}