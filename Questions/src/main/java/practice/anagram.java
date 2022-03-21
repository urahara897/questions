package practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.testng.annotations.Test;

public class anagram {

	@Test
	public void tc1() {
		
		int j = 1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string");
		char str1[] = sc.next().toCharArray();
		System.out.println("Enter second string");
		char str2[] =  sc.next().toCharArray();
		int length1 = str1.length;
		int length2 = str2.length;
		Arrays.sort(str1);
		Arrays.sort(str2);
		if (length1 != length2) {
			
			System.out.println("Not an anagram");
			
		}
		else {
			
			for(int i=0;i<length1;i++) {
				
				if (str1[i]!=str2[i]) {
					System.out.println("Not an anagram");
					break;
				}
				
				if(str1[i]==str2[i]) {
					if(j == length1)
						System.out.println("An anagram");
					j++;
				}
				
			}
			
			
		}
		
	}
	
	
}
