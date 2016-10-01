package hackerrank;

import java.util.Scanner;

//input :
//4 2  meaning array with 4 elements, shift right twice
//1 2 3 4   array

// output : 3 4 1 2

public class ArrayRightRotation {

	public static int[] arrayRightRotation(int[] a, int n, int k){
		
		// doing k number of loops
		for(int i = 0; i < k; i++){
			int lastNum = a[n-1];
			int j;
			for(j = n-1; j >0;j--){
				a[j] = a[j-1]; 
			}
			a[j] = lastNum;
		}
		
		return a;
	}
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayRightRotation(a, n, k);
        for(int i = 0; i < n; i++){
        	System.out.print(output[i] + " ");
        }
            
      
        System.out.println();
      
    }
}
