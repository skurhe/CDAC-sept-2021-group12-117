class Bracket{
	static int max=50;
	static int top;
	static char a1[]=new char[max];
	
	Bracket ()
	{
		top=-1;
	}
	
static	boolean isEmpty()
	{
		return (top<0);
	}
    boolean isFull()
	{
		return(top>=max);
	}
    
	static boolean push(char s)
	{
		if(top>=max)
		{
			System.out.println("StackOverFlow...");
			return false;
		}
		else
		{
			a1[++top]=s;
			System.out.println("Element "+s+"is pushed in the stack");
			return true;
		}
	}
	
	static char pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty...");
			return '0';
		}
		else
		{
			char v=a1[top--];
			return v;
		}
	}
	
boolean isMatched(String s1)
{
	 for(int i=0;i<s1.length();i++)
	  {
		  char q=s1.charAt(i);
		  if(q=='{'||q=='('||q=='[')
			  {
				push(q);  
			  
			  }
			  else if(a1[top]+1==q)
			  {
				 System.out.println("poped");
				 pop();
			  }
	  }
	  
	  return isEmpty();
	  
}
	
	
 
}

public class BracketMatching{
	public static void main(String args[])
	{
	  String s1="{(({[()]}))}";
	  Bracket B1=new Bracket();
	  
	  System.out.println(B1.isMatched(s1));
	 
	}
	
	
}