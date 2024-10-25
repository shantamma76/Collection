package com.xworkz.stream.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class StreamRunner {

	public static void main(String[] args) {

		Collection<Integer> collection = new ArrayList();

		collection.add(36);
		collection.add(87);
		collection.add(78);
		collection.add(63);
		collection.add(20);
		collection.add(32);

		System.out.println("sorting desending order");
		collection.forEach((ref) -> System.out.println(ref));

		System.out.println("After sorting asending order");

		collection.stream().sorted().collect(Collectors.toList()).forEach((ref) -> System.out.println(ref));

		System.out.println("===========================================================");

		Collection<String> collection1 = new ArrayList();

		collection1.add("Ganga");
		collection1.add("Yamuna");
		collection1.add("Kaveri");
		collection1.add("Krishna");
		collection1.add("Godavari");
		collection1.add("Tunga Badra");

		System.out.println("sorting desending order:");

		collection1.forEach((ref) -> System.out.println(ref));

		System.out.println("After sorting asending order:");

		collection1.stream().sorted().collect(Collectors.toList()).forEach((refer) -> System.out.println(refer));

	}
}
