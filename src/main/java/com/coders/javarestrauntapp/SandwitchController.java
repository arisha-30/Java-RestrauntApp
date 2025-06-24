package com.coders.javarestrauntapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SandwitchController implements Initializable{
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    public void goToProduct(MouseEvent event)  throws IOException {
        Parent helloPage= FXMLLoader.load(getClass().getResource("Product.fxml"));
        Scene helloPageScene = new Scene(helloPage);
        Stage appStage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(helloPageScene);
        appStage.show();
    }
    @FXML
    public void goToOrder(ActionEvent event) throws IOException{
        Parent helloPage= FXMLLoader.load(getClass().getResource("Orders.fxml"));
        Scene helloPageScene = new Scene(helloPage);
        Stage appStage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(helloPageScene);
        appStage.show();
    }
}
