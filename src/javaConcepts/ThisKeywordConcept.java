package javaConcepts;

public class ThisKeywordConcept {

	String name;
	int age;		
	
	public ThisKeywordConcept (String name, int age) {
	
		this.name=name;
		this.age=age;
		
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String[] args) {
		ThisKeywordConcept obj= new ThisKeywordConcept("Srinivas", 38);
	
	}

}
