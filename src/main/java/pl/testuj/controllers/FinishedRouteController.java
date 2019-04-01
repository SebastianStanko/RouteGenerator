package pl.testuj.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import org.controlsfx.control.Notifications;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FinishedRouteController {

    private MainController mainController;

    @FXML
    private TextArea createdRouteTf;

    public void initialize(){}

    @FXML
    public void saveToFile()  {
        try (PrintWriter out = new PrintWriter("route.json")) {
            //System.getProperty("user.home") + "/Desktop"; - zapisywanie na pulpicie
            out.println(createdRouteTf.getText());
            Notifications.create()
                    .title("Generator Tras")
                    .text("Pomyślnie zapisano trasę")
                    .showInformation();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            Notifications.create()
                    .title("Generator Tras")
                    .text("Błąd zapisu!")
                    .showWarning();
        }
    }

    @FXML
    public void close(){
        System.exit(0);
    }

    @FXML
    public void backToMenu(){mainController.loadMenuScreen();}

    @FXML
    public void copyOnClick(){
        ClipboardContent content = new ClipboardContent();
        content.putString(this.createdRouteTf.getText());
        Clipboard.getSystemClipboard().setContent(content);
        Notifications.create()
                .title("Generator Tras")
                .text("Skopiowano do schowka")
                .showInformation();
    }

    public void setCreatedRouteTf(String s) {
        this.createdRouteTf.setText(s);
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
