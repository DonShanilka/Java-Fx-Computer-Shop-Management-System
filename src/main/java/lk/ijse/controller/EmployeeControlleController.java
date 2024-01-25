package lk.ijse.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import lk.ijse.dto.EmployeeDto;
import lk.ijse.model.EmployeeModel;
import lk.ijse.tm.EmployeeTm;

import java.sql.SQLException;
import java.util.List;

public class EmployeeControlleController {
    public TextField txtNic;
    public TableColumn <?,?> tmNic;
    public TableView <EmployeeTm> employyeTm;


    public void initialize(){
        loadAllEmployee();
        setCellValueFactory();
    }

    private void setCellValueFactory(){
        tmNic.setCellValueFactory(new PropertyValueFactory<>("nic"));
    }

    public void empSaveOnAction(ActionEvent actionEvent) {

        String nic = txtNic.getText();

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
