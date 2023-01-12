package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardController {

    @FXML
    private void goMain(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("main-page.fxml"));

        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void goCart(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("cart-page.fxml"));
        root.getStylesheets().add(this.getClass().getResource("/assets/cart.css").toExternalForm());

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
}
