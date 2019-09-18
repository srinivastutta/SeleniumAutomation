package javaConcepts;

public class DuplicateValueFinding {

	public static void main(String[] args) {
		String names[] = {"Srinivas","Selenium","QTP","RCB","QTP", "Selenium", "Srinivas"};
		
		for(int i = 0; i < names.length; i ++) {
			for (int j = i+1; j < names.length; j++) {
					if(names[i].equals(names[j])) {
						System.out.println("duplicate element name is "+names[i]);
					}
			}
			
		}

	}
}
