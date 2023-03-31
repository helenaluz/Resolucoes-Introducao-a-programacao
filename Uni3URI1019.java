import java.util.Scanner;

/*Read an integer value, which is the duration in seconds of a certain event in a factory, and inform it expressed in hours:
 * minutes:seconds.
 

Input
The input file contains an integer N.

Output
Print the read time in the input file (seconds) converted in hours:minutes:seconds like the following example.*/

public class Uni3URI1019{
	public static void  main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int s=N%60;
		int x=N/60;
		int m=x%60;
		int h=x/60;
		System.out.println(h+":"+m+":"+s);
		scanner.close();
		
		
		
	}
}