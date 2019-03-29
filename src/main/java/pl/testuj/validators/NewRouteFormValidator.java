package pl.testuj.validators;

import pl.testuj.controllers.NewRouteController;

public class NewRouteFormValidator {

    private NewRouteController newRouteController;

    public NewRouteFormValidator(NewRouteController controller){newRouteController = controller;}

    public boolean isDatePicked(){
        return !newRouteController.getFirstDate().getEditor().getText().isEmpty();
    }
}
