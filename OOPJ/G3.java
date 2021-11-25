class NonGenericDemo
{
	Object ob;
	
	NonGenericDemo(Object ob)
	{
		this.ob=ob;
		
	}
	
	void Show()
	{
		System.out.println(ob);
		
	}
	
}
public class G3{
	public static void main(String args[])
	{
		NonGenericDemo obj=new NonGenericDemo("Siddheshwar");
	   NonGenericDemo obj=new NonGenericDemo(14);

		
		obj.Show();
		
		
	}
}