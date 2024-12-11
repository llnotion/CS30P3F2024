package StackList;

public class StackListTest 
{

	public static void main(String[] args) 
	{
		StackList s2 = new StackList();
		
		System.out.println("Adding \"red\" and \"yellow \" to stack. ");
		s2.push("red");
		s2.push("yellow");
		System.out.print("Top of stack: "+ s2.top() + "\n");
		System.out.print("Items in stack: "+ s2.size() + "\n");
		System.out.println("Removing top item.");
		s2.pop();
		System.out.print("Top of stack: "+ s2.top());
		System.out.print("Items in stack: "+ s2.size());
		



	}

}