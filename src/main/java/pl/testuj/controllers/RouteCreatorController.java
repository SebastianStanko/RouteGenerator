package pl.testuj.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import pl.testuj.validators.FormValidator;

public class RouteCreatorController {

    private MainController mainController;

    @FXML
    private Button createPointBtn;

    @FXML
    private Button backFromRouteCreator;

    @FXML
    private ChoiceBox<String> chargingCB;

    @FXML
    private TextField batteryLevelTF;

    @FXML
    private TextField speedTF;

    @FXML
    private TextField headingTF;

    @FXML
    private TextField accuracyTF;

    @FXML
    private ChoiceBox<String> typeCB;

    @FXML
    private TextField registrationNumberTF;

    @FXML
    private Text actualDateText;

    @FXML
    private TextField additionalYearTF;

    @FXML
    private TextField additionalMonthTF;

    @FXML
    private TextField additionalDayTF;

    @FXML
    private TextField additionalHourTF;

    @FXML
    private TextField additionalMinuteTF;

    @FXML
    private ChoiceBox<String> countryCB;

    @FXML
    public void initialize(){
//        loadData();
    }

    @FXML
    void backToMenu() {
        mainController.loadMenuScreen();
    }

    @FXML
    private void createPoint() {
        FormValidator formValidator = new FormValidator();
        if(formValidator.isFormValid()){
            System.out.println("Przszło");
        }
        System.out.println("Nie przeszło");

    }

//    private void loadData(){
//        ObservableList<String> chargingCBOptions = FXCollections.observableArrayList("true", "false");
//        ObservableList<String> typeCBOptions = FXCollections.observableArrayList("start", "broadcast", "end");
//        ObservableList<String> countryCBOptions = FXCollections.observableArrayList("Polska", "Niemcy", "Francja");
//
//        chargingCB.getItems().addAll(chargingCBOptions);
//        chargingCB.setValue(chargingCBOptions.get(0));
//        typeCB.getItems().addAll(typeCBOptions);
//        typeCB.setValue(typeCBOptions.get(0));
//        countryCB.getItems().addAll(countryCBOptions);
//        countryCB.setValue(countryCBOptions.get(0));
//
//    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    public ChoiceBox<?> getChargingCB() {
        return chargingCB;
    }

    public TextField getBatteryLevelTF() {
        return batteryLevelTF;
    }

    public TextField getSpeedTF() {
        return speedTF;
    }

    public TextField getHeadingTF() {
        return headingTF;
    }

    public TextField getAccuracyTF() {
        return accuracyTF;
    }

    public ChoiceBox<?> getTypeCB() {
        return typeCB;
    }

    public TextField getRegistrationNumberTF() {
        return registrationNumberTF;
    }

    public TextField getAdditionalYearTF() {
        return additionalYearTF;
    }

    public TextField getAdditionalMonthTF() {
        return additionalMonthTF;
    }

    public TextField getAdditionalDayTF() {
        return additionalDayTF;
    }

    public TextField getAdditionalHourTF() {
        return additionalHourTF;
    }

    public TextField getAdditionalMinuteTF() {
        return additionalMinuteTF;
    }

    public ChoiceBox<?> getCountryCB() {
        return countryCB;
    }
}

