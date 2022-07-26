package by.epam.hw01;

import java.util.Arrays;

/* 9. Заданы два одномерных массива с различным количеством элементов и натуральное число k. 
 * Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого. */

public class Task09 {

	public static void main(String[] args) {

		int k = 2;
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int[] b = { 7, 8, 9, 10 };

		System.out.println("Массив 1: " + Arrays.toString(a));
		System.out.println("Массив 2: " + Arrays.toString(b));

		int[] c = new int[a.length + b.length];

		int index = k;

		for (int i = 0; i <= index; i++) {
			c[i] = a[i];
		}

		for (int i = 0; i < b.length; i++) {
			c[index + 1] = b[i];
			index++;
		}

		for (int i = k + 1; i < a.length; i++) {
			c[index + 1] = a[i];
			index++;
		}

		System.out.println("Итог: " + Arrays.toString(c));

	}

}
