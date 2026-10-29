import java.util.Scanner;

public class TestCar {
	
	//prints the details of cars that have km between 20000 and 40000
	public static void printCarsDetailsIfOver(Car cars[]) {
		for (int i=0; i<cars.length; i++) {
			if (cars[i].getKm() > 20000 && cars[i].getKm() < 40000) {
				System.out.println("Car's type: "+cars[i].getType());
				System.out.println("Car's color: "+cars[i].getColor());
				System.out.println("The car has: "+cars[i].getKm()+" km");
			}
		}
	}
	
	//counts how many red cars there are
	public static double redCars(Car cars[]) {
		int redCounter = 0;
		for (int i=0; i<cars.length; i++) {
			if (cars[i].getColor() == "red") {
				redCounter++;
			}
		}
		return redCounter;
	}
	
	//goes through all the cars and calculates the average km and returns it
	public static void averageKm(Car cars[]) {
		double totalKm = 0;
		for (int i=0; i<cars.length; i++) {
			totalKm += cars[i].getKm() ;
		}
		double avg = totalKm/cars.length;
		System.out.println("The average is: "+avg);
	}
	
	//finds the car with the least km and prints its information
	public static void carWithLeastKm(Car cars[]) {
		double min = 0;
		String carColor = "";
		String carType = "";
		for (int i=0; i<cars.length; i++) {
			if (cars[i].getKm() < cars[i+1].getKm()) {
				min = cars[i].getKm();
				carColor = cars[i].getColor();
				carType = cars[i].getType();
			}
		}
		System.out.println("The car with the least km has: "+min+" on it");
		System.out.println("The car's color is: "+carColor);
		System.out.println("The car's type is: "+carType);
	}
	
	//gets from the user the car's color type and km
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Car [] cars = new Car[30];
		double km = 0;
		String type = "";
		String color = "";
		for (int i=0; i<30; i++) {
			System.out.print("Enter the car type: ");
			type = input.next();
			System.out.print("Enter the car color: ");
			color = input.next();
			System.out.print("Enter how many kms have been driven on the car: ");
			km = input.nextDouble();
			
			cars[i] = new Car(type, color, km);
			
		input.close();
	}

	}
}