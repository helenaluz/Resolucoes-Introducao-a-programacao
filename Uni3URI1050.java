import java.util.Scanner;

/*Read an integer number that is the code number for phone dialing. Then, print the destination according to the following table:

If the input number isn’t found in the above table, the output must be:
DDD nao cadastrado
That means “DDD not found” in Portuguese language.

Input
The input consists in a unique integer number.

Output
Print the city name corresponding to the input DDD. Print DDD nao cadastrado if doesn't exist corresponding DDD to the typed number.*/

public class Uni3URI1050{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int DDD = scanner.nextInt();
		
		switch(DDD) {
		case 61: System.out.println("Brasilia");break;
		case 71: System.out.println("Salvador");break;
		case 11: System.out.println("Sao Paulo");break;
		case 21: System.out.println("Rio de Janeiro");break;
		case 32: System.out.println("Juiz de Fora");break;
		case 19: System.out.println("Campinas");break;
		case 27: System.out.println("Vitoria");break;
		case 31: System.out.println("Belo Horizonte");break;
		default: System.out.println("DDD nao cadastrado");break;}
		
		scanner.close();
	}
}

