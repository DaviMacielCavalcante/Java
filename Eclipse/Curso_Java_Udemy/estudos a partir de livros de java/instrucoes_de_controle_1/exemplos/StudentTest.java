package exemplos;

import exemplos.entities.Student;

public class StudentTest {

	public static void main(String[] args) {

		Student acc1 = new Student("Jane Green", 93.5);
		Student acc2 = new Student("John Blue", 72.75);
		
		System.out.printf("%s's letter grade is: %s%n", acc1.getName(), acc1.getLetterGrade());
		System.out.printf("%s's letter grade is: %s%n", acc2.getName(), acc2.getLetterGrade());

	
	}

}
