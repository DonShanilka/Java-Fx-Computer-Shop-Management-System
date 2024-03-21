package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import lk.ijse.dto.SuppliyerDto;
import lk.ijse.model.SuppliyerModel;

import java.sql.SQLException;

public class SuppliyerController {

    @FXML
    private TableView<String> SuppliyerTm;

    @FXML
    private TableColumn<?, ?> tmAddress;

    @FXML
    private TableColumn<?, ?> tmCompanyName;

    @FXML
    private TableColumn<?, ?> tmDate;

    @FXML
    private TableColumn<?, ?> tmEmail;

    @FXML
    private TableColumn<?, ?> tmMobile;

    @FXML
    private TableColumn<?, ?> tmName;

    @FXML
    private TableColumn<?, ?> tmNic;

    @FXML
    private TableColumn<?, ?> tmProductname;

    @FXML
    private TableColumn<?, ?> tmQty;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtCompanyName;

    @FXML
    private TextField txtDate;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtMobile;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtNic;

    @FXML
    private TextField txtProductName;

    @FXML
    private TextField txtQty;

    @FXML
    void supAddOnAction(ActionEvent event) {
        String nic = txtNic.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        String email = txtEmail.getText();
        String mobile = txtMobile.getText();
        String cName = txtCompanyName.getText();
        String pName = txtProductName.getText();
        String date = txtDate.getText();
        int qty = Integer.parseInt(txtQty.getText());

        var dto = new SuppliyerDto(nic,name,address,email,mobile,cName,pName,date,qty);

        try {
            boolean isSave = SuppliyerModel.saveSup(dto);

            if (isSave){
                new Alert(Alert.AlertType.CONFIRMATION, "Supplier is Save");
            } else {
                new Alert(Alert.AlertType.ERROR, "Supplier is Not Save");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void supDeleteOnAction(ActionEvent event) {
        String nic = txtNic.getText();

        var dto = new SuppliyerDto(nic);

        try {
            boolean isDelete = SuppliyerModel.deleteEmployee(dto);

            if (isDelete){
                new Alert(Alert.AlertType.CONFIRMATION, "Supplier is Delete");
            } else {
                new Alert(Alert.AlertType.ERROR, "Supplier is Not Delete");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void supListOnAction(ActionEvent event) {

    }

    @FXML
    void supUpdateOnAction(ActionEvent event) {

    }

}
