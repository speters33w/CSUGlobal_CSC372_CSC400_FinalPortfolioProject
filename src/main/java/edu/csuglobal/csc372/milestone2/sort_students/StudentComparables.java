package edu.csuglobal.csc372.milestone2.sort_students;

@SuppressWarnings("unused")
public enum StudentComparables {
    // todo This might not even work, not implemented yet, needs testing.
    ROLLNO("rollNo"), FIRST_NAME("name"), LAST_NAME("getName().split(\" \")"),
    STATE_OF_RESIDENCE("getAddress().split(\" \")"), ZIP("getAddress().split(\" \")");

    public final String fieldName;

    StudentComparables(String fieldName) {
        this.fieldName = fieldName;
    }

}
