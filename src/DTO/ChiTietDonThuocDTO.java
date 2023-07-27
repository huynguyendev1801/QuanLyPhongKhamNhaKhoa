package DTO;
public class ChiTietDonThuocDTO {
    private String maChiTietDonThuoc;
    private String maDonThuoc;
    private String maThuoc;
    private int soLuong;


    public String getMaChiTietDonThuoc() {
        return maChiTietDonThuoc;
    }
    public String getMaDonThuoc() {
        return maDonThuoc;
    }
    public String getMaThuoc() {
        return maThuoc;
    }
    public void setMaChiTietDonThuoc(String maChiTietDonThuoc) {
        this.maChiTietDonThuoc = maChiTietDonThuoc;
    }
    public int getSoLuong() {
        return soLuong;
    }

    public ChiTietDonThuocDTO(String maChiTietDonThuoc, String maDonThuoc, String maThuoc, int soLuong) {
        this.maChiTietDonThuoc = maChiTietDonThuoc;
        this.maDonThuoc = maDonThuoc;
        this.maThuoc = maThuoc;
        this.soLuong = soLuong;
    }
    public void setMaDonThuoc(String maDonThuoc) {
        this.maDonThuoc = maDonThuoc;
    }
    public void setMaThuoc(String maThuoc) {
        this.maThuoc = maThuoc;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
