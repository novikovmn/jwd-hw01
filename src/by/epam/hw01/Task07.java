package by.epam.hw01;

/* 7. Составить программу для вычисления значений функции  F(x) на отрезке [а, b] с шагом h. 
 * Результат представить в виде таблицы, первый столбец которой – значения  аргумента, 
 * второй - соответствующие значения функции.
 */

public class Task07 {

	public static void main(String[] args) {

		// крайние точки отрезка
		double a = 2;
		double b = 10;
		
		// шаг
		double h = 2;

		System.out.println("|\t\tx\t\t|\t\tfunc\t\t|");
		System.out.println("|---------------------------------------------------------------|");

		for (double x = a; x <= b; x += h) {
			double func = Math.sin(x) * Math.sin(x) - Math.cos(2 * x);
			System.out.printf("|\t\t%.2f\t\t|\t\t%.2f\t\t|\n", x, func);
		}

		System.out.println("|---------------------------------------------------------------|");

	}

}
