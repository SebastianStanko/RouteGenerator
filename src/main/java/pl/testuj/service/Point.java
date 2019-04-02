package pl.testuj.service;

import pl.testuj.controllers.RouteCreatorController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    public String getDateString() {
        return getDateString("yyyy-MM-dd HH:mm:ss");
    }

    public String getDateString(String format) {
        DateFormat sdf = new SimpleDateFormat(format);
        Date date = new Date(getTrackedAt());
        return sdf.format(date);
    }

    public int getSourceId() {
        return sourceId;
    }

    public Type getType() {
        return type;
    }

    public Long getTrackedAt() {
        return trackedAt;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public boolean isCharging() {
        return charging;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public double getSpeed() {
        return speed;
    }

    public int getHeading() {
        return heading;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getAltitude() {
        return altitude;
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
