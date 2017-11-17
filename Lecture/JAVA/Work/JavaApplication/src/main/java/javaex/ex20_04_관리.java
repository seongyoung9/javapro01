package javaex;

public class ex20_04_관리 {
    
    private String 이름   = "";
    private String 주소   = "";
    private String 전화번호 = "";
    
    // ------------------------------------------------------------------
    
    public String get이름() {
        return 이름;
    }
    
    public void set이름(String 이름) {
        this.이름 = 이름;
    }
    
    public String get주소() {
        return 주소;
    }
    
    public void set주소(String 주소) {
        this.주소 = 주소;
    }
    
    public String get전화번호() {
        return 전화번호;
    }
    
    public void set전화번호(String 전화번호) {
        this.전화번호 = 전화번호;
    }
    // -----------------------------------------------------------------------
    
    public ex20_04_관리() {
        super();
    }
    
    public ex20_04_관리(String 이름, String 주소, String 전화번호) {
        super();
        this.이름 = 이름;
        this.주소 = 주소;
        this.전화번호 = 전화번호;
    }
    
    // ------------------------------------------------------------------------
    
    @Override
    public String toString() {
        return "ex20_04_관리 [이름=" + 이름 + ", 주소=" + 주소 + ", 전화번호=" + 전화번호 + "]";
    }
    
}
