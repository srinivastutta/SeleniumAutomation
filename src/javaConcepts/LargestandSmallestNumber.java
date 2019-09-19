package javaConcepts;

public class LargestandSmallestNumber {

	public static void main(String[] args) {
		int numbers[] = { 20, 40, 76, -99, 55, 12345, -89 };

		int largenumber = numbers[0];
		int smallnumber = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largenumber) {
				largenumber = numbers[i];
			} else if (numbers[i] < smallnumber) {
				smallnumber = numbers[i];

			}

		}
		System.out.println("Large number in given Array is " +largenumber);
		System.out.println("Small number in given Array is " +smallnumber);
	}
}
