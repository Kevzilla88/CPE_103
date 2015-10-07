/**
 * Project 01 - MyStack<T>
 * @author geoffwacker, kevinliu
 * @id gwacker, 
 * 10.04.15
 */

import java.util.*;

public class MyStack<T> 
{
	//Instance variables.
	private Node first;
	
	//Nested node class.
	private class Node
	{
		public T item;
		public Node next;
	}
	
	//Constructor for an empty stack.
	public MyStack()
	{
		first = null;
	}
	//Parameter object is added to the top of the stack.
	public void push(T element)
	{
		
	}
	
	//Removes and returns the element at the top of the stack.
	public T pop()
	{
		//If stack is empty, throw EmptyStackException.
		
		//Placeholder code.
		return null;
	}
	
	//Return the top value of the stack without removing it.
	public T peek()
	{
		//If stack is empty, throw EmptyStackException.	
		
		//Placeholder code.
		return null;
	}
}