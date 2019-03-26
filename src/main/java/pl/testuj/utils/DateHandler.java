package pl.testuj.utils;

import pl.testuj.controllers.RouteCreatorController;

import java.sql.Timestamp;

public class DateHandler {

    private Long currentTime;

    private RouteCreatorController routeCreatorController;

    public DateHandler(RouteCreatorController controller) {
        routeCreatorController = controller;
    }

    public void addTime(long days, long hours, long mins){
        this.currentTime = routeCreatorController.getCurrentDate().getTime();
        addMinute(mins);
        addHour(hours);
        addDay(days);
        Timestamp modifiedDate = new Timestamp(this.currentTime);
        routeCreatorController.setCurrentDate(modifiedDate);
    }

    private void addMinute(long mins){
        this.currentTime += mins * 60 * 1000;
    }

    private void addHour(long hours){
        this.currentTime += hours * 60 * 60 * 1000;
    }

    private void addDay(long days){
        this.currentTime += days * 24 * 60 * 60 * 1000;
    }
}
