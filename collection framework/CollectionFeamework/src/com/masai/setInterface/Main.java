package com.masai.setInterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
/*		Set interface is an unordered collection means it does not store elements in the insertion order or
		also not give output in insertion order.
		-> It also store unique values means it does not allow duplicate elements to store 
		-> set--HashSet
		-> set--LinkedHashSet->(Maintain insertion order it supports linkedList(order Maintained in it) + HashSet(Duplicate is not allowed in it)
		-> set--SortedSet(Interface)--TreeSet  */
		
		
		
//		Insertion order is not maintained in HashSet collection
//		Duplicate is not allowed only unique is allowed
		Set<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(10);
		hashSet.add(30);
		hashSet.add(5);
		hashSet.add(9);
		hashSet.add(5);
		hashSet.add(15);

		
		System.out.println("hashSet : " + hashSet);
		
		
//		toArra() return the array of object[] arr from the set collection
		Object[] arr = hashSet.toArray();
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		System.out.println("\n return the class of object : " + hashSet.getClass());
		
		
		
		
//		LinkedHashSet Follows insertion order according to LinkedList in List collection And 
//		Didn't allow Duplicate value to store because of set Interface
		
		LinkedHashSet<Integer> llSet = new LinkedHashSet<Integer>();
		llSet.add(5);
		llSet.add(2);
		llSet.add(2);
		llSet.add(10);
		llSet.add(16);
		llSet.add(10);
		
		System.out.println(llSet);
		
		ArrayList<Integer> lst = new ArrayList<Integer>();
		lst.add(5);
		lst.add(2);
		lst.add(10);
		lst.add(20);
		
		
		System.out.println(llSet.containsAll(lst));
		System.out.println("LinkedHashSet : "+ llSet);
		System.out.println("ArrayList : " + lst);
		
		
		
//		TreeSet maintain the sorted order because of the orderSet Interface
//		It also not allow to store duplicate value in it
//		It internally using Binary Search in tree to store the sorted values in TreeSet
		
		TreeSet<Integer> tset = new TreeSet<Integer>();
		tset.add(20);
		tset.add(5);
		tset.add(10);
		tset.add(12);
		tset.add(6);
		tset.add(5);
		
		
		
		System.out.println("TreeSet : " + tset);
		System.out.println("TreeSet in descending : " + tset.descendingSet());
		System.out.println("Return the nearest grater or equals to the given element : " + tset.ceiling(11));
		System.out.println("Returns the first (lowest) element currently in this set : " + tset.first());
		System.out.println("Returns the greatest element in this set less than or equal tothe given element, or null if there is no such element. : " + tset.floor(7));
		System.out.println("Returns the least element in this set strictly greater than the given element, or null if there is no such element. : " + tset.higher(10));
		System.out.println("Returns the least element in this set strictly greater than the given element, or null if there is no such element. : "+ tset.last());
		System.out.println("Returns a view of the portion of this set whose elements are strictly less than toElement : " + tset.headSet(12));

		System.out.println("Retrieves and removes the first (lowest) element,or returns null if this set is empty. : "+ tset.pollFirst());
		System.out.println("Retrieves and removes the last (highest) element,or returns null if this set is empty. : "+ tset.pollLast());

//		Retains only the elements in this set that are contained in thespecified collection (optional operation). 
//		In other words, removesfrom this set all of its elements that are not contained in thespecified collection
		tset.retainAll(lst);
		System.out.println("TreeSet : "+ tset);
	    System.out.println("ArrayList : "+lst);
		
		//		Removes from this set all of its elements that are contained in thespecified collection (optional operation).
		tset.removeAll(lst);
	    System.out.println("TreeSet : "+ tset);
	    System.out.println("ArrayList : "+lst);
		
		
		
	}

}
