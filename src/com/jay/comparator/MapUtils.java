package com.jay.comparator;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import com.jay.collections.CollectionUtils;

public class MapUtils {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 1);
		map.put("B", 156);
		map.put("C", 200);
		map.put("L", 30);
		map.put("G", 50);
		map.put("H", 60);
		map.put("D", 90);
		System.out.println("**************** Before Sorting ****************");
		printMap(map);
		System.out
				.println("**************** After Sort by value ****************");
		printMap(sortByValueMap(map));
		
		System.out.println("**************** Before Sorting Using Generics ****************");
		CollectionUtils.printMap(map);
		System.out
				.println("**************** After Sort by value Using Generics ****************");
		CollectionUtils.printMap(sortByValueMapGeneric(map));
		
		Map<Integer, String	> map2 = new HashMap<>();
		map2.put(1, "Jay");
		map2.put(2, "Vijay");
		map2.put(3, "Mohit");
		map2.put(6, "Ajay");
		map2.put(8, "Rajesh");
		map2.put(24, "Harishchandra");
		map2.put(23, "Ratnesh");
		map2.put(5, "Chanchal");
		System.out.println("**************** Before Sorting Using Generics ****************");
		CollectionUtils.printMap(map2);
		System.out
				.println("**************** After Sort by value Using Generics ****************");
		CollectionUtils.printMap(sortByValueMapGeneric(map2));
		
		Map<Integer, Employee> map3 = new HashMap<>();
		map3.put(11, new Employee("Jayhind", 101));
		map3.put(12, new Employee("Mohit", 103));
		map3.put(13, new Employee("Kamlakant", 105));
		map3.put(14, new Employee("Vijay", 102));
		map3.put(15, new Employee("Shambhu", 115));
		map3.put(16, new Employee("Ankit", 108));
		map3.put(18, new Employee("Chanchal", 109));
		
		System.out.println("**************** Before Sorting Using Generics ****************");
		CollectionUtils.printMap(map3);
		System.out
				.println("**************** After Sort by value Using Generics ****************");
		
		//Using generic sort by value.
		CollectionUtils.printMap(sortByValueMapGeneric(map3));
	}

	public static Map<String, Integer> sortByValueMap(Map<String, Integer> map) {
		TreeMap<String, Integer> res = new TreeMap<String, Integer>(
				new ValueComparator(map));
		res.putAll(map);
		return res;
	}

	public static void printMap(Map<String, Integer> map) {

		Iterator<String> it = map.keySet().iterator();

		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key + " \t " + map.get(key));
		}
	}

//	public static <K, V> void printMapGeneric(Map<K, V> map) {
//		Iterator<K> it = map.keySet().iterator();
//		while (it.hasNext()) {
//			K key = it.next();
//			System.out.println(key + " \t " + map.get(key));
//		}
//	}

	public static <K, V extends Comparable<V>> Map<K, V> sortByValueMapGeneric(
			Map<K, V> map) {
		TreeMap<K, V> res = new TreeMap<>(new GenericValueComparator<>(map));
		res.putAll(map);
		return res;
	}
}

class ValueComparator implements Comparator<String> {
	Map<String, Integer> map = null;

	public ValueComparator(Map<String, Integer> map) {
		this.map = map;
	}

	@Override
	public int compare(String s1, String s2) {
		return map.get(s1).compareTo(map.get(s2));
	}
}
// Generic Comparator
class GenericValueComparator<K, V extends Comparable<V>> implements Comparator<K> {
	Map<K, V> map = null;

	public GenericValueComparator(Map<K, V> map) {
		this.map = map;
	}

	@Override
	public int compare(K s1, K s2) {
		return map.get(s1).compareTo(map.get(s2));
	}
}


class Employee implements Comparable<Employee> {
	private String empName;
	private int empId;
	
	@Override
	public int compareTo(Employee arg0) {
//		return this.getEmpName().compareTo(arg0.getEmpName());
		return Integer.valueOf(this.getEmpId()).compareTo(Integer.valueOf(arg0.getEmpId()));
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + " empName=" + empName + "]";
	}

	public Employee(String empName, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	
}
