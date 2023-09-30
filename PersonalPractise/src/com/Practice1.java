package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//Reverse the each element of a array using string builder and using the collections for storing.

public abstract class Practice1 {
	public static void main(String[] args) {
		// Integer array
		Integer arr[] = new Integer[] { 23, 634, 456, 57, 87, 989, 43, 69 };

		// converting arrays to list
		List<Integer> lt1 = new ArrayList<Integer>(Arrays.asList(arr));
		List<Integer> lt2 = new ArrayList<Integer>();

		for (Integer it : lt1) {
			String s = it.toString();
			String string1 = new StringBuilder(s).reverse().toString();
			Integer asd = Integer.parseInt(string1); // converting String to Integer
			lt2.add(asd);
			// System.err.println(asd);
		}

		// sorting the collection
		Collections.sort(lt2);
		System.out.println(lt2);

		// reverse the collection
		Collections.reverse(lt2);
		System.out.println(lt2);

		// String Array
		String arr2[] = new String[] { "Java", "Python", "Java Full Stack" };
		List<String> lt3 = new ArrayList<String>(Arrays.asList(arr2));

		List<String> lt4 = new ArrayList<String>();
		for (String ss : lt3) {
			String str2 = new StringBuilder(ss).reverse().toString();
			lt4.add(str2);
			// System.out.println(str2);

		}

		// using stream expressions for sorting
		List<String> lt5 = lt4.stream().sorted().collect(Collectors.toList());
		Collections.reverse(lt5);

		lt5.forEach(System.out::println);
	}
}
