package week1.day1;

public class OddNumbers {
	
	
	/*
	 * Goal: Find the odd numbers in the specific range of numbers
	 * 
	 * Input: range of numbers (starting to end) [1 to 20]
	 * Output: Printing only odd numbers [1,3,5,7,9...,19]
	 * 
	 * Shortcuts:
	 * 1) Print : type 'syso', followed by ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 * 
	 * What are my learnings from this code?
	 * 
	 * 1) how for and if can be worked together
	 * 2) modulus operator behaviour
	 * 3) short cut keys usage for syso, for and if
	 * 
	 */
	  

	public static void main(String[] args) {
		
		 //	Iterate from 1 to 20 (tip: using loop concept)
		
		for (int i = 1; i <= 20 ; i++) {
			
			if ( i%2 != 0) {
			
			System.out.println(i);
			
		}
			
		}

		//	Within loop -> check whether the integer is odd (tip: use mod operator)

		//	Within loop -> print the odd integer

	}

}


