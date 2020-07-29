package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingCollection {

	public static void main(String[] args) {
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		
		List<String> values = new ArrayList<String>();
		
			
		
		for (int i = 0; i < values.size(); i++) {
			System.out.println(values.get(i));	
		}
	
		
		Collections.sort(values);
	}
}
