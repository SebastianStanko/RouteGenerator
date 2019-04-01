package pl.testuj.validators;

import org.controlsfx.control.Notifications;
import pl.testuj.controllers.NewRouteController;

public class NewRouteFormValidator {

    private NewRouteController newRouteController;

    public NewRouteFormValidator(NewRouteController controller){newRouteController = controller;}

    public boolean isDatePicked(){
        if (!newRouteController.getFirstDate().getEditor().getText().isEmpty()){
            return true;
        }
        else {
            Notifications.create()
                    .title("Generator Tras")
                    .text("Wybierz datę!")
                    .showWarning();
            return false;
        }
    }
}
