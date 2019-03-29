package pl.testuj.service;

import javafx.beans.property.SimpleStringProperty;
import pl.testuj.controllers.RouteCreatorController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TablePoint {

    private SimpleStringProperty trackedAt;
    private SimpleStringProperty country;
    private SimpleStringProperty type;

    private RouteCreatorController routeCreatorController;

    public TablePoint(RouteCreatorController controller) {routeCreatorController = controller;}

    public void create(){
        this.trackedAt = new SimpleStringProperty(routeCreatorController.getCurrentDate().toString());
        this.country = new SimpleStringProperty(routeCreatorController.getCountryCB().getValue());
        this.type = new SimpleStringProperty(routeCreatorController.getTypeCB().getValue());
    }

    @Override
    public String toString() {
        return "TablePoint{" +
                "trackedAt='" + trackedAt + '\'' +
                ", country='" + country + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getTrackedAt() {
        return trackedAt.get();
    }

    public void setTrackedAt(String trackedAt) {
        this.trackedAt.set(trackedAt);
    }

    public String getCountry() {
        return country.get();
    }

    public void setCountry(String country) {
        this.country.set(country);
    }

    public String getType() {
        return type.get();
    }

    public void setType(String type) {
        this.type.set(type);
    }
}
