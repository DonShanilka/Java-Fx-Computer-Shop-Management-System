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
    public TextField txtNation;
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
    private TextField txteId;

    @FXML
    private TextField txtRolle;

    @FXML
    private ComboBox<?> txtRelation;

    @FXML
    private TextField txtUni;



    @FXML
    void empSaveOnAction(ActionEvent event) {
        String nic = txtNic.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        String email = txtEmail.getText();
        String mobile = txtMobile.getText();
        String bDate = txtBdaY.getText();
        String gender = (String) txtGebder.getValue();
        String nation = txtNation.getText();
        String relation = (String) txtRelation.getValue();
        String eId = txteId.getText();
        String rolle = txtRolle.getText();
        String jDate = String.valueOf(txtJoinDate.getValue());
        String depart = (String) txtDepartment.getValue();
        String pQ = txtPQ.getText();
        String experiance = txtExpe.getText();
        String uni = txtUni.getText();

        var dto = new EmployeeDto(nic,name,address,email,mobile,bDate,gender,nation,relation,eId,rolle,jDate,depart,pQ,experiance,uni);

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

