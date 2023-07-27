package DAL;


import DTO.LichHenDTO;
import java.sql.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LichHenDAL {
    public static List<LichHenDTO> layDanhSachLichHen() {
        List<LichHenDTO> danhSachLichHen = new ArrayList<>();

        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT MaLichHen, ThoiGianHen, MaBenhNhan, MaNhaSi, PhongKham, TinhTrang FROM LichHen")) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String maLichHen = resultSet.getString("MaLichHen");
                Date thoiGianHen = resultSet.getDate("ThoiGianHen");
                String maBenhNhan = resultSet.getString("MaBenhNhan");
                String maNhaSi = resultSet.getString("MaNhaSi");
                String phongKham = resultSet.getString("PhongKham");
                String tinhTrang = resultSet.getString("TinhTrang");

                LichHenDTO lichHen = new LichHenDTO(maLichHen, thoiGianHen, maBenhNhan, maNhaSi, phongKham, tinhTrang);
                danhSachLichHen.add(lichHen);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return danhSachLichHen;
    }

    public static boolean themLichHen(LichHenDTO lichHen) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO LichHen (ThoiGianHen, MaBenhNhan, MaNhaSi, PhongKham, TinhTrang) VALUES (?, ?, ?, ?, ?)")) {
            preparedStatement.setDate(1, lichHen.getThoiGianHen());
            preparedStatement.setString(2, lichHen.getMaBenhNhan());
            preparedStatement.setString(3, lichHen.getMaNhaSi());
            preparedStatement.setString(4, lichHen.getPhongKham());
            preparedStatement.setString(5, lichHen.getTinhTrang());

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean suaLichHen(LichHenDTO lichHen) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE LichHen SET ThoiGianHen = ?, MaBenhNhan = ?, MaNhaSi = ?, NgayHen = ?, PhongKham = ?, TinhTrang = ? WHERE MaLichHen = ?")) {
            preparedStatement.setDate(1, lichHen.getThoiGianHen());
            preparedStatement.setString(2, lichHen.getMaBenhNhan());
            preparedStatement.setString(3, lichHen.getMaNhaSi());
            preparedStatement.setString(5, lichHen.getPhongKham());
            preparedStatement.setString(6, lichHen.getTinhTrang());
            preparedStatement.setString(7, lichHen.getMaLichHen());

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean xoaLichHen(String maLichHen) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "DELETE FROM LichHen WHERE MaLichHen = ?")) {
            preparedStatement.setString(1, maLichHen);

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
