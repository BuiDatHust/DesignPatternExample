package Observer;

public class main {
	public static void main(String[] args) {
		AccountService acc1 = createServer("Bui Dat", "127.0.0.1" ) ;
		acc1.login("Bui Dat", "127.0.0.1");
		acc1.changeStatus(LoginStatus.EXPIRED);
		System.out.println("------------");
		AccountService acc2 = createServer("Viet Dat", "127.0.0.1" ) ;
		acc1.login("Bui Hoang", "127.0.0.1");
	}
	
	public static AccountService createServer(String name, String ip) {
		AccountService newAcc = new AccountService(name, ip);
		newAcc.subscribe(new Logger()) ;
		newAcc.subscribe(new Mailer());
		
		return newAcc ;
	}
}
