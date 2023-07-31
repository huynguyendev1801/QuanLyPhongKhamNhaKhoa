package BUS;


import DAL.LichHenDAL;
import DTO.LichHenDTO;
import java.sql.Date;

import java.util.List;

public class LichHenBUS {
    public static List<LichHenDTO> layDanhSachLichHen() {
        return LichHenDAL.layDanhSachLichHen();
    }

    public static boolean themLichHen(LichHenDTO lichHen) {
        return LichHenDAL.themLichHen(lichHen);
    }

    public static boolean suaLichHen(LichHenDTO lichHen) {
        return LichHenDAL.suaLichHen(lichHen);
    }

    public static boolean xoaLichHen(String maLichHen) {
        return LichHenDAL.xoaLichHen(maLichHen);
    }
     public static List<LichHenDTO> layDanhSachLichHenTheoNhaSiVaThoiGian(String maNhaSi, Date startDate, Date endDate){
     return LichHenDAL.layDanhSachLichHenTheoNhaSiVaThoiGian(maNhaSi, startDate, endDate);
     }
}
