package com.set;

import java.util.Set;

public class AmeerpetTechnologies {
	private Set<Integer> StudentRollNumbers;

	public Set<Integer> getStudentRollNumbers() {
		return StudentRollNumbers;
	}

	public void setStudentRollNumbers(Set<Integer> studentRollNumbers) {
		StudentRollNumbers = studentRollNumbers;
	}

	public AmeerpetTechnologies() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AmeerpetTechnologies(Set<Integer> studentRollNumbers) {
		super();
		StudentRollNumbers = studentRollNumbers;
	}
	public void print()
	{
		System.out.println(StudentRollNumbers);
	}
	

}
