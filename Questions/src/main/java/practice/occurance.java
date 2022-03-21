package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import org.testng.annotations.Test;

import com.google.common.base.CharMatcher;

public class occurance {
    
	@Test
	public void tc1() {
	
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str1 = sc.nextLine();
		int number;
		int j = str1.length()-1;
		for (int i = 0; i<= j; i++) {
			
			if(charCountMap.containsKey(str1.charAt(i))) {
				
				number = charCountMap.get(str1.charAt(i));
				charCountMap.put(str1.charAt(i), ++number);
						
				
			}
			
			else {
				
				charCountMap.put(str1.charAt(i), 1);
				
			}
			
		}
		System.out.println(charCountMap);
		
		
		
	}
	
	
	
	
}
