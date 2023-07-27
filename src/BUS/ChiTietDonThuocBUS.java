package BUS;


import DAL.ChiTietDonThuocDAL;
import DTO.ChiTietDonThuocDTO;

import java.util.List;

public class ChiTietDonThuocBUS {
    public static List<ChiTietDonThuocDTO> layDanhSachChiTietDonThuoc() {
        return ChiTietDonThuocDAL.layDanhSachChiTietDonThuoc();
    }

    public static boolean themChiTietDonThuoc(ChiTietDonThuocDTO chiTietDonThuoc) {
        return ChiTietDonThuocDAL.themChiTietDonThuoc(chiTietDonThuoc);
    }

    public static boolean suaChiTietDonThuoc(ChiTietDonThuocDTO chiTietDonThuoc) {
        return ChiTietDonThuocDAL.suaChiTietDonThuoc(chiTietDonThuoc);
    }

    public static boolean xoaChiTietDonThuoc(String maChiTietDonThuoc) {
        return ChiTietDonThuocDAL.xoaChiTietDonThuoc(maChiTietDonThuoc);
    }
}
