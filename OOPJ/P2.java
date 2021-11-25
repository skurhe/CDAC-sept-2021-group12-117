import java.util.*;
public class P2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first string");
String s1=sc.next();
System.out.println("Enter the second String");
String s2=sc.next();
s1=s1.concat(s2);
System.out.println("Concated string is "+s1);

}
}