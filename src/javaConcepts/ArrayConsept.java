package javaConcepts;

public class ArrayConsept {

	public static void main(String[] args) {

		String a[] = new String[2];
		
		a[0]="Srinivas";
		a[1]="Vedik";
		
		System.out.println(a.length);
		
		for(int i=0; i <a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("******************");
		int b[] = new int[2];
			
			b[0]=10;
			b[1]=20;
			
			System.out.println(b.length);
			
			for(int i=0; i <b.length;i++) {
				System.out.println(b[i]);
			
		}
}}