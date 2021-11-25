import java.util.*;
class Student
{
	int rollno;
	int marks;
	int age;
	
	Student()
	{
		
	}
	Student(int rollno,int marks,int age)
	{
		this.rollno=rollno;
		this.marks=marks;
		this.age=age;
	}
	
	public String toString()
	{
		String str="Student rollno= "+rollno+" Marks="+marks+" Age="+age;
    return str;
		
	}
}

public class ArrayListDemo{
		static void print(Collection<?> ob)
	{
		for(Object c:ob)
		{
			System.out.println(c);
		}
		
	}
	public static void main(String args[])
	{
		List<Student> list1=new ArrayList<Student>();
		list1.add(new Student(1,85,20));
        list1.add(new Student(2,80,21));
        list1.add(new Student(3,78,22));
        list1.add(new Student(4,84,19));
		System.out.println("List before additing list 2");
		print(list1);
		List<Student> list2=new ArrayList<Student>();
		list2.add(new Student(1,85,20));
        list2.add(new Student(2,80,21));
        list2.add(new Student(3,78,22));
        list2.add(new Student(4,84,19));
		
       System.out.println("List 2");
	   print(list2);
	   list1.addAll(list2);
	   System.out.println("List1  after adding list 2");
	   print(list1);	
	   
	   boolean a=list1.containsAll(list2);
	   System.out.println(a);

		
	}
	
}