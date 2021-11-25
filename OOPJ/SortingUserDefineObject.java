import java.util.*;
class student implements Comparable<student>
{
	int roll,marks,age;
	
	student()
	{
		
	}
	student(int roll,int marks,int age)
	{
		this.roll=roll;
		this.marks=marks;
		this.age=age;
	}
	
	public String toString()
	{
		String str="Student[Student roll= "+roll +",marks= "+marks+",age="+age+"]";
		
		
	}
	
	
}
public class SortingUserDefineobject
{
	public static void main(String args[])
	
	{
		static void print(Collection<?> ob)
	{
		for(Object c:ob)
		{
			System.out.println(c);
		}
		
	}
		List<student> list1=new ArrayList<student>();
		list1.add(new student(1,85,21));
		list1.add(new student(1,80,21));
		list1.add(new student(1,91,21));
		list1.add(new student(1,99,21));

       	print(list1)	
	}
	
	
}