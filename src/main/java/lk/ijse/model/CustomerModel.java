package lk.ijse.model;

import lk.ijse.db.DbConnection;
import lk.ijse.dto.CustomerDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerModel {

    public static boolean saveCustomer(CustomerDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "INSERT INTO customer VALUES(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1,dto.getNic());
        pstm.setString(2,dto.getName());
        pstm.setString(3,dto.getAddress());
        pstm.setString(4,dto.getMobile());
        pstm.setString(5,dto.getDate());
        pstm.setString(6,dto.getPaymentMethod());
        pstm.setString(7,dto.getPaymentType());
        pstm.setString(8,dto.getAmount());
        pstm.setString(9,dto.getItem_cat());
        pstm.setString(10,dto.getProduct_name());

        return pstm.executeUpdate() > 0;
    }

    public static boolean deleteCustomer(CustomerDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "DELETE FROM customer WHERE nic=?";
        PreparedStatement  pstm = connection.prepareStatement(sql);

        pstm.setString(1,dto.getNic());

        return pstm.executeUpdate() >0;
    }
}
