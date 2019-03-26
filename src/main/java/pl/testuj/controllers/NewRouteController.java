package pl.testuj.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDate;

public class NewRouteController {

    @FXML
    private DatePicker firstDate;

    private Timestamp timestamp;

    private MainController mainController;

    @FXML
    public void startRoute(){
        getTime();
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/RouteCreator.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        RouteCreatorController routeCreatorController = loader.getController();
        routeCreatorController.setCurrentDate(timestamp);
        routeCreatorController.setMainController(mainController);
        mainController.setScreen(pane);
    }

    @FXML
    public void backToMenu(){
        mainController.loadMenuScreen();
    }

    public void getTime(){
        LocalDate date = firstDate.getValue();
        this.timestamp = Timestamp.valueOf(date.atStartOfDay());
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
