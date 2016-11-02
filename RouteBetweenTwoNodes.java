package hackerrank;

import java.util.LinkedList;
import java.util.Queue;

public class RouteBetweenTwoNodes {
	protected class Graph{
		public Node[] nodes;
	}
	
	protected static class Node{
		public String name;
		public Node[] children;
		boolean visited;
		
		public Node(String name, Node[] children){
			this.name = name;
			this.children = children;
			this.visited = false;
		}
		
		Node createNewNode(String name, Node[] children){
			return new Node(name,children);
		}
	}
	
	public static void main(String[] args){
		
		Node b = new Node("b", null);
		Node c = new Node("c", null);
		Node[] eChildren = {};
		Node e = new Node("e", eChildren);
		Node f = new Node("f", null);
		Node[] dChilren = {e,f};
		Node d = new Node("d", dChilren);
		Node[] aChildren = {c,d};
		Node a = new Node("a", aChildren);
		
		boolean result = isThereRoute(a,b);
		System.out.println(result);
	}
	
	public static boolean isThereRoute(Node a , Node b){
		if(a == null || b == null) return false;
		
		Queue<Node> visitedNodes = new LinkedList<Node>();
		visitedNodes.add(a);
		
		while(!visitedNodes.isEmpty()){
			Node curr = visitedNodes.peek();
			visitedNodes.remove();
			if(curr.children!= null){
				for(Node child : curr.children){
					if(child!=null && child.visited == false){
						visitedNodes.add(child);
						if(child==b) return true;
					}
				}
			}
			
		}
		
		return false;
	}
}
