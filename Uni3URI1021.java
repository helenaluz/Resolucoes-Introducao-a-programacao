/*Read a value of floating point with two decimal places. This represents a monetary value. After this, calculate the smallest
possible number of notes and coins on which the value can be decomposed. The considered notes are of 100, 50, 20, 10, 5, 2. The 
possible coins are of 1, 0.50, 0.25, 0.10, 0.05 and 0.01. Print the message “NOTAS:” followed by the list of notes and the message
“MOEDAS:” followed by the list of coins.

Input
The input file contains a value of floating point N (0 ≤ N ≤ 1000000.00).

Output
Print the minimum quantity of banknotes and coins necessary to change the initial value, as the given example*/

import java.util.Scanner;

public class Uni3URI1021{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual e o valor?");
		
		double valor = scanner.nextDouble();
		
		
		int cem = (int) valor/100;
		valor %= 100;
		int cinquenta = (int) (valor /50);
		valor %= 50;
		int vinte = (int) (valor/20);
		valor %= 20;
		int dez=(int) (valor/10);
		valor %= 10;
		int cinco=(int) (valor/5);
		valor %= 5;
		int dois=(int) (valor/2);
		int um = (int) (valor%2);
		valor%=1;
		int Ccinquenta = (int) (valor/0.50);
		valor %= 0.50;
		int Cvinte = (int) (valor/0.25);
		valor %=0.25;
		int Cdez= (int) (valor/0.10);
		valor %=0.10;
		int Ccinco =(int) (valor/0.05);
		valor %= 0.05;
		int Cum = (int)Math.round(valor/0.01);
	
		
	
		System.out.println("NOTAS:");
		System.out.println(cem+" nota(s) de R$ 100.00");
		System.out.println(cinquenta+" nota(s) de R$ 50.00");
		System.out.println(vinte+" nota(s) de R$ 20.00");
		System.out.println(dez+" nota(s) de R$ 10.00");
		System.out.println(cinco+" nota(s) de R$ 5.00");
		System.out.println(dois+" nota(s) de R$ 2.00");
		
		System.out.println("MOEDAS:");
		System.out.println(um+" moeda(s) de R$ 1.00");
		System.out.println(Ccinquenta+" moeda(s) de R$ 0.50");
		System.out.println(Cvinte+" moeda(s) de R$ 0.25");
		System.out.println(Cdez+" moeda(s) de R$ 0.10");
		System.out.println(Ccinco+" moeda(s) de R$ 0.05");
		System.out.println(Cum+" moeda(s) de R$ 0.01");
		scanner.close();}}