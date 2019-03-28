package pl.testuj.service;

import pl.testuj.controllers.RouteCreatorController;

public class TablePoint {

    private String trackedAt;
    private String country;
    private String type;

    private RouteCreatorController routeCreatorController;

    public TablePoint(RouteCreatorController controller) {routeCreatorController = controller;}

    public void create(){
        setTrackedAt(routeCreatorController.getCurrentDate().toString());
        setCountry(routeCreatorController.getCountryCB().getValue());
        setType(routeCreatorController.getTypeCB().getValue());
    }

    @Override
    public String toString() {
        return "TablePoint{" +
                "trackedAt='" + trackedAt + '\'' +
                ", country='" + country + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public void setTrackedAt(String trackedAt) {
        this.trackedAt = trackedAt;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setType(String type) {
        this.type = type;
    }
}
