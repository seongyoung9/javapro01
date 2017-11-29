package board.model;

public class ModelRecommend {
	
	private String  userid    = ""  ;    //`userid` VARCHAR(50) NOT NULL,
	private Integer articleno = null;    //`articleno` INT(11) NOT NULL,
	private Boolean good      = null;    //`good` TINYINT(1) NULL DEFAULT '0',
	private Boolean bad       = null;    //`bad` TINYINT(1) NULL DEFAULT '0',
	
	
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public Integer getArticleno() {
		return articleno;
	}
	public void setArticleno(Integer articleno) {
		this.articleno = articleno;
	}
	public Boolean getGood() {
		return good;
	}
	public void setGood(Boolean good) {
		this.good = good;
	}
	public Boolean getBad() {
		return bad;
	}
	public void setBad(Boolean bad) {
		this.bad = bad;
	}
	
	
	@Override
	public String toString() {
		return "ModelRecommend [userid=" + userid + ", articleno=" + articleno + ", good=" + good + ", bad=" + bad
				+ "]";
	}
	
	public ModelRecommend() {
		super();
	}
	
	

}
