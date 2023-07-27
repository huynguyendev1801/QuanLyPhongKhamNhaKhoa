package BUS;


import DAL.ThanhToanDAL;
import DTO.ThanhToanDTO;

import java.util.List;

public class ThanhToanBUS {
    public static List<ThanhToanDTO> layDanhSachThanhToan() {
        return ThanhToanDAL.layDanhSachThanhToan();
    }

    public static boolean themThanhToan(ThanhToanDTO thanhToan) {
        return ThanhToanDAL.themThanhToan(thanhToan);
    }

    public static boolean suaThanhToan(ThanhToanDTO thanhToan) {
        return ThanhToanDAL.suaThanhToan(thanhToan);
    }

    public static boolean xoaThanhToan(String maThanhToan) {
        return ThanhToanDAL.xoaThanhToan(maThanhToan);
    }
}
