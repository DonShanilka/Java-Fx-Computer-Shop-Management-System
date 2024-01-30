package lk.ijse.model;

import lk.ijse.db.DbConnection;
import lk.ijse.dto.EmployeeDto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeModel {

    public static boolean saveEmp(EmployeeDto dto) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "INSERT INTO employee VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1, dto.getNic());
        pstm.setString(2, dto.getName());
        pstm.setString(3, dto.getAddress());
        pstm.setString(4, dto.getEmail());
        pstm.setString(5, dto.getMobile());
        pstm.setString(6, dto.getBDate());
        pstm.setString(7, dto.getGender());
        pstm.setString(8, dto.getNation());
        pstm.setString(9, dto.getRelation());
        pstm.setString(10, dto.getEId());
        pstm.setString(11, dto.getRolle());
        pstm.setString(12, dto.getJDate());
        pstm.setString(13, dto.getDepart());
        pstm.setString(14, dto.getPQ());
        pstm.setString(15, dto.getExperiance());
        pstm.setString(16, dto.getUni());


        return pstm.executeUpdate() > 0;
    }


    public List<EmployeeDto> getAll() throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();

        String sql = "SELECT * FROM employee";
        PreparedStatement pstm = connection.prepareStatement(sql);

        List<EmployeeDto> empList = new ArrayList<>();

        ResultSet resultSet = pstm.executeQuery();
        while (resultSet.next()){
            empList.add(new EmployeeDto(
                    resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getString(5),
                    resultSet.getString(6),
                    resultSet.getString(7),
                    resultSet.getString(8),
                    resultSet.getString(9),
                    resultSet.getString(10),
                    resultSet.getString(11),
                    resultSet.getString(12),
                    resultSet.getString(13),
                    resultSet.getString(14),
                    resultSet.getString(15),
                    resultSet.getString(16)
            ));
        }

        return empList;
    }

}
