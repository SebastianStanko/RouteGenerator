package pl.testuj;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/FXML/MainScreen.fxml"));
        StackPane stackPane = loader.load();
        Scene scene = new Scene(stackPane, 350, 400);
        scene.getStylesheets().add(getClass().getResource("/CSS/fontCustom").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Generator Tras");
        primaryStage.show();
    }
}
