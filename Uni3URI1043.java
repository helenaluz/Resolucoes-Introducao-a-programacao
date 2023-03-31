import java.text.DecimalFormat;
import java.util.Scanner;

/*Read three point floating values (A, B and C) and verify if is possible to make a triangle with them. If it is possible, calculate the 
perimeter of the triangle and print the message:
Perimetro = XX.X
If it is not possible, calculate the area of the trapezium which basis A and B and C as height, and print the message:
Area = XX.X
Input
The input file has tree floating point numbers.
Output
Print the result with one digit after the decimal point.*/

public class Uni3URI1043{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.0");
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		
		if(a + b > c && b + c > a && a + c > b) {
			double per = a+b+c;
			System.out.println("Perimetro = "+decimal.format(per));}
		else {
			double ar = ((a+b)*c)/2;
			System.out.println("Area = "+decimal.format(ar));
		}
	}
}