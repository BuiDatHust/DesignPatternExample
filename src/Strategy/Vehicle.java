package Strategy;

public class Vehicle {
	public String name ;
	public GoAlgorythm goAlgo ;
	
	public void Vehicle(String name) {
		this.name= name ; 
	}
	
	public void setGoAlgo(GoAlgorythm goalgo) {
		goAlgo = goalgo ;
	}
	
	public void go() {
		goAlgo.go();
	}
}
