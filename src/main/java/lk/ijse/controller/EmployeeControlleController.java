package lk.ijse.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import lk.ijse.dto.EmployeeDto;
import lk.ijse.model.EmployeeModel;
import lk.ijse.tm.EmployeeTm;

import java.sql.SQLException;
import java.util.List;

public class EmployeeControlleController {
    @FXML
    private TableView <EmployeeTm> employyeTm;

    @FXML
    private TableColumn<?, ?> tmAddress;

    @FXML
    private TableColumn<?, ?> tmBday;

    @FXML
    private TableColumn<?, ?> tmDate;

    @FXML
    private TableColumn<?, ?> tmDepartment;

    @FXML
    private TableColumn<?, ?> tmEid;

    @FXML
    private TableColumn<?, ?> tmEmail;

    @FXML
    private TableColumn<?, ?> tmExperiance;

    @FXML
    private TableColumn<?, ?> tmGender;

    @FXML
    private TableColumn<?, ?> tmMobile;

    @FXML
    private TableColumn<?, ?> tmName;

    @FXML
    private TableColumn<?, ?> tmNic;

    @FXML
    private TableColumn<?, ?> tmQualification;

    @FXML
    private TableColumn<?, ?> tmRelation;

    @FXML
    private TableColumn<?, ?> tmRolle;

    @FXML
    private TableColumn<?, ?> tmUniname;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtBdaY;

    @FXML
    private ComboBox<?> txtDepartment;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtExpe;

    @FXML
    private ComboBox<?> txtGebder;

    @FXML
    private DatePicker txtJoinDate;

    @FXML
    private TextField txtMobile;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtNic;

    @FXML
    private TextField txtPQ;

    @FXML
    private TextField txtPQ1;

    @FXML
    private TextField txtPQ11;

    @FXML
    private ComboBox<?> txtRelation;

    @FXML
    private TextField txtUni;



    @FXML
    void empSaveOnAction(ActionEvent event) {
        String nic = txtNic.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        String

        var dto = new EmployeeDto(nic);

        try {
            boolean isSave = EmployeeModel.saveEmp(dto);

            if (isSave){
                new Alert(Alert.AlertType.CONFIRMATION, "Employee Save").show();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void empUpdateOnAction(ActionEvent event) {

    }


    @FXML
    void empDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void empGetAllAction(ActionEvent event) {

    }

    @FXML
    void empIdQrOnAction(ActionEvent event) {

    }

    public void initialize(){
        loadAllEmployee();
        setCellValueFactory();
    }

    private void setCellValueFactory(){
        tmNic.setCellValueFactory(new PropertyValueFactory<>("nic"));
    }

    public void loadAllEmployee(){
        var model = new EmployeeModel();

        ObservableList<EmployeeTm> obList = FXCollections.observableArrayList();

        try{
            List<EmployeeDto> dtoList = model.getAll();

            for (EmployeeDto dto : dtoList){
                obList.add(new EmployeeTm(
                        dto.getNic()
                ));
            }

            employyeTm.setItems(obList);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }



}

