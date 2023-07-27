package DTO;
import java.sql.Date;
public class KeHoachDieuTriDTO {
    private String maKeHoach;
    private String maBenhNhan;
    private String maNhaSi;
    private String tenNhaSi;

  

    public String getTenNhaSi() {
        return tenNhaSi;
    }

    public void setTenNhaSi(String tenNhaSi) {
        this.tenNhaSi = tenNhaSi;
    }

    public KeHoachDieuTriDTO(String maKeHoach, String maBenhNhan, String maNhaSi, String tenNhaSi, Date ngayDieuTri, String moTa, String ghiChu, String trangThaiDieuTri) {
        this.maKeHoach = maKeHoach;
        this.maBenhNhan = maBenhNhan;
        this.maNhaSi = maNhaSi;
        this.tenNhaSi = tenNhaSi;
        this.ngayDieuTri = ngayDieuTri;
        this.moTa = moTa;
        this.ghiChu = ghiChu;
        this.trangThaiDieuTri = trangThaiDieuTri;
    }

    public KeHoachDieuTriDTO() {
    }
    private Date ngayDieuTri;
    private String moTa;
    private String ghiChu;
    private String trangThaiDieuTri;

    public KeHoachDieuTriDTO(String maBenhNhan, String maNhaSi, Date ngayDieuTri, String moTa, String ghiChu, String trangThaiDieuTri) {
        this.maBenhNhan = maBenhNhan;
        this.maNhaSi = maNhaSi;
        this.ngayDieuTri = ngayDieuTri;
        this.moTa = moTa;
        this.ghiChu = ghiChu;
        this.trangThaiDieuTri = trangThaiDieuTri;
    }

    public String getGhiChu() {
        return ghiChu;
    }
    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public String getMaKeHoach() {
        return maKeHoach;
    }
    public String getMaNhaSi() {
        return maNhaSi;
    }
    public String getMoTa() {
        return moTa;
    }
    public Date getNgayDieuTri() {
        return ngayDieuTri;
    }
    public String getTrangThaiDieuTri() {
        return trangThaiDieuTri;
    }
    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }
  
    public void setMaKeHoach(String maKeHoach) {
        this.maKeHoach = maKeHoach;
    }
    public void setMaNhaSi(String maNhaSi) {
        this.maNhaSi = maNhaSi;
    }
    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    public void setNgayDieuTri(Date ngayDieuTri) {
        this.ngayDieuTri = ngayDieuTri;
    }
    public void setTrangThaiDieuTri(String trangThaiDieuTri) {
        this.trangThaiDieuTri = trangThaiDieuTri;
    }
}
