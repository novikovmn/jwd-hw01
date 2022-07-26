package by.epam.hw01;

/* 01. Верните true/false в зависимости от утверждения: 
Сумма двух первых цифр заданного четырехзначного числа
равна сумме двух его последних цифр.
*/

public class Task01 {

	public static void main(String[] args) {

		System.out.println(isSumOfFirstPairAndLastPairEqual(2213)); 

	}

	/* =====================проверка сумм====================================== */
	public static boolean isSumOfFirstPairAndLastPairEqual(int number) {

		int numberOfDigits = checkNumberOfDigits(number); // ищем кол-во цифр

		if (numberOfDigits != 4)
			return false; // если число не 4-значное - дальше не идем

		// если число 4-значное - извлекаем каждую цифру
		int firstDigit = number / 1000;
		int secondDigit = (number / 100) % 10;
		int thirdDigit = (number / 10) % 10;
		int fourthDigit = number % 10;

		// проверяем равенство сумм 1й и последней пар цифр
		return firstDigit + secondDigit == thirdDigit + fourthDigit;
	}
	/* ======================================================================== */

	/* ============определяем количество цифр в числе===================== */
	public static int checkNumberOfDigits(int num) {

		if (num < 0)
			num *= -1; // избавляемся от минуса, если таковой есть

		int counter = 0;
		while (num > 0) {
			num /= 10; // кол-во таких делений и будет количеством цифр
			counter++;
		}

		return counter;
	}
	/* ======================================================================== */

}
