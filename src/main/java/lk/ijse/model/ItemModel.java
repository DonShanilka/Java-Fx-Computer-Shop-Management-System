package lk.ijse.model;

import javafx.event.ActionEvent;
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


    public static boolean accUpdate() throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "UPDATE employee SET brand=?, modelno=?, year=?, price=?, spec=?, supid=?, date=?, qty=?, type=? WHERE id=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
    }

}
