package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    @FXML
    private ImageView iView;

    @FXML
    private void goMainPage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("main-page.fxml"));

        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void goCart(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("cart-page.fxml"));

        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void goDashboard(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("dashboard-page.fxml"));

        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void goCourse(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("course-page.fxml"));
        root.getStylesheets().add(this.getClass().getResource("/assets/application.css").toExternalForm());

        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
}
