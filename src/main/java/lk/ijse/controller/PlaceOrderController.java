package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import lk.ijse.model.OrderModel;

public class PlaceOrderController {
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

    public void initialize(){
        genarateNextId();
    }
}
