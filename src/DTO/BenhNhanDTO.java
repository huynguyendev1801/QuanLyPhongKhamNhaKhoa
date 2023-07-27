package DTO;
public class BenhNhanDTO {
    private String maBenhNhan;
    private String tenBenhNhan;
    private int tuoi;
    private String gioiTinh;
    private String sucKhoeRangMieng;


    public BenhNhanDTO(String maBenhNhan, String tenBenhNhan, int tuoi, String gioiTinh, String sucKhoeRangMieng) {
        this.maBenhNhan = maBenhNhan;
        this.tenBenhNhan = tenBenhNhan;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.sucKhoeRangMieng = sucKhoeRangMieng;
    }

    public BenhNhanDTO() {
    }

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
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

    public String getSucKhoeRangMieng() {
        return sucKhoeRangMieng;
    }

    public void setSucKhoeRangMieng(String sucKhoeRangMieng) {
        this.sucKhoeRangMieng = sucKhoeRangMieng;
    }
}
