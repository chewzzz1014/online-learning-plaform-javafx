package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.function.BinaryOperator;

public class Main extends Application {
    @FXML
    Pane dynamicPane;
    private static Stage window;
    private Pane loginPage;
    private static Scene mainScene;
    private Scene loginScene;
    private static Scene dashboardScene;
    private static Scene cartScene;
    private static Scene courseScene;

    @Override
    public void start(Stage primaryStage) {
        try {
            window = primaryStage;
            Parent root = FXMLLoader.load(this.getClass().getResource("login-page.fxml"));
            root.getStylesheets().add(this.getClass().getResource("/assets/login.css").toExternalForm());

            Scene scene = new Scene(root);
            window.setScene(scene);
            window.setTitle("TEdu Solutions");
            window.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

//    public void loginScene() throws IOException {
//        FXMLLoader loader = new FXMLLoader();
//        loader.setLocation(Main.class.getResource("login-page.fxml"));
//        dynamicPane = loader.load();
//        loginScene = new Scene(dynamicPane);
//        loginScene.getStylesheets().add(this.getClass().getResource("/assets/login.css").toExternalForm());
//        window.setScene(loginScene);
//        window.show();
//    }

    public static void setMainScene() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("main-page.fxml"));
        Pane mainPage = loader.load();
//        dynamicPane.getChildren().add(mainPage);
        mainScene = new Scene(mainPage);
        window.setScene(mainScene);
        window.show();
    }

    public static void setDashboardScene() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("dashboard-page.fxml"));
        Pane dashboardPage = loader.load();
        dashboardScene = new Scene(dashboardPage);
        window.setScene(dashboardScene);
        window.show();
    }

    public static void setCartScene() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("cart-page.fxml"));
        Pane cartPage = loader.load();
        cartScene = new Scene(cartPage);
        window.setScene(cartScene);
        window.show();
    }

    public static void setCourseScene() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("course-page.fxml"));
        Pane coursePage = loader.load();
        courseScene = new Scene(coursePage);
        window.setScene(courseScene);
        window.show();
    }
//
//    private void setDynamicPane(AnchorPane dynamicPane){
//        this.dynamicPane.getChildren().clear();
//        this.dynamicPane.getChildren().add(dynamicPane);
//    }
//
//    @FXML
//    private void yourButtonAction(ActionEvent evt) throws IOException {
//        setDynamicPane(FXMLLoader.load(getClass().getResource("main-page.fxml")));
//    }
}
