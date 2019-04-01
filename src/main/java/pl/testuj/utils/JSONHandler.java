package pl.testuj.utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pl.testuj.service.Point;

import java.util.ArrayList;

public class JSONHandler{

    public ArrayList<Point> list = new ArrayList<>();

    public JSONArray toJsonArray() throws JSONException {
        JSONArray array = new JSONArray();
        for (Point point : list) {

            JSONObject element = new JSONObject();

            element.put("sourceId", point.getSourceId());
            element.put("type", point.getType());
            element.put("trackedAt", point.getDateString());
            element.put("batteryPower", point.getBatteryPower());
            element.put("charging", point.isCharging());
            element.put("registrationNumber", point.getRegistrationNumber());
            element.put("latitude", point.getLatitude());
            element.put("longitude", point.getLongitude());
            element.put("altitude", point.getAltitude());
            element.put("speed", point.getSpeed());
            element.put("heading", point.getHeading());
            element.put("accuracy", point.getAccuracy());

            array.put(element);
        }
        return array;
    }

    public String toString(String jsonArray) {
        return "{" +
                "\"positions\": " + jsonArray +
                '}';
    }
}
