package DTO;
public class DanhMucDieuTriDTO {
    private String maDanhMuc;
    private String tenDanhMuc;

    public String getMaDanhMuc() {
        return maDanhMuc;
    }
    public String getTenDanhMuc() {
        return tenDanhMuc;
    }

    public DanhMucDieuTriDTO(String maDanhMuc, String tenDanhMuc) {
        this.maDanhMuc = maDanhMuc;
        this.tenDanhMuc = tenDanhMuc;
    }
    public void setMaDanhMuc(String maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }
    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }
}
