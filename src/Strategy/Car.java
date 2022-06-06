package Strategy;

public class Car extends Vehicle {
	public Car(String name) {
		super(name) ;
		this.setGoAlgo(new GoByRidingAlgo());
	}
}
