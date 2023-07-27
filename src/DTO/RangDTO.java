package DTO;
public class RangDTO {
    private String maRang;
    private String tenRang;
    private int vungRang;
    private int soRang;

    public RangDTO(String maRang, String tenRang, int vungRang, int soRang) {
        this.maRang = maRang;
        this.tenRang = tenRang;
        this.vungRang = vungRang;
        this.soRang = soRang;
    }

    public String getMaRang() {
        return maRang;
    }
    public int getSoRang() {
        return soRang;
    }
    public String getTenRang() {
        return tenRang;
    }
    public int getVungRang() {
        return vungRang;
    }
    public void setMaRang(String maRang) {
        this.maRang = maRang;
    }
    public void setSoRang(int soRang) {
        this.soRang = soRang;
    }
    public void setTenRang(String tenRang) {
        this.tenRang = tenRang;
    }
    public void setVungRang(int vungRang) {
        this.vungRang = vungRang;
    }
}
