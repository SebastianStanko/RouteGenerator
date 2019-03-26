package pl.testuj.utils;

import pl.testuj.controllers.RouteCreatorController;

public class Parser {

    private RouteCreatorController routeCreatorController;

    public Parser(RouteCreatorController controller) {
        routeCreatorController = controller;
    }

    public Long parseMinutes(){
        return  Long.parseLong(routeCreatorController.getAdditionalMinuteTF().getText());
    }

    public Long parseHours(){
        return  Long.parseLong(routeCreatorController.getAdditionalHourTF().getText());
    }

    public Long parseDays(){
        return  Long.parseLong(routeCreatorController.getAdditionalDayTF().getText());
    }
}
