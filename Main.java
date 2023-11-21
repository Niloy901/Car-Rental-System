package MyCar;

public class Main {

	 public static void main(String[] args) {
	        CarRentalSystem rentalSystem = new CarRentalSystem();

	        Car car1 = new Car("C901", "telca", "Cybercar1", 800.0); 
	        Car car2 = new Car("C902", "Toyota", "victs", 500.0);
	        Car car3 = new Car("C903", "Bmw", "2020 model", 1000.0);
	        rentalSystem.addCar(car1);
	        rentalSystem.addCar(car2);
	        rentalSystem.addCar(car3);

	        rentalSystem.menu();
	    }
	
}
