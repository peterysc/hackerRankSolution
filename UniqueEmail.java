package hackerrank;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
/*
 *  given a text file with N number of email lists, find the unique ones and print them in the order 
 *  it appeared from the text file
 */

// run time of O(n)
// space O(n) - doublecheck for hashmap at a large number of keys

public class UniqueEmail {
	
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("src/hackerrank/emailListTest.txt"));
		String currentLine;
		HashMap<String,Integer> urlList = new HashMap<String,Integer>();
		Queue<String> urlOrder = new LinkedList<>();
		int count;
		
		while((currentLine = in.readLine()) != null){
			if(!urlList.containsKey(currentLine)){
				count = 1;
				urlList.put(currentLine, count);
			}else{
				count = urlList.get(currentLine);
				count += 1;
				urlList.put(currentLine, count);
			}
			urlOrder.add(currentLine);
		}
		while(urlOrder.peek()!=null){
			String first = urlOrder.peek();
			int occurence = urlList.get(first);
			if(occurence == 1){
				System.out.println(first);
			}
			urlOrder.poll();
		}
		in.close();
	}

}
