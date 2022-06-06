package Strategy;

public class main {
	public static void main(String[] args) {
		Vehicle Toyota = new Car("Toyota") ;
		Vehicle B52 = new Helicopter("B52") ;
		
		Toyota.go() ;
		B52.go() ;
	}
}
