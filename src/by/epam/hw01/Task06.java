package by.epam.hw01;

/* 06. Написать программу нахождения суммы большего и меньшего из трех чисел. */

public class Task06 {

	public static void main(String[] args) {
		
		System.out.println(calculateMinAndMaxNumbersSum(2, 5, 1)); 

	}

	// находим сумму min и max чисел
	public static int calculateMinAndMaxNumbersSum(int a, int b, int c) {

		int minNumber = findMinNumber(a, b, c); 
		int maxNumber = findMaxNumber(a, b, c);
		
		return minNumber + maxNumber;
	}

	// находим min 
	public static int findMinNumber(int a, int b, int c) {
		int min = 0;

		if (a < b) {
			min = a;
		} else {
			min = b;
		}

		if (c < min) {
			min = c;
		}

		return min;
	}

	// находим max
	public static int findMaxNumber(int a, int b, int c) {
		int max = 0;

		if (a > b) {
			max = a;
		} else {
			max = b;
		}

		if (c > max) {
			max = c;
		}

		return max;
	}

}
