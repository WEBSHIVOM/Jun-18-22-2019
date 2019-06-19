package com.lab01;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
	private static List<Item> items = 
			Arrays.asList(new Item("Nike", 20.45), 
					new Item("Adidas", 31.45), 
					new Item("Reebok", 29.25), 
					new Item("Puma", 25.15), 
					new Item("Fila", 15.15));

	public static void main(String[] args) {
		//imperativeStyle();
		declarativeStyle();
	}
	
	public static boolean filterByPrice(Item item) {
		return item.getPrice() > 20;
	}
	
	public static double discountedPrice(Item item) {
		return item.getPrice() - item.getPrice() * 0.1;
	}
	public static double addUp(double a, double b) {
		return a + b;
	}
	public static void declarativeStyle2() {
		//Predicate<Item> pricePredicate = item -> item.getPrice() > 20;
		Predicate<Item> pricePredicate = Main::filterByPrice;
		
//		Function<Item, Double> discountFunction 
//				= item -> item.getPrice() - item.getPrice() * 0.1;
		Function<Item, Double> discountFunction = Main::discountedPrice;
		
//		BinaryOperator<Double> addUpBiFunction 
//			= (start, end) -> start + end;
		BinaryOperator<Double> addUpBiFunction = Main::addUp;
			
		final Optional<Double> total = items
			.stream()
			.filter(pricePredicate)
			.map(discountFunction)
			.reduce(addUpBiFunction);
			
			//.map(item -> item.getPrice() - (item.getPrice() * 0.1))
			//.reduce(Main::addUpPrices);

		if(total.isPresent()) {
			System.out.println("Total: " + total.get());
		}
	}
	
	public static void declarativeStyle() {
		Item dummyItem = new Item("", 1.1);
		final Optional<Double> total = items
			.stream()
			.filter(Main::isPriceGreaterThan20)
			//.map(dummyItem::getPrice)
			//.map(item -> Main.calculateDiscountedPrice(item.getPrice()))
			.map(Main::calculateDiscountedPrice)
			.reduce(Main::addUpPrices);

		if(total.isPresent()) {
			System.out.println("Total: " + total.get());
		}
	}
	
	public static double calculateDiscountedPrice(double price) {
		return price - (price * 0.1);
	}
	
	public static double addUpPrices(double first, double next) {
		return first + next;
	}
	
	public static boolean isPriceGreaterThan20(Item item) {
		return item.getPrice() > 20;
	}
	
	public static double calculateDiscountedPrice(Item item) {
		return item.getPrice() - (item.getPrice() * 0.1);
	}
	
	
	
	
	public static void imperativeStyle() {
		double total = 0;
		for (Item item : items) {
			if(item.getPrice() > 20) {
				double discount = item.getPrice() * 0.1;
				total += (item.getPrice() - discount);
			}
		}
		System.out.println(total);
	}
	//Find the items that cost more than 20; 
	//add a discount of 10% and print the total price;

}
