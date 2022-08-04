package com.Generics;

public class GenericMethods {

	public static <E> void printElements(E[]elements) {
		for(E element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = {12,23,32,56,76};
		String[] charArray = {"A","M","V","T"};
		printElements(intArray);
	}

}
