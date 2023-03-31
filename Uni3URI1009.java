/*Make a program that reads a seller's name, his/her fixed salary and the sale's total made by himself/herself in the month (in money). 
 * Considering that this seller receives 15% over all products sold, write the final salary (total) of this seller at the end of the
 *  month , with two decimal places.


- Don’t forget to print the line's end after the result, otherwise you will receive “Presentation Error”.

- Don’t forget the blank spaces.

Input
The input file contains a text (employee's first name), and two double precision values, that are the seller's salary and the 
total value sold by him/her.

Output
Print the seller's total salary, according to the given example.*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3URI1009{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.00");
		//String name = scanner.next();
		double FixedSalary = scanner.nextDouble();
		double Sales = scanner.nextDouble();
		double SalesSalary = Sales*0.15;
		double FinalSalary = SalesSalary + FixedSalary;
		System.out.println("TOTAL = R$ "+decimal.format(FinalSalary));
		scanner.close();
	}
}