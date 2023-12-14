package com.synechron.basics.array;

public class ArrayDemo1 {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random()*100);
		}
		
		for(int i: a) {
			if(i%3 == 0 && i%7 == 0) {
				System.out.println(i);
				System.out.println("Fizz Buzz");
			}
			else if(i%7==0) {
				System.out.println(i);
				System.out.println("Buzz");
			}
			else if(i%3 == 0) {
				System.out.println(i);
				System.out.println("Fizz");
			}
		}
		
		
	}

}
