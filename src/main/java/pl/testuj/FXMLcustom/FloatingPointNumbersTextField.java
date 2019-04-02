package pl.testuj.FXMLcustom;

import javafx.scene.control.TextField;

public class FloatingPointNumbersTextField extends TextField {

    public FloatingPointNumbersTextField(){
        this.setPromptText("Enter numbers and dot");
    }

    @Override
    public void replaceText(int start, int end, String text) {
        if(text.matches("[0-9]*\\.?[0-9]*")|| text.isEmpty()) {
            super.replaceText(start, end, text);
        }
    }

    @Override
    public void replaceSelection(String replacement) {
        super.replaceSelection(replacement);
    }
}
