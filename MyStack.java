package hackerrank;

import java.util.EmptyStackException;

public class MyStack<T> {
	private static class StackNode<T>{
		private T data;
		private StackNode<T> next;
		
		public StackNode(T data){
			this.data = data;
		}
	}
	
	private StackNode<T> top;
	
	public T pop(){
		if(top == null){
			throw new EmptyStackException();
		}
		T item = top.data;
		top = top.next;
		return item;
	}
	
	public void push(T item){
		StackNode<T> tempTop = new StackNode<T>(item);
		tempTop.next = top;
		top = tempTop;
	}
	
	public T peek(){
		if(top == null) throw new EmptyStackException();
		return top.data;
	}
	
	public boolean isEmpty(){
		return top==null;
	}
}
