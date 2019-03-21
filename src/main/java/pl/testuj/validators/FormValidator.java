package pl.testuj.validators;

import pl.testuj.controllers.RouteCreatorController;

public class FormValidator {

    RouteCreatorController routeCreatorController = new RouteCreatorController();

    public boolean isFormValid(){
        return(isBatteryPowerInputValid() &&
                isSpeedInputValid() &&
                isHeadingInputValid()) &&
                isAccuracyInputValid();
    }

    private boolean isBatteryPowerInputValid(){
        System.out.println(routeCreatorController.getBatteryLevelTF().getText());
        String batteryPower = routeCreatorController.getBatteryLevelTF().getText();
        double min = 0;
        double max = 100;
        return(isNumber(batteryPower) && minValue(batteryPower, min) && maxValue(batteryPower, max));
    }

    private boolean isSpeedInputValid(){
        String speed = routeCreatorController.getSpeedTF().getText();
        double min = 0;
        double max = 10000;
        return  (isNumber(speed) && minValue(speed, min) && maxValue(speed, max));
    }

    private boolean isHeadingInputValid(){
        String heading = routeCreatorController.getHeadingTF().getText();
        double min = 0;
        double max = 359;
        return (isNumber(heading) && minValue(heading,min) && maxValue(heading, max));
    }

    private boolean isAccuracyInputValid(){
        String accuracy = routeCreatorController.getAccuracyTF().getText();
        double min = 0;
        double max = 10000;
        return (isNumber(accuracy) && minValue(accuracy,min) && maxValue(accuracy, max));
    }

    private boolean isNumber(String s){
        if (!(s == null || s.length() == 0)){
            try {
                double i = Double.parseDouble(s);
                return true;
            }catch (NumberFormatException e){
            }
        }
        return false;
    }

    private boolean minValue(String value, double min){
        return (
                isNumber(value) &&
                        Double.parseDouble(value) >= min
        );
    }

    private boolean maxValue(String value, double max){
        return(
                isNumber(value) &&
                Double.parseDouble(value) <= max
        );
    }
}
