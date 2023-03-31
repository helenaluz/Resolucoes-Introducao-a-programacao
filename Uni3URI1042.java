import java.util.Arrays;
import java.util.Scanner;

/*Read three integers and sort them in ascending order. After, print these values in ascending order, a blank line and then the values 
in the sequence as they were readed.

Input
The input contains three integer numbers.

Output
Present the output as requested above.*/

public class Uni3URI1042{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numbers [] = new int[3];
		int originals [] = new int[3];
		
		for(int i=0; i<3; i++) {
			numbers[i] = scanner.nextInt();}
		
		for(int i =0;i<3;i++) {
			originals[i]=numbers[i];}
		
		Arrays.sort(numbers);
		for(int i=0; i<3; i++) {
			System.out.println(numbers[i]);}
		
		System.out.println();
		
		for(int i=0; i<3; i++) {
			System.out.println(originals[i]);}
		
		scanner.close();}}