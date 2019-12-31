package com.bridgelabz.collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Product {
	int id;
	String name;
	int price;
	
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
}
public class StreamCollectors {

	public static void main(String[] args) {
		List<Product> listOfProduct = new ArrayList<>();
		listOfProduct.add(new Product(1, "Mac Book", 100000));
		listOfProduct.add(new Product(2,"hp",55000));
		listOfProduct.add(new Product(3, "Dell", 35000));
		listOfProduct.add(new Product(4,"Lenovo",35500));
		
		//Fetching data as set
		List<Integer> productPriceList = listOfProduct.stream().map(x->x.price).collect(Collectors.toList());
		
		System.out.println("products price list(collectors example) : "+productPriceList);
		
		//Converting to set
		Set<String> productSet = 
				listOfProduct.stream().map(x->x.name).collect(Collectors.toSet());
		System.out.println("After converting List to Set : "+productSet);
		
		//using sum method
		int sumOfPrice = listOfProduct.stream().collect(Collectors.summingInt(x->x.price));
		System.out.println("Summing in collectore = "+ sumOfPrice);
		
		//average in collectors
		Double average = listOfProduct.stream().collect(Collectors.averagingInt(x->x.price));
		System.out.println("Average using collector = "+average);
		
		//counting elemets using collectors
		Long elementCount = listOfProduct.stream().collect(Collectors.counting());
	}

}
