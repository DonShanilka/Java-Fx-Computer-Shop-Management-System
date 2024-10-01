package lk.ijse.controller;

import com.jfoenix.controls.JFXComboBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import lk.ijse.dto.ItemDto;
import lk.ijse.model.ItemModel;
import lk.ijse.tm.ItemTm;

import java.net.URL;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;

public class ItemController implements Initializable {

    @FXML
    private TableView<?> AccessoriesTm;

    @FXML
    private TableView<?> CHtm;

    @FXML
    private TableView<?> CasingTm;

    @FXML
    private TableView<ItemTm> Gputm;

    @FXML
    private TableView<?> MBtm;

    @FXML
    private TableView<?> OtherTM;

    @FXML
    private TableView<?> Ramtm;

    @FXML
    private TableView<?> UPStm;

    @FXML
    private TableView<?> moniTm;

    @FXML
    private TableView<?> storageTM;

    @FXML
    private TableColumn<?, ?> tmAccBrand;

    @FXML
    private TableColumn<?, ?> tmAccDate;

    @FXML
    private TableColumn<?, ?> tmAccId;

    @FXML
    private TableColumn<?, ?> tmAccModel;

    @FXML
    private TableColumn<?, ?> tmAccPrice;

    @FXML
    private TableColumn<?, ?> tmAccQty;

    @FXML
    private TableColumn<?, ?> tmAccSupId;

    @FXML
    private TableColumn<?, ?> tmAccType;

    @FXML
    private TableColumn<?, ?> tmAccYear;

    @FXML
    private TableColumn<?, ?> tmAccspec;

    @FXML
    private TableColumn<?, ?> tmCHid;

    @FXML
    private TableColumn<?, ?> tmCasingBrand;

    @FXML
    private TableColumn<?, ?> tmCasingDate;

    @FXML
    private TableColumn<?, ?> tmCasingId;

    @FXML
    private TableColumn<?, ?> tmCasingModel;

    @FXML
    private TableColumn<?, ?> tmCasingPrice;

    @FXML
    private TableColumn<?, ?> tmCasingQty;

    @FXML
    private TableColumn<?, ?> tmCasingSpec;

    @FXML
    private TableColumn<?, ?> tmCasingSupId;

    @FXML
    private TableColumn<?, ?> tmCasingType;

    @FXML
    private TableColumn<?, ?> tmCasingYer;

    @FXML
    private TableColumn<?, ?> tmChBrand;

    @FXML
    private TableColumn<?, ?> tmChDate;

    @FXML
    private TableColumn<?, ?> tmChModel;

    @FXML
    private TableColumn<?, ?> tmChPrice;

    @FXML
    private TableColumn<?, ?> tmChQty;

    @FXML
    private TableColumn<?, ?> tmChSpec;

    @FXML
    private TableColumn<?, ?> tmChSupId;

    @FXML
    private TableColumn<?, ?> tmChType;

    @FXML
    private TableColumn<?, ?> tmChYear;

    @FXML
    private TableColumn<?, ?> tmGpuBrand;

    @FXML
    private TableColumn<?, ?> tmGpuDate;

    @FXML
    private TableColumn<?, ?> tmGpuId;

    @FXML
    private TableColumn<?, ?> tmGpuModelNo;

    @FXML
    private TableColumn<?, ?> tmGpuPrice;

    @FXML
    private TableColumn<?, ?> tmGpuQty;

    @FXML
    private TableColumn<?, ?> tmGpuSpec;

    @FXML
    private TableColumn<?, ?> tmGpuSupId;

    @FXML
    private TableColumn<?, ?> tmGpuType;

    @FXML
    private TableColumn<?, ?> tmGpuYear;

    @FXML
    private TableColumn<?, ?> tmMBdate;

    @FXML
    private TableColumn<?, ?> tmMBid;

    @FXML
    private TableColumn<?, ?> tmMBmodelNo;

    @FXML
    private TableColumn<?, ?> tmMBprice;

