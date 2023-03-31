import java.text.DecimalFormat;
import java.util.Scanner;

/*Using the following table, write a program that reads a code and the amount of an item. After, print the value to pay. This is a very simple program with 
 * the only intention of practice of selection commands.
Input
The input file contains two integer numbers X and Y. X is the product code and Y is the quantity of this item according to the above table.

Output
The output must be a message "Total: R$ " followed by the total value to be paid, with 2 digits after the decimal point*/

public class Uni3URI1038{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.00");
		
		int X = scanner.nextInt();
		int Y = scanner.nextInt();
		double total = 0;
		
		switch(X) {
		case 1: total=Y*4; break;
		case 2: total=Y*4.5; break;
		case 3: total=Y*5; break;
		case 4: total=Y*2; break;
		case 5: total=Y*1.5; break;}
		
		System.out.println("Total R$"+decimal.format(total));
		
		scanner.close();
	}
}