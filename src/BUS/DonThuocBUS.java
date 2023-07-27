package BUS;


import DAL.DonThuocDAL;
import DTO.DonThuocDTO;

import java.util.List;

public class DonThuocBUS {
    public static List<DonThuocDTO> layDanhSachDonThuoc() {
        return DonThuocDAL.layDanhSachDonThuoc();
    }

    public static boolean themDonThuoc(DonThuocDTO donThuoc) {
        return DonThuocDAL.themDonThuoc(donThuoc);
    }

    public static boolean suaDonThuoc(DonThuocDTO donThuoc) {
        return DonThuocDAL.suaDonThuoc(donThuoc);
    }

    public static boolean xoaDonThuoc(String maDonThuoc) {
        return DonThuocDAL.xoaDonThuoc(maDonThuoc);
    }
}
