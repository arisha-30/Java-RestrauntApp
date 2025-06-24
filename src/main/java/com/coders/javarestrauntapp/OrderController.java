package com.coders.javarestrauntapp;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class OrderController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
    @FXML
    public void goToHelloView(ActionEvent event) throws IOException {
        Parent helloPage= FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Scene helloPageScene = new Scene(helloPage);
        Stage appStage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(helloPageScene);
        appStage.show();
    }

    @FXML
    public void goToHome(ActionEvent event) throws IOException{
        Parent helloPage= FXMLLoader.load(getClass().getResource("Logged_In.fxml"));
        Scene helloPageScene = new Scene(helloPage);
        Stage appStage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(helloPageScene);
        appStage.show();
    }
}
