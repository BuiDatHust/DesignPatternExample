package Observer;

public class User {
	private String name ;
	private String ip ;
	private LoginStatus status ;
	
	public void setName(String name) {
		this.name = name ;
	}
	
	public void setIP(String ip) {
		this.ip = ip ;
	}
	
	public void setStatus(LoginStatus status) {
		this.status = status ;
	}
	
	public String getName() {
		return  this.name ;
	}
	
	public String getIP() {
		return this.ip  ;
	}
	
	public LoginStatus getStatus() {
		return this.status ;
	}
	
	@Override
	public String toString() {
		return "" ;
	}
}
