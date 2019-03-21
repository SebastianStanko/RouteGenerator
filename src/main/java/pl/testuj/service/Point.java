package pl.testuj.service;

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

    public Point(){}

    public Point(int sourceId, Type type, Long trackedAt, int batteryPower, boolean charging, String registrationNumber, double speed, int heading, int accuracy, double latitude, double longitude, double altitude) {
        this.sourceId = sourceId;
        this.type = type;
        this.trackedAt = trackedAt;
        this.batteryPower = batteryPower;
        this.charging = charging;
        this.registrationNumber = registrationNumber;
        this.speed = speed;
        this.heading = heading;
        this.accuracy = accuracy;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }
}
