package com.xworkz.runner;

import java.util.function.BiConsumer;
import java.util.function.ToDoubleFunction;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.BiPredicate;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;
import com.xworkz.collection.functions.FoodApp;
import com.xworkz.collection.functions.Starter;
import com.xworkz.collection.usage.Labour;

public class LambdaRunner {

	public static void main(String[] args) {

		// Lambda/arrow Expression
		Starter starter = () -> {
			System.out.println("running on in lambda expression");
		};
		Labour labour = new Labour();
		labour.startMotors(starter);

		System.out.println("========================");

		FoodApp foodApp = (String item) -> {
			System.out.println("Food app item is:" + item);
		};
		labour.foodOrder(foodApp);

		System.out.println("======================================");

		BiConsumer<String, String> biConsumer = (ref1, ref2) -> {
			System.out.println("Consumer:" + ref1);
			System.out.println("Consumer:" + ref2);
		};

		BiFunction<String, Double, Integer> biFunction = (ref, value1) -> {
			return 68;
		};

		BinaryOperator<Integer> binaryOperator = (value1, value2) -> {
			return 25;

		};

		BiPredicate<String, String> biPredicate = (String ref1, String ref2) -> {
			return true;
		};

		BooleanSupplier booleanSupplier = () -> {
           return false;
		};

		Consumer<String> consumer = (String costom) -> {
			System.out.println("Consumer:" + costom);
		};

		DoubleBinaryOperator doubleBinaryOperator = (double value, double value1) -> {
			return 55;
		};

		DoubleConsumer consumer1 = (double value) -> {
			System.out.println("DoubleConsumer:" + value);
		};

		DoubleFunction<Double> doubleFunction = (values) -> {
			return 30.6;

		};

		DoublePredicate doublePredicate = (double money) -> {
			return false;

		};

		DoubleSupplier doubleSupplier = () -> {
             return 25.02;
		};

		DoubleToIntFunction doubleToInt = (double value) -> {
			return 30;

		};

		DoubleToLongFunction func = (double value) -> {
			return 12364789;
		};

		DoubleUnaryOperator DoubleUnary = (double operand) -> {
			return 25.2;
		};

		Function<Double,Integer> function = (value) -> {
			return 36;
		};

		IntBinaryOperator intBinary = (int left, int right) -> {
			return 12;
		};

		IntConsumer intConsumer = (int value) -> {
			System.out.println("IntConsumer:" + value);
		};

		IntFunction<Integer> intFunction = (value) -> {
			return 86;
		};

		IntPredicate intPredicate = (int value) -> {
			return true;
		};

		IntSupplier intSupplier = () -> {
			return 0;
		};

		IntToDoubleFunction intToDouble = (int value) -> {
			return 10.5;
		};

		IntToLongFunction intToLong = (int value) -> {
			return 1254783;
		};

		IntUnaryOperator intUnary = (int operand) -> {
			return 40;
		};

		LongBinaryOperator longBinary = (long mobile, long contact) -> {
			return 159847;
		};

		LongConsumer longConsumer = (long value) -> {
			System.out.println("LongConsumer:" + value);

		};

		LongFunction<Integer> longFunction = (value) -> {
			return 12345678;
		};

		LongPredicate longPredicate = (long value) -> {
			return false;
		};

		LongSupplier longSupplier = () -> {
			return 12345;
		};

		LongToDoubleFunction longToDouble = (long value) -> {
			return 44;
		};

		LongToIntFunction longToInt = (long value) -> {
			return 306;

		};

		LongUnaryOperator longUnary = (long operand) -> {
			return 123654;

		};

		ObjDoubleConsumer<String> objConsumer = (ref, value) -> {
			System.out.println("ObjDoubleConsumer:" + ref);
			System.out.println("ObjDoubleConsumer:" + value);
		};

		ObjIntConsumer<String> ObjIntConsumer = (refer, value) -> {
			System.out.println("ObjIntConsumer:" + refer);
			System.out.println("ObjIntConsumer:" + value);

		};

		ObjLongConsumer<String> objLongConsumer = (refers, value) -> {
			System.out.println("ObjLongConsumer:" + refers);
			System.out.println("ObjLongConsumer:" + value);

		};

		Predicate<Boolean> predicate = (rainy) -> {
			return true;
		};

		Supplier<Integer> Supplier = () -> {
			return 0;
		};

		ToDoubleBiFunction<String, Integer> toDoubleBi = (refer1, value) -> {
			return 25.2;

		};

		ToDoubleFunction<Integer> funct = (value) -> {
			return 25.5;

		};

		ToIntFunction<Integer> toFunction = (value) -> {
			return 22;

		};

		ToIntBiFunction<String, Double> tobiFunction = (bifun, val) -> {
			return 70;
		};

		ToIntFunction<Double> intfu = (value) -> {
			return 63;
		};

		ToLongBiFunction<String, Integer> toLongBi = (items, value) -> {
			return 154872;

		};

		ToLongFunction<Integer> longFun = (value) -> {
			return 123789;
		};

		UnaryOperator<String> unaryOperator = (name) -> {
			return "shanta";

		};

	}

}
