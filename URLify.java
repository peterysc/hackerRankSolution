package hackerrank;

public class URLify {

	public static void main(String[] args){
		String test1 = "Mr John Smith      ";
		String test2 = "Mr Peter Chung    ";
		int test1Length = 13;
		int test2Length = 14;
		String result;
		String result2;
		result = urlifyString(test1,test1Length);
		result2 = urlifyString(test2, test2Length);
		System.out.println(result);
		System.out.println(result2);
		result = urlifyStringSol(test1,test1Length);
		result2 = urlifyStringSol(test2,test2Length);
	}

	private static String urlifyStringSol(String test2, int test2Length) {
		// TODO Auto-generated method stub
		int spaceCount = 0;
		int index = 0;
		int i = 0;
		char[] strArr = test2.toCharArray();
		
		for(i = 0; i < test2Length; i++){
			if(strArr[i] == ' '){
				spaceCount++;
			}
		}
		
		index = test2Length + spaceCount*2;
		if(test2Length < strArr.length){
			strArr[test2Length] = '\0'; // end array
		}
		for(i = test2Length - 1; i>=0; i--){
			if(strArr[i] == ' '){
				strArr[index-1] = '0';
				strArr[index-2] = '2';
				strArr[index-3] = '%';
				index -= 3;
			}else{
				strArr[index-1] = strArr[i];
				index--;
			}
		}
		String result = strArr.toString();
		return result;
	}

	private static String urlifyString(String test1, int test1Length) {
		// TODO Auto-generated method stub
		char[] oneChar = test1.toCharArray();
		StringBuilder result = new StringBuilder();
		result.append(oneChar[0]);
		
		for(int i = 1; i < test1Length; i ++){
//			if(oneChar[i] == ' '){
//				result.append("%20");
//			}
//			if(oneChar[i] != ' '){
//				result.append(oneChar[i]);
//			}
			if(oneChar[i-1]==' ' && oneChar[i] != ' '){
				result.append("%20");
				result.append(oneChar[i]);
			}else if(oneChar[i] != ' '){
				result.append(oneChar[i]);
			}
		}
		String strResult = result.toString();
		return strResult;
	}
}
