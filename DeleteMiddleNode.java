package hackerrank;

public class DeleteMiddleNode {
	
	public static void main(String[] args){
//		Node seventh = new Node(7,null);
		Node sixth = new Node(6, null);
		Node fifth = new Node(5, sixth);
		Node fourth = new Node(4,fifth);
		Node third = new Node(3,fourth);
		Node second = new Node(2,third);
		Node head = new Node(1,second);
		
		deleteMiddle(head);
		while(head!= null){
			System.out.println(head.value);
			head = head.next;
		}
		
	}
	
	private static void deleteMiddle(Node start){
		int length = 0;
		int mid;
		Node curr = start;
		Node prev = start;
		while(curr!=null){
			curr=curr.next;
			length++;
		}
		if(length%2==0){
			mid = length/2;
		}else{
			mid = (int) Math.floor(length/2) +1;	
		}

		for(int i = 0; i < mid-1; i++){
			prev = start;
			start = start.next;
		}
		
		prev.next = start.next;
		start.next = null;
	}

}
