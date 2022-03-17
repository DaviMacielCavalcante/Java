package entities;

import java.util.Objects;

public class StudentsLog implements Comparable<StudentsLog>{

	private Integer registration;

	public StudentsLog(Integer registration) {
		
		this.registration = registration;
	}

	public Integer getRegistration() {
		return registration;
	}

	public void setRegistration(Integer registration) {
		this.registration = registration;
	}

	@Override
	public int hashCode() {
		return Objects.hash(registration);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentsLog other = (StudentsLog) obj;
		return Objects.equals(registration, other.registration);
	}

	@Override
	public int compareTo(StudentsLog o) {		
		return registration.compareTo(o.getRegistration());
	}

	
	
	
	
}
