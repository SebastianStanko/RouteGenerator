package pl.testuj.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MenuController {

    private MainController mainController;

    @FXML
    public void startNewRoute(){
        FXMLLoader loader = new FXMLLoader(this.getClass().getClassLoader().getResource("fxml/NewRoute.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        NewRouteController newRouteController = loader.getController();
        newRouteController.setMainController(mainController);
        mainController.setScreen(pane);

    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
