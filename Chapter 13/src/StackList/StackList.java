package StackList;

public class StackList 
{
	private LinkedList data;
	private int top;
	
	public StackList()
	{
		data = new LinkedList();
		top = -1;
		
	}
	
	public Object top()
	{
		return(data.getHead());
	}
	
	public Object pop()
	{
		
		return(data.remove());
	}
	
	public void push(Object item)
	{
		data.addAtFront(item);
	}
	
	public boolean isEmpty()
	{
		if(data.size() == 0){ 
			return(true);
				
		} else {
			
			return(false);	}
	
	}
	
	public int size()
	{
		return data.size();                      
		
	}
	
	public void makeEmpty()
	{
		data.makeEmpty();
	}

}