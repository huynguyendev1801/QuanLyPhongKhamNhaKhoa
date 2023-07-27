package BUS;


import DAL.RangDieuTriDAL;
import DTO.RangDieuTriDTO;

import java.util.List;

public class RangDieuTriBUS {
    public static List<RangDieuTriDTO> layDanhSachRangDieuTri() {
        return RangDieuTriDAL.layDanhSachRangDieuTri();
    }

    public static boolean themRangDieuTri(RangDieuTriDTO rangDieuTri) {
        return RangDieuTriDAL.themRangDieuTri(rangDieuTri);
    }

    public static boolean suaRangDieuTri(RangDieuTriDTO rangDieuTri) {
        return RangDieuTriDAL.suaRangDieuTri(rangDieuTri);
    }

    public static boolean xoaRangDieuTri(String maRangDieuTri) {
        return RangDieuTriDAL.xoaRangDieuTri(maRangDieuTri);
    }
}
