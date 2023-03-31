import java.text.DecimalFormat;
import java.util.Scanner;

/*Read 3 floating-point numbers. After, print the roots of bhaskara’s formula. If it's impossible to calculate the roots because a 
division by zero or a square root of a negative number, presents the message “Impossivel calcular”.

Input
Read 3 floating-point numbers (double) A, B and C.

Output
Print the result with 5 digits after the decimal point or the message if it is impossible to calculate.*/

public class Uni3URI1036{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.00000");
		
		double A = scanner.nextDouble();
		double B = scanner.nextDouble();
		double C = scanner.nextDouble();
		
		double delta= Math.pow(B,2)-(4*A*C);
		
		if(delta<0 || A==0) {
			System.out.println("Impossivel calcular");}
		else {
		double x1 = ((-B+Math.sqrt(delta))/2*A);
		double x2 = ((-B-Math.sqrt(delta))/2*A);
		
		System.out.println("R1 = "+decimal.format(x1));
		System.out.println("R2 = "+decimal.format(x2));}
		
		scanner.close();
	}
}