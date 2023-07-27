package DAL;


import DTO.ChiTietDonThuocDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ChiTietDonThuocDAL {
    public static List<ChiTietDonThuocDTO> layDanhSachChiTietDonThuoc() {
        List<ChiTietDonThuocDTO> danhSachChiTietDonThuoc = new ArrayList<>();

        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT MaChiTietDonThuoc, MaDonThuoc, MaThuoc, SoLuong FROM ChiTietDonThuoc")) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String maChiTietDonThuoc = resultSet.getString("MaChiTietDonThuoc");
                String maDonThuoc = resultSet.getString("MaDonThuoc");
                String maThuoc = resultSet.getString("MaThuoc");
                int soLuong = resultSet.getInt("SoLuong");

                ChiTietDonThuocDTO chiTietDonThuoc = new ChiTietDonThuocDTO(maChiTietDonThuoc, maDonThuoc, maThuoc, soLuong);
                danhSachChiTietDonThuoc.add(chiTietDonThuoc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return danhSachChiTietDonThuoc;
    }

    public static boolean themChiTietDonThuoc(ChiTietDonThuocDTO chiTietDonThuoc) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO ChiTietDonThuoc (MaChiTietDonThuoc, MaDonThuoc, MaThuoc, SoLuong) VALUES (?, ?, ?, ?)")) {
            preparedStatement.setString(1, chiTietDonThuoc.getMaChiTietDonThuoc());
            preparedStatement.setString(2, chiTietDonThuoc.getMaDonThuoc());
            preparedStatement.setString(3, chiTietDonThuoc.getMaThuoc());
            preparedStatement.setInt(4, chiTietDonThuoc.getSoLuong());

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean suaChiTietDonThuoc(ChiTietDonThuocDTO chiTietDonThuoc) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE ChiTietDonThuoc SET MaDonThuoc = ?, MaThuoc = ?, SoLuong = ? WHERE MaChiTietDonThuoc = ?")) {
            preparedStatement.setString(1, chiTietDonThuoc.getMaDonThuoc());
            preparedStatement.setString(2, chiTietDonThuoc.getMaThuoc());
            preparedStatement.setInt(3, chiTietDonThuoc.getSoLuong());
            preparedStatement.setString(4, chiTietDonThuoc.getMaChiTietDonThuoc());

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean xoaChiTietDonThuoc(String maChiTietDonThuoc) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "DELETE FROM ChiTietDonThuoc WHERE MaChiTietDonThuoc = ?")) {
            preparedStatement.setString(1, maChiTietDonThuoc);

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
