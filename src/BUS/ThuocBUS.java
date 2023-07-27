package BUS;


import DAL.ThuocDAL;
import DTO.ThuocDTO;

import java.util.List;

public class ThuocBUS {
    public static List<ThuocDTO> layDanhSachThuoc() {
        return ThuocDAL.layDanhSachThuoc();
    }

    public static boolean themThuoc(ThuocDTO thuoc) {
        return ThuocDAL.themThuoc(thuoc);
    }

    public static boolean suaThuoc(ThuocDTO thuoc) {
        return ThuocDAL.suaThuoc(thuoc);
    }

    public static boolean xoaThuoc(String maThuoc) {
        return ThuocDAL.xoaThuoc(maThuoc);
    }
}
