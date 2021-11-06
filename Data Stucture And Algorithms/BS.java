class LinearSearch{
	
	static int Search(int arr[],int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				return i;
			}
		}
		return -1;
	}
	
	
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,53,2,44};
		int key=44;
		int res=Search(arr,key);
		
		if(res==-1)
		{
			System.out.println("Element not found");
		}
	     else{
			 System.out.println("Element found at index "+res);
		 }
	}
	
}