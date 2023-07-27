package BUS;


import DAL.ChongChiDinhDAL;
import DTO.ChongChiDinhDTO;

import java.util.List;

public class ChongChiDinhBUS {
    public static List<ChongChiDinhDTO> layDanhSachChongChiDinh() {
        return ChongChiDinhDAL.layDanhSachChongChiDinh();
    }

    public static boolean themChongChiDinh(ChongChiDinhDTO chongChiDinh) {
        return ChongChiDinhDAL.themChongChiDinh(chongChiDinh);
    }

    public static boolean suaChongChiDinh(ChongChiDinhDTO chongChiDinh) {
        return ChongChiDinhDAL.suaChongChiDinh(chongChiDinh);
    }

    public static boolean xoaChongChiDinh(String maChongChiDinh) {
        return ChongChiDinhDAL.xoaChongChiDinh(maChongChiDinh);
    }
}
