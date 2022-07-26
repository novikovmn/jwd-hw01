package by.epam.hw01;

import java.util.Arrays;

/* 10. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)*/

public class Task10 {

	public static void main(String[] args) {

		int[][] arr = new int[4][4];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i % 2 == 0) {
					arr[i][j] = j + 1;
				}

				if (i % 2 != 0) {
					arr[i][j] = arr[i].length - j;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

	}

}
