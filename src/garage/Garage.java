package garage;

import java.util.ArrayList;

public class Garage {
	ArrayList<Vehicle> vehicles = new ArrayList<>();

	public void add(Vehicle vehicle) {
		vehicles.add(vehicle);
		System.out.println(vehicle.print() + " added to garage");
	}

	public void remove(Vehicle vehicle) {
		for (Vehicle v : vehicles) {
			if (v == vehicle) {
				vehicles.remove(v);
				System.out.println(v.print() + " removed from garage");
			}
		}
	}

	public void removeByType(String vehicle) {
		switch (vehicle.toLowerCase()) {
		case "car":
			for (Vehicle car : vehicles) {
				if (car instanceof Car) {
					vehicles.remove(car);
				}
			}
		case "motorbike":
			for (Vehicle motorbike : vehicles) {
				if (motorbike instanceof Motorbike) {
					vehicles.remove(motorbike);
				}
			}
		case "lorry":
			for (Vehicle lorry : vehicles) {
				if (lorry instanceof Lorry) {
					vehicles.remove(lorry);
				}
			}
		}
	}

	public void fixVehicle(Vehicle vehicle) {
		System.out.println(vehicle.print() + " is now fixed, your bill comes to £" + calculateBill(vehicle));
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
