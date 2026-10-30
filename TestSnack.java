import java.util.Scanner;

public class TestSnack {

	//goes through S and sorts the rank in a new array based on how many of the item there is
	public static int[] testSnackTask2(Snack S[]) {
		int[] t = new int[5];
		for (int i=0; i<S.length; i++) {
			t[S[i].getRank() - 1]++;
			}
		return t;
		}
	
	//calculates the average price of items between 15 and 20 grams and rank equals to n
	public static double testSnackTask3(Snack S[], int n) {
		double totalPrice = 0;
		int rankEqualsN = 0;
		for (int i=0; i<S.length; i++) {
			if(S[i].getWeight() >= 15 && S[i].getWeight() <= 20 && S[i].getRank() == n) {
				totalPrice += S[i].getPrice();
				rankEqualsN++;
			}
			}
		if (rankEqualsN == 0) {
			return 0;
		}
		double avg = totalPrice/rankEqualsN;
		return avg;
	}
	
	//prints the name of items that cost less than price
	public static void testSnackTask4(Snack S[],double price) {
		for (int i=0; i<S.length; i++) {
			if (S[i].getPrice() < price) {
				System.out.println(S[i].getName());
			}
			}
	}
	
	//goes through the array and if the current snack it is on has the same weight as other it prints out it's name
	public static void testSnackTask5(Snack S[],Snack other) {
		for (int i=0; i<S.length; i++) {
			if (S[i].isTheSameKg(other)) {
				System.out.println(S[i].getName());
			}
			}
	}

	//using all the functions I created and stuff
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Snack [] snacks = new Snack[200];
		int weight = 0;
		double price = 0;
		int rank = 0;
		String name = "";
		for (int i=0; i<snacks.length; i++) {
			System.out.print("Enter the snack's name: ");
			name = input.next();
			System.out.print("Enter the snack's weight: ");
			weight = input.nextInt();
			System.out.print("Enter the snack's price ");
			price = input.nextDouble();
			System.out.print("Enter the snack's rank ");
			rank = input.nextInt();
			snacks[i] = new Snack(name, weight, price, rank);
		}
		input.close();
		
	    // Task 2
	    int[] result = testSnackTask2(snacks);

	    // Task 3
	    System.out.println(testSnackTask3(snacks, 3));

	    // Task 4
	    testSnackTask4(snacks, 10.0);

	    // Task 5
	    Snack other = new Snack("Other", 20, 5.0, 3);
	    testSnackTask5(snacks, other);
}
}
