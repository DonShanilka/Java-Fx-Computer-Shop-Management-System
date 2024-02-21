package lk.ijse.controller;

import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import lk.ijse.dto.CustomerDto;
import lk.ijse.model.CustomerModel;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class CustomerController implements Initializable {

    @FXML
    private TableView<?> customerTm;

    @FXML
    private TableColumn<?, ?> tmAddress;

    @FXML
    private TableColumn<?, ?> tmAmount;

    @FXML
    private TableColumn<?, ?> tmCatogory;

    @FXML
    private TableColumn<?, ?> tmDate;

    @FXML
    private TableColumn<?, ?> tmMethod;

    @FXML
    private TableColumn<?, ?> tmMobile;

    @FXML
    private TableColumn<?, ?> tmName;

    @FXML
    private TableColumn<?, ?> tmNic;

    @FXML
    private TableColumn<?, ?> tmProductName;

    @FXML
    private TableColumn<?, ?> tmType;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtAmount;

    @FXML
    private JFXComboBox<String> txtItemCatagory;

    @FXML
    private TextField txtMobile;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtNic;

    @FXML
    private JFXComboBox<String> txtPaymentMethod;

    @FXML
    private JFXComboBox<String> txtPaymentType;

    @FXML
    private TextField txtProductName;

    @FXML
    private DatePicker txtDate;

    private String[] pM = {"Credit Card", "Debit Card", "Cash", "Bank Transfer"};
    private String[] pT = {"On Time", "Installments"};
    private String[] cat = {"LapTop", "DescTop", "Chairs & Table", "Parts", "Accessory"};

    @FXML
    void customerDeleteOnAction(ActionEvent event) {
        String nic = txtNic.getText();

        var dto = new CustomerDto();

        try{
            boolean isDelete = CustomerModel.deleteCustomer(dto);

            if (isDelete){
                new Alert(Alert.AlertType.CONFIRMATION, "Customer is Delete");
            } else {
                new Alert(Alert.AlertType.ERROR, "Customer is Not Delete");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void customerListOnAction(ActionEvent event) {

    }

    @FXML
    void customerSaveOnAction(ActionEvent event) {
        String nic = txtNic.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        String mobile = txtMobile.getText();
        String date = String.valueOf(txtDate.getValue());
        String pyM = txtPaymentMethod.getValue();
        String pyT = txtPaymentType.getValue();
        String amount = txtAmount.getText();
        String catogary = txtItemCatagory.getValue();
        String prName = txtProductName.getText();

        var dto = new CustomerDto(nic,name,address,mobile,date,pyM,pyT,amount,catogary,prName);

        try{
            boolean isSave = CustomerModel.saveCustomer(dto);

            if (isSave){
                new Alert(Alert.AlertType.CONFIRMATION, "Customer is Save");
            } else {
                new Alert(Alert.AlertType.ERROR, "Customer is Not Save");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void customerUpdateOnAction(ActionEvent event) {
        String nic = txtNic.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        String mobile = txtMobile.getText();
        String date = String.valueOf(txtDate.getValue());
        String pyM = txtPaymentMethod.getValue();
        String pyT = txtPaymentType.getValue();
        String amount = txtAmount.getText();
        String catogary = txtItemCatagory.getValue();
        String prName = txtProductName.getText();

        var dto = new CustomerDto(nic,name,address,mobile,date,pyM,pyT,amount,catogary,prName);

        try{
            boolean isUpdate = CustomerModel.updateCustomer(dto);

            if (isUpdate){
                new Alert(Alert.AlertType.CONFIRMATION, "Update Customer");
            } else {
                new Alert(Alert.AlertType.ERROR, "Customer Not Update");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        txtPaymentMethod.getItems().addAll(pM);
        txtPaymentType.getItems().addAll(pT);
        txtItemCatagory.getItems().addAll(cat);
    }
}
