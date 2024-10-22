package com.xworkz.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

import com.xworkz.dto.EmailDTO;
import com.xworkz.dto.MallDTO;
import com.xworkz.dto.MallDTO.Location;

public class MallRunner {
	public static void main(String[] args) {

		MallDTO mall1 = new MallDTO(1, "Lulu Mall", Location.Sujata_Theatre, "Ramesh", 91000);
		MallDTO mall2 = new MallDTO(2, "Phoenix Market City", Location.Mahadevpura, "Rao", 10000);
		MallDTO mall3 = new MallDTO(3, "Mantri Square Mall", Location.Sampige_Rd, "Omakar", 1300000);
		MallDTO mall4 = new MallDTO(4, "Orian Malla", Location.Rajaji_Nagar, "H.O.K", 1400000);
		MallDTO mall5 = new MallDTO(5, "Gopal Malla", Location.RR_Nagar, "Harish", 1200000);
		MallDTO mall6 = new MallDTO(6, "UB City", Location.Vittal_Mallya_Road, "Suhas", 160000);
		MallDTO mall7 = new MallDTO(7, "Inorbit Mall", Location.Whitefield, "mamatha", 160000);
		MallDTO mall8 = new MallDTO(8, "Royal Meenakshi Mall", Location.Meenakshi_Temple, "Manakshi", 60000);
		MallDTO mall9 = new MallDTO(9, "Ascendas Park quareMall", Location.Pattandur_Agrahara, "Virat", 110000);
		MallDTO mall10 = new MallDTO(10, "Garuda Mall", Location.Magrath_Road, "Raanna", 30000);

		List<MallDTO> collection = new ArrayList<MallDTO>();
		collection.add(mall1);
		collection.add(mall2);
		collection.add(mall3);
		collection.add(mall4);
		collection.add(mall5);
		collection.add(mall6);
		collection.add(mall7);
		collection.add(mall8);
		collection.add(mall9);
		collection.add(mall10);

		System.out.println("========Sort all mall by ID desc===========");
		collection.stream().sorted((pro1, pro2) -> Integer.compare(pro2.getId(), pro1.getId()))
				.collect(Collectors.toList()).forEach((pro) -> System.out.println(pro));

		System.out.println("========Sort all mall name desc order===========");
		collection.stream().sorted((pro1, pro2) -> pro2.getName().compareTo(pro1.getName()))
				.collect(Collectors.toList()).forEach((pro) -> System.out.println(pro));

		System.out.println("======== Iterator===========");
		Iterator<MallDTO> iterator = collection.iterator();
		while (iterator.hasNext()) {
			MallDTO ref = iterator.next();
			System.out.println(ref);

		}

		System.out.println("========List Iterator===========");
		ListIterator<MallDTO> listIterator = collection.listIterator();
		while (listIterator.hasNext()) {
			MallDTO ref = listIterator.next();
			System.out.println(ref);
		}

		System.out.println("=================Filter all mall by landDimension less than one lakh=================");
		collection.stream().filter(pro -> pro.getLandDimension() < 100000)
				.forEach(pro -> System.out.println(pro.getName()));

		System.out.println("======== Collect only names of mall==========");
		collection.stream().map((pro) -> pro.getName()).collect(Collectors.toList())
				.forEach((pro) -> System.out.println(pro));

		System.out.println("======== Collect only landDimension and sort it asc order==========");
		collection.stream().map((pro) -> pro.getLandDimension()).sorted().collect(Collectors.toList())
				.forEach((pro) -> System.out.println(pro));

	}

}
