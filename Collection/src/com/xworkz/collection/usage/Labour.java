package com.xworkz.collection.usage;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

import com.xworkz.collection.functions.FoodApp;
import com.xworkz.collection.functions.Starter;

public class Labour {

	public void startMotors(Starter starter) {

		if (starter != null) {
			System.out.println("starter is not null");
			starter.on(); // abstraction
		} else {
			System.out.println("starter is null");
		}
		System.out.println("exit startMotor in labour");

	}
	public void foodOrder(FoodApp foodApp)
	{
		if(foodApp!=null) {
			foodApp.order("Dosa");
			System.out.println("foodApp is not null");
		}
		
	
	}
	
}




