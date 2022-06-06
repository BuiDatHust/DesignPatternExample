package Observer;

public class Logger implements Observe {
	
	@Override 
	public void update(User user) {
		System.out.println("Logger: " + user) ;
	}
}
