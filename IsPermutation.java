package hackerrank;

import java.util.Arrays;

public class IsPermutation {

	public static void main(String[] args){
		String first = "onetwoThree";
		String second = "onettttt";
		String third = "hello";
		String fourth = "ellop";
		String dog = "dog";
		String god = "god";
		
		boolean check1 = checkPermutation(first,second);
		boolean check2 = checkPermutation(third,fourth);
		boolean check3 = checkPermutation(dog,god);
		
		System.out.println(check1);
		System.out.println(check2);
		System.out.println(check3);
		
		check1 = checkPermutation2(first,second);
		check2 = checkPermutation2(third,fourth);
		check3 = checkPermutation2(dog,god);
		
		System.out.println(check1);
		System.out.println(check2);
		System.out.println(check3);
	}
	
	// O(n lgn) where n = string length
	static boolean checkPermutation(String one, String two){
		
		char[] oneChar = one.toCharArray();
		char[] twoChar = two.toCharArray();
		Arrays.sort(oneChar);
		Arrays.sort(twoChar);
		String oneStr = new String(oneChar);
		String twoStr = new String(twoChar);
		
		if(oneStr.equals(twoStr)){
			return true;
		}
		
		// 
		return false;
	}
	
	// O(n)
	static boolean checkPermutation2(String one, String two){
		
		if(one.length() != two.length()){
			return false;
		}
		int[] alphabets = new int[128];
		
		char[] oneChar = one.toCharArray();
		
		for(char c : oneChar){
			alphabets[c]++;
		}
		
		for(int i = 0; i< two.length(); i++){
			int c = (int) two.charAt(i);
			alphabets[c]--;
			
			if(alphabets[c] < 0) {
				System.out.println(c);
				return false;
			}
		}
		
		return true;
	}
}
