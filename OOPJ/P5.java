import java.util.Scanner;
public class P5
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter the String");
String s1=sc.nextLine();
System.out.println("Enter the check string");
String s2=sc.nextLine();
boolean t=s1.contains(s2);

if(t)
System.out.println("String cointains check string");
else
System.out.println("it does not cointain check string");

}
}