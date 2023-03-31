import java.text.DecimalFormat;
import java.util.Scanner;

/*Read four numbers (N1, N2, N3, N4), which one with 1 digit after the decimal point, corresponding to 4 scores obtained by a student. Calculate the average with weights 
2, 3, 4 e 1 respectively, for these 4 scores and print the message "Media: " (Average), followed by the calculated result. If the average was 7.0 or more, print the
message "Aluno aprovado." (Approved Student). If the average was less than 5.0, print the message: "Aluno reprovado." (Reproved Student). If the average was between
5.0 and 6.9, including these, the program must print the message "Aluno em exame." (In exam student).

In case of exam, read one more score. Print the message "Nota do exame: " (Exam score) followed by the typed score. Recalculate the average (sum the exam score with 
		the previous calculated average and divide by 2) and print the message “Aluno aprovado.” (Approved student) in case of average 5.0 or more) or "Aluno reprovado."
(Reproved student) in case of average 4.9 or less. For these 2 cases (approved or reproved after the exam) print the message "Media final: " (Final average) followed by
the final average for this student in the last line.

Input
The input contains four floating point numbers that represent the students' grades.

Output
Print all the answers with one digit after the decimal point.*/

public class Uni3URI1040{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.0");
		
		double N1 = scanner.nextDouble();
		double N2 = scanner.nextDouble();
		double N3 = scanner.nextDouble();
		double N4 = scanner.nextDouble();
		
		double MEDIA = (N1*2+N2*3+N3*4+N4*1)/10;
		
		System.out.println("Media: "+decimal.format(MEDIA));
		
		if(MEDIA >=7.0) {
			System.out.println("Aluno aprovado.");}
		else if(MEDIA < 5.0) {
			System.out.println("Aluno reprovado.");}
		else {
			System.out.println("Aluno em exame.");
			double N5 = scanner.nextDouble();
			System.out.println("Nota do exame: "+decimal.format(N5));
			double NMedia = (MEDIA+N5)/2;
			
			if(NMedia >=5.0) {
				System.out.println("Aluno aprovado.");}
			else {
				System.out.println("Aluno reprovado.");}
			System.out.println("Media final: "+ decimal.format(NMedia));}
		
		scanner.close();
	}
}