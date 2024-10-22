package com.xworkz.runner;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.dto.EmailDTO;

public class EmailRunner {
	public static void main(String[] args) {

		EmailDTO email1 = new EmailDTO("shanta", "x-workz", "leaves", "holidays for diwali");
		EmailDTO email2 = new EmailDTO("student", "principle", "leave letter", "holidays for sick");
		EmailDTO email3 = new EmailDTO("bhagya", "x-workz", "leavs", "holidays dasara");
		EmailDTO email4 = new EmailDTO("Renuka", "father", "reservation ticket", "please book the train ticket");
		EmailDTO email5 = new EmailDTO("sohita", "akshara sir", "leave", "beauty caring");

		Collection<EmailDTO> collection = new ArrayList<EmailDTO>();
		collection.add(email1);
		collection.add(email2);
		collection.add(email3);
		collection.add(email4);
		collection.add(email5);

		System.out.println("==========Remove============");
		EmailDTO dto = new EmailDTO("sohita", "akshara sir", "leave", "beauty caring");
		boolean removed = collection.remove(dto);
		collection.forEach((ref) -> System.out.println(ref));
		System.out.println("removes:" + removed);

		System.out.println("==============Add============");
		boolean add = collection.add(email5);
		System.out.println("add:" + add);
		collection.forEach((ref) -> System.out.println(ref));

		System.out.println("=============Add All===========");
		boolean added = collection.addAll(collection);
		System.out.println("addAll:" + added);

		System.out.println("===============Contains============");
		boolean isContains = collection.contains(dto);
		System.out.println("IsContains:" + isContains);

		System.out.println("===============ContainsAll============");
		boolean contain = collection.containsAll(collection);
		System.out.println("ContainsAll:" + contain);

		System.out.println("================Equals==================");
		boolean equal = collection.equals(dto);
		System.out.println("isEquals:" + equal);

		System.out.println("===========Hash Code============");
		int code = collection.hashCode();
		System.out.println("Hash Code:" + code);

		System.out.println("===============isEmpty===========");
		boolean empty = collection.isEmpty();
		System.out.println("empty:" + empty);

		System.out.println("==============Size=============");
		int size = collection.size();
		System.out.println("size:" + size);

		System.out.println("==============RemoveAll=============");
		boolean remov = collection.removeAll(collection);
		System.out.println("removeAll:" + remov);

		System.out.println("=========Retain All==============");
		boolean retain = collection.retainAll(collection);
		System.out.println("Retain All:" + retain);

		System.out.println("=========Clear========");
		collection.clear();

		
	}

}





