package BUS;


import DAL.DanhMucDieuTriDAL;
import DTO.DanhMucDieuTriDTO;

import java.util.List;

public class DanhMucDieuTriBUS {
    public static List<DanhMucDieuTriDTO> layDanhSachDanhMucDieuTri() {
        return DanhMucDieuTriDAL.layDanhSachDanhMucDieuTri();
    }

    public static boolean themDanhMucDieuTri(DanhMucDieuTriDTO danhMucDieuTri) {
        return DanhMucDieuTriDAL.themDanhMucDieuTri(danhMucDieuTri);
    }

    public static boolean suaDanhMucDieuTri(DanhMucDieuTriDTO danhMucDieuTri) {
        return DanhMucDieuTriDAL.suaDanhMucDieuTri(danhMucDieuTri);
    }

    public static boolean xoaDanhMucDieuTri(String maDanhMuc) {
        return DanhMucDieuTriDAL.xoaDanhMucDieuTri(maDanhMuc);
    }
}
