package lk.ijse.model;

import lk.ijse.db.DbConnection;
import lk.ijse.dto.EmployeeDto;
import lk.ijse.dto.ItemDto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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


    public List<ItemDto> accGetAll() throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "SELECT * FROM item";
        PreparedStatement pstm = connection.prepareStatement(sql);

        List<ItemDto> itemList = new ArrayList<>();

        ResultSet resultSet = pstm.executeQuery();
        while (resultSet.next()){
            itemList.add(new ItemDto(
                    resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getDouble(5),
                    resultSet.getString(6),
                    resultSet.getString(7),
                    resultSet.getDate(8),
                    resultSet.getInt(9),
                    resultSet.getString(10)

            ));
        }

        return itemList;
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


    public List<ItemDto> chGetAll() throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "SELECT * FROM item";
        PreparedStatement pstm = connection.prepareStatement(sql);

        List<ItemDto> itemList = new ArrayList<>();

        ResultSet resultSet = pstm.executeQuery();
        while (resultSet.next()){
            itemList.add(new ItemDto(
                    resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getDouble(5),
                    resultSet.getString(6),
                    resultSet.getString(7),
                    resultSet.getDate(8),
                    resultSet.getInt(9),
                    resultSet.getString(10)

            ));
        }

        return itemList;
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


    public List<ItemDto> gpuGetAll() throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "SELECT * FROM item";
        PreparedStatement pstm = connection.prepareStatement(sql);

        List<ItemDto> itemList = new ArrayList<>();

        ResultSet resultSet = pstm.executeQuery();
        while (resultSet.next()){
            itemList.add(new ItemDto(
                    resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getDouble(5),
                    resultSet.getString(6),
                    resultSet.getString(7),
                    resultSet.getDate(8),
                    resultSet.getInt(9),
                    resultSet.getString(10)

            ));
        }

        return itemList;
    }


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


    public static boolean ramDeleteOnAction(ItemDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "DELETE FROM item WHERE id = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1 ,dto.getId());
        return pstm.executeUpdate()>0;
    }


    public static boolean ramUpdateOnAction(ItemDto dto) throws SQLException {
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



    public static boolean storageUpdateOnAction(ItemDto dto) throws SQLException {
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



    public static boolean upsUpdateOnAction(ItemDto dto) throws SQLException {
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


    public static boolean wheelUpdateOnAction(ItemDto dto) throws SQLException {
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

}
