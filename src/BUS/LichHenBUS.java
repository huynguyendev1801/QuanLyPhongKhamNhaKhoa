package BUS;


import DAL.LichHenDAL;
import DTO.LichHenDTO;

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
}
