package com.xworkz.stream.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.stream.dto.ProductDto;

public class ProductRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<ProductDto> product = new ArrayList<ProductDto>();
		product.add(new ProductDto(1, "Smart watch", "Apple", 10000));
		product.add(new ProductDto(2, "Loptop", "Hp", 60000));
		product.add(new ProductDto(3, "Mobile", "oppo", 15000));
		product.add(new ProductDto(4, "Dress", "messho", 2000));
		product.add(new ProductDto(5, "Bluetooth", "lenova", 1200));
		product.add(new ProductDto(6, "Hair Dryer", "lakmy", 6000));
		product.add(new ProductDto(7, "Alcohal cups", "maharaj", 500));
		product.add(new ProductDto(8, "Lipstick", "mumaearth", 999));
		product.add(new ProductDto(9, "Foundation", "mumaearth", 500));
		product.add(new ProductDto(10, "Almond oil", "bajaj", 200));

		product.forEach((pro) -> System.out.println(pro));

		System.out.println("===========ascending order=================");
		product.stream().sorted().forEach(pro -> System.out.println(pro));

		System.out
				.println("============integer(first big id number is sorted & next smaller id value===========");
		product.stream().sorted((pro1, pro2) -> Integer.compare(pro2.getId(), pro1.getId()))
				.forEach(pro -> System.out.println(pro));

		System.out
				.println("==============double(first bigger cost is sorted and next smaller cost)===============");
		product.stream().sorted((pro1, pro2) -> Double.compare(pro2.getCost(), pro1.getCost()))
				.forEach(pro -> System.out.println(pro));

		System.out.println("==============String(first sort uppercase & next lower case===============");
		product.stream().sorted((pro1, pro2) -> pro1.getVendor().compareTo(pro2.getVendor()))
				.forEach(pro -> System.out.println(pro));

		System.out.println("===================cost greater than 5000====================");
		product.stream().filter(pro -> pro.getCost() > 5000).sorted().forEach(pro -> System.out.println(pro));

		System.out.println("===================cost greater than 5000 & less than 30000====================");
		product.stream().filter(pro -> pro.getCost() > 5000).filter(pro -> pro.getCost() < 30000).sorted()
				.forEach(pro -> System.out.println(pro));

		System.out.println("========sort in descending by cost===========");
		product.stream().sorted((pro1, pro2) -> Double.compare(pro2.getCost(), pro1.getCost()))
				.collect(Collectors.toList()).forEach((pro) -> System.out.println(pro));

		System.out.println("========vendor names starts with A and sort by asc by name===========");
		product.stream().sorted().filter((pro) -> pro.getName().startsWith("A"))
				.forEach((pro) -> System.out.println(pro));

		System.out.println("======== sort by cost ===========");
		product.stream().sorted((pro1, pro2) -> Double.compare(pro1.getCost(), pro2.getCost()))
				.forEach(pro -> System.out.println(pro));

		System.out.println("======== sort by Id ===========");
		product.stream().sorted((pro1, pro2) -> Integer.compare(pro1.getId(), pro2.getId()))
				.forEach(pro -> System.out.println(pro));

		System.out.println("========Collect  only names from product ===========");
		product.stream().map((pro) -> pro.getName()).collect(Collectors.toList())
				.forEach((pro) -> System.out.println(pro));

		System.out.println("========Collect only id from product ===========");
		product.stream().map((pro) -> pro.getId()).collect(Collectors.toList())
				.forEach((pro) -> System.out.println(pro));

		System.out.println("======== only names from product ===========");
		product.stream().map((pro) -> pro.getName()).collect(Collectors.toList())
				.forEach((pro) -> System.out.println(pro.toUpperCase()));

	}

}

