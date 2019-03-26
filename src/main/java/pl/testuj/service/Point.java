package pl.testuj.service;

import pl.testuj.controllers.RouteCreatorController;

public class Point {

    private int sourceId;
    private Type type;
    private Long trackedAt;
    private int batteryPower;
    private boolean charging;
    private String registrationNumber;
    private double speed;
    private int heading;
    private int accuracy;
    private double latitude;
    private double longitude;
    private double altitude;

    private RouteCreatorController routeCreatorController;

    public Point(RouteCreatorController controller) {routeCreatorController = controller;}

    public void create(){
        routeCreatorController.setPointID(routeCreatorController.getPointID()+1);
        this.setSourceId(routeCreatorController.getPointID());
        this.setType(Type.valueOf(routeCreatorController.getTypeCB().getValue()));
        this.setTrackedAt(routeCreatorController.getCurrentDate().getTime());
        this.setBatteryPower(Integer.parseInt(routeCreatorController.getBatteryPowerTF().getText()));
        this.setCharging(Boolean.parseBoolean(routeCreatorController.getChargingCB().getValue()));
        this.setRegistrationNumber(routeCreatorController.getRegistrationNumberTF().getText());
        this.setSpeed(Double.parseDouble(routeCreatorController.getSpeedTF().getText()));
        this.setHeading(Integer.parseInt(routeCreatorController.getHeadingTF().getText()));
        this.setAccuracy(Integer.parseInt(routeCreatorController.getAccuracyTF().getText()));
        this.setLatitude(Country.valueOf(routeCreatorController.getCountryCB().getValue()).getLatitude());
        this.setLongitude(Country.valueOf(routeCreatorController.getCountryCB().getValue()).getLongitude());
        this.setAltitude(Country.valueOf(routeCreatorController.getCountryCB().getValue()).getAltitude());
    }

    @Override
    public String toString() {
        return "Point{" +
                "sourceId=" + sourceId +
                ", type=" + type +
                ", trackedAt=" + trackedAt +
                ", batteryPower=" + batteryPower +
                ", charging=" + charging +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", speed=" + speed +
                ", heading=" + heading +
                ", accuracy=" + accuracy +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", altitude=" + altitude +
                '}';
    }

    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setTrackedAt(Long trackedAt) {
        this.trackedAt = trackedAt;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public void setCharging(boolean charging) {
        this.charging = charging;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setHeading(int heading) {
        this.heading = heading;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }
}
