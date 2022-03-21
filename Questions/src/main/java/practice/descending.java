package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import org.apache.commons.lang.ArrayUtils;
import org.testng.annotations.Test;

public class descending {

	@Test
	public void tc1() {
		
		Scanner sc=new Scanner(System.in);
		int[] arr1 = new int[4];
		System.out.println("Enter the numbers in the array");
		for (int i = 0; i < 4 ; i++) {
			
			arr1[i] = sc.nextInt();
			
		}
		
		System.out.println("Original array elements ");
		//Arrays.sort(arr1, Collections.reverseOrder());
        for (int i = 0; i < 4 ; i++) {
			
			System.out.println(arr1[i]);
			
		}
		
        Arrays.sort(arr1);
        ArrayUtils.reverse(arr1);
        System.out.println("Array after sorting");
        for (int i = 0; i < 4 ; i++) {
			
			System.out.println(arr1[i]);
			
		}
		
		
	}
	
}
