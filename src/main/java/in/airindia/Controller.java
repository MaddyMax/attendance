package in.airindia;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class Controller {
    @FXML
    AnchorPane create_ap_CreateNew;
    @FXML
    Button create_btn_searchSAP,create_btn_CreateNEW,create_btn_submitNew;
    @FXML
    TextField create_tf_searchSAP,create_tf_SAP_NO,create_tf_EMP_NO,create_tf_NAME,create_tf_DESIGNATION,create_tf_DEPARTMENT,create_tf_SECTION;

    public AnchorPane getCreate_ap_CreateNew() {
        return create_ap_CreateNew;
    }

    public void setCreate_ap_CreateNew(AnchorPane create_ap_CreateNew) {
        this.create_ap_CreateNew = create_ap_CreateNew;
    }

    public Button getCreate_btn_searchSAP() {
        return create_btn_searchSAP;
    }

    public void setCreate_btn_searchSAP(Button create_btn_searchSAP) {
        this.create_btn_searchSAP = create_btn_searchSAP;
    }

    public Button getCreate_btn_CreateNEW() {
        return create_btn_CreateNEW;
    }

    public void setCreate_btn_CreateNEW(Button create_btn_CreateNEW) {
        this.create_btn_CreateNEW = create_btn_CreateNEW;
    }

    public Button getCreate_btn_submitNew() {
        return create_btn_submitNew;
    }

    public void setCreate_btn_submitNew(Button create_btn_submitNew) {
        this.create_btn_submitNew = create_btn_submitNew;
    }

    public TextField getCreate_tf_searchSAP() {
        return create_tf_searchSAP;
    }

    public void setCreate_tf_searchSAP(TextField create_tf_searchSAP) {
        this.create_tf_searchSAP = create_tf_searchSAP;
    }

    public TextField getCreate_tf_SAP_NO() {
        return create_tf_SAP_NO;
    }

    public void setCreate_tf_SAP_NO(TextField create_tf_SAP_NO) {
        this.create_tf_SAP_NO = create_tf_SAP_NO;
    }

    public TextField getCreate_tf_EMP_NO() {
        return create_tf_EMP_NO;
    }

    public void setCreate_tf_EMP_NO(TextField create_tf_EMP_NO) {
        this.create_tf_EMP_NO = create_tf_EMP_NO;
    }

    public TextField getCreate_tf_NAME() {
        return create_tf_NAME;
    }

    public void setCreate_tf_NAME(TextField create_tf_NAME) {
        this.create_tf_NAME = create_tf_NAME;
    }

    public TextField getCreate_tf_DESIGNATION() {
        return create_tf_DESIGNATION;
    }

    public void setCreate_tf_DESIGNATION(TextField create_tf_DESIGNATION) {
        this.create_tf_DESIGNATION = create_tf_DESIGNATION;
    }

    public TextField getCreate_tf_DEPARTMENT() {
        return create_tf_DEPARTMENT;
    }

    public void setCreate_tf_DEPARTMENT(TextField create_tf_DEPARTMENT) {
        this.create_tf_DEPARTMENT = create_tf_DEPARTMENT;
    }

    public TextField getCreate_tf_SECTION() {
        return create_tf_SECTION;
    }

    public void setCreate_tf_SECTION(TextField create_tf_SECTION) {
        this.create_tf_SECTION = create_tf_SECTION;
    }
}