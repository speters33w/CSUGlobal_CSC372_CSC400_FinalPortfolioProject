module edu.csuglobal.csc372.portfolio {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens edu.csuglobal.csc372.milestone1 to javafx.fxml;
    exports edu.csuglobal.csc372.milestone1;
    exports edu.csuglobal.csc372.milestone1.bank_account;
    opens edu.csuglobal.csc372.milestone1.bank_account to javafx.fxml;
}