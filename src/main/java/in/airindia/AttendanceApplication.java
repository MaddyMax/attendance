package in.airindia;

import dao.ConnDB;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AttendanceApplication extends Application {
    private Controller controller;
    VBox page;
    FXMLLoader fxmlLoader;
    List<Object> objects;
    ConnDB db;

    @Override
    public void start(Stage primaryStage) throws Exception {
//        controller = setPage(primaryStage);
        objects = setPage(primaryStage, "/fxml/SearchPage.fxml","Search Tab");
        controller = (Controller) objects.get(2);

        AnchorPane createAnchorPane = controller.getCreate_ap_CreateNew();
        Button submitNewCredentials = controller.getCreate_btn_submitNew();
        Button createNew = controller.getCreate_btn_CreateNEW();


        db = new ConnDB();
        db.dbConnect();

        submitNewCredentials.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                insertUserData(controller,db);
            }
        });

        createNew.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                createAnchorPane.setVisible(true);
            }
        });
    }

    private void insertUserData(Controller controller, ConnDB db) {
        String empID = controller.getCreate_tf_EMP_NO().getText();
        String sapID = controller.getCreate_tf_SAP_NO().getText();
        String empName = controller.getCreate_tf_NAME().getText();
        String empDesignation = controller.getCreate_tf_DESIGNATION().getText();
        String empDepartment = controller.create_tf_DEPARTMENT.getText();
        String empSection = controller.create_tf_SECTION.getText();
        try {
            db.setPerson(empID,sapID,empName,empDesignation,empDepartment,empSection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void createNewPersonEntry(String newID, String newName) {

    }

    private List<Object> setPage(Stage primaryStage, String fxmlPath, String title) throws IOException {

        fxmlLoader = new FXMLLoader(getClass().getResource(fxmlPath));
        page = (VBox) fxmlLoader.load();
        controller = fxmlLoader.getController();

        Scene scene = new Scene(page);
        primaryStage.setTitle(title);
        primaryStage.setScene(scene);
        primaryStage.show();

        List<Object> objects = new ArrayList<>();
        objects.add(fxmlLoader);
        objects.add(page);
        objects.add(controller);
        return objects;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
