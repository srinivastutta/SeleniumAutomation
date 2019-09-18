package javaConcepts;

public class ConstructorConcept {

	public ConstructorConcept() {
		System.out.println("test");
	
	}
	public ConstructorConcept(int i) {
		System.out.println(i);
	
	}
	public ConstructorConcept(int i, int j) {
		System.out.println(i);
		System.out.println(j);
	}
	public static void main(String[] arg) { //when we create of object of class name and run the program,
		//it will automatically run constructor 
		ConstructorConcept obj = new ConstructorConcept ();
		ConstructorConcept obj1 = new ConstructorConcept (10);
		ConstructorConcept obj2 = new ConstructorConcept (20,30);
		
	}

}
