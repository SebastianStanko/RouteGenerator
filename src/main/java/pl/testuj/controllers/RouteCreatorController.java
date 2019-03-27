package pl.testuj.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import org.json.JSONException;
import pl.testuj.service.Point;
import pl.testuj.utils.DateHandler;
import pl.testuj.utils.JSONHandler;
import pl.testuj.utils.Parser;
import pl.testuj.validators.FormValidator;

import java.sql.Timestamp;

public class RouteCreatorController {

    private MainController mainController;

    @FXML
    private ChoiceBox<String> chargingCB;

    @FXML
    private TextField batteryPowerTF;

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
    private TextField additionalDayTF;

    @FXML
    private TextField additionalHourTF;

    @FXML
    private TextField additionalMinuteTF;

    @FXML
    private ChoiceBox<String> countryCB;

    private Timestamp currentDate;

    private int pointID;

    @FXML
    public void initialize() {
        loadData();
    }

    @FXML
    void backToMenu() {
        mainController.loadMenuScreen();
    }

    JSONHandler handler = new JSONHandler();

    @FXML
    private void createPoint() throws JSONException {
        FormValidator formValidator = new FormValidator(this);
        if (formValidator.isFormValid()) {
            DateHandler dateHandler = new DateHandler(this);
            Parser parser = new Parser(this);
            dateHandler.addTime(parser.parseDays(),parser.parseHours(),parser.parseMinutes());
            Point point = new Point(this);
            point.create();
            handler.list.add(point);

            actualDateText.setText(currentDate.toString());
            System.out.println(point);
        } else {
            System.out.println("Nie przeszło");
        }
    }

    @FXML
    private void endRoute() throws JSONException {
        System.out.println(handler.toJsonArray());
    }

    private void loadData() {
        ObservableList<String> chargingCBOptions = FXCollections.observableArrayList("true", "false");
        ObservableList<String> typeCBOptions = FXCollections.observableArrayList("START", "BROADCAST", "END");
        ObservableList<String> countryCBOptions = FXCollections.observableArrayList
                ("Austria", "Belgia", "Chorwacja", "Czechy","Francja","Hiszpania","Holandia","Niemcy",
                        "Polska", "Portugalia", "Słowacja", "Słowenia", "Szwajcaria", "Węgry", "Włochy");

        chargingCB.getItems().addAll(chargingCBOptions);
        chargingCB.setValue(chargingCBOptions.get(0));
        typeCB.getItems().addAll(typeCBOptions);
        typeCB.setValue(typeCBOptions.get(0));
        countryCB.getItems().addAll(countryCBOptions);
        countryCB.setValue(countryCBOptions.get(0));
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    public ChoiceBox<String> getChargingCB() {
        return chargingCB;
    }

    public TextField getBatteryPowerTF() {
        return batteryPowerTF;
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

    public ChoiceBox<String> getTypeCB() {
        return typeCB;
    }

    public TextField getRegistrationNumberTF() {
        return registrationNumberTF;
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

    public ChoiceBox<String> getCountryCB() {
        return countryCB;
    }

    public int getPointID() {
        return pointID;
    }

    public void setPointID(int pointID) {
        this.pointID = pointID;
    }

    public Timestamp getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Timestamp currentDate) {
        this.currentDate = currentDate;
    }
}

