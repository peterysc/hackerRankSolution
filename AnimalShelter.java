package hackerrank;

import java.util.LinkedList;
import java.util.Queue;


public class AnimalShelter {
	
	private static class Animal{
		Queue<Animal> animalShelter = new LinkedList<Animal>();
		
		String type;
		private Animal(String type){
			this.type = type;
		}
		
		String getType(){
			return this.type;
		}
		
		void setType(String type){
			this.type = type;
		}
		
		void enqueue(String type){
			Animal newAni = new Animal(type);
			animalShelter.add(newAni);
			animalShelter.peek();
		}
		
		
	}
	
	
	Queue<String> qe = new LinkedList<String>();
	Queue qu = new LinkedList<>();
	
	
	LinkedList<String> first;
	String type;
	
	private static void enqueue(String type){
		Animal newAnimal = new Animal(type);
		
	}
	
	private static LinkedList<String> dequeueAny(){
		return null;
	}
	
	private static LinkedList<String> dequeueCat(){
		return null;
	}
	
	private static LinkedList<String> dequeueDog(){
		return null;
	}

}
