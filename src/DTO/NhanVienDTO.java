package DTO;
public class NhanVienDTO {
    private String maNhanVien;
    private String tenNhanVien;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;
    private String soDienThoai;
private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public NhanVienDTO(String maNhanVien, String tenNhanVien, int tuoi, String gioiTinh, String diaChi, String soDienThoai, String password) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.password = password;
    }
    public NhanVienDTO(String maNhanVien, String tenNhanVien, int tuoi, String gioiTinh, String diaChi, String soDienThoai) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }
    public String getGioiTinh() {
        return gioiTinh;
    }
    public String getMaNhanVien() {
        return maNhanVien;
    }
    public String getSoDienThoai() {
        return soDienThoai;
    }
    public String getTenNhanVien() {
        return tenNhanVien;
    }
    public int getTuoi() {
        return tuoi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
}
