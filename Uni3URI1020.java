import java.util.Scanner;

/*Read an integer value corresponding to a person's age (in days) and print it in years, months and days, followed by its respective
message “ano(s)”, “mes(es)”, “dia(s)”.

Note: only to facilitate the calculation, consider the whole year with 365 days and 30 days every month. In the cases of test there
will never be a situation that allows 12 months and some days, like 360, 363 or 364. This is just an exercise for the purpose of 
testing simple mathematical reasoning.

Input
The input file contains 1 integer value.

Output
Print the output, like the following example.*/

public class Uni3URI1020{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int days = scanner.nextInt();
		
		int years = days/365;
		days %= 365;
		int months = days/30;
		int day = days%30;
		
		System.out.println(years+" anos(s)");
		System.out.println(months+" mes(es)");
		System.out.println(day+" dia(a)");
		
		scanner.close();
	}
}