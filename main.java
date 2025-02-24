import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		double userInput;
		double gradeMin = 0;
		double gradeMax = 0;
		double gradeAvg;
		double gradeSum = 0;
		
		Scanner input = new Scanner(System.in); // create new scanner object
		
		userInput = input.nextDouble();
		gradeMin = userInput;
		
		for (int i = 0; i < 9; ++i) {
			userInput = input.nextDouble();
			
			if (userInput > gradeMax) {
				gradeMax = userInput;
			}
			else if (userInput < gradeMin) {
				gradeMin = userInput;
			}
			gradeSum += userInput;
		}
		gradeAvg = gradeSum / 10;
		
		System.out.println("Average: " + gradeAvg);
		System.out.println("Maximum: " + gradeMax);
		System.out.println("Minimum: " + gradeMin);	
	}
}
