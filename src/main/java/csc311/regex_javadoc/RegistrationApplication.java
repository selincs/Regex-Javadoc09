package csc311.regex_javadoc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistrationApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {


        FXMLLoader fxmlLoader = new FXMLLoader(RegistrationApplication.class.getResource("registration-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 480);
        stage.setTitle("Regex + JavaDoc Assignment");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}