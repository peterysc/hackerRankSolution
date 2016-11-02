package hackerrank;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class MyQueue <T>{
	
	
	private static class QueueNode<T>{
		private T data;
		private QueueNode<T> next;
		
		public QueueNode(T data){
			this.data = data;
		}
	}
	
	private QueueNode<T> first;
	private QueueNode<T> last;
	
	private Queue<Integer> queue = new LinkedList<Integer>();
	private LinkedList<Integer> n1 = new LinkedList<Integer>();
	
	
	public void add(T item){
		
		QueueNode<T> temp = new QueueNode<T> (item);
		if(last!= null){
			last.next = temp;
		}

		last = temp;
		if(first == null){
			first = last;
		}
		
	}
	
	public T remove(){
		if(first==null){
			throw new NoSuchElementException();
		}
		T data = first.data;
		if(first == null){
			last = null;
		}
		first = first.next;
		
		return data;
		
	}
	
	public T peek(){
		if(first == null) throw new NoSuchElementException();
		return first.data;
	}
	
	public boolean isEmpty(){
		return (first == null);
	}
}
