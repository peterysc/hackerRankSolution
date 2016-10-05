package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MakingAnagram {
	
	public static int numberNeeded(String first, String second) {
        char[] firstCharArr = first.toCharArray();
        char[] secondCharArr = second.toCharArray();
        ArrayList<String> anagram = new ArrayList<String>();
        
        int count = 0;
        
        for(int i=0; i< firstCharArr.length; i++){
        	for(int j = secondCharArr.length-1; j>0; j--){
        		if(firstCharArr[i]==secondCharArr[j]){
        			anagram.add(Character.toString(firstCharArr[i]));
        			count++;
        			break;
        		}
        		
        	}
        }
        System.out.println(anagram);
        System.out.println(anagram.size());
        System.out.println(count);
        int totalLength = firstCharArr.length + secondCharArr.length;
        int duplicate = totalLength-(2*count);
        return duplicate;
        
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String first = in.next();
        String second = in.next();
        System.out.println(numberNeeded(first, second));
    }
}
