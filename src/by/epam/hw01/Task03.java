package by.epam.hw01;

/* 03. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.*/

public class Task03 {

	public static void main(String[] args) {

		double a = 6; // катет1
		double b = 7; // катет2

		double hypotenus = calculateHypotenus(a, b); // гипотенуза
		double perimeter = calculatePerimeter(a, b, hypotenus); // периметр
		double area = calculateArea(a, b); // площадь

		System.out.printf("\tПри катетах прямоугольного треугольника, равных %.1f и %.1f, мы имеем:\n", a, b);
		System.out.printf("периметр = %.2f\n", perimeter);
		System.out.printf("площадь = %.2f\n", area);

	}

	public static double calculateHypotenus(double a, double b) {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}

	public static double calculatePerimeter(double a, double b, double hypotenus) {
		return a + b + hypotenus;
	}

	public static double calculateArea(double a, double b) {
		return (a * b) / 2;
	}

}
