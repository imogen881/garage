package garage;

public class Runner {

	public static void main(String[] args) {
		Car car1 = new Car(957, "BMW", "Silver", 5, false);
		Motorbike motorbike1 = new Motorbike(204, "Honda", "Blue", false);
		Lorry lorry1 = new Lorry(43, "Volvo", "Grey", "Food");
		Car car2 = new Car(962, "Toyota", "Black", 8, false);

		Garage garage = new Garage();

		garage.add(car1);
		garage.fixVehicle(car1);
		garage.add(motorbike1);
		garage.add(lorry1);
		garage.add(car2);
		garage.removeByType("car");
		garage.print();

	}

}
