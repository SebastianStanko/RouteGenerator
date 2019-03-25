package pl.testuj.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.Pane;

import java.io.IOException;



public class NewRouteController {

    @FXML
    private DatePicker firstDate;

    private MainController mainController;

    @FXML
    public void startRoute(){
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/RouteCreator.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        RouteCreatorController routeCreatorController = loader.getController();
        routeCreatorController.setMainController(mainController);
        mainController.setScreen(pane);
    }

    @FXML
    public void backToMenu(){
        mainController.loadMenuScreen();
    }




    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

}
