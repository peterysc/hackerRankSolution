package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/*
 * create your own data structure that handles the following operation in O(1) time
 * add, delete, search and findRandom
 * 
 * Your data structure will have integers stored in it 
 * 
 * find random finds any random integers from your data structure
 * 
 * assume there are no duplicates for now
 */
public class CreateYourOwnDataStructure {
	
	static HashMap<Integer,Integer> numbers;
	static Queue<Integer> lastDeletedIndex;
	static ArrayList<Integer> numberIndex;
	
	public static void main(String[] args){
		numbers = new HashMap<Integer,Integer>();
		lastDeletedIndex = new LinkedList<Integer>();
		numberIndex = new ArrayList<Integer>();
		add(2);
		add(8);
		add(10);
		add(9);
		add(1);
		delete(1);
		add(5);
		int rand = findRandom();
		System.out.println(numberIndex);
		System.out.println(rand);
	}
	
	static void add(int n){
		// O(1)
		if(lastDeletedIndex.peek()!=null){
			int lastIndex = lastDeletedIndex.remove();
			numberIndex.add(lastIndex,n);
		}else{
			numberIndex.add(n);
		}
		int lastInsertedIndex = numberIndex.indexOf(n);
		numbers.put(n, lastInsertedIndex);

	}
	
	static void delete(int n) throws NullPointerException{
		// O(1)
		if(!numbers.containsKey(n)){
			System.out.println("Number not in the hashmap");
			return;
		}
		int indexToBeDeleted = numbers.get(n);
		numbers.remove(n);
		numberIndex.remove(indexToBeDeleted);
		lastDeletedIndex.add(indexToBeDeleted);
	}
	
	boolean search(int n){
		// O(1)
		boolean isNumFound = numbers.containsKey(n);
		return isNumFound;
	}
	
	static int findRandom(){
		// O(1)
		int arraySize = numberIndex.size();
		int randomIndex = (int) (Math.random() * arraySize);
		int randomNum = numberIndex.get(randomIndex);
		return randomNum;
	}
}
