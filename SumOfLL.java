package hackerrank;

public class SumOfLL {

	public static void main(String[] args){
		
		Node second = new Node(2,null);
		Node head = new Node(9,second);
		Node head2 = new Node(1, null);
		
		int carryOver = 0;
		Node result = sumList(head, head2, carryOver);
		while(result!=null){
			System.out.println(result.value);
			result = result.next;
		}
	}
	
	private static Node sumList(Node n1, Node n2, int carryOver){
		
		if(n1==null && n2==null && carryOver==0) return null;
		
		Node result = new Node(0,null);
		int tempSum = carryOver;
		if(n1 != null){
			tempSum += n1.value;
		}
		if(n2 != null){
			tempSum += n2.value;
		}
	
		result.value = tempSum % 10;
		result.next = sumList((n1==null)? null: n1.next,(n2==null)? null:n2.next, (tempSum >=10)? 1:0);
		
		return result;
	}
}
