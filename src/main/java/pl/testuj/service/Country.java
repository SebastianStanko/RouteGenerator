package pl.testuj.service;

public enum Country {
    Polska(11.11, 111.111, 1111.1111),
    Niemcy(22.22, 222.222, 2222.2222),
    Francja(33.33, 333.333, 3333.3333);

    private double latitude;
    private double longitude;
    private double altitude;

    private Country(double latitude, double longitude, double altitude){
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
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
}
