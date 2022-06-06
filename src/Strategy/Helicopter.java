package Strategy;

public class Helicopter extends Vehicle {
	public Helicopter(String name) {
		super(name) ;
		this.setGoAlgo(new GoByFlyingAlgo());
	}
}
