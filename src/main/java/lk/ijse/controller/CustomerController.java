package lk.ijse.controller;

import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
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
    private JFXComboBox<?> txtItemCatagory;

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

    private String[] pM = {"Credit Card", "Debit Card", "Cash", "Bank Transfer"};
    private String[] pT = {"On Time", "Installments"};

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        txtPaymentMethod.getItems().addAll(pM);
        txtPaymentType.getItems().addAll(pT);
    }
}
