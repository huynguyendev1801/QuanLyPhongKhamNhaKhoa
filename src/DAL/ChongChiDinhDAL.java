package DAL;


import DTO.ChongChiDinhDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ChongChiDinhDAL {
    public static List<ChongChiDinhDTO> layDanhSachChongChiDinh() {
        List<ChongChiDinhDTO> danhSachChongChiDinh = new ArrayList<>();

        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT MaChongChiDinh, MaBenhNhan, MaThuoc, GhiChu FROM ChongChiDinh")) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int maChongChiDinh = resultSet.getInt("MaChongChiDinh");
                String maBenhNhan = resultSet.getString("MaBenhNhan");
                String maThuoc = resultSet.getString("MaThuoc");
                String ghiChu = resultSet.getString("GhiChu");

                ChongChiDinhDTO chongChiDinh = new ChongChiDinhDTO(maChongChiDinh, maBenhNhan, maThuoc, ghiChu);
                danhSachChongChiDinh.add(chongChiDinh);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return danhSachChongChiDinh;
    }

    public static boolean themChongChiDinh(ChongChiDinhDTO chongChiDinh) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO ChongChiDinh (MaBenhNhan, MaThuoc, GhiChu) VALUES (?, ?, ?)")) {
            preparedStatement.setString(1, chongChiDinh.getMaBenhNhan());
            preparedStatement.setString(2, chongChiDinh.getMaThuoc());
            preparedStatement.setString(3, chongChiDinh.getGhiChu());

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean suaChongChiDinh(ChongChiDinhDTO chongChiDinh) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE ChongChiDinh SET MaBenhNhan = ?, MaThuoc = ?, GhiChu = ? WHERE MaChongChiDinh = ?")) {
            preparedStatement.setString(1, chongChiDinh.getMaBenhNhan());
            preparedStatement.setString(2, chongChiDinh.getMaThuoc());
            preparedStatement.setString(3, chongChiDinh.getGhiChu());
            preparedStatement.setInt(4, chongChiDinh.getMaChongChiDinh());

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean xoaChongChiDinh(String maChongChiDinh) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "DELETE FROM ChongChiDinh WHERE MaChongChiDinh = ?")) {
            preparedStatement.setString(1, maChongChiDinh);

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
