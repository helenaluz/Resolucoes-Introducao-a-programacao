import java.text.DecimalFormat;
import java.util.Scanner;

/*Write a program that reads an employee's number, his/her worked hours number in a month and the amount he received per hour.
 *  Print the employee's number and salary that he/she will receive at end of the month, with two decimal places.

Don’t forget to print the line's end after the result, otherwise you will receive “Presentation Error”.
Don’t forget the space before and after the equal signal and after the U$.
Input
The input file contains 2 integer numbers and 1 value of floating point, representing the number, worked hours amount and the 
amount the employee receives per worked hour.

Output
Print the number and the employee's salary, according to the given example, with a blank space before and after the equal signal.*/
public class Uni3URI1008{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.00");
		int number = scanner.nextInt();
		int hours = scanner.nextInt();
		double amountPerHour = scanner.nextDouble();
		double salary = hours * amountPerHour;
		System.out.println("NUMBER = "+number);
		System.out.println("SALARY = U$ "+decimal.format(salary));
		scanner.close();
	}
}