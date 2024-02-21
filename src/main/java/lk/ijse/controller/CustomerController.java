package lk.ijse.controller;

import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CustomerController {

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
    private JFXComboBox<?> txtItemCatagory;

    @FXML
    private TextField txtMobile;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtNic;

    @FXML
    private JFXComboBox<?> txtPaymentMethod;

    @FXML
    private JFXComboBox<?> txtPaymentType;

    @FXML
    private TextField txtProductName;

    @FXML
    void customerDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void customerListOnAction(ActionEvent event) {

    }

    @FXML
    void customerSaveOnAction(ActionEvent event) {

    }

    @FXML
    void customerUpdateOnAction(ActionEvent event) {

    }



}
