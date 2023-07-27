package BUS;


import DAL.BeMatRangDAL;
import DTO.BeMatRangDTO;

import java.util.List;

public class BeMatRangBUS {
    public static List<BeMatRangDTO> layDanhSachBeMatRang() {
        return BeMatRangDAL.layDanhSachBeMatRang();
    }

    public static boolean themBeMatRang(BeMatRangDTO beMatRang) {
        return BeMatRangDAL.themBeMatRang(beMatRang);
    }

    public static boolean suaBeMatRang(BeMatRangDTO beMatRang) {
        return BeMatRangDAL.suaBeMatRang(beMatRang);
    }

    public static boolean xoaBeMatRang(String maBeMatRang) {
        return BeMatRangDAL.xoaBeMatRang(maBeMatRang);
    }
}
