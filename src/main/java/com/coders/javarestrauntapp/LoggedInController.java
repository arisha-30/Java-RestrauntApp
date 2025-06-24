package com.coders.javarestrauntapp;

import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoggedInController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    private TextField tf_search;

    @FXML
    private Button ttf_more;

    @FXML
    public void goToProducts(ActionEvent event) throws IOException {
        Parent helloPage= FXMLLoader.load(getClass().getResource("Product.fxml"));
        Scene helloPageScene = new Scene(helloPage);
        Stage appStage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(helloPageScene);
        appStage.show();
    }
    @FXML
    void goToChickenFillet(MouseEvent event) throws IOException {
        Parent helloPage= FXMLLoader.load(getClass().getResource("ChickenFllet.fxml"));
        Scene helloPageScene = new Scene(helloPage);
        Stage appStage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(helloPageScene);
        appStage.show();
    }
    @FXML
    void goToChocolateMaltCake(MouseEvent event) throws IOException{
        Parent helloPage= FXMLLoader.load(getClass().getResource("ChocolateMaltCake.fxml"));
        Scene helloPageScene = new Scene(helloPage);
        Stage appStage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(helloPageScene);
        appStage.show();
    }
}
