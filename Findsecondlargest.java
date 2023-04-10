package week2.day1;

import java.util.Arrays;

public class Findsecondlargest {

	public static void main(String[] args) {
	int data[]= {3,2,11,4,6,7};
	int length = data.length;
	Arrays.sort(data);
	for (int i = 0; i < data.length; i++) {
	
	System.out.println(+data[i]);
	}
	System.out.println("The second largest element is: " +data[length-2]);
	
		
	}
	

	

}
