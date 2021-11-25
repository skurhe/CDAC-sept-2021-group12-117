import java.util.*;
class CollectionDemo
{
	static void display(Collection <?> obj)
	{
		for(Object i:obj)
		{
			System.out.println(i);
		}
		
	}
	public static void main(String args[])
	{
		
		
		ArrayList<String> list1=new ArrayList<>();
		list1.add("Siddheshwar");
		list1.add("siddheshwar1");
		list1.add("Siddheshwar2");
		System.out.println("Iterate using for each loop");
		for(String i:list1)
		{
			System.out.println(i);
		}
		System.out.println("Printing elements using method");
		display(list1);
		
	}
	
	
}