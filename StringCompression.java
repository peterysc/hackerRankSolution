package hackerrank;

public class StringCompression {
	
	public static void main(String[] args){
		String ex1 = "aabcccccaaa";
		String compressedex1 = compressString(ex1);
		System.out.println(compressedex1);
	}
	
	public static String compressString(String str){
		
		StringBuilder strResult = new StringBuilder();
		int strLength = str.length();
		int count = 0;
		
		for(int i = 0; i< str.length(); i++){
			count ++;
			if(i +1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
				strResult.append(str.charAt(i));
				strResult.append(count);
				count = 0;
			}
		}
		
		String result = strResult.toString();
		if(result.length() > strLength) return str;
		
		return result;
	}
}
