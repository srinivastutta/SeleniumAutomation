package javaConcepts;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		int a[][] = new int[3][3];

		// 1st row
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;

		// 2nd row
		a[1][0] = 40;
		a[1][1] = 50;
		a[1][2] = 60;

		// 3rd row
		a[2][0] = 70;
		a[2][1] = 80;
		a[2][2] = 90;

		//System.out.println(a[0][0]);
		//System.out.println(a[2][2]);
		
		for (int row= 0; row < a.length; row++) {
			for (int col = 0; col < a[0].length; col++) {
					System.out.println(a[row][col]);
			}
}}

}
