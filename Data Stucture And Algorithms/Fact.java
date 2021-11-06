import java.util.Scanner;
public class Fact{

int Pal(int n)
{
int rem;
static int sum=0;
if(n!=0)
{
  rem=n%10;
sum=sum*10+rem;
pal(n/10);

}
else 
{
return sum;
}


}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();

int b=pal(n);
System.out.println(b);
}


}