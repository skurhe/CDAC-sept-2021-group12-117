import java.util.Scanner;
public class P3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String");
String s1=sc.nextLine();
 
String a[]=s1.split(" ");
s1=a[0].concat(a[1]);
System.out.println(s1);

}
}