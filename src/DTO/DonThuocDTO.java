package DTO;
public class DonThuocDTO {
    private String maDonThuoc;
    private String maKeHoach;
    private String maNhanVien;

    public String getMaDonThuoc() {
        return maDonThuoc;
    }
    public String getMaKeHoach() {
        return maKeHoach;
    }

    public DonThuocDTO(String maDonThuoc, String maKeHoach, String maNhanVien) {
        this.maDonThuoc = maDonThuoc;
        this.maKeHoach = maKeHoach;
        this.maNhanVien = maNhanVien;
    }
    public String getMaNhanVien() {
        return maNhanVien;
    }
    public void setMaDonThuoc(String maDonThuoc) {
        this.maDonThuoc = maDonThuoc;
    }
    public void setMaKeHoach(String maKeHoach) {
        this.maKeHoach = maKeHoach;
    }
    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
}
