package com.masai.listInterface;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
/*		List is a ordered collection means it store data in the insertion order form 
	    -> It allows to store duplicate values in it  */
		
		
//		ArrayList is a Dynamic Array means in this we don't need to provide size according to arrays  
		ArrayList<Integer> lst = new ArrayList<Integer>();
		
		lst.add(10);
		lst.add(20);
		lst.add(25);
		lst.add(30);
		
		lst.add(1, 15);
		
		
		System.out.println("ArrayList output"+lst);
		
		
//		LinkedList
		
		List linkedList = new LinkedList<Integer>();
		
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(30);
		
		System.out.println("linkedList : " + linkedList);
		
		System.out.println("Element Present in linkedList : "+linkedList.contains(60));
		
		System.out.println("return the first index value of object : "+ linkedList.indexOf(20));
		
		System.out.println("return last index of object : " + linkedList.lastIndexOf(30));
		
		List filteredList = lst.stream().filter(p -> p > 10).collect(Collectors.toList());
		
		System.out.println("List we get after filtering : "+ filteredList);
		
		
		List<Integer> numbers = Arrays.asList(12,3,45,18,20,17,6,30);
		numbers.stream().filter(n -> n > 3).forEach(System.out::println);
		
		System.out.println("Adding all linkList in lst :" + lst.addAll(linkedList));
		
		System.out.println(lst);
		
		
		boolean res = linkedList.containsAll(lst);
		
		System.out.println("Output of contains all : " + res);
		
		
//		 System.out.println("Retaining all the element from the given lst : " + lst.retainAll(linkedList));
		 
		System.out.println("removing all the element which are common in both the lst from the lst : "+lst.removeAll(linkedList));
		
		 System.out.println(lst);
		 System.out.println(linkedList);
		 
		 ArrayList<Integer> ltd = new ArrayList<Integer>(linkedList);
		 
		 
		 System.out.println(ltd);
		 
//		 vector is a Syncronised or thread safe but ArrayList is non Syncronised or non thread safe list thats why ArrayList is more
//		 faster then vector
		 Vector<String> vector = new Vector<String>(); 
		 vector.add("Anshul");
		 vector.add("Ajay");
		 vector.add("Lamal");
		 vector.add("Rohit");
		 
		 vector.add(0,"Dev");
		 
		 System.out.println("vector : " +vector);
		 
		
		System.out.println("using removeAll function with vector and ArrayList : " + lst.removeAll(vector));
		
		System.out.println(lst);
		System.out.println(vector);
		
		
		
		
//		Stack class extends vector class because vector is thread safe and because of thread safe we can follow FIFO petorn safely
//		methods of stack : push(), pop(), peek();
		
		Stack<Integer> st = new Stack<Integer>();
		st.push(10);
		st.add(10);
		st.push(20);
		st.push(30);
		
		System.out.println("Stack : " + st);
		
		System.out.println("peek() : "+ st.peek());
		
		System.out.println("Stack pop() : " + st.pop());
		
		System.out.println("Stack : " + st);
		
		System.out.println("current capacity of stack : "+st.capacity());
		
		System.out.println("return last element of stack : "+ st.lastElement());
		
		
		
		
		
		
		
		
		
	}

}
