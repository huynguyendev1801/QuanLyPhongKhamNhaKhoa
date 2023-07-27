package DAL;


import DTO.NhanVienDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NhanVienDAL {
    public static List<NhanVienDTO> layDanhSachNhanVien() {
        List<NhanVienDTO> danhSachNhanVien = new ArrayList<>();

        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT MaNhanVien, TenNhanVien, Tuoi, GioiTinh, DiaChi, SoDienThoai, MatKhau FROM NhanVien")) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String maNhanVien = resultSet.getString("MaNhanVien");
                String tenNhanVien = resultSet.getString("TenNhanVien");
                int tuoi = resultSet.getInt("Tuoi");
                String gioiTinh = resultSet.getString("GioiTinh");
                String diaChi = resultSet.getString("DiaChi");
                String soDienThoai = resultSet.getString("SoDienThoai");
                String matKhau = resultSet.getString("MatKhau");
                NhanVienDTO nhanVien = new NhanVienDTO(maNhanVien, tenNhanVien, tuoi, gioiTinh, diaChi, soDienThoai);
                nhanVien.setPassword(matKhau);
                danhSachNhanVien.add(nhanVien);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return danhSachNhanVien;
    }

    public static boolean themNhanVien(NhanVienDTO nhanVien) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO NhanVien (MaNhanVien, TenNhanVien, Tuoi, GioiTinh, DiaChi, SoDienThoai, MatKhau) VALUES (?, ?, ?, ?, ?, ?, ?)")) {
            preparedStatement.setString(1, nhanVien.getMaNhanVien());
            preparedStatement.setString(2, nhanVien.getTenNhanVien());
            preparedStatement.setInt(3, nhanVien.getTuoi());
            preparedStatement.setString(4, nhanVien.getGioiTinh());
            preparedStatement.setString(5, nhanVien.getDiaChi());
            preparedStatement.setString(6, nhanVien.getSoDienThoai());
  preparedStatement.setString(7, nhanVien.getPassword());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean suaNhanVien(NhanVienDTO nhanVien) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE NhanVien SET TenNhanVien = ?, Tuoi = ?, GioiTinh = ?, DiaChi = ?, SoDienThoai = ?, MatKhau = ? WHERE MaNhanVien = ?")) {
            preparedStatement.setString(1, nhanVien.getTenNhanVien());
            preparedStatement.setInt(2, nhanVien.getTuoi());
            preparedStatement.setString(3, nhanVien.getGioiTinh());
            preparedStatement.setString(4, nhanVien.getDiaChi());
            preparedStatement.setString(5, nhanVien.getSoDienThoai());
             preparedStatement.setString(6, nhanVien.getPassword());
            preparedStatement.setString(7, nhanVien.getMaNhanVien());

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean xoaNhanVien(String maNhanVien) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "DELETE FROM NhanVien WHERE MaNhanVien = ?")) {
            preparedStatement.setString(1, maNhanVien);

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
