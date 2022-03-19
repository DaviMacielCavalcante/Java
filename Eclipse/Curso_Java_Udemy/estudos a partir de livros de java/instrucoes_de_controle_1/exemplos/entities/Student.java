package exemplos.entities;

public class Student {
	
	private String name;
	private Double average;	
	
	public Student(String name, Double average) {		
		this.name = name;
		if (average > 0.0) {
			if (average < 100.0) {
				this.average = average;
			}
		}		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAverage() {
		return average;
	}

	public void setAverage(Double average) {
		if (average > 0.0) {
			if (average < 100.0) {
				this.average = average;
			}
		}
	}
	
	public String getLetterGrade() {
		
		String letterGrade = "";
		
		if (average >= 90) {
			letterGrade = "A";
		}
		else if (average >= 80) {
			letterGrade = "B";
		}
		else if (average >= 70) {
			letterGrade = "C";
		}
		else if (average >= 60) {
			letterGrade = "D";
		}
		else {
			letterGrade = "F";
		}
		return letterGrade;
	}
	

}
