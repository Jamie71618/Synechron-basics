package com.synechron.basics.array;

public class ArrayDemo2 {

	public static void main(String[] args) {
		String ip = "192.168.1.1";

		String s[] = ip.split("\\.");

		for (String i : s) {

			int cellValue = Integer.parseInt(i);

			if (cellValue >= 0 && cellValue <= 255) {
				System.out.println(i);
			} else {
				System.out.println("IP not valid");
				System.exit(1);
			}
		}

		int cell0 = Integer.parseInt(s[0]);

		if (cell0 >= 1 && cell0 <= 126) {
			System.out.println("The IP is part of class A (Large number of Hosts)");
		} else if (cell0 >= 128 && cell0 <= 191) {
			System.out.println("The IP is part of class B (Medium number of Hosts)");
		} else if (cell0 >= 192 && cell0 <= 223) {
			System.out.println("The IP is part of class C (Small number of Hosts)");
		} else if (cell0 >= 224 && cell0 <= 239) {
			System.out.println("The IP is part of class D (Reserved for Multi-tasking)");
		} else if (cell0 >= 240 && cell0 <= 254) {
			System.out.println("The IP is part of class E (Reserved for R&D)");
		} else {
			System.out.println("The IP is not in the avalible range");
		}

		System.out.println("--NON-METHOD VERSION--");
		int numToFind = 192;
		for (String element : s) {
			int num = Integer.parseInt(element);
			if (num == numToFind) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
		}

		ArrayDemo2 ar2 = new ArrayDemo2();

		System.out.println("--METHOD VERSION--");
		System.out.println(ar2.findElement(s, 192));
		
	}

	public boolean findElement(String s[], int numToFind) {

		for (String element : s) {
			int num = Integer.parseInt(element);
			if (num == numToFind) {
				return true;
			}
		}
		return false;
	}

	/**
	 * String s <-- This is reference = "Hello World" <-- This is the object
	 * 
	 * String is not a variable
	 * 
	 * The "new" command is created at runtime
	 * 
	 * Heap memory is bigger than Stack memory
	 * 
	 * Constructor example: ArrayDemo2 ar2 = new ArrayDemo2();
	 * 
	 * Constructor helps initialise the objects with some values or it will take
	 * default values.
	 * 
	 * Heap memory holds the object
	 * Stack memory hold the reference
	 */
}
