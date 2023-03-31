/*In this problem, the task is to read a code of a product 1, the number of units of product 1, the price for one unit of product 1, 
 * the code of a product 2, the number of units of product 2 and the price for one unit of product 2. After this, calculate and show 
 * the amount to be paid.
 

Input
The input file contains two lines of data. In each line there will be 3 values: two integers and a floating value with 2 digits after 
the decimal point.

Output
The output file must be a message like the following example where "Valor a pagar" means Value to Pay. Remember the space after ":" and
 after "R$" symbol. The value must be presented with 2 digits after the point.*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3URI1010{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat Decimal = new DecimalFormat("0.00");
		
		//int code1 = scanner.nextInt();
		int units1 = scanner.nextInt();
		double price1 = scanner.nextDouble();
		//int code2 = scanner.nextInt();
		int units2 = scanner.nextInt();
		double price2 = scanner.nextDouble();
		
		double  total1 = units1*price1;
		double  total2 = units2*price2;
		double TotalFinal= total1+total2;
		
		System.out.println("Valor a pagar: R$"+ Decimal.format(TotalFinal));
		scanner.close();
	}
}