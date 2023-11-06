module edu.csuglobal.csc372.portfolio {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens edu.csuglobal.csc372.portfolio to javafx.fxml;
    exports edu.csuglobal.csc372.portfolio;
}