package phone;

public class PhoneInfo {
    
    private String 이름 = "";
    private String 전화번호 = "";
    
    
    public String get이름() {
        return 이름;
    }
    public void set이름(String 이름) {
        this.이름 = 이름;
    }
    public String get전화번호() {
        return 전화번호;
    }
    public void set전화번호(String 전화번호) {
        this.전화번호 = 전화번호;
    }
    
    
    @Override
    public String toString() {
        return "PhoneInfo [이름=" + 이름 + ", 전화번호=" + 전화번호 + "]";
    }
    
    
    public PhoneInfo() {
        super();
    }
    
      
}
