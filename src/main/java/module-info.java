module csc311.regex_javadoc {
    requires javafx.controls;
    requires javafx.fxml;


    opens csc311.regex_javadoc to javafx.fxml;
    exports csc311.regex_javadoc;
}