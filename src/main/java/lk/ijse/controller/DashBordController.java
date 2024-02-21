package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.Objects;

public class DashBordController {
    @FXML
    private AnchorPane root1;

    public JFXButton customer;
    public JFXButton employee;
    public JFXButton home;
    public JFXButton item;

    void setForm(String form) throws IOException {
        String[] formArray = {"/view/customer.fxml", "/view/employee.fxml", "/view/AddItem.fxml", "/view/AddSupplier.fxml","/view/Salary.fxml" , "/view/monthlyincome.fxml","/view/Attendance.fxml","/view/Cashier.fxml"};

        JFXButton[] btnArray = {customer,employee,home,item};
        AnchorPane load = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(form)));
        root1.getChildren().clear();
        root1.getChildren().add(load);
        for (int i = 0; i < formArray.length; i++) {
            btnArray[i].setStyle("/*-fx-background-color:  #ffffff;*/ -fx-font-size: 22; /*-fx-text-fill: #202A44FF*/");

            if (form.equals(formArray[i])){
                btnArray[i].setStyle("-fx-background-color: #00bd1f; -fx-font-size: 22; -fx-text-fill: #000000");
            }
        }
    }

    @FXML
    void customerOnAction(ActionEvent event) {

    }

    @FXML
    void employeeOnAction(ActionEvent event) {

    }

    @FXML
    void homeOnAction(ActionEvent event) {

    }

    @FXML
    void itemOnAction(ActionEvent event) {

    }
}
