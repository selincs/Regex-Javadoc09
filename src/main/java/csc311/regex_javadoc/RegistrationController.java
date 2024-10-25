package csc311.regex_javadoc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class RegistrationController {

    @FXML
    private Button addBtn;

    @FXML
    private HBox dobHbox;

    @FXML
    private Label dobLbl;

    @FXML
    private TextField dobTF;

    @FXML
    private Label dobVldLbl;

    @FXML
    private HBox emailHbox;

    @FXML
    private Label emailLbl;

    @FXML
    private TextField emailTF;

    @FXML
    private Label email_VldLbl;

    @FXML
    private Label fNameLbl;

    @FXML
    private TextField fNameTF;

    @FXML
    private HBox f_NameHbox;

    @FXML
    private Label f_NameVldLbl;

    @FXML
    private Label lNameLbl;

    @FXML
    private TextField lNameTF;

    @FXML
    private HBox l_NameHbox;

    @FXML
    private Label l_NameVldLbl;

    @FXML
    private HBox zipHbox;

    @FXML
    private Label zipLbl;

    @FXML
    private TextField zipTF;

    @FXML
    private Label zipVldLbl;

    //Set visibility of vldLbls to Off unless invalid entry input
    //Color vldLbls to red
    //Req says when focus is moved off TextField, validate -> Regex validation -> Visibility of label

    //Disable addUserBtn until all fields have valid input

    @FXML
    void addUser(ActionEvent event) {

        //input validation of all fields
        //disable until all fields have valid inputs

    }

}

