package javaConcepts;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
	System.out.println("Enter any Character from - RGB");
	
	Scanner sc= new Scanner(System.in);
	String MyColor=sc.nextLine();
	
	switch (MyColor) {
	case "R":
		System.out.println("Your Choice Is Red");
		break;
	case "G":
		System.out.println("Your Choice Is Green");
		break;
	case "B":
		System.out.println("Your Choice Is Blue");
		break;

	default:
		System.out.println("Your Choice is Invalid");
		break;
	}
	}

}
