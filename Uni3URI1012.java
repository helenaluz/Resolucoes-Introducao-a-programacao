/*Make a program that reads three floating point values: A, B and C. Then, calculate and show:
a) the area of the rectangled triangle that has base A and height C.
b) the area of the radius's circle C. (pi = 3.14159)
c) the area of the trapezium which has A and B by base, and C by height.
d) the area of ​​the square that has side B.
e) the area of the rectangle that has sides A and B.

Input
The input file contains three double values with one digit after the decimal point.

Output
The output file must contain 5 lines of data. Each line corresponds to one of the areas described above, always with a corresponding 
message (in Portuguese) and one space between the two points and the value. The value calculated must be presented with 3 digits after 
the decimal point.*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3URI1012{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.000");
		
		
		double A = scanner.nextDouble();
		double B = scanner.nextDouble();
		double C = scanner.nextDouble();
		
		double tri = (A*C)/2;
		double cir = Math.pow(C, 2)*3.14159;
		double trap = ((A+B)*C)/2;
		double quad = Math.pow(B,2);
		double ret = A*B;
		
		System.out.println("TRIANGULO: "+decimal.format(tri));
		System.out.println("CIRCULO: "+decimal.format(cir));
		System.out.println("TRAPÉZIO: "+decimal.format(trap));
		System.out.println("QUADRDO: "+decimal.format(quad));
		System.out.println("RETAGULO: "+decimal.format(ret));
		
		scanner.close();
	}
}