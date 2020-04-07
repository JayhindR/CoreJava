package com.jay.concurrent;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		
//		PriorityQueue<Employee1> emps = new PriorityQueue<Employee1>(5);
		// Providing comparator
//		PriorityQueue<Employee1> emps = new PriorityQueue<Employee1>(5, new EmpComparator());
		
		// Providing Lambda Functions
		PriorityQueue<Employee1> emps = new PriorityQueue<Employee1>(5, (Employee1 e1, Employee1 e2) -> {return Double.valueOf(e1.getSalary()).compareTo(Double.valueOf(e2.getSalary())); });
		emps.add(new Employee1(1, "Jayhind", 120000.0, 1));
		emps.add(new Employee1(2, "Rajendra", 220000.0, 6));
		emps.add(new Employee1(6, "Mohit", 3012012000.0, 5));
		emps.add(new Employee1(3, "Ganesh", 12450.0, 3));
		emps.add(new Employee1(5, "Ankit", 120512.0, 5));
		emps.add(new Employee1(4, "Ramesh", 120.0, 2));
//		
		
		System.out.println(emps.poll());
		System.out.println(emps.poll());
		System.out.println(emps.poll());
		emps.add(new Employee1(8, "Ram Prakash", 20.0, 3));
		System.out.println(emps.poll());
		System.out.println(emps.poll());
		System.out.println(emps.poll());
		System.out.println(emps.poll());
		
		
		// PriorityBlockingQueue
		PriorityBlockingQueue<Employee1> emps1 = new PriorityBlockingQueue<Employee1>(5, (Employee1 e1, Employee1 e2) -> {return Double.valueOf(e1.getSalary()).compareTo(Double.valueOf(e2.getSalary())); });
		emps1.add(new Employee1(1, "Jayhind", 120000.0, 1));
		emps1.add(new Employee1(2, "Rajendra", 220000.0, 6));
		emps1.add(new Employee1(6, "Mohit", 3012012000.0, 5));
		emps1.add(new Employee1(3, "Ganesh", 12450.0, 3));
		emps1.add(new Employee1(5, "Ankit", 120512.0, 5));
		emps1.add(new Employee1(4, "Ramesh", 120.0, 2));
		
		
		System.out.println(emps1.size());
		
		System.out.println(emps1.poll());
		System.out.println(emps1.poll());
		System.out.println(emps1.poll());
		emps1.add(new Employee1(8, "Ram Prakash", 20.0, 3));
		System.out.println(emps1.poll());
		System.out.println(emps1.poll());
		System.out.println(emps1.poll());
		System.out.println(emps1.poll());
//		CollectionUtils.print(emps);
	}
	
	
	
}

class EmpComparator implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 emp1, Employee1 emp2) {
		return Double.valueOf(emp1.getSalary()).compareTo(Double.valueOf(emp2.getSalary()));
	}
}

class Employee1 {
	private int enmpId;
	private String empName;
	private double salary;
	private int deptId;
	
	public int getEnmpId() {
		return enmpId;
	}

	public void setEnmpId(int enmpId) {
		this.enmpId = enmpId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public Employee1(int enmpId, String empName, double salary, int deptId) {
		super();
		this.enmpId = enmpId;
		this.empName = empName;
		this.salary = salary;
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "Employee1 [enmpId=" + enmpId + ", empName=" + empName
				+ ", salary=" + salary + ", deptId=" + deptId + "]";
	}
	
	
}