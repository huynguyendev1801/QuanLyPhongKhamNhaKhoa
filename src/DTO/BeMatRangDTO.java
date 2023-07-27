package DTO;
public class BeMatRangDTO {
    private String maBeMatRang;
    private String tenBeMatRang;

    public BeMatRangDTO(String maBeMatRang, String tenBeMatRang) {
        this.maBeMatRang = maBeMatRang;
        this.tenBeMatRang = tenBeMatRang;
    }



    // C�c ph??ng th?c getter v� setter

    // Constructor (c� th? t?o th�m constructor c� tham s? n?u c?n thi?t)
    public String getMaBeMatRang() {
        return maBeMatRang;
    }
    public String getTenBeMatRang() {
        return tenBeMatRang;
    }
    public void setMaBeMatRang(String maBeMatRang) {
        this.maBeMatRang = maBeMatRang;
    }
    public void setTenBeMatRang(String tenBeMatRang) {
        this.tenBeMatRang = tenBeMatRang;
    }
}
