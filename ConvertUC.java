package week2.day1;



public class ConvertUC {

	public static void main(String[] args) {
		String test = "changeme";
		char[] chr=test.toCharArray();
		for (int i = 0; i < chr.length; i++) 
			if(i%2==0){
			char uppercase=Character.toUpperCase(chr[i]);
			System.out.print(uppercase);
		}
			else {
			System.out.print(chr[i]);
			
		}	
		
	}
}
