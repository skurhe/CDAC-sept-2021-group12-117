import java.util.*;
class student
{
	int roll;
	int marks;
	int age;
	
	student()
	{
		
	}
	student(int roll,int marks,int age)
	{
		this.roll=roll;
		this.marks=marks;
		this.age=roll;
	}
	public String toString()
	{
		 System.out.println(roll+" "+marks+" "+age);
		 return "";
		
	}
	
	
}
public class ArrayListUsingObject{
	static void print(Collection<?> ob)
	{
		for(Object c:ob)
		{
			System.out.println(c);
		}
		
	}
	
	public static void main(String args[])
	{
		List<student> list1=new ArrayList<student>();
		student s1=new student(1,75,21);
		list1.add(s1);
		list1.add(new student(2,80,20));
		print(list1);
		
        List<student> list2=new ArrayList<student>();
         list2.add(new student(3,45,10));
         list2.add(new student(7,85,85));
		 list2.add(new student(4,45,6));
		 
		 list1.addAll(list2);
		 
		 System.out.println("List after addting list 2");
		 print(list1);
		 
		boolean s=list1.contains(list2);
		System.out.println(s);
		System.out.println("List before sorting");
		print(list1);
        System.out.println("List after sorting");
		
		
		
		
	}
	
}