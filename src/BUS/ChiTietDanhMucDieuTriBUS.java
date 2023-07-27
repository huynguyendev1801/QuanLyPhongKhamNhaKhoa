package BUS;


import DAL.ChiTietDanhMucDieuTriDAL;
import DTO.ChiTietDanhMucDieuTriDTO;

import java.util.List;

public class ChiTietDanhMucDieuTriBUS {
    public static List<ChiTietDanhMucDieuTriDTO> layDanhSachChiTietDanhMucDieuTri() {
        return ChiTietDanhMucDieuTriDAL.layDanhSachChiTietDanhMucDieuTri();
    }

    public static boolean themChiTietDanhMucDieuTri(ChiTietDanhMucDieuTriDTO chiTietDanhMucDieuTri) {
        return ChiTietDanhMucDieuTriDAL.themChiTietDanhMucDieuTri(chiTietDanhMucDieuTri);
    }

    public static boolean suaChiTietDanhMucDieuTri(ChiTietDanhMucDieuTriDTO chiTietDanhMucDieuTri) {
        return ChiTietDanhMucDieuTriDAL.suaChiTietDanhMucDieuTri(chiTietDanhMucDieuTri);
    }

    public static boolean xoaChiTietDanhMucDieuTri(String maChiTietDanhMuc) {
        return ChiTietDanhMucDieuTriDAL.xoaChiTietDanhMucDieuTri(maChiTietDanhMuc);
    }
}
