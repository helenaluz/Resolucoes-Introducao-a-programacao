import java.util.Scanner;

/*Make a program that reads 3 integer values and present the greatest one followed by the message "eh o maior". Use the following 
formula: (a+b+abs(a-b)))/2

Input
The input file contains 3 integer values.

Output
Print the greatest of these three values followed by a space and the message “eh o maior”.*/

public class Uni3URI1013{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		int maxAB = (A+B+Math.abs(A-B))/2;
		int maior = (maxAB+C+Math.abs(maxAB-C))/2;
		
		System.out.println(maior+ " eh o maior");
		
		scanner.close();
	}
	
}