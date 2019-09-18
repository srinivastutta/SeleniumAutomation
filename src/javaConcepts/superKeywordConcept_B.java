package javaConcepts;

public class superKeywordConcept_B extends  superKeywordConcept_A{
	
	public superKeywordConcept_B() {
		//super keyword will be used to call parent constructor
		super(10,20);
		System.out.println("Childclass");
	}
	
	
	public static void main(String[] args) {
		superKeywordConcept_B obj= new superKeywordConcept_B();
	}

}
