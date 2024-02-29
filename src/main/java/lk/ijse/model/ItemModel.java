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
        pstm.setString(4,dto.getYear());
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

        String sql = "UPDATE item SET brand=?, modelno=?, year=?, price=?, spec=?, supid=?, date=?, qty=?, type=? WHERE id=?";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1,dto.getBrand());
        pstm.setString(2,dto.getModelno());
        pstm.setString(3,dto.getYear());
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
        pstm.setDate(4, Date.valueOf(dto.getYear()));
        pstm.setDouble(5,dto.getPrice());
        pstm.setString(6,dto.getSpec());
        pstm.setString(7,dto.getSupid());
        pstm.setDate(8, (Date) dto.getDate());
        pstm.setInt(9,dto.getQty());
        pstm.setString(10,dto.getType());

        return pstm.executeUpdate() > 0;
    }


    public static boolean chDeleteOnAction(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "DELETE FROM item WHERE id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1 ,dto.getId());
        return pstm.executeUpdate()>0;
    }



    public static boolean chUpdateOnAction(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "UPDATE item SET brand=?, modelno=?, year=?, price=?, spec=?, supid=?, date=?, qty=?, type=? WHERE id=?";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1,dto.getBrand());
        pstm.setString(2,dto.getModelno());
        pstm.setString(3,dto.getYear());
        pstm.setDouble(4,dto.getPrice());
        pstm.setString(5,dto.getSpec());
        pstm.setString(6,dto.getSupid());
        pstm.setDate(7,(Date) dto.getDate());
        pstm.setInt(8,dto.getQty());
        pstm.setString(9,dto.getType());
        pstm.setString(10,dto.getId());

        return pstm.executeUpdate()>0;
    }


    public static boolean gpuAddOnAction(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "INSERT INTO item VALUES(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1,dto.getId());
        pstm.setString(2,dto.getBrand());
        pstm.setString(3,dto.getModelno());
        pstm.setString(4,dto.getYear());
        pstm.setDouble(5,dto.getPrice());
        pstm.setString(6,dto.getSpec());
        pstm.setString(7,dto.getSupid());
        pstm.setDate(8, (Date) dto.getDate());
        pstm.setInt(9,dto.getQty());
        pstm.setString(10,dto.getType());

        return pstm.executeUpdate() > 0;
    }


    public static boolean gpuDeleteOnAction(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "DELETE FROM item WHERE id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1 ,dto.getId());
        return pstm.executeUpdate()>0;
    }


    public static boolean gpuUpdateOnAction(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "UPDATE item SET brand=?, modelno=?, year=?, price=?, spec=?, supid=?, date=?, qty=?, type=? WHERE id=?";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1,dto.getBrand());
        pstm.setString(2,dto.getModelno());
        pstm.setString(3,dto.getYear());
        pstm.setDouble(4,dto.getPrice());
        pstm.setString(5,dto.getSpec());
        pstm.setString(6,dto.getSupid());
        pstm.setDate(7,(Date) dto.getDate());
        pstm.setInt(8,dto.getQty());
        pstm.setString(9,dto.getType());
        pstm.setString(10,dto.getId());

        return pstm.executeUpdate()>0;
    }

    @FXML
    public static boolean lapAddOnAction(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "INSERT INTO item VALUES(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1,dto.getId());
        pstm.setString(2,dto.getBrand());
        pstm.setString(3,dto.getModelno());
        pstm.setString(4,dto.getYear());
        pstm.setDouble(5,dto.getPrice());
        pstm.setString(6,dto.getSpec());
        pstm.setString(7,dto.getSupid());
        pstm.setDate(8, (Date) dto.getDate());
        pstm.setInt(9,dto.getQty());
        pstm.setString(10,dto.getType());

        return pstm.executeUpdate() > 0;
    }


    public static boolean lapDeleteOnAction(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "DELETE FROM item WHERE id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1 ,dto.getId());
        return pstm.executeUpdate()>0;
    }


    public static boolean lapUpdateOnAction(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "UPDATE item SET brand=?, modelno=?, year=?, price=?, spec=?, supid=?, date=?, qty=?, type=? WHERE id=?";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1,dto.getBrand());
        pstm.setString(2,dto.getModelno());
        pstm.setString(3,dto.getYear());
        pstm.setDouble(4,dto.getPrice());
        pstm.setString(5,dto.getSpec());
        pstm.setString(6,dto.getSupid());
        pstm.setDate(7,(Date) dto.getDate());
        pstm.setInt(8,dto.getQty());
        pstm.setString(9,dto.getType());
        pstm.setString(10,dto.getId());

        return pstm.executeUpdate()>0;
    }

    @FXML
    public static boolean mbAddOnAction(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "INSERT INTO item VALUES(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1,dto.getId());
        pstm.setString(2,dto.getBrand());
        pstm.setString(3,dto.getModelno());
        pstm.setString(4,dto.getYear());
        pstm.setDouble(5,dto.getPrice());
        pstm.setString(6,dto.getSpec());
        pstm.setString(7,dto.getSupid());
        pstm.setDate(8, (Date) dto.getDate());
        pstm.setInt(9,dto.getQty());
        pstm.setString(10,dto.getType());

        return pstm.executeUpdate() > 0;
    }


    public static boolean mbDeleteOnAction(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "DELETE FROM item WHERE id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1 ,dto.getId());
        return pstm.executeUpdate()>0;
    }


    public static boolean mbUpdateOnAction(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "UPDATE item SET brand=?, modelno=?, year=?, price=?, spec=?, supid=?, date=?, qty=?, type=? WHERE id=?";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1,dto.getBrand());
        pstm.setString(2,dto.getModelno());
        pstm.setString(3,dto.getYear());
        pstm.setDouble(4,dto.getPrice());
        pstm.setString(5,dto.getSpec());
        pstm.setString(6,dto.getSupid());
        pstm.setDate(7,(Date) dto.getDate());
        pstm.setInt(8,dto.getQty());
        pstm.setString(9,dto.getType());
        pstm.setString(10,dto.getId());

        return pstm.executeUpdate()>0;
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
        pstm.setString(4,dto.getYear());
        pstm.setDouble(5,dto.getPrice());
        pstm.setString(6,dto.getSpec());
        pstm.setString(7,dto.getSupid());
        pstm.setDate(8, (Date) dto.getDate());
        pstm.setInt(9,dto.getQty());
        pstm.setString(10,dto.getType());

        return pstm.executeUpdate() > 0;
    }


    public static boolean monitorDeteleOnAction(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "DELETE FROM item WHERE id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1 ,dto.getId());
        return pstm.executeUpdate()>0;
    }


    public static boolean monitorUpdateOnAction(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "UPDATE item SET brand=?, modelno=?, year=?, price=?, spec=?, supid=?, date=?, qty=?, type=? WHERE id=?";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1,dto.getBrand());
        pstm.setString(2,dto.getModelno());
        pstm.setString(3,dto.getYear());
        pstm.setDouble(4,dto.getPrice());
        pstm.setString(5,dto.getSpec());
        pstm.setString(6,dto.getSupid());
        pstm.setDate(7,(Date) dto.getDate());
        pstm.setInt(8,dto.getQty());
        pstm.setString(9,dto.getType());
        pstm.setString(10,dto.getId());

        return pstm.executeUpdate()>0;
    }

    @FXML
    public static boolean otherAddOnAction(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "INSERT INTO item VALUES(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1,dto.getId());
        pstm.setString(2,dto.getBrand());
        pstm.setString(3,dto.getModelno());
        pstm.setString(4,dto.getYear());
        pstm.setDouble(5,dto.getPrice());
        pstm.setString(6,dto.getSpec());
        pstm.setString(7,dto.getSupid());
        pstm.setDate(8, (Date) dto.getDate());
        pstm.setInt(9,dto.getQty());
        pstm.setString(10,dto.getType());

        return pstm.executeUpdate() > 0;
    }


    public static boolean otherDeleteOnAction(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "DELETE FROM item WHERE id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1 ,dto.getId());
        return pstm.executeUpdate()>0;
    }

    @FXML
    void otherListOnAction(ActionEvent event) {

    }


    public static boolean otherUpdateOnAction(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "UPDATE item SET brand=?, modelno=?, year=?, price=?, spec=?, supid=?, date=?, qty=?, type=? WHERE id=?";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1,dto.getBrand());
        pstm.setString(2,dto.getModelno());
        pstm.setString(3,dto.getYear());
        pstm.setDouble(4,dto.getPrice());
        pstm.setString(5,dto.getSpec());
        pstm.setString(6,dto.getSupid());
        pstm.setDate(7,(Date) dto.getDate());
        pstm.setInt(8,dto.getQty());
        pstm.setString(9,dto.getType());
        pstm.setString(10,dto.getId());

        return pstm.executeUpdate()>0;
    }


    public static boolean ramAddOnAction(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "INSERT INTO item VALUES(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1,dto.getId());
        pstm.setString(2,dto.getBrand());
        pstm.setString(3,dto.getModelno());
        pstm.setString(4,dto.getYear());
        pstm.setDouble(5,dto.getPrice());
        pstm.setString(6,dto.getSpec());
        pstm.setString(7,dto.getSupid());
        pstm.setDate(8, (Date) dto.getDate());
        pstm.setInt(9,dto.getQty());
        pstm.setString(10,dto.getType());

        return pstm.executeUpdate() > 0;
    }

    @FXML
    public static boolean ramDeleteOnAction(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "DELETE FROM item WHERE id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1 ,dto.getId());
        return pstm.executeUpdate()>0;
    }

    @FXML
    void ramListOnAction(ActionEvent event) {

    }

    @FXML
    void ramUpdateOnAction(ActionEvent event) {

    }

    @FXML
    public static boolean storageAddOnAction(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "INSERT INTO item VALUES(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1,dto.getId());
        pstm.setString(2,dto.getBrand());
        pstm.setString(3,dto.getModelno());
        pstm.setString(4,dto.getYear());
        pstm.setDouble(5,dto.getPrice());
        pstm.setString(6,dto.getSpec());
        pstm.setString(7,dto.getSupid());
        pstm.setDate(8, (Date) dto.getDate());
        pstm.setInt(9,dto.getQty());
        pstm.setString(10,dto.getType());

        return pstm.executeUpdate() > 0;
    }


    public static boolean storageDeleteOnAction(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "DELETE FROM item WHERE id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1 ,dto.getId());
        return pstm.executeUpdate()>0;
    }

    @FXML
    void storageListOnAction(ActionEvent event) {

    }

    @FXML
    void storageUpdateOnAction(ActionEvent event) {

    }

    @FXML
    public static boolean upsAddOnAction(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "INSERT INTO item VALUES(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1,dto.getId());
        pstm.setString(2,dto.getBrand());
        pstm.setString(3,dto.getModelno());
        pstm.setString(4,dto.getYear());
        pstm.setDouble(5,dto.getPrice());
        pstm.setString(6,dto.getSpec());
        pstm.setString(7,dto.getSupid());
        pstm.setDate(8, (Date) dto.getDate());
        pstm.setInt(9,dto.getQty());
        pstm.setString(10,dto.getType());

        return pstm.executeUpdate() > 0;
    }


    public static boolean upsDeleteOnAction(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "DELETE FROM item WHERE id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1 ,dto.getId());
        return pstm.executeUpdate()>0;
    }

    @FXML
    void upsListOnAction(ActionEvent event) {

    }

    @FXML
    void upsUpdateOnAction(ActionEvent event) {

    }

    @FXML
    public static boolean wheelAddOnAction(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "INSERT INTO item VALUES(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1,dto.getId());
        pstm.setString(2,dto.getBrand());
        pstm.setString(3,dto.getModelno());
        pstm.setString(4,dto.getYear());
        pstm.setDouble(5,dto.getPrice());
        pstm.setString(6,dto.getSpec());
        pstm.setString(7,dto.getSupid());
        pstm.setDate(8, (Date) dto.getDate());
        pstm.setInt(9,dto.getQty());
        pstm.setString(10,dto.getType());

        return pstm.executeUpdate() > 0;
    }


    public static boolean wheelDeleteOnAction(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "DELETE FROM item WHERE id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1 ,dto.getId());
        return pstm.executeUpdate()>0;
    }

    @FXML
    void wheelUpdateOnAction(ActionEvent event) {

    }

}
