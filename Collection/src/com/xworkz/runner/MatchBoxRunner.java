package com.xworkz.runner;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.dto.MatchBoxDTO;

public class MatchBoxRunner {

	public static void main(String[] args) {

		MatchBoxDTO box = new MatchBoxDTO();
		MatchBoxDTO box1 = new MatchBoxDTO("superfast", 20);
		MatchBoxDTO box2 = new MatchBoxDTO("skybustor", 30);
		MatchBoxDTO box3 = new MatchBoxDTO("convoys", 40);
		MatchBoxDTO box4 = new MatchBoxDTO("Gerwin", 50);
		MatchBoxDTO box5 = new MatchBoxDTO("Asia", 60);

		Collection<MatchBoxDTO> collection = new LinkedList<MatchBoxDTO>();
		collection.add(box);
		collection.add(box1);
		collection.add(box2);
		collection.add(box3);
		collection.add(box5);

		System.out.println("Total Elements:" + collection.size());
		System.out.println("isEmpty:" + collection.isEmpty());

		// collection.clear();
		System.out.println("After clear......");

		System.out.println("Total Elements:" + collection.size());
		System.out.println("isEmpty:" + collection.isEmpty());
		// Iterator is an interface class

		Iterator<MatchBoxDTO> iterator = collection.iterator();//
		// methods are accessed to search or filter the elements
		while (iterator.hasNext())// interview qst
		{
			System.out.println("element exists");
			MatchBoxDTO ref = iterator.next();// get the element and move the cursor
			System.out.println(ref);// toString

			if (ref.getPrice() > 1500 && ref.getBrand().equals("Bajaj")) {
				System.out.println("stove is more than 1500");
			}
		}
	}
}


