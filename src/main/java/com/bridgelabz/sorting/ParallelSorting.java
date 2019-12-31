package com.bridgelabz.sorting;

import java.util.Arrays;

public class ParallelSorting {

	public static void main(String args[]) {
		int intArray[] = {12,4,25,50,20,5};
		
		System.out.println("Array elements ");
		for(int i: intArray) {
			System.out.print(i+" ");
		}
		
		//Sorting array elements using parallel
		Arrays.parallelSort(intArray);
		System.out.println("\nAfter parallel sort ");
		
		for(int j:intArray) {
			System.out.print(j+" ");
		}
		
		//Paralle sort using fromIndex to ToIndex
		int arrayTwo[] = {12,36,5,22,2};
		Arrays.parallelSort(arrayTwo,0,3);
		System.out.println("\nAfter Parallel sorting with forIndex to ToIndex ");
		for(int k:arrayTwo) {
			System.out.print(k+" ");
		}
	}
}
