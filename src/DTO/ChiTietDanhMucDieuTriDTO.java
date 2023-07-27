package DTO;
public class ChiTietDanhMucDieuTriDTO {
    private String maChiTietDanhMucDieuTri;
    private String maDanhMuc;
    private String maKeHoach;

    public ChiTietDanhMucDieuTriDTO(String maChiTietDanhMucDieuTri, String maDanhMuc, String maKeHoach) {
        this.maChiTietDanhMucDieuTri = maChiTietDanhMucDieuTri;
        this.maDanhMuc = maDanhMuc;
        this.maKeHoach = maKeHoach;
    }
    public String getMaChiTietDanhMucDieuTri() {
        return maChiTietDanhMucDieuTri;
    }
    public String getMaDanhMuc() {
        return maDanhMuc;
    }
    public String getMaKeHoach() {
        return maKeHoach;
    }
    public void setMaChiTietDanhMucDieuTri(String maChiTietDanhMucDieuTri) {
        this.maChiTietDanhMucDieuTri = maChiTietDanhMucDieuTri;
    }
    public void setMaDanhMuc(String maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }
    public void setMaKeHoach(String maKeHoach) {
        this.maKeHoach = maKeHoach;
    }
}
