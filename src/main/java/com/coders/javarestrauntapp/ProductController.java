package com.coders.javarestrauntapp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ProductController implements Initializable {


    @FXML
    private ImageView backicon;

    @FXML
    private ImageView imageView;
    private boolean isWhite = true;
    private Image whiteImage;
    private Image redImage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

//        ClassLoader classLoader = HelloApplication.class.getClassLoader();
//        whiteImage = new Image(classLoader.getResourceAsStream("images/white_heart.png"));
//        imageView.setImage(whiteImage);
//
//        redImage = new Image(classLoader.getResourceAsStream("images/heart_filled.png"));
//
//        imageView.setOnMouseClicked(this::changeImage);
    }
    @FXML
    private ImageView img_lemonCake;

    @FXML
    public void goToLogIn(MouseEvent event) throws IOException {
        Parent helloPage= FXMLLoader.load(getClass().getResource("Logged_In.fxml"));
        Scene helloPageScene = new Scene(helloPage);
        Stage appStage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(helloPageScene);
        appStage.show();
    }
    @FXML
    public void goToLemonBlueberryCake(MouseEvent event) throws IOException{
        Parent helloPage= FXMLLoader.load(getClass().getResource("LemonCakeOrderForm.fxml"));
        Scene helloPageScene = new Scene(helloPage);
        Stage appStage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(helloPageScene);
        appStage.show();
    }
    @FXML
    public void goToChocolateMaltCake(MouseEvent event) throws IOException{
        Parent helloPage= FXMLLoader.load(getClass().getResource("ChocolateMaltCake.fxml"));
        Scene helloPageScene = new Scene(helloPage);
        Stage appStage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(helloPageScene);
        appStage.show();
    }
    @FXML
    public void goToSpagheti(MouseEvent event) throws IOException{
        Parent helloPage= FXMLLoader.load(getClass().getResource("Spegheti.fxml"));
        Scene helloPageScene = new Scene(helloPage);
        Stage appStage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(helloPageScene);
        appStage.show();
    }
    @FXML
    public void goToIceCream(MouseEvent event) throws IOException{
        Parent helloPage= FXMLLoader.load(getClass().getResource("IceCreamCone.fxml"));
        Scene helloPageScene = new Scene(helloPage);
        Stage appStage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(helloPageScene);
        appStage.show();
    }
    @FXML
    public void goToChocolateChip(MouseEvent event) throws IOException{
        Parent helloPage= FXMLLoader.load(getClass().getResource("ChocolateChips.fxml"));
        Scene helloPageScene = new Scene(helloPage);
        Stage appStage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(helloPageScene);
        appStage.show();
    }
    @FXML
    public void goToSandwitch(MouseEvent event) throws IOException{
        Parent helloPage= FXMLLoader.load(getClass().getResource("Sandwitch.fxml"));
        Scene helloPageScene = new Scene(helloPage);
        Stage appStage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(helloPageScene);
        appStage.show();
    }
    @FXML
    public void changeImage(MouseEvent event) {
        if (isWhite) {
            imageView.setImage(redImage);
        } else {
            imageView.setImage(whiteImage);
        }
        isWhite = !isWhite;
    }
}
