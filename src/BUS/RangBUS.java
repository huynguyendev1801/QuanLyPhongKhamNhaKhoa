package BUS;


import DAL.RangDAL;
import DTO.RangDTO;

import java.util.List;

public class RangBUS {
    public static List<RangDTO> layDanhSachRang() {
        return RangDAL.layDanhSachRang();
    }

    public static boolean themRang(RangDTO rang) {
        return RangDAL.themRang(rang);
    }

    public static boolean suaRang(RangDTO rang) {
        return RangDAL.suaRang(rang);
    }

    public static boolean xoaRang(String maRang) {
        return RangDAL.xoaRang(maRang);
    }
}
