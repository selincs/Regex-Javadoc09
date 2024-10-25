package csc311.regex_javadoc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationController implements Initializable {

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
    private Label emailVldLbl;

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
        //open new UI upon successful Add

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Set visibility of labels before program displays to user
        //Add listeners to apply focus validation
        //Can i make this so that it does not display until focus is given first? then validate?
        f_NameVldLbl.setVisible(false);
        fNameTF.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue) {  // Focus lost
                validateFirstName();
            }
        });

        l_NameVldLbl.setVisible(false);
        emailVldLbl.setVisible(false);

        dobVldLbl.setVisible(false);
        dobTF.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue) {  // Focus lost
               // validateFirstName();
            }
        });

        zipVldLbl.setVisible(false);
        zipTF.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue) {  // Focus lost
                validateZipCode();
            }
        });


    }

    private void validateZipCode() {
        //Zip Code Regex Validation
        //Get zip string from TF, create regex pattern + mattern
        //alter if else statements
        String zipCodeStr = zipTF.getText();
        final String regexZipPattern = "(\\d{5})";
        final Pattern pattern = Pattern.compile(regexZipPattern, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(zipCodeStr);

        // Example validation: Show the label if the first name is empty
        //Regex for if statement below
        if (!matcher.matches()) {
            zipVldLbl.setVisible(true);
        } else {
            zipVldLbl.setVisible(false);
        }
    }

    //Can probably make this just validate name as they have the same parameters of validation
    //Maybe I should keep this seperate? How should I do about enabling addUserBtn if everything = valid?
    //Just use flags, and 2 specific flags for this one?
    private void validateFirstName() {
        String firstName = fNameTF.getText();

        // Example validation: Show the label if the first name is empty
        //Regex for if statement below
        if (firstName == null || firstName.trim().isEmpty()) {
            f_NameVldLbl.setVisible(true);
        } else {
            f_NameVldLbl.setVisible(false);
        }
    }
}

