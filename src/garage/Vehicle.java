package garage;

public abstract class Vehicle {
	private int id;
	private String make;
	private String colour;

	public Vehicle(int id, String make, String colour) {
		this.id = id;
		this.make = make;
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", make=" + make + ", colour=" + colour + "]";
	}

	public String print() {
		return colour + " " + make + " with id of " + id;
	}

	public void drive() {
		System.out.println("driving...");
	}

	public abstract void refuel();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
