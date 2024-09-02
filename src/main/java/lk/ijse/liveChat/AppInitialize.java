package lk.ijse.liveChat;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitialize extends Application {

    public static void main(String[] args) {launch(args);}

    @Override
    public void start(Stage stage) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/view/login_form.fxml"));
        stage.setTitle("Login Page");
        stage.centerOnScreen();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
