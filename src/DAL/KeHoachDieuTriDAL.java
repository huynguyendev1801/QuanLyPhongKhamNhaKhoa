package DAL;

import DTO.KeHoachDieuTriDTO;
import java.sql.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class KeHoachDieuTriDAL {
    public static List<KeHoachDieuTriDTO> layDanhSachKeHoachDieuTri() {
        List<KeHoachDieuTriDTO> danhSachKeHoachDieuTri = new ArrayList<>();

        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT MaKeHoach, MaBenhNhan, MaNhaSi, NgayDieuTri, MoTa, GhiChu, TrangThaiDieuTri FROM KeHoachDieuTri")) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String maKeHoach = resultSet.getString("MaKeHoach");
                String maBenhNhan = resultSet.getString("MaBenhNhan");
                String maNhaSi = resultSet.getString("MaNhaSi");
                Date ngayDieuTri = resultSet.getDate("NgayDieuTri");
                String moTa = resultSet.getString("MoTa");
                String ghiChu = resultSet.getString("GhiChu");
                String trangThaiDieuTri = resultSet.getString("TrangThaiDieuTri");

                KeHoachDieuTriDTO keHoachDieuTri = new KeHoachDieuTriDTO();
                keHoachDieuTri.setMaKeHoach(maKeHoach);
                keHoachDieuTri.setMaBenhNhan(maBenhNhan);
                keHoachDieuTri.setMaNhaSi(maNhaSi);
                keHoachDieuTri.setNgayDieuTri(ngayDieuTri);
                keHoachDieuTri.setMoTa(moTa);
                keHoachDieuTri.setGhiChu(ghiChu);
                keHoachDieuTri.setTrangThaiDieuTri(trangThaiDieuTri);
                danhSachKeHoachDieuTri.add(keHoachDieuTri);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return danhSachKeHoachDieuTri;
    }

    public static boolean themKeHoachDieuTri(KeHoachDieuTriDTO keHoachDieuTri) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO KeHoachDieuTri (MaKeHoach, MaBenhNhan, MaNhaSi, NgayDieuTri, MoTa, GhiChu, TrangThaiDieuTri) VALUES (dbo.GenerateMaKeHoach(), ?, ?, ?, ?, ?, ?)")) {
            preparedStatement.setString(1, keHoachDieuTri.getMaBenhNhan());
            preparedStatement.setString(2, keHoachDieuTri.getMaNhaSi());
            preparedStatement.setDate(3, keHoachDieuTri.getNgayDieuTri());
            preparedStatement.setString(4, keHoachDieuTri.getMoTa());
            preparedStatement.setString(5, keHoachDieuTri.getGhiChu());
            preparedStatement.setString(6, keHoachDieuTri.getTrangThaiDieuTri());

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean suaKeHoachDieuTri(KeHoachDieuTriDTO keHoachDieuTri) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE KeHoachDieuTri SET MaBenhNhan = ?, MaNhaSi = ?, NgayDieuTri = ?, MoTa = ?, GhiChu = ?, TrangThaiDieuTri = ? WHERE MaKeHoach = ?")) {
            preparedStatement.setString(1, keHoachDieuTri.getMaBenhNhan());
            preparedStatement.setString(2, keHoachDieuTri.getMaNhaSi());
            preparedStatement.setDate(3, keHoachDieuTri.getNgayDieuTri());
            preparedStatement.setString(4, keHoachDieuTri.getMoTa());
            preparedStatement.setString(5, keHoachDieuTri.getGhiChu());
            preparedStatement.setString(6, keHoachDieuTri.getTrangThaiDieuTri());
            preparedStatement.setString(7, keHoachDieuTri.getMaKeHoach());

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean xoaKeHoachDieuTri(String maKeHoach) {
        try (Connection connection = Database.getConnect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "DELETE FROM KeHoachDieuTri WHERE MaKeHoach = ?")) {
            preparedStatement.setString(1, maKeHoach);

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
