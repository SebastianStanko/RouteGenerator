package pl.testuj.service;

import javafx.beans.property.SimpleStringProperty;
import pl.testuj.controllers.RouteCreatorController;

public class TablePoint {

    private SimpleStringProperty trackedAt;
    private SimpleStringProperty country;
    private SimpleStringProperty type;

    private RouteCreatorController routeCreatorController;

    public TablePoint(RouteCreatorController controller) {routeCreatorController = controller;}

    public void create(){
        this.trackedAt = new SimpleStringProperty(routeCreatorController.getCurrentDate().toString().substring(0,16));
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

    public SimpleStringProperty trackedAtProperty() {
        return trackedAt;
    }

    public SimpleStringProperty countryProperty() {
        return country;
    }

    public SimpleStringProperty typeProperty() {
        return type;
    }
}
