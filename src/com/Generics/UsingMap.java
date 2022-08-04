package com.Generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(12, "Mohit");
		map.put(21, "Anjali");
		map.put(5, "Vandana");
		
		Set<Map.Entry<Integer,String>> set=map.entrySet(); 
		Iterator<Map.Entry<Integer,String>> itr = set.iterator();
		
		
		while(itr.hasNext()) {
			Map.Entry<Integer, String> m = itr.next();
			System.out.println(m.getKey() + "-->"+ m.getValue());
		}

	}

}
