import java.util.*;
public class ArrayListDemo1
{
	
	public static void main(String args[])
	{
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
	
		
	Integer sum=0;
	for(Integer i:list1)
		{
			sum=sum+i;
			System.out.println(i);
			
		}
		
		System.out.println(sum);
	}	
	
	
}