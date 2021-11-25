import java.util.*;
class Student{
     int RollNo;
     int Marks;
     int Age;
     Student()
     {
         
         
     }
      Student(int RollNo,int Marks,int Age)
     {
         this.RollNo=RollNo;
         this.Marks=Marks;
         this.Age=Age;
     }
    
    public String toString()
    {
        String str="[ Roll no="+RollNo +" "+ "Marks ="+Marks +" "+"Age ="+Age+"]";
        return str;
    }
    
    public boolean equals(Object ob)
    {
        Student a=(Student)ob;
        if(ob==null) return false;
        if(this.RollNo==a.RollNo && this.Marks==a.Marks && this.Age==a.Age)
        return true;
        else return false;
        
    }
    public int hashCode()
    {
        return (RollNo+Marks*Age); 
    }
    
}

public class Main{
    
    static void print(Collection<?> obj)
    {
        for(Object i:obj)
        {
            System.out.println(i);
        }
        
    }
    public static void main(String args[])
    {
        List<Student> list1=new ArrayList<Student>();
        list1.add(new Student(3,80,21));
        list1.add(new Student(2,89,21));
        list1.add(new Student(1,82,21));
        System.out.println("Student list before sorting");
        List<Student> list2=new ArrayList<Student>();
        list2.add(new Student(3,80,21));
        list2.add(new Student(2,89,21));
        list2.add(new Student(1,82,21));
       Student s2=new Student(3,80,21);
       System.out.println(list1.contains(s2));
        System.out.println(list1.containsAll(list2));
        
        print(list1);
    }
    
}