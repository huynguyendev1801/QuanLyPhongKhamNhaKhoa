package DAL;


import DTO.ChiTietDanhMucDieuTriDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ChiTietDanhMucDieuTriDAL {
    public static List<ChiTietDanhMucDieuTriDTO> layDanhSachChiTietDanhMucDieuTri() {
        List<ChiTietDanhMucDieuTriDTO> danhSachChiTietDanhMucDieuTri = new ArrayList<>();

        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT MaChiTietDanhMucDieuTri, MaDanhMuc, MaKeHoach FROM ChiTietDanhMucDieuTri")) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String maChiTietDanhMucDieuTri = resultSet.getString("MaChiTietDanhMucDieuTri");
                String maDanhMuc = resultSet.getString("MaDanhMuc");
                String maKeHoach = resultSet.getString("MaKeHoach");

                ChiTietDanhMucDieuTriDTO chiTietDanhMucDieuTri = new ChiTietDanhMucDieuTriDTO(maChiTietDanhMucDieuTri, maDanhMuc, maKeHoach);
                danhSachChiTietDanhMucDieuTri.add(chiTietDanhMucDieuTri);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return danhSachChiTietDanhMucDieuTri;
    }

    public static boolean themChiTietDanhMucDieuTri(ChiTietDanhMucDieuTriDTO chiTietDanhMucDieuTri) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO ChiTietDanhMucDieuTri (MaChiTietDanhMucDieuTri, MaDanhMuc, MaKeHoach) VALUES (?, ?, ?)")) {
            preparedStatement.setString(1, chiTietDanhMucDieuTri.getMaChiTietDanhMucDieuTri());
            preparedStatement.setString(2, chiTietDanhMucDieuTri.getMaDanhMuc());
            preparedStatement.setString(3, chiTietDanhMucDieuTri.getMaKeHoach());

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean suaChiTietDanhMucDieuTri(ChiTietDanhMucDieuTriDTO chiTietDanhMucDieuTri) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE ChiTietDanhMucDieuTri SET MaDanhMuc = ?, MaKeHoach = ? WHERE MaChiTietDanhMucDieuTri = ?")) {
            preparedStatement.setString(1, chiTietDanhMucDieuTri.getMaDanhMuc());
            preparedStatement.setString(2, chiTietDanhMucDieuTri.getMaKeHoach());
            preparedStatement.setString(3, chiTietDanhMucDieuTri.getMaChiTietDanhMucDieuTri());

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean xoaChiTietDanhMucDieuTri(String maChiTietDanhMucDieuTri) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "DELETE FROM ChiTietDanhMucDieuTri WHERE MaChiTietDanhMucDieuTri = ?")) {
            preparedStatement.setString(1, maChiTietDanhMucDieuTri);

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
