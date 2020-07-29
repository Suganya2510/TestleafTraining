package week3.day2;

public class ReverseString {

	public static void main(String[] args) {
		 
		String str = "feeling good";
		 
		 //Convert the String to character array
		
		char[] charArray = str.toCharArray();
		
		// Traverse through each character (using loop in reverse direction)
		
		int length = str.length();
		
		for (int i = length - 1; i >= 0; i--) {
			
			System.out.println(str.charAt(i));
		}
		
		
		
	}

}
