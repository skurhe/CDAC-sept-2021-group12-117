public class FactorialUsingRecursion{
	static String factorial(int n)
	{
		if(n==10)
		{
			return "";
		}
		else{
			String str="2 *"+n+" ="+n;
			return str; 
		}
		
	}
	public static void main(String args[])
	{
		int x=5;
		System.out.println("Factorial is"+factorial(x));
	}
	
	
	
}