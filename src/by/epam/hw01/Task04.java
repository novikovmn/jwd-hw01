package by.epam.hw01;

/* 04. Cоставить линейную программу, которая печатает true, если 
 * точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае */

public class Task04 {

	public static void main(String[] args) {

		System.out.println(checkCoord(1, 2));

	}

	public static boolean checkCoord(int x, int y) {
		if ((x >= -2 && x <= 2) && (y >= -3 && y <= 4)) {
			return true;
		} else if ((x < -2 || x > 2) && (y >= -3 && y <= 0)) {
			return true;
		}
		return false;
	}

}
