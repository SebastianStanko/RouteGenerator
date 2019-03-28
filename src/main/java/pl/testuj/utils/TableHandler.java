package pl.testuj.utils;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pl.testuj.service.TablePoint;

public class TableHandler {

    public ObservableList<TablePoint> tableList = FXCollections.observableArrayList();

    public ObservableList<TablePoint> getTableList() {
        return tableList;
    }
}
