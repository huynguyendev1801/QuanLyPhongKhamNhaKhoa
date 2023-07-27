package DAL;


import DTO.NhaSiDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NhaSiDAL {
    public static List<NhaSiDTO> layDanhSachNhaSi() {
        List<NhaSiDTO> danhSachNhaSi = new ArrayList<>();

        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT MaNhaSi, TenNhaSi, Tuoi, GioiTinh, DiaChi, SoDienThoai, MatKhau FROM NhaSi")) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String maNhaSi = resultSet.getString("MaNhaSi");
                String tenNhaSi = resultSet.getString("TenNhaSi");
                int tuoi = resultSet.getInt("Tuoi");
                String gioiTinh = resultSet.getString("GioiTinh");
                String diaChi = resultSet.getString("DiaChi");
                String soDienThoai = resultSet.getString("SoDienThoai");
 String matKhau = resultSet.getString("MatKhau");
                NhaSiDTO nhaSi = new NhaSiDTO(maNhaSi, tenNhaSi, tuoi, gioiTinh, diaChi, soDienThoai);
                nhaSi.setPassword(matKhau);
                danhSachNhaSi.add(nhaSi);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return danhSachNhaSi;
    }

    public static boolean themNhaSi(NhaSiDTO nhaSi) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO NhaSi (MaNhaSi, TenNhaSi, Tuoi, GioiTinh, DiaChi, SoDienThoai, MatKhau) VALUES (?, ?, ?, ?, ?, ?, ?)")) {
            preparedStatement.setString(1, nhaSi.getMaNhaSi());
            preparedStatement.setString(2, nhaSi.getTenNhaSi());
            preparedStatement.setInt(3, nhaSi.getTuoi());
            preparedStatement.setString(4, nhaSi.getGioiTinh());
            preparedStatement.setString(5, nhaSi.getDiaChi());
            preparedStatement.setString(6, nhaSi.getSoDienThoai());
            preparedStatement.setString(7, nhaSi.getPassword());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public static boolean suaNhaSi(NhaSiDTO nhaSi) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE NhaSi SET TenNhaSi = ?, Tuoi = ?, GioiTinh = ?, DiaChi = ?, SoDienThoai = ?, MatKhau = ? WHERE MaNhaSi = ?")) {
            preparedStatement.setString(1, nhaSi.getTenNhaSi());
            preparedStatement.setInt(2, nhaSi.getTuoi());
            preparedStatement.setString(3, nhaSi.getGioiTinh());
            preparedStatement.setString(4, nhaSi.getDiaChi());
            preparedStatement.setString(5, nhaSi.getSoDienThoai());
             preparedStatement.setString(6, nhaSi.getPassword());
            preparedStatement.setString(7, nhaSi.getMaNhaSi());
           
System.out.println("hello");
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean xoaNhaSi(String maNhaSi) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "DELETE FROM NhaSi WHERE MaNhaSi = ?")) {
            preparedStatement.setString(1, maNhaSi);

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}

