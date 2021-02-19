package garage;

public class Motorbike extends Vehicle {
	boolean sidecar;

	public Motorbike(int id, String make, String colour, boolean sidecar) {
		super(id, make, colour);
		this.sidecar = sidecar;
	}

	@Override
	public void refuel() {
		System.out.println("Refuelling...");
	}

}
