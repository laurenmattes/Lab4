import java.util.Scanner;

public class Labs4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String choice;

		System.out.println("Enter an integer: ");
		int userNum = scan.nextInt();

		System.out.println("Number  " + "Squared  " + " Cubed");
		System.out.println("======  " + "=======  " + " ======");

		for (int i = 1; i <= (userNum); i++) {
			if (i <= (userNum))
				System.out.println(i);

		}
		System.out.println("Continue? (y/n)");
		choice = scan.nextLine();

	}

}
