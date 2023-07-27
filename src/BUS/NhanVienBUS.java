package BUS;


import DAL.NhanVienDAL;
import DTO.NhanVienDTO;

import java.util.List;

public class NhanVienBUS {
    public static List<NhanVienDTO> layDanhSachNhanVien() {
        return NhanVienDAL.layDanhSachNhanVien();
    }

    public static boolean themNhanVien(NhanVienDTO nhanVien) {
        return NhanVienDAL.themNhanVien(nhanVien);
    }

    public static boolean suaNhanVien(NhanVienDTO nhanVien) {
        return NhanVienDAL.suaNhanVien(nhanVien);
    }

    public static boolean xoaNhanVien(String maNhanVien) {
        return NhanVienDAL.xoaNhanVien(maNhanVien);
    }
}
