/*In this problem you have to read an integer value and calculate the smallest possible number of banknotes in which the value may be 
 * decomposed. The possible banknotes are 100, 50, 20, 10, 5, 2 e 1. Print the read value and the list of banknotes.
 

Input
The input file contains an integer value N (0 < N < 1000000).

Output
Print the read number and the minimum quantity of each necessary banknotes in Portuguese language, as the given example. Do not forget 
to print the end of line after each line, otherwise you will receive “Presentation Error”.*/

import java.util.Scanner;

public class Uni3URI1018{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual e o valor?");
		double valor = scanner.nextDouble();
		int cem = (int) (valor/100);
		int x = (int) (valor%100);
		int cinquenta = x/50;
		int y=x%50;
		int vinte = y/20;
		int z=y%20;
		int dez=z/10;
		int w=z%10;
		int cinco=w/5;
		int v=w%5;
		int dois=v/2;
		int um=v%2;
		
		System.out.println(cem+" nota(s) de R$ 100,00");
		System.out.println(cinquenta+" nota(s) de R$ 50,00");
		System.out.println(vinte+" nota(s) de R$ 20,00");
		System.out.println(dez+" nota(s) de R$ 10,00");
		System.out.println(cinco+" nota(s) de R$ 5,00");
		System.out.println(dois+" nota(s) de R$ 2,00");
		System.out.println(um+" nota(s) de R$ 1,00");
		
		
		scanner.close();
		
	}
}