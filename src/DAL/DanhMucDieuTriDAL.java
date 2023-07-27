package DAL;


import DTO.DanhMucDieuTriDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DanhMucDieuTriDAL {
    public static List<DanhMucDieuTriDTO> layDanhSachDanhMucDieuTri() {
        List<DanhMucDieuTriDTO> danhSachDanhMucDieuTri = new ArrayList<>();

        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT MaDanhMuc, TenDanhMuc FROM DanhMucDieuTri")) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String maDanhMuc = resultSet.getString("MaDanhMuc");
                String tenDanhMuc = resultSet.getString("TenDanhMuc");

                DanhMucDieuTriDTO danhMucDieuTri = new DanhMucDieuTriDTO(maDanhMuc, tenDanhMuc);
                danhSachDanhMucDieuTri.add(danhMucDieuTri);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return danhSachDanhMucDieuTri;
    }

    public static boolean themDanhMucDieuTri(DanhMucDieuTriDTO danhMucDieuTri) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO DanhMucDieuTri (MaDanhMuc, TenDanhMuc) VALUES (?, ?)")) {
            preparedStatement.setString(1, danhMucDieuTri.getMaDanhMuc());
            preparedStatement.setString(2, danhMucDieuTri.getTenDanhMuc());

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean suaDanhMucDieuTri(DanhMucDieuTriDTO danhMucDieuTri) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE DanhMucDieuTri SET TenDanhMuc = ? WHERE MaDanhMuc = ?")) {
            preparedStatement.setString(1, danhMucDieuTri.getTenDanhMuc());
            preparedStatement.setString(2, danhMucDieuTri.getMaDanhMuc());

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean xoaDanhMucDieuTri(String maDanhMuc) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "DELETE FROM DanhMucDieuTri WHERE MaDanhMuc = ?")) {
            preparedStatement.setString(1, maDanhMuc);

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
