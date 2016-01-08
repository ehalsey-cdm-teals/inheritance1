package inheritance1;
public class TestInheritance {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle(2015);
		Vehicle v2 = new Car(2014);
		Vehicle v3 = new SUV(2015, true);
		// Car c = new Vehicle(); //car is more specific than vehicle
		// SUV suv = new Vehicle(); //suv is more specific than vehicle
		// SUV suv = new Car(); //suv is more specific than car
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);

		Vehicle v4 = v1;

		System.out.println(v1 == v4);
		System.out.println("v3 year=" + v3.get_year());
		System.out.println("v4 year=" + v4.get_year());
		if (v3 instanceof SUV) {
			SUV tempSUV = (SUV) v3;
			if (tempSUV.is_isFourWheelDrive()) {
				System.out.println("v3 is four wheel drive");
			} else {
				System.out.println("v3 is four wheel drive");
			}
		}
		
		v3.moveForward();  //if on dirt or pavement move forward
	}
}
