package javaConcepts;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner InputString = new Scanner(System.in);
		System.out.println("Enter a String");
		String str=InputString.next();
		InputString.close();
		String RevString="";
		
		//System.out.println(str.length());
		
		//Convert String into Array
		char [] ch=str.toCharArray();
		
		for (int i = str.length()-1; i >= 0; i--) {
				RevString=RevString+ch[i];
					
		}
			System.out.println(RevString);
		
			if (str.equals(RevString)) {
				System.out.println(str + " is palindrome");
			} else {
				System.out.println(str = " not palindrome");
			}
	}}
