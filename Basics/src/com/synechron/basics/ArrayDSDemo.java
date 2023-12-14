package com.synechron.basics;

import java.util.Arrays;

public class ArrayDSDemo {

	int a[] = { 1, 20, 25, 30, 45, 50, 70 };

	/**
	 * search is used to search for an element in an array. The input is the number
	 * which the user would like to locate in the function.
	 * 
	 * @return true if value is in array, false otherwise
	 */
	public boolean search(int value) {
		for (int i : a) {
			if (i == value) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		ArrayDSDemo arrayDemo = new ArrayDSDemo();
		boolean result = arrayDemo.search(30);

		System.out.println("result: " + result);
		
		//Unsorted arrays
		byte byteArr[] = { 10, 20, 15, 22, 35 };
		char charArr[] = { 'g', 'p', 'q', 'c', 'i' };
		int intArr[] = { 10, 20, 15, 22, 35 };
		double doubleArr[] = { 10.2, 15.1, 2.2, 3.5 };
		float floatArr[] = { 10.2f, 15.1f, 2.2f, 3.5f };
		short shortArr[] = { 10, 20, 15, 22, 35 };
		
		//Sorting the arrays
		Arrays.sort(byteArr);
		Arrays.sort(charArr);
		Arrays.sort(intArr);
		Arrays.sort(doubleArr);
		Arrays.sort(floatArr);
		Arrays.sort(shortArr);
		
		//Printing out arrays
		System.out.println(Arrays.toString(byteArr));
		System.out.println(Arrays.toString(intArr));
		System.out.println(Arrays.toString(charArr));
		System.out.println(Arrays.toString(doubleArr));
		System.out.println(Arrays.toString(floatArr));
		System.out.println(Arrays.toString(shortArr));
		
		//What we're searching for
		byte byteKey = 35;
        char charKey = 'g';
        int intKey = 22;
        double doubleKey = 1.5;
        float floatKey = 35;
        short shortKey = 5;
        
        //FInding the values given, -1 means not in array
        System.out.println("ByteKey found at index: " + Arrays.binarySearch(byteArr, byteKey));
        System.out.println("charKey found at index: " + Arrays.binarySearch(charArr, charKey));
        System.out.println("intKey found at index: " + Arrays.binarySearch(intArr, intKey));
        System.out.println("doubleKey found at index: " + Arrays.binarySearch(doubleArr, doubleKey));
        System.out.println("floatKey found at index: " + Arrays.binarySearch(floatArr, floatKey));
        System.out.println("shortKey found at index: " + Arrays.binarySearch(shortArr, shortKey));
	}
}
