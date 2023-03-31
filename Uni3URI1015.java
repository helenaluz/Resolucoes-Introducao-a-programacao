/*Read the four values corresponding to the x and y axes of two points in the plane, p1 (x1, y1) and p2 (x2, y2) and calculate the 
distance between them, showing four decimal places after the comma, according to the formula:

Distance = 

Input
The input file contains two lines of data. The first one contains two double values: x1 y1 and the second one also contains two 
double values with one digit after the decimal point: x2 y2.

Output
Calculate and print the distance value using the provided formula, with 4 digits after the decimal point.*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3URI1015{
	public static void main(String[]  args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimal =new DecimalFormat("0.0000");
		
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		
		double distancia = Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
		
		System.out.println(decimal.format(distancia));
		scanner.close();
	}
}