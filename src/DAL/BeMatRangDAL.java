package DAL;


import DTO.BeMatRangDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BeMatRangDAL {
    public static List<BeMatRangDTO> layDanhSachBeMatRang() {
        List<BeMatRangDTO> danhSachBeMatRang = new ArrayList<>();

        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT MaBeMatRang, TenBeMatRang FROM BeMatRang")) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String maBeMatRang = resultSet.getString("MaBeMatRang");
                String tenBeMatRang = resultSet.getString("TenBeMatRang");

                BeMatRangDTO beMatRang = new BeMatRangDTO(maBeMatRang, tenBeMatRang);
                danhSachBeMatRang.add(beMatRang);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return danhSachBeMatRang;
    }

    public static boolean themBeMatRang(BeMatRangDTO beMatRang) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO BeMatRang (MaBeMatRang, TenBeMatRang) VALUES (?, ?)")) {
            preparedStatement.setString(1, beMatRang.getMaBeMatRang());
            preparedStatement.setString(2, beMatRang.getTenBeMatRang());

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean suaBeMatRang(BeMatRangDTO beMatRang) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE BeMatRang SET TenBeMatRang = ? WHERE MaBeMatRang = ?")) {
            preparedStatement.setString(1, beMatRang.getTenBeMatRang());
            preparedStatement.setString(2, beMatRang.getMaBeMatRang());

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean xoaBeMatRang(String maBeMatRang) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "DELETE FROM BeMatRang WHERE MaBeMatRang = ?")) {
            preparedStatement.setString(1, maBeMatRang);

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
