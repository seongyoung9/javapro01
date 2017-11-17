package lib;

public class book {
    
    private Integer no = null;
    private String 제목 = null;
    private String 출판사 = null;
    private String 장르 = null;
    private String 저자 = null;
    private Integer 가격 = null;
    private String 대여정보 = null;
    
    //----------------------------------------------------------
    
    
    public Integer getNo() {
        return no;
    }
    public void setNo(Integer no) {
        this.no = no;
    }
    public String get제목() {
        return 제목;
    }
    public void set제목(String 제목) {
        this.제목 = 제목;
    }
    public String get출판사() {
        return 출판사;
    }
    public void set출판사(String 출판사) {
        this.출판사 = 출판사;
    }
    public String get장르() {
        return 장르;
    }
    public void set장르(String 장르) {
        this.장르 = 장르;
    }
    public String get저자() {
        return 저자;
    }
    public void set저자(String 저자) {
        this.저자 = 저자;
    }
    public Integer get가격() {
        return 가격;
    }
    public void set가격(Integer 가격) {
        this.가격 = 가격;
    }
    public String get대여정보() {
        return 대여정보;
    }
    public void set대여정보(String 대여정보) {
        this.대여정보 = 대여정보;
    }
    
    //----------------------------------------------------------
    
    
    @Override
    public String toString() {
        return "book [no=" + no + ", 제목=" + 제목 + ", 출판사=" + 출판사 + ", 장르=" + 장르
                + ", 저자=" + 저자 + ", 가격=" + 가격 + ", 대여정보=" + 대여정보 + "]";
    }
    
    //----------------------------------------------------------
    
    
    public book() {
        super();
    }
    public book(Integer no, String 제목, String 출판사, String 장르, String 저자,
            Integer 가격, String 대여정보) {
        super();
        this.no = no;
        this.제목 = 제목;
        this.출판사 = 출판사;
        this.장르 = 장르;
        this.저자 = 저자;
        this.가격 = 가격;
        this.대여정보 = 대여정보;
    }
    
    
}
