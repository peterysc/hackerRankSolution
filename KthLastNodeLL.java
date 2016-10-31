package hackerrank;

public class KthLastNodeLL {
	
	public static void main(String[] args){
		
		Node seventh = new Node(7,null);
		Node sixth = new Node(6, seventh);
		Node fifth = new Node(5, sixth);
		Node fourth = new Node(4,fifth);
		Node third = new Node(3,fourth);
		Node second = new Node(2,third);
		Node head = new Node(1,second);

		int k = 3;
		Node result = kthLastNodeRecursion(head,k);
		Node result2 = kthLastNodeIteration(head,k);
		System.out.println(result.value);
		System.out.println(result2.value);
	}
	
	private static Node kthLastNodeIteration(Node head, int k) {
		// TODO Auto-generated method stub
		Node curr = head;
		
		for(int i =0; i< k; i ++){
			curr = curr.next;
		}
		
		return curr;
	}

	private static Node kthLastNodeRecursion(Node head, int k) {
		// TODO Auto-generated method stub
		Node curr = head;
		if(k==0){
			return curr;
		}
		return kthLastNodeRecursion(head.next, k-1);
	}

	
}
