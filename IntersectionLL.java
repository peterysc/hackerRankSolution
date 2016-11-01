package hackerrank;

public class IntersectionLL {
	
	// given two linked list, find the intersection of the two if it exists
	// length unknown
	// they might not have any intersection
	// none of the linkedlists are circular
	
	public static void main(String[] args){
		Node n1 = new Node(1,null);
		Node n3 = new Node(2,n1);
		
		Node n2 = new Node(2,n1);
		Node intersection = findIntersection(n1,n3);
		System.out.println(intersection);
		System.out.println(n1);
	}
	
	private static Node findIntersection(Node n1, Node n2){
		if(n1 == null) return null;
		if(n2 == null) return null;
		
		int diff = 0;
		int n1Size = 0;
		int n2Size = 0;
		Node n1Start = n1;
		Node n2Start = n2;
		Node greater = null;
		Node lesser = null;
		
		while(n1Start!=null){
			n1Size++;
			n1Start = n1Start.next;
		}
		
		while(n2Start!=null){
			n2Size++;
			n2Start = n2Start.next;
		}
		
		diff = Math.abs(n1Size - n2Size);
		
		if(n1Size>n2Size){
			greater = n1;
			lesser = n2;
		}else{
			greater = n2;
			lesser = n1;
		}
		
		for(int i =0; i < diff; i++){
			greater = greater.next;
		}
		
		while(lesser!=null && greater!=null){
			if(lesser == greater) return greater;
			lesser = lesser.next;
			greater = greater.next;
		}
		
		return null;
	}
	
}
