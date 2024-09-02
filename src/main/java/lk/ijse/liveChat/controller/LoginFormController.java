package lk.ijse.liveChat.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {

    @FXML
    private AnchorPane root;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUserName;

    @FXML
    void loginBtnOnAction(ActionEvent event) throws IOException {
        ClientFormController.userName = txtUserName.getText();
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/client_form.fxml"));
        Scene scene = new  Scene(anchorPane);
        Stage stage =new Stage();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setTitle(txtUserName.getText());
        stage.show();
        txtUserName.setText("");
    }

    @FXML
    void txtPasswordOnAction(ActionEvent event) {

    }

    @FXML
    void txtUserNameOnAction(ActionEvent event) {

    }
}
