package hackerrank;

import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args){
		String[] a = {"a","c","d","w","p","z","s","r","a"};
		Integer[] abc = {7,6,23,4,1,2,3,4,99,5};
		
		mergesort(a);
		mergesort(abc);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(abc));
		
	}

	@SuppressWarnings("rawtypes")
	private static Comparable[] mergesort(Comparable[] list) {
		// TODO Auto-generated method stub
		if(list.length <= 1){
			return list;
		}
		
		Comparable[] firstHalf = new Comparable[list.length/2];
		Comparable[] secondHalf = new Comparable[list.length- firstHalf.length];
		System.arraycopy(list, 0, firstHalf, 0, firstHalf.length);
		System.arraycopy(list, firstHalf.length, secondHalf, 0, secondHalf.length);
		
		mergesort(firstHalf);
		mergesort(secondHalf);
		
		merge(firstHalf,secondHalf,list);
		return list;
	}

	@SuppressWarnings("unchecked")
	private static void merge(Comparable[] firstHalf, Comparable[] secondHalf, Comparable[] list) {
		// TODO Auto-generated method stub
		int firstIndex = 0;
		int secondIndex = 0;
		int mergedIndex = 0;
		
		while(firstIndex < firstHalf.length && secondIndex < secondHalf.length){
			if(firstHalf[firstIndex].compareTo(secondHalf[secondIndex]) < 0){
				list[mergedIndex] = firstHalf[firstIndex];
				firstIndex++;
			}else{
				list[mergedIndex] = secondHalf[secondIndex];
				secondIndex++;
			}
			mergedIndex++;
		}
		
		System.arraycopy(firstHalf, firstIndex, list, mergedIndex, firstHalf.length - firstIndex);
		System.arraycopy(secondHalf, secondIndex, list, mergedIndex, secondHalf.length - secondIndex);
	}
}


