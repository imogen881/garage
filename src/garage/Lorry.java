package garage;

public class Lorry extends Vehicle {
	String cargo;

	public Lorry(int id, String make, String colour, String cargo) {
		super(id, make, colour);
		this.cargo = cargo;
	}

	@Override
	public void refuel() {
		System.out.println("Refuelling...");
	}

}
