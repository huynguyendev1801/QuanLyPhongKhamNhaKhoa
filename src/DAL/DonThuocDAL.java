package DAL;


import DTO.DonThuocDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DonThuocDAL {
    public static List<DonThuocDTO> layDanhSachDonThuoc() {
        List<DonThuocDTO> danhSachDonThuoc = new ArrayList<>();

        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT MaDonThuoc, MaKeHoach, MaNhanVien FROM DonThuoc")) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String maDonThuoc = resultSet.getString("MaDonThuoc");
                String maKeHoach = resultSet.getString("MaKeHoach");
                String maNhanVien = resultSet.getString("MaNhanVien");

                DonThuocDTO donThuoc = new DonThuocDTO(maDonThuoc, maKeHoach, maNhanVien);
                danhSachDonThuoc.add(donThuoc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return danhSachDonThuoc;
    }

    public static boolean themDonThuoc(DonThuocDTO donThuoc) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO DonThuoc (MaDonThuoc, MaKeHoach, MaNhanVien) VALUES (?, ?, ?)")) {
            preparedStatement.setString(1, donThuoc.getMaDonThuoc());
            preparedStatement.setString(2, donThuoc.getMaKeHoach());
            preparedStatement.setString(3, donThuoc.getMaNhanVien());

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean suaDonThuoc(DonThuocDTO donThuoc) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE DonThuoc SET MaKeHoach = ?, MaNhanVien = ? WHERE MaDonThuoc = ?")) {
            preparedStatement.setString(1, donThuoc.getMaKeHoach());
            preparedStatement.setString(2, donThuoc.getMaNhanVien());
            preparedStatement.setString(3, donThuoc.getMaDonThuoc());

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean xoaDonThuoc(String maDonThuoc) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "DELETE FROM DonThuoc WHERE MaDonThuoc = ?")) {
            preparedStatement.setString(1, maDonThuoc);

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
