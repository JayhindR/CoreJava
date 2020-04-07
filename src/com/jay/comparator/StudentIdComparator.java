package com.jay.comparator;

import java.util.Comparator;

import com.jay.enums.Sorting;

public class StudentIdComparator implements Comparator<Student> {

	private Sorting sorting = Sorting.ASCENDING;
	
	@Override
	public int compare(Student s1, Student s2) {
		if(sorting.equals(Sorting.DESCENDING)) {
			return s2.getStudentId().compareTo(s1.getStudentId());	
		}
		return s1.getStudentId().compareTo(s2.getStudentId());
	}
	
public StudentIdComparator() {
	
}

public StudentIdComparator(Sorting sorting) {
	this.sorting = sorting;
}
}
