package lk.ijse.model;

import lk.ijse.db.DbConnection;
import lk.ijse.dto.CustomerDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    public static boolean updateCustomer(CustomerDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "UPDATE customer SET name=?, address=?, mobile=?, date=?, paymentMethod=?, paymentType=?, amount=?, item_Cat=?, product_name=? WHERE nic=?";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1,dto.getName());
        pstm.setString(2,dto.getAddress());
        pstm.setString(3,dto.getMobile());
        pstm.setString(4,dto.getDate());
        pstm.setString(5,dto.getPaymentMethod());
        pstm.setString(6,dto.getPaymentType());
        pstm.setString(7,dto.getAmount());
        pstm.setString(8,dto.getItem_cat());
        pstm.setString(9,dto.getProduct_name());
        pstm.setString(10,dto.getNic());

        return pstm.executeUpdate() >0;
    }

    public List<CustomerDto> getAll() throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "SELECT * FROM customer";
        PreparedStatement pstm = connection.prepareStatement(sql);

        List<CustomerDto> customerDtoList = new ArrayList<>();

        ResultSet resultSet = pstm.executeQuery();
        while (resultSet.next()){
            customerDtoList.add(new CustomerDto(
                    resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getString(5),
                    resultSet.getString(6),
                    resultSet.getString(7),
                    resultSet.getString(8),
                    resultSet.getString(9),
                    resultSet.getString(10)
            ));
        }
        return customerDtoList;
    }

    public static CustomerDto searchCustomer(String nic) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "SELECT * FROM customer WHERE nic=?";
    }

}
