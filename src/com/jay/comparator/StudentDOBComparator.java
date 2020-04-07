/**
 * 
 */
package com.jay.comparator;

import java.util.Comparator;

/**
 * @author jayrajpo
 *
 */
public class StudentDOBComparator implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		return s1.getDob().compareTo(s2.getDob());
	}

}
