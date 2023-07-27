package BUS;


import DAL.KeHoachDieuTriDAL;
import DTO.KeHoachDieuTriDTO;

import java.util.List;

public class KeHoachDieuTriBUS {
    public static List<KeHoachDieuTriDTO> layDanhSachKeHoachDieuTri() {
        return KeHoachDieuTriDAL.layDanhSachKeHoachDieuTri();
    }

    public static boolean themKeHoachDieuTri(KeHoachDieuTriDTO keHoachDieuTri) {
        return KeHoachDieuTriDAL.themKeHoachDieuTri(keHoachDieuTri);
    }

    public static boolean suaKeHoachDieuTri(KeHoachDieuTriDTO keHoachDieuTri) {
        return KeHoachDieuTriDAL.suaKeHoachDieuTri(keHoachDieuTri);
    }

    public static boolean xoaKeHoachDieuTri(String maKeHoach) {
        return KeHoachDieuTriDAL.xoaKeHoachDieuTri(maKeHoach);
    }
}
