package application;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private DoubleProperty buttonWidth = new SimpleDoubleProperty(10);

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
        commentView.getItems().addAll(viewTypes);
        commentView.setValue("Top comment");

        String path = new File("src/resources/assets/production ID 4708330.mp4").getAbsolutePath();
        Media media = new Media(new File(path).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaView.setMediaPlayer(mediaPlayer);
        mediaView.setPreserveRatio(true);
        mediaPlayer.setAutoPlay(true);
    }
}
