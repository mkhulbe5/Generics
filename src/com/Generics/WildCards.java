package com.Generics;

import java.util.ArrayList;
import java.util.List;

public class WildCards {

	abstract class Shape{
	abstract void draw();
	}
	
	class Rectangle extends Shape{

		@Override
		void draw() {
			// TODO Auto-generated method stub
			System.out.println("Drawing rectangle");
		}
		
	}
	
	
	class Circle extends Shape{

		@Override
		void draw() {
			// TODO Auto-generated method stub
			System.out.println("Drawing Circle");
		}
		}
	
	
//	public static void drawShapes(List<? extends Shape> lists) {
//		for(Shape s:lists){
//		s.draw();
//	}
	
	public static void drawShapes(List<? extends Shape> lists){  
		for(Shape s:lists){  
		s.draw();//calling method of Shape class by child class instance  
		}  
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Rectangle> r = new ArrayList<Rectangle>();
//		r.add(new Rectangle());
		
		List<Rectangle> list1=new ArrayList<Rectangle>();  
		list1.add(new Rectangle()); 
	}

}
