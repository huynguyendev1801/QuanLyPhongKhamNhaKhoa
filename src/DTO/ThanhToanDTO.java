package DTO;
import java.sql.Date;
import java.math.BigDecimal;

public class ThanhToanDTO {
    private String maThanhToan;
    private String maKeHoach;
    private BigDecimal tongTien;
    private Date ngayThanhToan;
    private String maNhanVien;
    private BigDecimal tienDaTra;
    private BigDecimal tienThoi;
    private String loaiThanhToan;

    public ThanhToanDTO(String maThanhToan, String maKeHoach, BigDecimal tongTien, Date ngayThanhToan, String maNhanVien, BigDecimal tienDaTra, BigDecimal tienThoi, String loaiThanhToan) {
        this.maThanhToan = maThanhToan;
        this.maKeHoach = maKeHoach;
        this.tongTien = tongTien;
        this.ngayThanhToan = ngayThanhToan;
        this.maNhanVien = maNhanVien;
        this.tienDaTra = tienDaTra;
        this.tienThoi = tienThoi;
        this.loaiThanhToan = loaiThanhToan;
    }

    public String getLoaiThanhToan() {
        return loaiThanhToan;
    }
    public String getMaKeHoach() {
        return maKeHoach;
    }
    public String getMaNhanVien() {
        return maNhanVien;
    }
    public String getMaThanhToan() {
        return maThanhToan;
    }
    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }
    public BigDecimal getTienDaTra() {
        return tienDaTra;
    }
    public BigDecimal getTienThoi() {
        return tienThoi;
    }
    public BigDecimal getTongTien() {
        return tongTien;
    }
    public void setLoaiThanhToan(String loaiThanhToan) {
        this.loaiThanhToan = loaiThanhToan;
    }
    public void setMaKeHoach(String maKeHoach) {
        this.maKeHoach = maKeHoach;
    }
    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
    public void setMaThanhToan(String maThanhToan) {
        this.maThanhToan = maThanhToan;
    }
    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }
    public void setTienDaTra(BigDecimal tienDaTra) {
        this.tienDaTra = tienDaTra;
    }
    public void setTienThoi(BigDecimal tienThoi) {
        this.tienThoi = tienThoi;
    }
    public void setTongTien(BigDecimal tongTien) {
        this.tongTien = tongTien;
    }
    
}
