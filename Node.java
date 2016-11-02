package hackerrank;

import java.util.LinkedList;

public class Node {
	int value;
	Node next;
	LinkedList<String> animalNode = new LinkedList<String>();
	
	public Node(int value, Node next){
		this.value = value;
		this.next = next;
	}

}
