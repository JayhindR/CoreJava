package com.jay.comparator;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.jay.enums.Sorting;

public class StudentTest {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(1989, Month.JULY, 02);
		Student student = new Student("Jayhind", "1020", date);

		LocalDate date1 = LocalDate.of(1990, Month.AUGUST, 12);
		Student student1 = new Student("Ankit", "1021", date1);

		LocalDate date2 = LocalDate.of(1990, Month.FEBRUARY, 14);
		Student student2 = new Student("Mohit", "1022", date2);
		
		LocalDate date3 = LocalDate.of(1991, Month.JUNE, 12);
		Student student3 = new Student("Shambhu", "1023",
				date3);
		
		LocalDate date4 = LocalDate.of(1988, Month.FEBRUARY, 12);
		Student student4 = new Student("Hari Krishna", "1024", date4);
		
		LocalDate date5 = LocalDate.of(1995, Month.DECEMBER, 30);
		Student student5 = new Student("Suresh", "1025", date5);
		
		LocalDate date6 = LocalDate.of(1993, Month.MARCH, 17);
		Student student6 = new Student("Kamlakant", "1026",date6);
		
		LocalDate date7 = LocalDate.of(1990, Month.FEBRUARY, 12);
		Student student7 = new Student("Pratap", "1027",
				date7);
		LocalDate date10 = LocalDate.of(1990, Month.FEBRUARY, 12);
		Student student10 = new Student("Ramesh", "1030",
				date10);
		
		LocalDate date8 = LocalDate.of(1990, Month.FEBRUARY, 12);
		Student student8 = new Student("Prakash", "1028",
				date8);
		
		LocalDate date9 = LocalDate.of(1990, Month.FEBRUARY, 12);
		Student student9 = new Student("Prakash", "1029",
				date9);
		
		List<Student> students = new ArrayList<Student>();
		students.add(student);
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);
		students.add(student7);
		students.add(student8);
		students.add(student9);
		students.add(student10);
		print("Before Sorting", students);
//		Collections.sort(students, new StudentComparator(new StudentDOBComparator(), new StudentNameComparator(), new StudentIdComparator()));
		
		Collections.sort(students, new GenericComparator<Student>(new StudentDOBComparator(), new StudentNameComparator(), new StudentIdComparator(Sorting.DESCENDING)));
		
		print("After Sorting", students);
	}

	private static void print(String message, List<Student> students) {
		System.out.println("******************" + message
				+ "******************");
		for (Student student : students) {
			System.out.println(student);
		}
	}
}
