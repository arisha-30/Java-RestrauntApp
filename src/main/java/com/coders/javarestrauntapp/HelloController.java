package com.coders.javarestrauntapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
//import javafx.scene.control.Label;

public class HelloController implements Initializable{
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    private Button button_login;

    @FXML
    private Button button_sign_up;

    @FXML
    private TextField tf_password;

    @FXML
    private TextField tf_username;

    @FXML
    public void goToSignUp(ActionEvent event) throws IOException{
        Parent helloPage= FXMLLoader.load(getClass().getResource("Sign-up.fxml"));
        Scene helloPageScene = new Scene(helloPage);
        Stage appStage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(helloPageScene);
        appStage.show();
    }
    @FXML
    public void goToLogIn(ActionEvent event) throws IOException {
        Parent helloPage= FXMLLoader.load(getClass().getResource("Logged_In.fxml"));
        Scene helloPageScene = new Scene(helloPage);
        Stage appStage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(helloPageScene);
        appStage.show();

    }
}