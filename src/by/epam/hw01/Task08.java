package by.epam.hw01;

import java.util.Arrays;

/* 08. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, 
 * которые кратны данному К. */

public class Task08 {

	public static void main(String[] args) {

		int k = 3;
		int[] naturalNumbers = createArrayWithNaturalNumbers(10);

		System.out.println("Дано: "+ Arrays.toString(naturalNumbers) );
		System.out.printf("Сумма чисел кратных %d = %d", k, calculateSum(naturalNumbers, k));
	}

	// находим сумму чисел, кратных k
	public static int calculateSum(int[] arr, int k) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % k == 0) {
				sum += arr[i];
			}
		}
		return sum;
	}

	// создать массив с натур числами длиной от 1 до  len
	public static int[] createArrayWithNaturalNumbers(int len) {
		int[] arr = new int[len];

		for (int i = 0; i < len; i++) {
			arr[i] = i + 1;
		}

		return arr;
	}

}
