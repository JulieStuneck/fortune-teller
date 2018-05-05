import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// input from user
		System.out.println("Please enter your first name:");
		String firstName = input.next();

		System.out.println("Thanks. Now enter your last name:");
		String lastName = input.next();

		System.out.println("How old are you?");
		int age = input.nextInt();

		System.out.println("Now enter the month you were born as a number.");
		System.out.println("  (i.e. January = 1 or August = 8)");
		int birthMonth = input.nextInt();

		System.out.println("What is your favorite ROYGBIV color?");
		System.out.println("   (Hint: type \"help\" if you do not remember what ROYGBIV stands for.");
		String favColor = input.next();

		if (favColor.equalsIgnoreCase("help")) {
			System.out.println(
					" R = Red\n O = Orange\n Y = Yellow\n G = Green\n B = Blue\n I = Indigo\n V = Violet\nWhich one is your favorite?");
			favColor = input.next();
		}

		System.out.println("Tell me how many siblings you have.");
		int siblings = input.nextInt();

		// Value of conditions

		int retireYears = 0;
		if ((age % 2) == 0) {
			retireYears = 20;
		} else {
			retireYears = 2;
		}

		System.out.println("test print age" + retireYears);// Julie delete

		String vacaHome = "Hawaii";
		if (siblings < 1) {
			vacaHome = "Akron, Ohio";
		} else if (siblings == 1) {
			vacaHome = "Kelly's Island";
		} else if (siblings == 2) {
			vacaHome = "Outer Banks";
		} else if (siblings == 3) {
			vacaHome = "Key West";
		} else {
			vacaHome = "Hawaii";
		}

		System.out.println("test print siblings" + vacaHome);// Julie delete
		
		String trans = "mode";
		if (favColor.equalsIgnoreCase("red")) {
			trans = "horse & buggy";
		}

		input.close();
	}

}
