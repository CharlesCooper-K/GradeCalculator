import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		// declare and initialize variables
		Scanner input = new Scanner(System.in);
		int numGrade;
		String letterGrade = "";
		
		// ask user for their grade
		System.out.print("Enter your grade: ");
		numGrade = input.nextInt();
		
		// check numGrade to get letterGrade
		if (numGrade >= 90 && numGrade <= 100) {
			letterGrade = "A";
		} else if (numGrade >= 80 && numGrade <= 89) {
			letterGrade = "B";
		} else if (numGrade >= 70 && numGrade <= 79) {
			letterGrade = "C";
		} else if (numGrade >= 60 && numGrade <= 69) {
			letterGrade = "D";
		} else {
			letterGrade = "F";
		}
		
		// print letter grade
		System.out.printf("Your letter grade for a %d is: %s", numGrade, letterGrade);
	}
}
