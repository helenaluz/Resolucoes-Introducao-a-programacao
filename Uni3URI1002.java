import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3URI1002{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.0000");
		double π = 3.14159;
		double R = scanner.nextDouble();
	    double A = Math.pow(R, 2)* π;
	    System.out.println("A = "+decimal.format(A));
	    scanner.close();
	}
}