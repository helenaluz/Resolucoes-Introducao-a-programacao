import java.util.Scanner;

/*Read the start time and end time of a game, in hours. Then calculate the duration of the game, knowing that the game can begin in a 
day and finish in another day, with a maximum duration of 24 hours. The message must be printed in portuguese “O JOGO DUROU X HORA(S)”
that means “THE GAME LASTED X HOUR(S)”

Input
Two integer numbers representing the start and end time of a game.

Output
Print the duration of the game as in the sample output.*/

public class Uni3URI1046{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int begin = scanner.nextInt();
		int end = scanner.nextInt();
		int time;
		if(begin>end) {
			time = 24-(begin-end);}
		else if(begin<end) {
			time = end-begin;}
		else {
			time = 24;}
		
		System.out.println("O JOGO DUROU "+ time +" HORA(S)");
		scanner.close();
	}
}