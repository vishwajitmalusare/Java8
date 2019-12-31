package com.bridgelabz.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		
		List<Integer> integerArray = Arrays.asList(12,8,5,25,3,50,75,2);
		
		//stream Intermediate operation Map
		List<Integer> squareOfList = integerArray.stream()
				.map(x->x*x)
				.collect(Collectors.toList());
		
		System.out.println("List of Integers = "+integerArray);
		System.out.println("Square of List = "+squareOfList);
		
		//stream filter
		List<String> stringArray = Arrays.asList("diljit","appu","jassy","ravi","sunny","bhavna","vish","sachin");
		
		List<String> filteredArray = stringArray.stream().filter(s->s.startsWith("s")).collect(Collectors.toList());
		System.out.println("Actual List : "+stringArray);
		System.out.println("Filtered Result List by starting with - S \n"+ filteredArray);
		
		//stream sort
		List<Integer> sortedIntegerList = integerArray.stream().sorted().collect(Collectors.toList());
		List<String> sortedStringList = stringArray.stream().sorted().collect(Collectors.toList());
		System.out.println("Actual List "+integerArray);
		System.out.println("List after Sorting "+sortedIntegerList);
		System.out.println("Actual list "+stringArray);
		System.out.println("After sorting "+sortedStringList);
		
		//collect method returns a set
		Set<Integer> setOfInteger = integerArray.stream().map(x->x*x).collect(Collectors.toSet());
		System.out.println("Result of toSet"+setOfInteger);
		
		//forEach
		System.out.println("Result of forEach ");
		integerArray.stream().forEach(y->System.out.print(y+" "));
		
		//reduce
		int evenNumber = integerArray.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);
		System.out.println("\nresult of reduce "+evenNumber);
 	}
	
}
