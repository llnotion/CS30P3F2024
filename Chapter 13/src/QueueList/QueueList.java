package QueueList;

public class QueueList 
{
	private LinkedList data;
	private int front, rear, maxSize;
	
	public QueueList() 
	{
		data = new LinkedList();
		front = -1;		//no items in the array
		rear = -1;
		
	}
	
	public Object front() 
	{
	 	return(data.Frontal());
	}
	
	public Object dequeue() 
	{
	  	return(data.remove());					
	}
	
	public void enqueue(Object item) 
	{
		data.addAtEnd(item);
	}

	public boolean isEmpty() 
	{
		if (data.size() == 0) {
			
			return(true);
			
		}else {
			
			return(false);
		}
	 	
	}
	
	public int size() 
	{
	 	return(data.size());
	 	}
	
	
	public void makeEmpty() 
	{
	 	data.makeEmpty();
	}
}