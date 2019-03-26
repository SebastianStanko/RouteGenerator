package pl.testuj.service;

public enum Country {
    Austria(48.19892300000000, 16.36148700000000, 100.0),
    Belgia(50.86825900000000, 4.32047100000000, 100.0),
    Chorwacja(45.81335400000000, 15.97696600000000, 100.0),
    Czechy(50.07817300000000, 14.44986600000000, 100.0),
    Francja(48.85013400000000, 2.29898700000000, 100.0),
    Hiszpania(40.43844200000000, -3.63363000000000, 100.0),
    Holandia(52.35871300000000, 4.86978800000000, 100.0),
    Niemcy(52.51610600000000, 13.27432900000000, 100.0),
    Polska(52.24786700000000, 20.97574500000000, 100.0),
    Portugalia(38.89088600000000, -9.14876700000000, 100.0),
    Słowacja(48.14763700000000, 17.11954400000000, 100.0),
    Słowenia(46.07309900000000, 14.52677000000000, 100.0),
    Szwajcaria(46.96138100000000, 7.44608200000000, 100.0),
    Węgry(47.49480800000000, 19.00919200000000, 100.0),
    Włochy(41.91848800000000, 12.58219000000000, 100.0);

    private double latitude;
    private double longitude;
    private double altitude;

    Country(double latitude, double longitude, double altitude){
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
