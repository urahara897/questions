package practice;

import java.util.HashMap;
import java.util.Scanner;

import org.testng.annotations.Test;

public class singleoccurance {

	@Test
	public void tc1() {
		
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str1 = sc.nextLine();
		//System.out.println("First repeated character");
		
		int j = str1.length()-1;
		for (int i = 0; i<= j; i++) {
			
			if(charCountMap.containsKey(str1.charAt(i))) {
				
				System.out.println("First repeated character is " +str1.charAt(i));
				break;
				
			}
			
			else {
				
				charCountMap.put(str1.charAt(i), 1);
				
			}
			
		}
		
		
	}
	
}
