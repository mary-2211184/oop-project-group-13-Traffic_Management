import com.sun.javafx.charts.Legend;
import com.sun.javafx.collections.ElementObservableListDecorator;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class trackStatusController{
    @FXML
    private TableView statusTableView;
    @FXML
    private TableColumn colType;
    @FXML
    private TableColumn colTimeStamp;
    @FXML
    private TableColumn colId;
    @FXML
    private TableColumn colStatus;

    public TableView getStatusTableView() {
        return statusTableView;
    }

    public void setStatusTableView(TableView statusTableView) {
        this.statusTableView = statusTableView;
    }

    public TableColumn getColType() {
        return colType;
    }

    public void setColType(TableColumn colType) {
        this.colType = colType;
    }

    public TableColumn getColTimeStamp() {
        return colTimeStamp;
    }

    public void setColTimeStamp(TableColumn colTimeStamp) {
        this.colTimeStamp = colTimeStamp;
    }

    public TableColumn getColId() {
        return colId;
    }

    public void setColId(TableColumn colId) {
        this.colId = colId;
    }

    public TableColumn getColStatus() {
        return colStatus;
    }

    public void setColStatus(TableColumn colStatus) {
        this.colStatus = colStatus;
    }

    @Override
    public String toString() {
        return STR."TrackStatusController{statusTableView=\{statusTableView}, colType=\{colType}, colTimeStamp=\{colTimeStamp}, colId=\{colId}, colStatus=\{colStatus}}";
    }

    public trackStatusController(TableView statusTableView, TableColumn colType, TableColumn colTimeStamp, TableColumn colId, TableColumn colStatus) {
        this.statusTableView = statusTableView;
        this.colType = colType;
        this.colTimeStamp = colTimeStamp;
        this.colId = colId;
        this.colStatus = colStatus;

    }

    @FXML
    public void initialize() {
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colType.setCellValueFactory(new PropertyValueFactory<>("type"));
        TableColumn<Object, Object> colTimestamp = null;
        colTimestamp.setCellValueFactory(new PropertyValueFactory<>("timestamp"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));

        // color-coded status cell
        colStatus.setCellFactory(tc -> new TableCell<StatusRow,String>() {
            @Override
            protected void updateItem(String status, boolean empty) {
                super.updateItem(status, empty);
                if (empty || status == null) {
                    setText(null);
                    setStyle("");
                } else {
                    setText(status);
                    switch (status) {
                        case "New": setStyle("-fx-background-color: light yellow"); break;
                        case "In Progress": setStyle("-fx-background-color: light blue"); break;
                        case "Resolved": setStyle("-fx-background-color: light green"); break;
                        default: setStyle("");
                    }
                }
            }
        });

        Legend statusTable = null;
        ObservableList<Legend.LegendItem> data = null;
        statusTable.setItems(null);
        loadData();
    }


    }

public class TrackStatusControllerImpl extends trackStatusController {
    public TrackStatusControllerImpl(TableView statusTableView, TableColumn colType, TableColumn colTimeStamp, TableColumn colId, TableColumn colStatus) {
        super(statusTableView, colType, colTimeStamp, colId, colStatus);
    }
}

private void loadData() {
        ElementObservableListDecorator<Object> data = null;
        data.clear();
        data.addAll(
                new StatusRow("INC-AAA1","Accident","2025-11-12 08:30", "New"),
                new StatusRow("INC-BBB2","Obstruction","2025-11-13 14:10", "In Progress")
        );
    }

    public static class StatusRow {
        public String id,type,timestamp,status;
        public StatusRow(String id,String type,String timestamp,String status){this.id=id;this.type=type;this.timestamp=timestamp;this.status=status;}
        public String getId(){return id;}
        public String getType(){return type;}
        public String getTimestamp(){return timestamp;}
        public String getStatus(){return status;}
    }


void main() {
}