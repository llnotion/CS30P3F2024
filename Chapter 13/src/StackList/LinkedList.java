package StackList;


public class LinkedList 
{
	private Node head;
	
	public LinkedList() 
	{
		head = null;
	}
	
	public void addAtFront(Object str) 
	{
		Node newNode = new Node(str);
		newNode.setNext(head);
		head = newNode;
	}
	
	
	
	public Object remove() 
	{
		Node current = head;
		head = current.getNext();
		
		
		return(current.getData());
			}
		
	
	
	public String toString() 
	{
		Node current = head;
		String listString;
		
		if (current != null) {
			listString = current.getData() + "\n";
			while (current.getNext() != null) {
				current = current.getNext();
				listString += current.getData() + "\n";
			}
			return(listString);
		} else {
			return("There are no items in list.");
		}
	}
	
	public int size() 
	{
		Node current = head;
		int count = 0;
		
		if (current != null) {
			count += 1;
			while (current.getNext() != null) {
				current = current.getNext();
				count += 1;
			}
			return(count);
		} else {
			return(0);
		}
	}	
	
	public void makeEmpty() 
	{
		head = null;
	}	
	
	
	public Object getHead()
	{
		return head.getData();
	}
	

}