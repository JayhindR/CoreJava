package com.jay.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class CollectionUtils {

	public static <E> void print(Collection<E> c) {
		if (c != null && c.size() > 0) {
			Iterator<E> it = c.iterator();

			while (it.hasNext()) {
				E e = it.next();
				System.out.print(e + " ");
			}
		} else {
			System.out.println("Collection is empty or null.");
			
		}
	}

	public static <K, V> void printMap(Map<K, V> map) {
		if (map != null && map.size() > 0) {
			Iterator<K> it = map.keySet().iterator();
			while (it.hasNext()) {
				K key = it.next();
				System.out.println(key + " \t: " + map.get(key));
			}
		}
	}
}
