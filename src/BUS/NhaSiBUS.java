package BUS;


import DAL.NhaSiDAL;
import DTO.NhaSiDTO;

import java.util.List;

public class NhaSiBUS {
    public static List<NhaSiDTO> layDanhSachNhaSi() {
        return NhaSiDAL.layDanhSachNhaSi();
    }

    public static boolean themNhaSi(NhaSiDTO nhaSi) {
        return NhaSiDAL.themNhaSi(nhaSi);
    }

    public static boolean suaNhaSi(NhaSiDTO nhaSi) {
        return NhaSiDAL.suaNhaSi(nhaSi);
    }

    public static boolean xoaNhaSi(String maNhaSi) {
        return NhaSiDAL.xoaNhaSi(maNhaSi);
    }
}
