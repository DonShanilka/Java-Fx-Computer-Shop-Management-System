package lk.ijse.model;

import lk.ijse.db.DbConnection;
import lk.ijse.dto.EmployeeDto;
import lk.ijse.dto.SuppliyerDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SuppliyerModel {

    public static boolean saveSup(SuppliyerDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "INSERT INTO suppliyer VALUES(?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1, dto.getNic());
        pstm.setString(2, dto.getName());
        pstm.setString(3, dto.getAddress());
        pstm.setString(4, dto.getEmail());
        pstm.setString(5, dto.getMobile());
        pstm.setString(6, dto.getCName());
        pstm.setString(7, dto.getPName());
        pstm.setString(8, String.valueOf(dto.getDate()));
        pstm.setInt(9, dto.getQty());

        return pstm.executeUpdate() > 0;;
    }


    public List<SuppliyerDto> getAll() throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "SELECT * FROM suppliyer";
        PreparedStatement pstm = connection.prepareStatement(sql);

        List<SuppliyerDto> empList = new ArrayList<>();

        ResultSet resultSet = pstm.executeQuery();
        while (resultSet.next()){
            empList.add(new SuppliyerDto(
                    resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getString(5),
                    resultSet.getString(6),
                    resultSet.getString(7),
                    resultSet.getString(8),
                    resultSet.getInt(9)
            ));
        }

        return empList;
    }

    public static boolean deleteSup(SuppliyerDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "DELETE FROM suppliyer WHERE nic = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1 , dto.getNic());

        return pstm.executeUpdate() > 0;
    }

    public static boolean updatesup(SuppliyerDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "UPDATE suppliyer SET name=?, address=?, email=?, mobile=?, cName=?, pName=?, date=?, qty=? WHERE nic=?";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1, dto.getName());
        pstm.setString(2, dto.getAddress());
        pstm.setString(3, dto.getEmail());
        pstm.setString(4, dto.getMobile());
        pstm.setString(5, dto.getCName());
        pstm.setString(6, dto.getPName());
        pstm.setString(7, String.valueOf(dto.getDate()));
        pstm.setInt(8, dto.getQty());
        pstm.setString(9, dto.getNic());

        return pstm.executeUpdate() > 0;

    }

}
