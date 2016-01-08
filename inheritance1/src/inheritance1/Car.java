package inheritance1;

public class Car extends Vehicle {

	Car(int year) {
		super(year);
	}
	public void moveForward() {
		System.out.println("if on pavement move forward");
	}
}
