package designPattern.Proxy;

public class User {
	private String gmail;
	private String pwd;
	
	public User() {}
	
	public User(String gmail, String pwd) {
		super();
		this.gmail = gmail;
		this.pwd = pwd;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
}
