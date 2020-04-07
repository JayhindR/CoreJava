package com.jay.comparator;

import java.util.Comparator;

/**
 * 
 * @author jayrajpo
 *
 */
public class StudentNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getStudentName().compareTo(s2.getStudentName());
	}

}
