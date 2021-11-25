import java.util.*;
class Student implements Comparable<Student>
{
    int roll;
    int marks;
    int age;
    
    Student()
    {
        
        
    }
    Student(int roll,int marks,int age)
    {
        this.roll=roll;
        this.marks=marks;
        this.age=age;
        
    }
public String toString()
{
          String str="[ Roll no="+roll +" "+ "Marks ="+marks +" "+"Age ="+age+"]";
        return str;
}

public int compareTo(Student ob)
{
    if(ob==null) 
    return 0;
    Student s=(Student)ob;
    
    if(this.roll==s.roll )
    return 0;
     if(this.roll<s.roll )
    return -1;
    else return 1;
   // if()
    
}


}
public class Main
{
    
    static void print(Collection <?> obj)
    {
        for(Object i:obj)
        {
            System.out.println(i);
        }
        
    }
	public static void main(String[] args) {
		
		List<Student> list1=new ArrayList<Student>();
		list1.add(new Student(4,89,23));
		list1.add(new Student(3,89,23));
		list1.add(new Student(1,89,23));
		list1.add(new Student(2,89,23));
		Collections.sort(list1);
		 print(list1);
		
		
	}
}