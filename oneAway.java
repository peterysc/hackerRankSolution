package hackerrank;

public class oneAway {

	public static void main(String[] args){
		String pale = "pale";
		String ple = "ple";
		String pales = "pales";
		String bale = "bale";
		String bake = "bake";
		String sports = "sports";
		
		boolean result = checkOneAway(pale,ple);
//		boolean result2 = checkOneAway(pale,pales);
//		boolean result3 = checkOneAway(pale,bale);
//		boolean result4 = checkOneAway(pale,bake);
//		boolean result5 = checkOneAway(ple,sports);
		
		System.out.println(result);
//		System.out.println(result2);
//		System.out.println(result3);
//		System.out.println(result4);
//		System.out.println(result5);
	}
	
	static boolean checkOneAway(String one, String two){
		char[] oneChar = one.toCharArray();
		char[] twoChar = two.toCharArray();
		if(Math.abs(oneChar.length - twoChar.length) > 1){
			return false;
		}
		
		String longer = (one.length() > two.length())? one:two;
		String shorter = (one.length() > two.length())? two:one;
		System.out.println(longer);
		System.out.println(shorter);
		int firstIndex = 0;
		int secondIndex = 0;
		boolean found = false;
		
		while(firstIndex < longer.length() && secondIndex < shorter.length()){
			if(longer.charAt(firstIndex) != shorter.charAt(secondIndex)){
				if(found) return false;
				found = true;
				if(longer.length() == shorter.length()){
					secondIndex++;
				}
			}
			if(longer.charAt(firstIndex) == shorter.charAt(secondIndex)){

				secondIndex++;
			}
			firstIndex++;
		}
		
		return found;
	}
}
