package hackerrank;

public class StringRotation {
	public static void main(String[] args){
		String waterbottle = "waterbottle";
		String erbottlewat = "erbottlewat";
		
		boolean result = rotateString(waterbottle, erbottlewat);
		System.out.println(result);
	}
	
	static boolean rotateString(String s1, String s2){
		if(s1.length()!=s2.length()){
			return false;
		}
		StringBuilder news2 = new StringBuilder();
		news2.append(s2);
		news2.append(s2);
		String news2Str = news2.toString();
		
		return isSubstring(news2Str, s1);
	}

	// this function will return true if s2 is a substring of s2
	// assume built-in
	private static boolean isSubstring(String s1, String s2) {
		// TODO Auto-generated method stub
		return true;
	}
}
