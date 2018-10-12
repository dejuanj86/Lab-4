
import java.util.Scanner;

public class TableOfPowers{

	public static void main(String[] args) {

		System.out.println("Welcome to the Squares and Cubes Table");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		String question = "y";
		

		 do {
			// get the input from the user
			System.out.println("Enter an Integer: ");
			int userInteger = sc.nextInt();

			System.out.printf("%-10s %-10s %-10s", "Number", "Squared", "Cubed");
			System.out.printf("\n%-10s %-10s %-10s", "======", "======", "======");

			for (int i = 1; i <= userInteger; i++) {
				//i = userInteger;
				int numSquared = i * i;
				int numCubed = i * i * i;

				System.out.printf("\n%-10s %-10s %-10s", i, numSquared, numCubed);

				System.out.println();
			}

			
			// see if the user wants to continue
			System.out.println("Would you like to continue?: ");
			sc.nextLine();
			question = sc.nextLine();
		} while (question.equalsIgnoreCase ("y"));
	     
	      System.out.println("Bye!");
	}
}


