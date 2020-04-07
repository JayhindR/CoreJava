package com.jay.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author jayrajpo
 *
 * @param <T>
 */
public class GenericComparator<T> implements Comparator<T> {
	private List<Comparator<T>> comps = null;

	/**
	 * 
	 * @param s
	 */
	public GenericComparator(Comparator<T> ...s) {
		this.comps = Arrays.asList(s);
	}

	@Override
	public int compare(T arg0, T arg1) {

		for (Comparator<T> c : comps) {

			int res = c.compare(arg0, arg1);
			if (res != 0) {
				return res;
			}
		}

		return 0;
	}
}
