package com.synechron.basics;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicGraphicsUtils;

public class Main {

	public static void main(String[] args) {

		/**
		 * SHORTCUTS: ctrl + F11 - RUN SHORTCUT
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		// Scanner: will accept input values
		// class introduced in JavaSE5

		// print statement
		System.out.println("hello world");

		// array: set of similar type of elements
		// array index: will start with 0 and ends with size-1
		// int array declaration
		int a[] = { 1, 2, 3, 4, 5 }; // provide values via {}
		System.out.println(a[4]);

		// traverse the array
		// for loop
		// will build the implicate condition to traverse, increment the counter
		// and directly it will assign the value of i
		for (int i : a) {
			System.out.println(i);
		}

		int b[] = new int[5];

		for (int i = 0; i < b.length; i++) {
			b[i] = (int) (Math.random() * 1000);
		}

		for (int i : b) {
			System.out.println(i);
		}

		System.out.println("Enter the value to delete from the array: ");
		int userInput = scanner.nextInt(); // accepts int value
		// nextXXX() : XXX :name of data type
		// 8 data types in java + String
		System.out.println(userInput);
		for (int i = 0; i < b.length; i++) {
			if (b[i] == userInput) {
				b[i] = 0;
				System.out.println("Number removed");
				break;
			}
		}
		for (int i : b) {
			System.out.println(i);
		}
		
		for(int i = 0; i < b.length-1; i++) {
			if(b[i] < b[i+1]) {
				int temp = b[i];
				b[i] = b[i+1];
				b[i+1] = temp;
			}
		}
		System.out.println("--SORTED--");
		for (int i : b) {
			System.out.println(i);
		}
		
		
		
	}

}
