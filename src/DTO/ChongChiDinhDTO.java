package DTO;
public class ChongChiDinhDTO {
    private int maChongChiDinh;
    private String maBenhNhan;
    private String maThuoc;
    private String tenThuoc;

    public String getTenThuoc() {
        return tenThuoc;
    }

    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }

    public ChongChiDinhDTO() {
    }
    private String ghiChu;

    public ChongChiDinhDTO(int maChongChiDinh, String maBenhNhan, String maThuoc, String ghiChu) {
        this.maChongChiDinh = maChongChiDinh;
        this.maBenhNhan = maBenhNhan;
        this.maThuoc = maThuoc;
        this.ghiChu = ghiChu;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public ChongChiDinhDTO(String maBenhNhan, String maThuoc, String ghiChu) {
        this.maBenhNhan = maBenhNhan;
        this.maThuoc = maThuoc;
        this.ghiChu = ghiChu;
    }
    public String getMaBenhNhan() {
        return maBenhNhan;
    }
    public int getMaChongChiDinh() {
        return maChongChiDinh;
    }
    public String getMaThuoc() {
        return maThuoc;
    }
    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }
    public void setMaChongChiDinh(int maChongChiDinh) {
        this.maChongChiDinh = maChongChiDinh;
    }
    public void setMaThuoc(String maThuoc) {
        this.maThuoc = maThuoc;
    }
}
