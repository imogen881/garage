package garage;

import java.util.ArrayList;

public class Garage {
	ArrayList<Vehicle> vehicles = new ArrayList<>();

	public void print() {
		if (vehicles.isEmpty()) {
			System.out.println("Garage is currently empty");
		} else {
			System.out.println("Garage currently contains: ");
			for (Vehicle v : vehicles) {
				System.out.println(v.print());
			}
		}
	}

	public void add(Vehicle vehicle) {
		vehicles.add(vehicle);
		System.out.println(vehicle.print() + " added to garage");
	}

	public void remove(Vehicle vehicle) {
		Vehicle toRemove = null;
		for (Vehicle v : vehicles) {
			if (v == vehicle) {
				toRemove = v;
			}
		}
		vehicles.remove(toRemove);
	}

	public void removeByType(String vehicle) {
		ArrayList<Vehicle> toRemove = new ArrayList<>();
		for (Vehicle v : vehicles) {
			switch (vehicle.toLowerCase()) {
			case "car":
				if (v instanceof Car) {
					toRemove.add(v);
				}
				break;
			case "motorbike":
				if (v instanceof Motorbike) {
					toRemove.add(v);
				}
				break;
			case "lorry":
				if (v instanceof Lorry) {
					toRemove.add(v);
				}
				break;
			}
		}
		vehicles.removeAll(toRemove);
	}

	public void empty() {
		vehicles.clear();
	}

	public void fixVehicle(Vehicle vehicle) {
		System.out.println(vehicle.print() + " is now fixed, your bill comes to £" + calculateBill(vehicle));
		vehicles.remove(vehicle);
		System.out.println(vehicle.print() + " has been removed from the garage");
	}

	public int calculateBill(Vehicle vehicle) {
		int flatRate = 100;
		int carRate = flatRate * 2;
		int motorbikeRate = flatRate * 3;
		int lorryRate = flatRate * 8;

		if (vehicle instanceof Car) {
			return carRate;
		} else if (vehicle instanceof Motorbike) {
			return motorbikeRate;
		} else {
			return lorryRate;
		}
	}

}
