package lk.ijse.controller;

import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class ItemController {

    @FXML
    private TableView<?> AccessoriesTm;

    @FXML
    private TableView<?> CHtm;

    @FXML
    private TableView<?> CasingTm;

    @FXML
    private TableView<?> Gputm;

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

    }

    @FXML
    void itemGetAction(ActionEvent event) {

    }

    @FXML
    void itemUpdateOnAction(ActionEvent event) {

    }

    @FXML
    void itemaddOnAction(ActionEvent event) {

    }

}
