package DAL;


import DTO.RangDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RangDAL {
    public static List<RangDTO> layDanhSachRang() {
        List<RangDTO> danhSachRang = new ArrayList<>();

        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT MaRang, TenRang, VungRang, SoRang FROM Rang")) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String maRang = resultSet.getString("MaRang");
                String tenRang = resultSet.getString("TenRang");
                int vungRang = resultSet.getInt("VungRang");
                int soRang = resultSet.getInt("SoRang");

                RangDTO rang = new RangDTO(maRang, tenRang, vungRang, soRang);
                danhSachRang.add(rang);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return danhSachRang;
    }

    public static boolean themRang(RangDTO rang) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO Rang (MaRang, TenRang, VungRang, SoRang) VALUES (?, ?, ?, ?)")) {
            preparedStatement.setString(1, rang.getMaRang());
            preparedStatement.setString(2, rang.getTenRang());
            preparedStatement.setInt(3, rang.getVungRang());
            preparedStatement.setInt(4, rang.getSoRang());

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean suaRang(RangDTO rang) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE Rang SET TenRang = ?, VungRang = ?, SoRang = ? WHERE MaRang = ?")) {
            preparedStatement.setString(1, rang.getTenRang());
            preparedStatement.setInt(2, rang.getVungRang());
            preparedStatement.setInt(3, rang.getSoRang());
            preparedStatement.setString(4, rang.getMaRang());

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean xoaRang(String maRang) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "DELETE FROM Rang WHERE MaRang = ?")) {
            preparedStatement.setString(1, maRang);

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
