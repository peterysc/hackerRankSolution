package hackerrank;

public class Partition {

	public static void main(String[] args){
		int k = 5;
		Node head = new Node(1,null);
		
		head = partitionNode(k, head);
	}

	private static Node partitionNode(int k, Node head) {
		// TODO Auto-generated method stub
		Node curr = head;
		Node lesser = null;
		Node lesserStart = null;
		Node greater = null;
		Node greaterStart = null;
		
		while(curr!=null){
			if(curr.value < k){
				if(lesser==null){
					lesser = curr;
					lesserStart = curr;
				}else{
					lesser.next = curr;
					lesser = lesser.next;
				}
			}else{
				if(greater==null){
					greater = curr;
					greaterStart = curr;
				}else{
					greater.next = curr;
					greater = greater.next;
				}
			}
			curr = curr.next;
		}
		
		if(lesserStart == null){
			return greaterStart;
		}
		if(greaterStart == null){
			return lesserStart;
		}
		
		lesser.next = greaterStart;
		
		return lesserStart;
	}
}

