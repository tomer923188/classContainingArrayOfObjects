import java.util.Scanner;
public class TestSoldier {
	
	//decides who stays for the night based on their height
	public static void whoStaysTonight(Soldier soldiers[]) {
		
		if (soldiers[0].getHeight() < soldiers[1].getHeight()) {
			System.out.println(soldiers[0].getName()+" stays tonight");
		}
		
		if (soldiers[soldiers.length-1].getHeight() < soldiers[soldiers.length-2].getHeight())
		{
			System.out.println(soldiers[soldiers.length-1].getName()+" stays tonight");
		}
		
		for (int i=0; i<soldiers.length-1; i++) {
			if (soldiers[i].getHeight() < soldiers[i+1].getHeight() && soldiers[i-1].getHeight() < soldiers[i].getHeight() ) {
				System.out.println(soldiers[i]+" stays tonight");
			}
		}
	}
	
	//gets from the user the soldier's name and height
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Soldier [] soldiers = new Soldier[20];
		double height = 0;
		String name = "";
		for (int i=0; i<20; i++) {
			System.out.print("Enter your name: " );
			name = input.next();
			System.out.print("Enter your height: " );
			height = input.nextDouble();
			
			soldiers[i] = new Soldier(name, height);
			
		whoStaysTonight(soldiers);
		input.close();
		}
	}

}