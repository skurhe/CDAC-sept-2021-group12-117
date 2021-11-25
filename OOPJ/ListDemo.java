import java.util.*;
public class ListDemo{
	
	static void print(Collection <?> ab)
	{
		for(Object s:ab)
		{
			System.out.println(s);
		}
	}
	public static void main(String args[])
	{
		List<Integer> list2=new ArrayList<>();
		list2.add(10);
		list2.add(20);
		list2.add(1000);
		list2.add(2000);
		list2.add(104);
		print(list2);
		
		List <Integer> list1=new ArrayList<>();
		list1.add(77);
        list1.add(88);
		list1.add(98);
		
		System.out.println("List 2 ");
		print(list1);
		
		list1.addAll(list2);
		System.out.println("List 1 after adding list2");
		print(list1);
		
		boolean t=List1.contains(2000);
		if(t==true)
		{
			System.out.println("List contain given elemrnt");
			
		}
		else
			System.out.println("List does not contain the given elemnt");
		}
		
	
}