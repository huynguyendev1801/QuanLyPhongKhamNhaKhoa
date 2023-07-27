package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DangNhapDAL {

    public static boolean checkLoginCredentials(String username, String password, String userType) {
        boolean isValid = false;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = Database.getConnect();

            String tableName = "";
            if ("NhanVien".equals(userType)) {
                tableName = "NhanVien";
            } else if ("NhaSi".equals(userType)) {
                tableName = "NhaSi";
            } else if ("QuanTriVien".equals(userType)) {
                tableName = "QuanTriVien";
            } else {
                // Invalid user type, return false
                return false;
            }

            String sql = "SELECT COUNT(*) AS count FROM " + tableName + " WHERE Ma" + userType + " = ? AND MatKhau = ?";
            System.out.println(username + password  + userType);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
System.out.println(sql);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt("count");
                if (count > 0) {
                    isValid = true;
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            Database.getClose(connection);
        }

        return isValid;
    }
}
