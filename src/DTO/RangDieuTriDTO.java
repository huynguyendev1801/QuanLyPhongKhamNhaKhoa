package DTO;
public class RangDieuTriDTO {
    private String maRangDieuTri;
    private String maKeHoach;
    private String maRang;
    private String maBeMatRang;

    public RangDieuTriDTO(String maRangDieuTri, String maKeHoach, String maRang, String maBeMatRang) {
        this.maRangDieuTri = maRangDieuTri;
        this.maKeHoach = maKeHoach;
        this.maRang = maRang;
        this.maBeMatRang = maBeMatRang;
    }

    public String getMaBeMatRang() {
        return maBeMatRang;
    }
    public String getMaKeHoach() {
        return maKeHoach;
    }
    public String getMaRang() {
        return maRang;
    }
    public String getMaRangDieuTri() {
        return maRangDieuTri;
    }
    public void setMaBeMatRang(String maBeMatRang) {
        this.maBeMatRang = maBeMatRang;
    }
    public void setMaKeHoach(String maKeHoach) {
        this.maKeHoach = maKeHoach;
    }
    public void setMaRang(String maRang) {
        this.maRang = maRang;
    }
    public void setMaRangDieuTri(String maRangDieuTri) {
        this.maRangDieuTri = maRangDieuTri;
    }
    
}
