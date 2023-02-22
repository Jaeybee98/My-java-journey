//import scanner
import java.util.Scanner;

class MethodOverloading {
	public static void main(String[] args) {
		System.out.println("The maximum of 3 and 4 is " + max(3, 4));

		System.out.println("The maximum of 3.0 and 5.4 " + max(3.0, 5.4));

		System.out.println("The maximum of 3.0, 5.4 and 10.14 is " + max(3.0, 5.4, 10.14));
	}

	//Return the max of two int values
	public static int max (int num1, int num2) {
		if (num1 > num2)
			return num1;
		else
			return num2;
	}

	//Return the max of two doubles
	public static double max(double num1, double num2) {
		if (num1 < num2)
			return num1;
		else
			return num2;
	}

	//Return max of three doubles
	public static double max(double num1, double num2, double num3) {
		return max(max(num1, num2), num3);
	}
}
