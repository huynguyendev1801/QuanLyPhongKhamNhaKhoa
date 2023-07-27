package DTO;
public class NhaSiDTO {
    private String maNhaSi;
    private String tenNhaSi;
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

    public NhaSiDTO(String maNhaSi, String tenNhaSi, int tuoi, String gioiTinh, String diaChi, String soDienThoai) {
        this.maNhaSi = maNhaSi;
        this.tenNhaSi = tenNhaSi;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public NhaSiDTO(String maNhaSi, String tenNhaSi, int tuoi, String gioiTinh, String diaChi, String soDienThoai, String password) {
        this.maNhaSi = maNhaSi;
        this.tenNhaSi = tenNhaSi;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.password = password;
    }

    public String getDiaChi() {
        return diaChi;
    }
    public String getGioiTinh() {
        return gioiTinh;
    }
    public String getMaNhaSi() {
        return maNhaSi;
    }
    public String getSoDienThoai() {
        return soDienThoai;
    }public String getTenNhaSi() {
        return tenNhaSi;
    }
    public int getTuoi() {
        return tuoi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }public void setMaNhaSi(String maNhaSi) {
        this.maNhaSi = maNhaSi;
    }
    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    public void setTenNhaSi(String tenNhaSi) {
        this.tenNhaSi = tenNhaSi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
}
