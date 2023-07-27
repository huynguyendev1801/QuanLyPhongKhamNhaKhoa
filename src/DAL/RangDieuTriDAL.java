package DAL;


import DTO.RangDieuTriDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RangDieuTriDAL {
    public static List<RangDieuTriDTO> layDanhSachRangDieuTri() {
        List<RangDieuTriDTO> danhSachRangDieuTri = new ArrayList<>();

        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT MaRangDieuTri, MaKeHoach, MaRang, MaBeMatRang FROM RangDieuTri")) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String maRangDieuTri = resultSet.getString("MaRangDieuTri");
                String maKeHoach = resultSet.getString("MaKeHoach");
                String maRang = resultSet.getString("MaRang");
                String maBeMatRang = resultSet.getString("MaBeMatRang");

                RangDieuTriDTO rangDieuTri = new RangDieuTriDTO(maRangDieuTri, maKeHoach, maRang, maBeMatRang);
                danhSachRangDieuTri.add(rangDieuTri);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return danhSachRangDieuTri;
    }

    public static boolean themRangDieuTri(RangDieuTriDTO rangDieuTri) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO RangDieuTri (MaRangDieuTri, MaKeHoach, MaRang, MaBeMatRang) VALUES (?, ?, ?, ?)")) {
            preparedStatement.setString(1, rangDieuTri.getMaRangDieuTri());
            preparedStatement.setString(2, rangDieuTri.getMaKeHoach());
            preparedStatement.setString(3, rangDieuTri.getMaRang());
            preparedStatement.setString(4, rangDieuTri.getMaBeMatRang());

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean suaRangDieuTri(RangDieuTriDTO rangDieuTri) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE RangDieuTri SET MaKeHoach = ?, MaRang = ?, MaBeMatRang = ? WHERE MaRangDieuTri = ?")) {
            preparedStatement.setString(1, rangDieuTri.getMaKeHoach());
            preparedStatement.setString(2, rangDieuTri.getMaRang());
            preparedStatement.setString(3, rangDieuTri.getMaBeMatRang());
            preparedStatement.setString(4, rangDieuTri.getMaRangDieuTri());

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean xoaRangDieuTri(String maRangDieuTri) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "DELETE FROM RangDieuTri WHERE MaRangDieuTri = ?")) {
            preparedStatement.setString(1, maRangDieuTri);

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
