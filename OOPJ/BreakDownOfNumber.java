import java.util.Scanner;
public class BreakDownOfNumber{
	static int a=1;
	static int v,count=0;
	static void Num(int n)
	{   
	int k=n;
		while(k>0)
		{
			k=k/10;
			count++;	
		}
		int arr[]=new int[count];
		for(int i=0;i<count;i++)
		{
		int d=n%10;
		d=d*a;
		a=a*10;
		arr[i]=d;
		System.out.println(d);
		n=n/10;
		}
		
		for(int i=count-1;i>=0;i--)
		{
			if(i==0)
			{
				System.out.print(arr[i]);
			}
			else
			System.out.print(arr[i]+"+");
		}
		
	}
	public static void main(String agrs[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enterr the number");
		int x=sc.nextInt();
		Num(x);
	
	}
	
	
}