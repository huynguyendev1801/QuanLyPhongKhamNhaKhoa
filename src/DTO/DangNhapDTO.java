/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

public class DangNhapDTO {
        private String ma;
private String loaiTaiKhoan;

    public String getLoaiTaiKhoan() {
        return loaiTaiKhoan;
    }

    public void setLoaiTaiKhoan(String loaiTaiKhoan) {
        this.loaiTaiKhoan = loaiTaiKhoan;
    }
    public String getMa() {
        return ma;
    }

    public DangNhapDTO() {
    }

    public DangNhapDTO(String ma, String loaiTaiKhoan) {
        this.ma = ma;
        this.loaiTaiKhoan = loaiTaiKhoan;

    }

    public void setMa(String ma) {
        this.ma = ma;
    }





}
