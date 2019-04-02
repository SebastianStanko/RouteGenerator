package pl.testuj.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.Pane;
import pl.testuj.validators.NewRouteFormValidator;

import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDate;

public class NewRouteController {

    @FXML
    private DatePicker firstDate;

    private Timestamp startRouteDate;

    private MainController mainController;

    NewRouteFormValidator newRouteFormValidator = new NewRouteFormValidator(this);

    @FXML
    public void startRoute(){
        if(newRouteFormValidator.isDatePicked()) {
            getTime();
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/FXML/RouteCreator.fxml"));
            Pane pane = null;
            try {
                pane = loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            RouteCreatorController routeCreatorController = loader.getController();
            routeCreatorController.setCurrentDate(startRouteDate);
            routeCreatorController.setFirstDate(startRouteDate);
            routeCreatorController.setActualDateText(startRouteDate.toString());
            routeCreatorController.setMainController(mainController);
            mainController.setScreen(pane);
        }
    }

    @FXML
    public void backToMenu(){
        mainController.loadMenuScreen();
    }

    public void getTime(){
        LocalDate date = firstDate.getValue();
        this.startRouteDate = Timestamp.valueOf(date.atStartOfDay());
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    public DatePicker getFirstDate() {
        return firstDate;
    }
}
