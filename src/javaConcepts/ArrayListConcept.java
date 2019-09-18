package javaConcepts;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList<String> ar1 = new ArrayList<String>();

		ar1.add("Srinivas");
		ar1.add("1981");
		ar1.add("Vrushaba");

		ArrayList<String> ar2 = new ArrayList<String>();

		ar2.add("Vedik");
		ar2.add("2015");
		ar2.add("Vrushaba1");

		//System.out.println(ar1);
		//System.out.println(ar1.size());
		
		ar1.addAll(ar2);
		ar1.removeAll(ar2);
		
		for (int i = 0; i < ar1.size(); i++) {
			System.out.println(ar1.get(i));

		}

	}
}
