package Stack3;

import java.util.ArrayList;

public class Stack3{

private ArrayList<Object> data;
private int top;

public Stack3 () 
{

	data = new ArrayList<Object>();
}
public Object top()
{
	
}
public Object pop() 
{
	Object topItem;
	topItem = data.get(top);
	top = top - 1;
	return topItem;
	
}
public void push(Object item)
{
	top = top + 1;
	data.add(top, item);
}

public boolean isEmpty() 
{
	if(top == -1) {
		return(true);
	}
	else {
		return(false);
	}
}

public int size() {
	
	if(isEmpty())
	{
		
	}
	
}
}
