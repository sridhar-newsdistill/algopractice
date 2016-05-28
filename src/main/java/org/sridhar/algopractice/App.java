package org.sridhar.algopractice;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// code
		Scanner sc = new Scanner(System.in);
		int testCases = 1; /* sc.nextInt(); */
		while (testCases > 0) {
			int sizeOfInput = 6;
			//sc.nextInt();

			int array[] = new int[sizeOfInput];
			array[0] = 16;
			array[1] = 17;
			array[2] = 3;
			array[3] = 5;
			array[4] = 4;
			array[5] = 2;
			/*
			 * for (int i = 0; i < sizeOfInput; i++) { array[i] = sc.nextInt();
			 * }
			 */
			int max = array[0];
			int maxItemIndex = 0;
			int prevIndex = 0;
			while (maxItemIndex < sizeOfInput) {

				maxItemIndex = maxItemIndex(array, prevIndex);
				if (maxItemIndex != prevIndex) {
					prevIndex = maxItemIndex;
				} else {
					break;
				}
			}

			for (int i : array) {
				System.out.printf("%d", i);
			}

			testCases--;
		}
		sc.close();
	}

	public static int maxItemIndex(int array[], int maxItemIndex) {
		// min index
		int maxElementIndex = maxItemIndex > 1 ? maxItemIndex - 1 : 0;
		int maxElement = array[maxElementIndex];
		for (int i = maxElementIndex; i < array.length; i++) {
			if (maxElement < array[i]) {
				maxElement = array[i];
				maxElementIndex = i;
			}
		}
		for (int k = maxItemIndex; k < maxElementIndex; k++) {
			array[k] = maxElement;
		}
		return maxElementIndex;
	}

}
