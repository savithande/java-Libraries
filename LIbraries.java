package example.javalibraries1;

public class LIbraries {
	
	public void compare(String str1,String str2) {
		if (str1 == str2) {
			System.out.println("both are equals");
		}
		else {
			System.out.println("both are not equals");
		}
		
	}
	public void compareEquals(String str1,String str2) {
		if (str1.equals(str2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	 public static void main(String[] args) {
		 String str1 = new String("Savitha");
		 String str2 = "Savitha";
			
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println();
		System.out.println(str2.toString());
		System.out.println(str1.toString());
		
		LIbraries li = new LIbraries();
		System.out.println();
		System.out.println("this is == used to compare 2 strings");
		li.compare(str1, str2);
		System.out.println();
		System.out.println("this is equals() used to comapre 2 strings");
		li.compareEquals(str1, str2);
 
	}

}
