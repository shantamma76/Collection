package com.xworkz.stream.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class SortingRunner {
	public static void main(String[] args) {
		
		Collection<Long> number=new ArrayList<>();
		number.add(1010L);
		number.add(1002L);
		number.add(1008L);
		number.add(1009L);
		number.add(1012L);
		number.add(1004L);
		number.add(1016L);
		number.add(1018L);
		number.add(1006L);
		number.add(1014L);
		
		System.out.println("============before sorted=======");
		number.forEach((ref)->System.out.println(ref));
		
		System.out.println("=============sorting in asending order:=============");
		number.stream().sorted().collect(Collectors.toList()).forEach((ref) -> System.out.println(ref));
		
		System.out.println("========sorting in desending order===========");
		number.stream().sorted((ref1,ref2)->ref2.compareTo(ref1)).collect(Collectors.toList()).forEach((ref)-> System.out.println(ref));
		
		System.out.println("===========================================================================");
		
		Collection<String> names=new ArrayList<>();
		names.add("Jawaharlal Nehru");
		names.add("Gulzarilal Nanda");
		names.add("JLal Bahadur Shastri");
		names.add("Indira Gandhi");
		names.add("Morarji Desai ");
		names.add("Charan Singh");
		names.add("Rajiv Gandhi");
		names.add("Vishwanath Pratap Singh");
		names.add("Chandra Shekhar");
		names.add("P.V.Narasimha Rao");
		names.add("Atal Bihari Vajpayee");
		names.add("H. D. Deve Gowda ");
		names.add("Manmohan Singh");
		names.add("Narendra Modi");
		
		System.out.println("====before Sorting====");
		names.forEach((ref1)->System.out.println(ref1));
		
		System.out.println("============Sorting in Asending order=========");
		names.stream().sorted().collect(Collectors.toList()).forEach((ref1)->System.out.println(ref1));
		
		System.out.println("============sorting in desending order===========");
		number.stream().sorted((ref1,ref2)->ref2.compareTo(ref1)).collect(Collectors.toList()).forEach((ref)-> System.out.println(ref));
		
		System.out.println("===========================================================================");
		
		Collection<String> states=new ArrayList<>();
		states.add("Karnataka");
		states.add("Maharashtra");
		states.add("Tamil Nadu");
		states.add("Andhra Pradesh");
		states.add("Uttar Pradesh");
		states.add("Madhya Pradesh");
		states.add("Arunachal Pradesh");
		states.add("Himachal Pradesh");
		states.add("Kerala");
		states.add("Bihar");
		states.add("Goa");
		states.add("Assam");
		states.add("Gujarat");
		states.add("Tripura");
		states.add("Chhattisgarh");
		states.add("Telangana");
		states.add("Haryana");
		states.add("Uttarakhand");
		states.add("Sikkim");
		states.add("Jharkhand");
		states.add("Rajasthan");
		states.add("Manipur");
		states.add("West Bengal");
		states.add("Punjab");
		states.add("Odisha");
		states.add("Mizoram");
		states.add("Nagaland");
		states.add("Meghalaya");
		
		System.out.println("=====before sorting=====");
		states.forEach((ref2)->System.out.println(ref2));
		
		System.out.println("============Sorting in Asending order===========");
		states.stream().sorted().collect(Collectors.toList()).forEach((ref2)->System.out.println(ref2));
		
		System.out.println("============sorting in desending order===========");
		number.stream().sorted((ref1,ref2)->ref2.compareTo(ref1)).collect(Collectors.toList()).forEach((ref)-> System.out.println(ref));
		
	}
	

}
