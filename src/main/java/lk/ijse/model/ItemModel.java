package lk.ijse.model;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import lk.ijse.db.DbConnection;
import lk.ijse.dto.ItemDto;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ItemModel {

    public static boolean accAdd(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "INSERT INTO item VALUES(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1,dto.getId());
        pstm.setString(2,dto.getBrand());
        pstm.setString(3,dto.getModelno());
        pstm.setDate(4, (Date) dto.getYear());
        pstm.setDouble(5,dto.getPrice());
        pstm.setString(6,dto.getSpec());
        pstm.setString(7,dto.getSupid());
        pstm.setDate(8, (Date) dto.getDate());
        pstm.setInt(9,dto.getQty());
        pstm.setString(10,dto.getType());

        return pstm.executeUpdate() > 0;
    }


    public static boolean accDelete(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "DELETE FROM item WHERE id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1 ,dto.getId());
        return pstm.executeUpdate()>0;
    }


    public static boolean accUpdate(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "UPDATE employee SET brand=?, modelno=?, year=?, price=?, spec=?, supid=?, date=?, qty=?, type=? WHERE id=?";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1,dto.getBrand());
        pstm.setString(2,dto.getModelno());
        pstm.setDate(3, (Date) dto.getYear());
        pstm.setDouble(4,dto.getPrice());
        pstm.setString(5,dto.getSpec());
        pstm.setString(6,dto.getSupid());
        pstm.setDate(7,(Date) dto.getDate());
        pstm.setInt(8,dto.getQty());
        pstm.setString(9,dto.getType());
        pstm.setString(10,dto.getId());

        return pstm.executeUpdate()>0;
    }

    public static boolean chAddOnAction(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "INSERT INTO item VALUES(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1,dto.getId());
        pstm.setString(2,dto.getBrand());
        pstm.setString(3,dto.getModelno());
        pstm.setDate(4, (Date) dto.getYear());
        pstm.setDouble(5,dto.getPrice());
        pstm.setString(6,dto.getSpec());
        pstm.setString(7,dto.getSupid());
        pstm.setDate(8, (Date) dto.getDate());
        pstm.setInt(9,dto.getQty());
        pstm.setString(10,dto.getType());

        return pstm.executeUpdate() > 0;
    }

    @FXML
    void chDeleteOnAction(ActionEvent event) {

    }


    @FXML
    void chUpdateOnAction(ActionEvent event) {

    }

    @FXML
    public static boolean gpuAddOnAction(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "INSERT INTO item VALUES(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1,dto.getId());
        pstm.setString(2,dto.getBrand());
        pstm.setString(3,dto.getModelno());
        pstm.setDate(4, (Date) dto.getYear());
        pstm.setDouble(5,dto.getPrice());
        pstm.setString(6,dto.getSpec());
        pstm.setString(7,dto.getSupid());
        pstm.setDate(8, (Date) dto.getDate());
        pstm.setInt(9,dto.getQty());
        pstm.setString(10,dto.getType());

        return pstm.executeUpdate() > 0;
    }

    @FXML
    void gpuDeleteOnAction(ActionEvent event) {

    }


    @FXML
    void gpuUpdateOnAction(ActionEvent event) {

    }

    @FXML
    public static boolean lapAddOnAction(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "INSERT INTO item VALUES(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1,dto.getId());
        pstm.setString(2,dto.getBrand());
        pstm.setString(3,dto.getModelno());
        pstm.setDate(4, (Date) dto.getYear());
        pstm.setDouble(5,dto.getPrice());
        pstm.setString(6,dto.getSpec());
        pstm.setString(7,dto.getSupid());
        pstm.setDate(8, (Date) dto.getDate());
        pstm.setInt(9,dto.getQty());
        pstm.setString(10,dto.getType());

        return pstm.executeUpdate() > 0;
    }

    @FXML
    void lapDeleteOnAction(ActionEvent event) {

    }


    @FXML
    void lapUpdateOnAction(ActionEvent event) {

    }

    @FXML
    public static boolean mbAddOnAction(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "INSERT INTO item VALUES(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1,dto.getId());
        pstm.setString(2,dto.getBrand());
        pstm.setString(3,dto.getModelno());
        pstm.setDate(4, (Date) dto.getYear());
        pstm.setDouble(5,dto.getPrice());
        pstm.setString(6,dto.getSpec());
        pstm.setString(7,dto.getSupid());
        pstm.setDate(8, (Date) dto.getDate());
        pstm.setInt(9,dto.getQty());
        pstm.setString(10,dto.getType());

        return pstm.executeUpdate() > 0;
    }

    @FXML
    void mbDeleteOnAction(ActionEvent event) {

    }


    @FXML
    void mbUpdateOnAction(ActionEvent event) {

    }

    @FXML
    void moniListAction(ActionEvent event) {

    }

    @FXML
    public static boolean monitorAddOnAction(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "INSERT INTO item VALUES(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1,dto.getId());
        pstm.setString(2,dto.getBrand());
        pstm.setString(3,dto.getModelno());
        pstm.setDate(4, (Date) dto.getYear());
        pstm.setDouble(5,dto.getPrice());
        pstm.setString(6,dto.getSpec());
        pstm.setString(7,dto.getSupid());
        pstm.setDate(8, (Date) dto.getDate());
        pstm.setInt(9,dto.getQty());
        pstm.setString(10,dto.getType());

        return pstm.executeUpdate() > 0;
    }

    @FXML
    void monitorDeteleOnAction(ActionEvent event) {

    }

    @FXML
    void monitorUpdateOnAction(ActionEvent event) {

    }

    @FXML
    public static boolean otherAddOnAction(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "INSERT INTO item VALUES(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1,dto.getId());
        pstm.setString(2,dto.getBrand());
        pstm.setString(3,dto.getModelno());
        pstm.setDate(4, (Date) dto.getYear());
        pstm.setDouble(5,dto.getPrice());
        pstm.setString(6,dto.getSpec());
        pstm.setString(7,dto.getSupid());
        pstm.setDate(8, (Date) dto.getDate());
        pstm.setInt(9,dto.getQty());
        pstm.setString(10,dto.getType());

        return pstm.executeUpdate() > 0;
    }

    @FXML
    void otherDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void otherListOnAction(ActionEvent event) {

    }

    @FXML
    void otherUpdateOnAction(ActionEvent event) {

    }

    @FXML
    void ramAddOnAction(ActionEvent event) {

    }

    @FXML
    void ramDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void ramListOnAction(ActionEvent event) {

    }

    @FXML
    void ramUpdateOnAction(ActionEvent event) {

    }

    @FXML
    void storageAddOnAction(ActionEvent event) {

    }

    @FXML
    void storageDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void storageListOnAction(ActionEvent event) {

    }

    @FXML
    void storageUpdateOnAction(ActionEvent event) {

    }

    @FXML
    void upsAddOnAction(ActionEvent event) {

    }

    @FXML
    void upsDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void upsListOnAction(ActionEvent event) {

    }

    @FXML
    void upsUpdateOnAction(ActionEvent event) {

    }

    @FXML
    void wheelAddOnAction(ActionEvent event) {

    }

    @FXML
    void wheelDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void wheelList(ActionEvent event) {

    }

    @FXML
    void wheelTm(ActionEvent event) {

    }

    @FXML
    void wheelUpdateOnAction(ActionEvent event) {

    }

}
