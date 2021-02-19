package garage;

public class Car extends Vehicle {
	int numberOfPassengers;
	boolean electric;

	public Car(int id, String make, String colour, int numberOfPassengers, boolean electric) {
		super(id, make, colour);
		this.numberOfPassengers = numberOfPassengers;
		this.electric = electric;
	}

	@Override
	public void refuel() {
		if (electric) {
			System.out.println("Charging...");
		} else {
			System.out.println("Refuelling...");
		}
	}

}
