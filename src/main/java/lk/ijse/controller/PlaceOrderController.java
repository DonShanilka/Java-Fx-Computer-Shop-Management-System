package lk.ijse.controller;

import com.jfoenix.controls.JFXComboBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import lk.ijse.dto.CustomerDto;
import lk.ijse.model.CustomerModel;
import lk.ijse.model.ItemModel;
import lk.ijse.model.OrderModel;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class PlaceOrderController {

    @FXML
    private JFXComboBox<String> lblCustomerId;

    @FXML
    private Label lblOrderDate;

    @FXML
    private Label lblOrderId;

    @FXML
    private Label lbl_customer_name;

    @FXML
    private Label lbl_item_name;

    @FXML
    private Label lbl_item_price;

    @FXML
    private Label lbl_total_price;

    @FXML
    private TextField txt_qty;

    OrderModel orderModel = new OrderModel();
    CustomerModel customerModel = new CustomerModel();
    ItemModel itemModel = new ItemModel();

    @FXML
    void addToCartOnAction(ActionEvent event) {

    }

    @FXML
    void clearOnAction(ActionEvent event) {

    }

    private void genarateNextId(){
        String orderId;

        try {
            String lastId = orderModel.getLastId();
            System.out.println("Last ID : " + lastId);

            if (lastId == null) {
                orderId = "O-0001";
            } else {
                String[] ar = lastId.split("[O]");
                int digits = Integer.parseInt(ar[1]);
                digits++;
                String newId = String.format("%04d", digits);
                orderId =  newId;
            }
            System.out.println("Order ID : " + orderId);
            lblOrderId.setText(orderId);

        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        }
    }

    private void setData(){
        lblOrderDate.setText(String.valueOf(LocalDate.now()));
    }

    public void initialize(){
        genarateNextId();
        setData();
    }

    public void cmbItemOnAction(ActionEvent actionEvent) {
    }

    private void lodadCustomerId(){
        ObservableList<String> obList = FXCollections.observableArrayList();

        try{
            List<CustomerDto> idList = customerModel.getAll();

            for (CustomerDto dto : idList) {
                obList.add(dto.getNic());
            }
            lblCustomerId.setItems(obList);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void cmbCustomerOnAction(ActionEvent actionEvent) {
        String id = lblCustomerId.getValue();


    }
}
