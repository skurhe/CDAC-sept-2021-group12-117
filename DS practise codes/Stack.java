import java.util.Scanner;

class Stack{
	static int max=10;
	static int top;
    static int arr[]=new int[max];
	Stack ()
	{
		//int max=size;
		top=-1;
	}
	
	static boolean isFull()
	{
		if(top>=max-1)
		{
			return true;
		}
		else 
	    return false;
	}
	
    static  boolean isEmpty()
	 {
		return (top==-1);
		 
	 }
	
	static void push(int a)
	{
		if(isFull()!=true)
		{
			arr[++top]=a;
		}
		else
			System.out.println("Stack is full..");
	}
	
	static int  pop()
	{
		if(isEmpty()==false)
		{
			return arr[top--];
		}
		
		else 
			System.out.println("Stack is empty");
		    return -1;
	}
	
	static void display()
	{
		for(int i=0;i<top+1;i++)
		{
			System.out.println(arr[i]);
		}
	
	}
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the size of the stack");
		//int n=sc.nextInt();
		 Stack s1=new Stack();
		 
		 s1.push(10);
		 s1.push(20);
		 s1.push(30);
		 s1.push(40);
		 System.out.println("Element poped "+s1.pop());
		 System.out.println("Element poped "+s1.pop());
		 s1.display();
		
	}
}
