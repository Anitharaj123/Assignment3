package week2.day1;



public class ArrayDuplicatevalue {

	

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count = arr.length;
	
		for (int i = 0; i < count-1; i++) {
			
			for (int j = i+1; j < count; j++) {
				if(arr[i]==arr[j])
				{
				System.out.println("The dulicate numbers in set is "+arr[j]);
				}
				
			}
			
		}

	}

}
