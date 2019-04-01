package pl.testuj.validators;

import org.controlsfx.control.Notifications;
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
                isAdditionalDayInputValid();
    }

    private boolean isAdditionalDayInputValid(){
        String additionalDays = routeCreatorController.getAdditionalDayTF().getText();
        String fieldName = "\"Dodatkowe dni\"";
        double min = 0;
        double max = 100;
        return (isNumber(additionalDays, fieldName) &&
                minValue(additionalDays, min, fieldName) &&
                maxValue(additionalDays, max, fieldName));
    }

    private boolean isAdditionalHourInputValid(){
        String additionalHours = routeCreatorController.getAdditionalHourTF().getText();
        String fieldName = "\"Dodatkowe godziny\"";
        double min = 0;
        double max = 23;
        return (isNumber(additionalHours, fieldName) &&
                minValue(additionalHours, min, fieldName) &&
                maxValue(additionalHours, max, fieldName));
    }

    private boolean isAdditionalMinuteInputValid(){
        String additionalMinutes = routeCreatorController.getAdditionalMinuteTF().getText();
        String fieldName = "\"Dodatkowe minuty\"";
        double min = 0;
        double max = 59;
        return (isNumber(additionalMinutes, fieldName) &&
                minValue(additionalMinutes, min, fieldName) &&
                maxValue(additionalMinutes, max, fieldName));
    }

    private boolean isBatteryPowerInputValid(){
        String batteryPower = routeCreatorController.getBatteryPowerTF().getText();
        String fieldName = "\"Poziom baterii\"";
        double min = 0;
        double max = 100;
        return(isNumber(batteryPower, fieldName) &&
                minValue(batteryPower, min, fieldName) &&
                maxValue(batteryPower, max ,fieldName));
    }

    private boolean isSpeedInputValid(){
        String speed = routeCreatorController.getSpeedTF().getText();
        String fieldName = "\"Prędkość\"";
        double min = 0;
        double max = 10000;
        return  (isNumber(speed, fieldName) &&
                minValue(speed, min, fieldName) &&
                maxValue(speed, max, fieldName));
    }

    private boolean isHeadingInputValid(){
        String heading = routeCreatorController.getHeadingTF().getText();
        String fieldName = "\"Kierunek\"";
        double min = 0;
        double max = 359;
        return (isNumber(heading, fieldName) &&
                minValue(heading,min, fieldName) &&
                maxValue(heading, max, fieldName));
    }

    private boolean isAccuracyInputValid(){
        String accuracy = routeCreatorController.getAccuracyTF().getText();
        String fieldName = "\"Dokładność\"";
        double min = 0;
        double max = 10000;
        return (isNumber(accuracy, fieldName) &&
                minValue(accuracy,min,fieldName) &&
                maxValue(accuracy, max, fieldName));
    }

    private boolean isNumber(String s, String fieldName){

        if (!(s == null || s.length() == 0)){
            try {
                Double.parseDouble(s);
                return true;
            }catch (NumberFormatException e){
                Notifications.create()
                        .title("Generator Tras")
                        .text("Wartość w polu " + fieldName + " musi być liczbą")
                        .showWarning();
            }
        }
        return false;
    }

    private boolean minValue(String value, double min, String fieldName){
        if (
                isNumber(value, fieldName) &&
                        Double.parseDouble(value) >= min
        )
            return true;
        else {
            Notifications.create()
                    .title("Generator Tras")
                    .text("Minimalna wartość w polu " + fieldName + " = " + (int)min)
                    .showWarning();
            return false;
        }
    }

    private boolean maxValue(String value, double max, String fieldName){
        if(
                isNumber(value, fieldName) &&
                Double.parseDouble(value) <= max
        )
            return true;
        else {
            Notifications.create()
                    .title("Generator Tras")
                    .text("Maksymalna wartość w polu " + fieldName + " = " + (int)max)
                    .showWarning();
            return false;
        }
    }
}
