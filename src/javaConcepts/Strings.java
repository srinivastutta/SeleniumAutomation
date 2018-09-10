package javaConcepts;

public class Strings {

	public static void main(java.lang.String[] args) {

		String str = "Manvik & Vedik";
		System.out.println(str);
		
		String str1 = "ABCD";
		System.out.println(str1.length());
	
		String str2 = "Mindq";
		System.out.println(str2.charAt(3));
		
		String str3 = "Systems";
		System.out.println(str3.indexOf("t"));
		
		String str4="ProFit";
		System.out.println(str4.toUpperCase());
		
		String str5="ProFit";
		System.out.println(str5.toLowerCase());

		
		String str6 = "Camel";
		System.out.println(str6.equals("camel"));
		
		String str7 = "Camel";
		System.out.println(str7.equals("Camel"));
		
		String str8 = "Camel";
		System.out.println(str8.equalsIgnoreCase("CAMEL"));
		
		String str9 = "Camel";
		System.out.println(str9.startsWith("Ca"));
		
		String str10 = "Camel";
		System.out.println(str10.startsWith("Ca"));
		
		String str11 = "Camel";
		System.out.println(str11.startsWith("ca"));
		
		String str12 = "Ruby";
		System.out.println(str12.endsWith("by"));
		
		String str13 = "Ruby";
		System.out.println(str13.endsWith("BY"));
		
		String str14 = "MindQ Tech";
		System.out.println(str14.contains("Tech"));
		
		String str15 = "My Name is ";
		String str16 = "Jack";
		System.out.println(str15.concat(str16));
		
		String str17 = " Selenium ";
		System.out.println(str17.trim().length());
		
		String str18="mindqsystems";
		System.out.println(str18.replace("m", "@"));
		
		String str19="mindqsystems";
		System.out.println(str19.isEmpty());
		
		String str20="";
		System.out.println(str20.isEmpty());
		
		String str21="Mindqsystems";
		System.out.println(str21.substring(5));
		System.out.println(str21.substring(5, 7));
		System.out.println(str21.substring(5, 8));

	}
}
