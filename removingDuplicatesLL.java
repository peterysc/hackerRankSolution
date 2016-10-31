package hackerrank;

import java.util.HashSet;

public class removingDuplicatesLL {
	public static void main(String[] args){
		Node head = new Node(1,null);
		removeDuplicate(head);
		
	}

	private static void removeDuplicate(Node head) {
		// TODO Auto-generated method stub
		HashSet<Integer> elements = new HashSet<Integer>();
		Node prev = null;
		Node curr = head;
		while(curr!=null){
			if(elements.contains(curr.value)){
				prev.next = curr.next;
				curr.next = null;
			}else{
				elements.add(curr.value);
				prev = curr;
			}
			curr = curr.next;
		}
	}
	
	

}


class DNode{
	int value;
	DNode prev;
	DNode next;
}