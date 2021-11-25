import java.util.Scanner;
public class P4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string1");
String s1=sc.nextLine();
System.out.println("Enter the String 2");
String s2=sc.nextLine();
if(s1.equals(s2))
{
System.out.println("Both strings are equal");
}
else 
System.out.println("Strings are not equal");
}
}