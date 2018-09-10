package javaConcepts;

import java.util.Scanner;

public class StudentMarksNGrades {

	public static void main(String[] args) {
		int StMarks;
		String StGrade;
		
		System.out.println("Enter Student Marks:");
		
		//to read marks from console
		
		Scanner sc= new Scanner(System.in);
		StMarks=sc.nextInt();

		if (StMarks >= 90) {
			StGrade = "A";
		}
		else if (StMarks >=80) {
			StGrade = "B";
		}
		else if (StMarks >=70) {
			StGrade = "C";
		}
		else {
			StGrade = "D";
		}
		
		System.out.println("Student Marks: "+StMarks);
		System.out.println("Student Grade: "+StGrade);
	}

}
