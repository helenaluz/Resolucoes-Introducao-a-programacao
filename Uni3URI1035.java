import java.util.Scanner;

/*Read 4 integer values A, B, C and D. Then if B is greater than C and D is greater than A and if the sum of C and D is greater than 
the sum of A and B and if C and D were positives values and if A is even, write the message “Valores aceitos” (Accepted values). 
Otherwise, write the message “Valores nao aceitos” (Values not accepted).

Input
Four integer numbers A, B, C and D.

Output
Show the corresponding message after the validation of the values​​.*/

public class Uni3URI1035{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int D = scanner.nextInt();
		int soma1 = D+C;
		int soma2 = A+B;
		int resto = A%2;
		
		if(B>C && D>A && soma1>soma2 && C>0 && D>0 && resto==0) {
			System.out.println("Valores aceitos");}
		else {
			System.out.println("Valores nao aceitos");}
		scanner.close();
	}
}