    @FXML
    private TableColumn<?, ?> tmMBqty;

    @FXML
    private TableColumn<?, ?> tmMBrand;

    @FXML
    private TableColumn<?, ?> tmMBsupId;

    @FXML
    private TableColumn<?, ?> tmMBtype;

    @FXML
    private TableColumn<?, ?> tmMByear;

    @FXML
    private TableColumn<?, ?> tmMbspec;

    @FXML
    private TableColumn<?, ?> tmMoniBrand;

    @FXML
    private TableColumn<?, ?> tmMoniDate;

    @FXML
    private TableColumn<?, ?> tmMoniID;

    @FXML
    private TableColumn<?, ?> tmMoniModel;

    @FXML
    private TableColumn<?, ?> tmMoniPrice;

    @FXML
    private TableColumn<?, ?> tmMoniQty;

    @FXML
    private TableColumn<?, ?> tmMoniSpec;

    @FXML
    private TableColumn<?, ?> tmMoniSupID;

    @FXML
    private TableColumn<?, ?> tmMoniType;

    @FXML
    private TableColumn<?, ?> tmMoniYear;

    @FXML
    private TableColumn<?, ?> tmOtherBrand;

    @FXML
    private TableColumn<?, ?> tmOtherDate;

    @FXML
    private TableColumn<?, ?> tmOtherID;

    @FXML
    private TableColumn<?, ?> tmOtherModel;

    @FXML
    private TableColumn<?, ?> tmOtherPrice;

    @FXML
    private TableColumn<?, ?> tmOtherQty;

    @FXML
    private TableColumn<?, ?> tmOtherSpec;

    @FXML
    private TableColumn<?, ?> tmOtherSupId;

    @FXML
    private TableColumn<?, ?> tmOtherType;

    @FXML
    private TableColumn<?, ?> tmOtherYear;

    @FXML
    private TableColumn<?, ?> tmQty;

    @FXML
    private TableColumn<?, ?> tmRamBrand;

    @FXML
    private TableColumn<?, ?> tmRamDate;

    @FXML
    private TableColumn<?, ?> tmRamId;

    @FXML
    private TableColumn<?, ?> tmRamModel;

    @FXML
    private TableColumn<?, ?> tmRamPrice;

    @FXML
    private TableColumn<?, ?> tmRamSpec;

    @FXML
    private TableColumn<?, ?> tmRamSupId;

    @FXML
    private TableColumn<?, ?> tmRamType;

    @FXML
    private TableColumn<?, ?> tmRamYear;

    @FXML
    private TableColumn<?, ?> tmStoBrand;

    @FXML
    private TableColumn<?, ?> tmStoDate;

    @FXML
    private TableColumn<?, ?> tmStoID;

    @FXML
    private TableColumn<?, ?> tmStoModelNo;

    @FXML
    private TableColumn<?, ?> tmStoPrice;

    @FXML
    private TableColumn<?, ?> tmStoQty;

    @FXML
    private TableColumn<?, ?> tmStoSpec;

    @FXML
    private TableColumn<?, ?> tmStoSupID;

    @FXML
    private TableColumn<?, ?> tmStoType;

    @FXML
    private TableColumn<?, ?> tmStoYear;

    @FXML
    private TableColumn<?, ?> tmUPStype;

    @FXML
    private TableColumn<?, ?> tmUpsBrand;

    @FXML
    private TableColumn<?, ?> tmUpsDate;

    @FXML
    private TableColumn<?, ?> tmUpsId;

    @FXML
    private TableColumn<?, ?> tmUpsModel;

    @FXML
    private TableColumn<?, ?> tmUpsPrice;

    @FXML
    private TableColumn<?, ?> tmUpsQty;

    @FXML
    private TableColumn<?, ?> tmUpsSpec;

    @FXML
    private TableColumn<?, ?> tmUpsSupId;

    @FXML
    private TableColumn<?, ?> tmUpsYear;

