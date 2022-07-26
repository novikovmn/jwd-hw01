package by.epam.hw01;

/* 02. Вычислить значение выражения */

public class Task02 {

	public static void main(String[] args) {

		System.out.println(calculateValue(2, 5, 25));

	}

	public static double calculateValue(double a, double b, double c) {
		double result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
		return result;
	}

}
