package com.jay.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentComparator implements Comparator<Student> {
private List<Comparator<Student>> comps = null;

	@SafeVarargs
	public StudentComparator(Comparator<Student> ...comps) {
		this.comps = Arrays.asList(comps);
	}
	

    public int compare(Student	s1 , Student s2) {
        for (Comparator<Student> c : this.comps) {
            int result = c.compare(s1, s2);
            if (result != 0) {
                return result;
            }
        }
        return 0;
    }

}