    @FXML
    private TableColumn<?, ?> tmWeelBrand;

    @FXML
    private TableColumn<?, ?> tmWeelDate;

    @FXML
    private TableColumn<?, ?> tmWeelId;

    @FXML
    private TableColumn<?, ?> tmWeelModel;

    @FXML
    private TableColumn<?, ?> tmWeelPrice;

    @FXML
    private TableColumn<?, ?> tmWeelSpec;

    @FXML
    private TableColumn<?, ?> tmWeelSupId;

    @FXML
    private TableColumn<?, ?> tmWeelType;

    @FXML
    private TableColumn<?, ?> tmWeelYear;

    @FXML
    private TableColumn<?, ?> tmWheelQty;

    @FXML
    private AnchorPane txt;

    @FXML
    private TextField txtItemBrand;

    @FXML
    private DatePicker txtItemBuyDate;

    @FXML
    private TextField txtItemId;

    @FXML
    private TextField txtItemModel;

    @FXML
    private TextField txtItemPrice;

    @FXML
    private TextField txtItemQty;

    @FXML
    private TextArea txtItemSpec;

    @FXML
    private JFXComboBox<?> txtItemSuppliyerID;

    @FXML
    private JFXComboBox<?> txtItemType;

    @FXML
    private TextField txtItemYear;

    @FXML
    private TableView<?> wheelTm;

    @FXML
    void itemDeleteOnAction(ActionEvent event) {
        System.out.println("hi hello");
    }

    @FXML
    void itemGetAction(ActionEvent event) {

    }

    @FXML
    void itemUpdateOnAction(ActionEvent event) {

    }

    @FXML
    void itemaddOnAction(ActionEvent event) {
        String id = txtItemId.getText();
        String brand = txtItemBrand.getText();
        String model = txtItemModel.getText();
        String year = txtItemYear.getText();
        double price = Double.parseDouble(txtItemPrice.getText());
        String spec = txtItemSpec.getText();
        String supId = String.valueOf(txtItemSuppliyerID.getValue());
        LocalDate date = txtItemBuyDate.getValue();
        int qty = Integer.parseInt(txtItemQty.getText());
        String type = (String) txtItemType.getValue();

        var dto = new ItemDto(id,brand,model,year,price,spec,supId,date,qty,type);

        try {
            boolean isSave = ItemModel.saveItem(dto);

            if (isSave) {
                new Alert(Alert.AlertType.CONFIRMATION, "Item is Save").show();
                loadAllItem();
            } else {
                new Alert(Alert.AlertType.ERROR, "Item is Not Save");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void loadAllItem(){
        var model = new ItemModel();

        ObservableList<ItemTm> obList = FXCollections.observableArrayList();

        try {
            List<ItemDto> dtoList = model.accGetAll();

            for (ItemDto dto : dtoList) {
                obList.add(new ItemTm(
                        dto.getId(),
                        dto.getBrand(),
                        dto.getModelno(),
                        dto.getYear(),
                        dto.getPrice(),
                        dto.getSpec(),
                        dto.getSupid(),
                        dto.getDate(),
                        dto.getQty(),
                        dto.getType()
                ));
            }
            Gputm.setItems(obList);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void setCellValueFactory(){
        tmGpuId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tmGpuBrand.setCellValueFactory(new PropertyValueFactory<>("brand"));
        tmGpuModelNo.setCellValueFactory(new PropertyValueFactory<>("modelno"));
        tmGpuYear.setCellValueFactory(new PropertyValueFactory<>("year"));
        tmGpuPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        tmGpuSpec.setCellValueFactory(new PropertyValueFactory<>("spec"));
        tmGpuSupId.setCellValueFactory(new PropertyValueFactory<>("supid"));
        tmGpuDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        tmGpuQty.setCellValueFactory(new PropertyValueFactory<>("qty"));
        tmGpuType.setCellValueFactory(new PropertyValueFactory<>("type"));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadAllItem();
        setCellValueFactory();
    }
}
