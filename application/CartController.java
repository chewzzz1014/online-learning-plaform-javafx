package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CartController implements Initializable {
    @FXML
    private ChoiceBox<String> myChoiceBox;
    private final String[] payMethod = {"Tng E-Wallet", "GrabPay", "CIMBClicks"};
    @FXML
    private CheckBox mainCheck;
    @FXML
    private CheckBox firstCheck;
    @FXML
    private CheckBox secondCheck;
    @FXML
    private TextField tfFirst;
    @FXML
    private TextField tfSecond;
    @FXML
    private TextField tfTotal;

    private double total;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myChoiceBox.getItems().addAll(payMethod);
        myChoiceBox.setValue("Tng E-Wallet");

        double firstPrice = Double.valueOf(tfFirst.getText().substring(3));
        double secondPrice = Double.valueOf(tfSecond.getText().substring(3));

        mainCheck.selectedProperty().addListener((obs, oldValue, newValue) -> {
            if (mainCheck.isSelected()) {
                firstCheck.setSelected(true);
                secondCheck.setSelected(true);

                total = firstPrice + secondPrice;
            }
            else {
                firstCheck.setSelected(false);
                secondCheck.setSelected(false);

                total = 0;
            }

            tfTotal.setText("RM " + total);
        });

        firstCheck.selectedProperty().addListener((obs, oldValue, newValue) -> {
            if (firstCheck.isSelected() && !secondCheck.isSelected()) {
                total = firstPrice;

            }
            else if (secondCheck.isSelected() && !firstCheck.isSelected()) {
                total = secondPrice;

            }
            else if (firstCheck.isSelected() && secondCheck.isSelected()) {
                mainCheck.setSelected(true);

                total = firstPrice + secondPrice;
            }

            tfTotal.setText("RM " + total);
        });

        secondCheck.selectedProperty().addListener((obs, oldValue, newValue) -> {
            if (firstCheck.isSelected() && !secondCheck.isSelected()) {
                total = firstPrice;

            }
            else if (secondCheck.isSelected() && !firstCheck.isSelected()) {
                total = secondPrice;

            }
            else if (firstCheck.isSelected() && secondCheck.isSelected()) {
                mainCheck.setSelected(true);

                total = firstPrice + secondPrice;
            }

            tfTotal.setText(String.format("RM%.2f", total));
        });
    }

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

//    @FXML
//    private void calcTotal() {
//
//
//        if (mainCheck.isSelected()) {
//
//        }
//        else {
//            if (firstCheck.isSelected() && !secondCheck.isSelected()) {
//                total = firstPrice;
//            }
//            else if (secondCheck.isSelected() && !firstCheck.isSelected()) {
//                total = secondPrice;
//            }
//            else if (firstCheck.isSelected() && secondCheck.isSelected()) {
//                mainCheck.setSelected(true);
//
//                total = firstPrice + secondPrice;
//            }
//            else {
//                total = 0;
//            }
//        }
//
//        tfTotal.setText("RM " + total);
//    }
}
