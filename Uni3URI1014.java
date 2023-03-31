import java.text.DecimalFormat;
import java.util.Scanner;

/*Calculate a car's average consumption being provided the total distance traveled (in Km) and the spent fuel total (in liters).

Input
The input file contains two values: one integer value X representing the total distance (in Km) and the second one is a floating 
point number Y  representing the spent fuel total, with a digit after the decimal point.

Output
Present a value that represents the average consumption of a car with 3 digits after the decimal point, followed by the message 
"km/l".*/

public class Uni3URI1014{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.000");
		
		int x = scanner.nextInt();
		double y = scanner.nextDouble();
		
		double z = x/y;
		
		System.out.println(decimal.format(z)+ " km/l");
		
		scanner.close();
	}
}