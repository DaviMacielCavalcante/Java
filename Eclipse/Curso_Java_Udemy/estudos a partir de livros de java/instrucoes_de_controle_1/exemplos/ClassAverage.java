package exemplos;

import java.util.Scanner;

public class ClassAverage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		int gradeCounter = 1;
		
		while (gradeCounter <= 10) {
			System.out.print("Enter grade: ");
			int grade = sc.nextInt();
			total = total + grade;
			gradeCounter = gradeCounter + 1; 
		}
		
		int average = total /10;
		
		System.out.printf("%nTotal of all grades is %d%n", total);
		System.out.printf("Class average is %d%n", average);
		
		sc.close();
	}

}
