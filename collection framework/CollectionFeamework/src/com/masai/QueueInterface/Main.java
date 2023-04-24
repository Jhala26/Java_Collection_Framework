package com.masai.QueueInterface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		
		/* Queue Interface follows the FIFO rule first in first out 
		  */
		
	
//		LinkedList
//		In linkedList which implements Dequeue maintain insertion order while implementing Queue 
//		we can use add(){If not able to add it in queue throw exception} and 
//		offer(){If not able to add it in queue then return true/false} method to add in queue
//		we use remove(){if not able to remove from queue it throw exception} and 
//		poll(){if not able to remove from queue it return null} function to remove from queue
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(10);
		queue.offer(20);
		queue.add(30);
		queue.offer(40);
		
		
		System.out.println("Queue : "+queue);
		System.out.println("Removing from queue : " + queue.remove());
		System.out.println("Queue : "+queue);
		System.out.println("Queue poll : " + queue.poll());
		System.out.println("Queue : "+queue);
		System.out.println("Queue peek() : " + queue.peek());
		
		
		
		
		
//		ArrayDeque--> Dequeue
//		In ArrayDequeue we can insert element from both the end and can also remove from both side
//		offer(), offerFirst(), offerLast(), peek(), peekFirst(), peekLast(), poll(), pollFirst(), pollLast()
		Deque<Integer> arrayDeque = new ArrayDeque<Integer>();
		arrayDeque.offer(10);
		arrayDeque.offer(20);
		arrayDeque.offerLast(30);
		arrayDeque.offerFirst(40);
		
//		40,10,20,30
		System.out.println("ArrayDeque : " + arrayDeque);
		
		
		
		
		
	}

}
