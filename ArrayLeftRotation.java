package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// input :
// 4 1  meaning array with 4 elements, shift left once
// 1 2 3 4   array
// output: 2 3 4 1

public class ArrayLeftRotation {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
    // k number of rotation to left
        for(int i = 0; i < k; i++){
            int j;
            int temp = a[0];
            for(j = 0; j < n-1; j++){
                a[j] = a[j+1];
            }
            a[j] = temp;
            
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
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++){
        	System.out.print(output[i] + " ");
        }
            
      
        System.out.println();
      
    }
}
