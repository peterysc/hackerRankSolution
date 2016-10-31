package hackerrank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeLL {
	
	public static void main(String[] args){
		Node fifth = new Node(1, null);
		Node fourth = new Node(2,fifth);
		Node third = new Node(3,fourth);
		Node second = new Node(2,third);
		Node head = new Node(1,second);
		
		Node n5 = new Node(3, null);
		Node n4 = new Node(5, n5);
		Node n3 = new Node(4, n4);
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1,n2);
		
		boolean result = checkPalindrome(head);
		System.out.println(result);
		result = checkPalindrome(n1);
		System.out.println(result);
	}
	
	private static boolean checkPalindrome(Node start){
		if(start == null) return true;
		Stack<Integer> storage = new Stack<Integer>();
	
		Node slow = start;
		Node fast = start;

		while(fast!=null && fast.next!=null){
			fast = fast.next.next;
			storage.push(slow.value);
			slow = slow.next;
		}
		if(fast!=null){ // has odd number of elements, skip middle
			slow = slow.next;
		}
		
		while(slow!=null){
			
			int top = storage.pop().intValue();
			if(top!=slow.value){
				return false;
			}
			slow = slow.next;
		}
		
		return true;
	}
	
}

// 1 2 3 2 1 size = 5
// 1 2
//

// 1 2 3 4 size = 4
// 1 2 

// 1 2 3 2 1

// get the size of the linkedlist
// enqueue everything until size / 2
// dont do anything for the mid
// dequeue everything until the loop ends

// if the queue is not empty, then its not palindrome
// if the queue is empty, then it is palindrome


// for the sea (value =0) or island(value =1) in nxn array
// loop through first row and see if 1 is detected; as you loop through add the current grid
// to hashset <- memoization
// once you detect one, do BFS on top, left, right and bottom (no diagonals as they dont matter)
// when you do BFS, add the grid checked to the hashset
// keep iterationg through row for all n rows -> do not bother checking the grids that are already in hashset
