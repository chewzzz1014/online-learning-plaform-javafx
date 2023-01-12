package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CourseController implements Initializable {
    @FXML
    private Button leftButton;

    @FXML
    private Button rightButton;

    @FXML
    private ChoiceBox<String> commentView;

    @FXML
    private MediaView mediaView;

    private String[] viewTypes = {"Top comment", "Most recent"};

    private MediaPlayer mediaPlayer;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // for choice box in course-page
        commentView.getItems().addAll(viewTypes);
        commentView.setValue("Top comment");

        // to autoplay the media in course-page
        String path = new File("src/resources/assets/production ID 4708330.mp4").getAbsolutePath();
        Media media = new Media(new File(path).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaView.setMediaPlayer(mediaPlayer);
        mediaView.setPreserveRatio(true);
        mediaPlayer.setAutoPlay(true);
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
