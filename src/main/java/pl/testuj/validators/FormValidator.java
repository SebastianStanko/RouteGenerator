package pl.testuj.validators;

import pl.testuj.controllers.RouteCreatorController;

public class FormValidator {

    private RouteCreatorController routeCreatorController;

    public FormValidator(RouteCreatorController controller) {
        routeCreatorController = controller;
    }

    public boolean isFormValid(){
        return(isBatteryPowerInputValid() &&
                isSpeedInputValid() &&
                isHeadingInputValid()) &&
                isAccuracyInputValid() &&
                isAdditionalMinuteInputValid() &&
                isAdditionalHourInputValid() &&
                isAdditionalDayInputValid() &&
                isAdditionalMonthInputValid() &&
                isAdditionalYearInputValid();
    }

    private boolean isAdditionalYearInputValid(){
        String additionalYears = routeCreatorController.getAdditionalYearTF().getText();
        double min = 0;
        double max = 100;
        return (isNumber(additionalYears) &&
                minValue(additionalYears, min) &&
                maxValue(additionalYears, max));
    }

    private boolean isAdditionalMonthInputValid(){
        String additionalMonths = routeCreatorController.getAdditionalMonthTF().getText();
        double min = 0;
        double max = 11;
        return (isNumber(additionalMonths) &&
                minValue(additionalMonths, min) &&
                maxValue(additionalMonths, max));
    }

    private boolean isAdditionalDayInputValid(){
        String additionalDays = routeCreatorController.getAdditionalDayTF().getText();
        double min = 0;
        double max = 31;
        return (isNumber(additionalDays) &&
                minValue(additionalDays, min) &&
                maxValue(additionalDays, max));
    }

    private boolean isAdditionalHourInputValid(){
        String additionalHours = routeCreatorController.getAdditionalHourTF().getText();
        double min = 0;
        double max = 23;
        return (isNumber(additionalHours) &&
                minValue(additionalHours, min) &&
                maxValue(additionalHours, max));
    }

    private boolean isAdditionalMinuteInputValid(){
        String additionalMinutes = routeCreatorController.getAdditionalMinuteTF().getText();
        double min = 0;
        double max = 59;
        return (isNumber(additionalMinutes) &&
                minValue(additionalMinutes, min) &&
                maxValue(additionalMinutes, max));
    }

    private boolean isBatteryPowerInputValid(){
        String batteryPower = routeCreatorController.getBatteryPowerTF().getText();
        double min = 0;
        double max = 100;
        return(isNumber(batteryPower) &&
                minValue(batteryPower, min) &&
                maxValue(batteryPower, max));
    }

    private boolean isSpeedInputValid(){
        String speed = routeCreatorController.getSpeedTF().getText();
        double min = 0;
        double max = 10000;
        return  (isNumber(speed) &&
                minValue(speed, min) &&
                maxValue(speed, max));
    }

    private boolean isHeadingInputValid(){
        String heading = routeCreatorController.getHeadingTF().getText();
        double min = 0;
        double max = 359;
        return (isNumber(heading) &&
                minValue(heading,min) &&
                maxValue(heading, max));
    }

    private boolean isAccuracyInputValid(){
        String accuracy = routeCreatorController.getAccuracyTF().getText();
        double min = 0;
        double max = 10000;
        return (isNumber(accuracy) &&
                minValue(accuracy,min) &&
                maxValue(accuracy, max));
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
