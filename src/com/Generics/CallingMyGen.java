package com.Generics;

public class CallingMyGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyGen< Integer> m = new MyGen<Integer>();
		MyGen<Integer> m=new MyGen<Integer>();  
		m.add(2);
		System.out.println(m.get());

	}

}
