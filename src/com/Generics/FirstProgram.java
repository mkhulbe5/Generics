package com.Generics;

import java.util.ArrayList;
import java.util.Iterator;

public class FirstProgram {

	public static void main(String[] args) {
//		ArrayList<String> str = new ArrayList<>();
//		str.add("10");
//		str.add("23");
//		str.add("21");
//		str.add("12");
//		
//		Iterator<String> itr = str.iterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//	}
		
		ArrayList<String> list = new ArrayList<>();
		list.add("12");
		list.add("21");
		list.add("5");
		list.add("25");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
