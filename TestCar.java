import java.util.Scanner;

public class TestCar {
	
	//counts how many red cars there are
	public static void redCars(Car cars[]) {
		int redCounter = 0;
		for (int i=0; i<cars.length; i++) {
			if (cars[i].getColor() == "red") {
				redCounter++;
			}
		}
	}
	
	//goes through all the cars and calculates the average km and returns it
	public static double averageKm(Car cars[]) {
		double totalKm = 0;
		for (int i=0; i<cars.length; i++) {
			totalKm += cars[i].getKm() ;
		}
		double avg = totalKm/cars.length;
		return "The average is: "+avg	;
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
		System.out.println("The car's color is: "+"carColor");
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