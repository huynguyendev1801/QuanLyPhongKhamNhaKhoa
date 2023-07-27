/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.math.BigDecimal;

public class ChiTietBenhNhanDTO {
    private String maBenhNhan;

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }
    private String tenBenhNhan;
    private int tuoi;

    public ChiTietBenhNhanDTO(String tenBenhNhan, int tuoi, String gioiTinh, BigDecimal tongTienDieuTri, BigDecimal tongTienDaThanhToan, String sucKhoeRangMieng) {
        this.tenBenhNhan = tenBenhNhan;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.tongTienDieuTri = tongTienDieuTri;
        this.tongTienDaThanhToan = tongTienDaThanhToan;
        this.sucKhoeRangMieng = sucKhoeRangMieng;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public BigDecimal getTongTienDieuTri() {
        return tongTienDieuTri;
    }

    public void setTongTienDieuTri(BigDecimal tongTienDieuTri) {
        this.tongTienDieuTri = tongTienDieuTri;
    }

    public BigDecimal getTongTienDaThanhToan() {
        return tongTienDaThanhToan;
    }

    public void setTongTienDaThanhToan(BigDecimal tongTienDaThanhToan) {
        this.tongTienDaThanhToan = tongTienDaThanhToan;
    }

    public String getSucKhoeRangMieng() {
        return sucKhoeRangMieng;
    }

    public void setSucKhoeRangMieng(String sucKhoeRangMieng) {
        this.sucKhoeRangMieng = sucKhoeRangMieng;
    }
    private String gioiTinh;
    private BigDecimal tongTienDieuTri;
    private BigDecimal tongTienDaThanhToan;
    private String sucKhoeRangMieng;
    
    
}
