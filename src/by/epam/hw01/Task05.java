package by.epam.hw01;

import java.util.Arrays;

/* Даны три действительных числа. Возвести в квадрат те из них, значения 
 * которых неотрицательны, и в четвертую степень — отрицательные. */

public class Task05 {

	public static void main(String[] args) {

		double[] numbers = { -2.0, 4.5, 2.0 };

		System.out.println("Дано: " + Arrays.toString(numbers));

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				numbers[i] = Math.pow(numbers[i], 2);
			}

			if (numbers[i] < 0) {
				numbers[i] = Math.pow(numbers[i], 4);
			}
		}

		System.out.println("Результат: " + Arrays.toString(numbers));

	}

}
