import java.util.Scanner;

/*Read two integer values. After this, calculate the product between them and store the result in a variable named PROD. 
 * Print the result like the example below. Do not forget to print the end of line after the result, otherwise you will 
 * receive “Presentation Error”.

Input
The input file contains 2 integer numbers.

Output
Print the message "PROD" and PROD according to the following example, with a blank space before and after the equal signal.*/
public class Uni3Uri1004{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int PROD = A*B;
		System.out.println("PROD = "+PROD);
		scanner.close();
	}
}