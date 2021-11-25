//Source code by
//Siddheshwar kurhe
//Vishal patil


import java.util.*;
class EmployeeDatabase
{

 Node head;
 
static class Node
{
	
	
    int iEmpId;
	int iAge;
	String sName;
	float fSalary;
	String sGender;
	String sCity;
	String sDesignation;
	Node next;
	Node prev;
	
	 Node(int eid,int age,String name,float sal,String gen,String city,String desg)
     {
	      iEmpId=eid;
	      iAge=age;
		  sName=name;
	      fSalary=sal;
	      sGender=gen;
	      sCity=city;
	      sDesignation=desg;
	      next=null;
		  prev=null;
   	 
	 }
	 
}

public void insertFirst(int eid,int age,String name,float sal,String gen,String city,String desg)
{
	Node new_node=new Node(eid,age,name,sal,gen,city,desg);
	
	
	if(head==null)
	{
		head=new_node;
	}
	else
	{
		head.prev=new_node;
		new_node.next=head;
		head=new_node;
		
	}
	
}

public void insertLast(int eid,int age,String name,float sal,String gen,String city,String desg)
{
	
	Node new_node=new Node(eid,age,name,sal,gen,city,desg);
	Node temp=head;
	if(head==null)
	{
		head=new_node;
	}
	else
	{ 
      while(temp.next!=null)
		{
		   temp=temp.next;
		}
	    temp.next=new_node;
        new_node.prev=temp;
        		
		
	}
	
	
}              	

public void insertAtPos(int eid,int age,String name,float sal,String gen,String city,String desg,int pos)
{
	int size=0;
	size=count();
	Node temp=head;
	
	if((pos<1)||(pos>size+1))
	{
		return;
	}
	else if(pos==1)
	{
	    insertFirst(eid,age,name,sal,gen,city,desg);
	}
	else if(pos==(size+1))
	{
		insertLast(eid,age,name,sal,gen,city,desg);
	}
	else
	{
        Node new_node=new Node(eid,age,name,sal,gen,city,desg);
			for(int i=1;i<pos-1;i++)
		{
			temp=temp.next;
			
		}
		
	
		new_node.next=temp.next;
		temp.next.prev=new_node;
		new_node.prev=temp;
	    temp.next=new_node;
		
		
	}
	
	
	
}


public void deleteFirst()
{
	if(head==null)
	{
		return;
	}	
	else
	{
	   head=head.next;
	   head.prev=null;
                        
	}
	
	
}

public void deleteLast()
{
	Node temp=head;
	
	if(head==null)
	{
		return;
	}	
	else if((head.next==null) && (head.prev==null))
	{
	   head=null;
    }
	else 
	{
	  while(temp.next!=null)
	  {
		temp=temp.next;  
		  
	  }
	  temp.prev.next=null;
		  
		
		
	}
	
	
	
}

public void deleteAtPos(int pos)
{
	int size=0;
	size=count();
	Node temp=head;
	
   if(pos<1||pos>size)
   {
	   return;
   }	   
   
   else if(pos==1)
    {
	   deleteFirst();
    }
   else if(pos==size)
    {
	   deleteLast();
    }	
	else
	{
		for(int i=1;i<(pos-1);i++)
		{
             		  
           temp=temp.next;    
		  
	    }
	    temp.next=temp.next.next;
		temp.next.prev=temp;
	}
	
	
	
	
	
}

public void display()
{
    Node temp=head;
	System.out.println("================================================================");
		
	while(temp!=null)
	{
		System.out.print("\n Employee Id: "+temp.iEmpId+"\n Employee Name: "+temp.sName+"\n Employee Age: "+temp.iAge+"\n Employee Salary: "+temp.fSalary+ "\n Employee Gender: "+ temp.sGender+"\n Employee city: "+temp.sCity+"\n Employee desg: "+temp.sDesignation+"\n");
	    
		temp= temp.next;
	    System.out.println("================================================================");
		
	}
	
	
}

public int count()
{
	Node temp=head; 
	int count=0;
	while(temp!=null)
	{
		count++;
		temp=temp.next;
	}
	
	return count;
	
}


public float MinimumSalary()
{
	float iMin = 0;
    Node temp=head;
	iMin=temp.fSalary;
		System.out.println(" imin = : "+iMin);

	System.out.println(" Searching Minimum salary of an Employee : ");
	
	while(temp!=null)
	{
	   System.out.println("Inside while ");
		
		if((temp.fSalary)<iMin)
		{
  		   System.out.println("inside if ");
	     	iMin =(temp.fSalary);
	 	}
		temp = temp.next;
	}


	return iMin;
}



public float MaximumSalary()
{
	float iMax = 0;
    Node temp=head;
	iMax = temp.fSalary;

	System.out.println("Searching Maximum salary of an Employee : ");
	while(temp != null)
	{
		if((temp.fSalary) > iMax)
		{
			iMax = (temp.fSalary);
		}
		temp = temp.next;
	}

	return iMax;
}


public int MinimumAge()
{
	Node temp=head;
	int iMin = 0;
	iMin=temp.iAge;

	System.out.println(" Searching minimum age of an Employee : ");
	
	while(temp!=null)
	{
		if((temp.iAge) < iMin)
		{
			iMin =temp.iAge;
		}
		temp = temp.next;
	}
	
	return iMin;
}


public int MaximumAge()
{
	Node temp=head;
	int iMax = 0;
	iMax=temp.iAge;

	System.out.println(" Searching maximum age of an Employee : ");
	
	while(temp!=null)
	{
		if((temp.iAge) > iMax)
		{
			iMax=temp.iAge;
		}
		temp=temp.next;
	}
	
	return iMax;
}



public void SearchByID(int iID)
{
	int iFlag = 1;
	Node temp=head;
	System.out.println("Searching Employee by ID: ");
	while(temp!=null)
	{
		if((temp.iEmpId) == iID)
		{
			System.out.println("----------------------------------------------------------------\n");

			iFlag++;
			System.out.print("\n Employee Id: "+temp.iEmpId+"\n Employee Name: "+temp.sName+"\n Employee Salary: "+temp.fSalary+"\n Employee Gender: "+ temp.sGender+"\n Employee city: "+temp.sCity+"\n Employee desg: "+temp.sDesignation+"\n");
		
		   	System.out.println("----------------------------------------------------------------\n");

		}
		temp = temp.next;
	}
	if(iFlag == 1)
	{
		System.out.println(" No Employee ID Found according to user input ");
	}
}

public void SearchByAge(int Age)
{
	Node temp=head;
	while(temp!=null);
	{
		if((temp.iAge) == Age)
		{
			System.out.println("----------------------------------------------------------------\n");

			
			System.out.print("\n Employee Id: "+temp.iEmpId+"\n Employee Name: "+temp.sName+"\n Employee Salary: "+temp.fSalary+"\n Employee Gender: "+ temp.sGender+"\n Employee city: "+temp.sCity+"\n Employee desg: "+temp.sDesignation+"\n");
		   
		    System.out.println("----------------------------------------------------------------\n");

		}
		temp = temp.next;
	}
}


public void SearchByName(String name)
{
	Node temp =head;
	int flag=0;
	
	while(temp!=null)
	{
		if((name.equalsIgnoreCase(temp.sName)))
		{
			flag++;
            System.out.println("----------------------------------------------------------------\n");

			
			System.out.print("\n Employee Id: "+temp.iEmpId+"\n Employee Name: "+temp.sName+"\n Employee Salary: "+temp.fSalary+"\n Employee Gender: "+ temp.sGender+"\n Employee city: "+temp.sCity+"\n Employee desg: "+temp.sDesignation+"\n");
		   
		    System.out.println("----------------------------------------------------------------\n");	
		}
		temp=temp.next;
	  
	   }
	
	if(flag==0)
		 {
		    System.out.println("Employee Name not Found\n");	
         } 
}


public void SearchByCity(String city)
{
	Node temp =head;
	int flag=0;
	
	while(temp!=null)
	{
		if((city.equalsIgnoreCase(temp.sCity)))
		{
			flag++;
            System.out.println("----------------------------------------------------------------\n");

			
			System.out.print("\n Employee Id: "+temp.iEmpId+"\n Employee Name: "+temp.sName+"\n Employee Salary: "+temp.fSalary+"\n Employee Gender: "+ temp.sGender+"\n Employee city: "+temp.sCity+"\n Employee desg: "+temp.sDesignation+"\n");
		   
		    System.out.println("----------------------------------------------------------------\n");	
		}
		temp=temp.next;
	  
	   }
	
	if(flag==0)
		 {
		    System.out.println("\n Employee City not Found\n");	
         } 
}
public void SearchByDesignation(String cDesg)
{
	
	Node temp =head;
	int flag=0;
	
	while(temp!=null)
	{
		if((cDesg.equalsIgnoreCase(temp.sDesignation)))
		{
			flag++;
            System.out.println("----------------------------------------------------------------\n");

			
			System.out.print("\n Employee Id: "+temp.iEmpId+"\n Employee Name: "+temp.sName+"\n Employee Salary: "+temp.fSalary+"\n Employee Gender: "+ temp.sGender+"\n Employee city: "+temp.sCity+"\n Employee desg: "+temp.sDesignation+"\n");
		   
		    System.out.println("----------------------------------------------------------------\n");	
		}
		temp=temp.next;
	  
	   }
	
	if(flag==0)
		 {
		    System.out.println("\n Employee Designation not Found\n");	
         } 
}

public void SearchByGender(String gender)
{
	Node temp =head;
	int flag=0;
	
	while(temp!=null)
	{
		if((gender.equalsIgnoreCase(temp.sGender)))
		{
			flag++;
            System.out.println("----------------------------------------------------------------\n");

			
			System.out.print("\n Employee Id: "+temp.iEmpId+"\n Employee Name: "+temp.sName+"\n Employee Salary: "+temp.fSalary+"\n Employee Gender: "+ temp.sGender+"\n Employee city: "+temp.sCity+"\n Employee desg: "+temp.sDesignation+"\n");
		   
		    System.out.println("----------------------------------------------------------------\n");	
		}
		temp=temp.next;
	  
	   }
	
	if(flag==0)
		 {
		    System.out.println("\n Invalid Gender \n");	
         } 
}


public void SearchEqaSalary(float fSal)
{ 
	Node temp=head;
	int flag=0;
	while(temp!=null)
	{
		if((temp.fSalary) == fSal)
		{
			flag++;
            System.out.println("----------------------------------------------------------------\n");

			
			System.out.print("\n Employee Id: "+temp.iEmpId+"\n Employee Name: "+temp.sName+"\n Employee Salary: "+temp.fSalary+"\n Employee Gender: "+ temp.sGender+"\n Employee city: "+temp.sCity+"\n Employee desg: "+temp.sDesignation+"\n");
		   
		    System.out.println("----------------------------------------------------------------\n");	
		}
		temp=temp.next;
	  
	}
	
	if(flag==0)
		 {
		    System.out.println("\n Employee Salary not Found\n");	
         } 
	
	
}

void SearchGrtSalary(float fSal)
{
	Node temp=head;
	int flag=0;
	while(temp!=null)
	{
		if((temp.fSalary)>fSal)
		{
			flag++;
            System.out.println("----------------------------------------------------------------\n");

			
			System.out.print("\n Employee Id: "+temp.iEmpId+"\n Employee Name: "+temp.sName+"\n Employee Salary: "+temp.fSalary+"\n Employee Gender: "+ temp.sGender+"\n Employee city: "+temp.sCity+"\n Employee desg: "+temp.sDesignation+"\n");
		   
		    System.out.println("----------------------------------------------------------------\n");	
		}
		temp=temp.next;
	  
	}
	
	if(flag==0)
		 {
		    System.out.println("\n Employee Salary not Found\n");	
         } 
	
}


void SearchLesSalary(float fSal)
{
	Node temp=head;
	int flag=0;
	while(temp!=null)
	{
		if((temp.fSalary)<fSal)
		{
			flag++;
            System.out.println("----------------------------------------------------------------\n");

			
			System.out.print("\n Employee Id: "+temp.iEmpId+"\n Employee Name: "+temp.sName+"\n Employee Salary: "+temp.fSalary+"\n Employee Gender: "+ temp.sGender+"\n Employee city: "+temp.sCity+"\n Employee desg: "+temp.sDesignation+"\n");
		   
		    System.out.println("----------------------------------------------------------------\n");	
		}
		temp=temp.next;
	  
	}
	
	if(flag==0)
		 {
		    System.out.println("\n Employee Salary not Found\n");	
         }
}



public void Like(char ch)
{
	int flag = 0;
	
	Node temp=head;
	System.out.println("\n Finding Employee name with :"+ch);
	
	while(temp!=null)
	{
		char cha=((temp.sName).charAt(0));
		
		if(cha==ch)
		{
	        flag++;        		
	 		System.out.println("Employee Name "+temp.sName);
		}
		
	  temp=temp.next;	
	}
	
	if(flag == 0)
	{
		System.out.println("No Employee Name Starts with "+ch);
		
	}
	
}

public void Like1(char ch)
{
	int flag = 0;
	
	Node temp=head;
	System.out.println("\n Finding Employee name with :"+ch);
	
	while(temp!=null)
		//string.substring(string.length() - 1));
	{
		char cha=((temp.sName).charAt(((temp.sName).length())-1));
		
		if(cha==ch)
		{
	        flag++;        		
	 		System.out.println("Employee Name "+temp.sName);
		}
		
	  temp=temp.next;	
	}
	
	if(flag == 0)
	{
		System.out.println("No Employee Name End with "+ch);
		
	}
	
}

public static void main(String arg[])
{
	int iRet=0,iNo=0,age=0;
	String Name=null,gender=null,city=null,designation=null;
	float salary=0.0f;
	int choice=1,choice1=1, choice2=1;
	 
	
	EmployeeDatabase l1=new EmployeeDatabase();
    /*l1.insertFirst(101,25,"Manish",25000,"Male","Mumbai","Developer");
	l1.insertFirst(102,28,"Akash",20000,"Male","Mumbai","System Engineer");
    l1.insertLast(119,26,"vikas",40000,"Male","Nashik","Manager");
    l1.insertFirst(201,30,"Dinesh",35000,"Male","Pune","System Engineer");
	l1.insertAtPos(202,26,"manali",40000,"Female","Pune","Developer",5);
  

     
	iRet=l1.count();  
     

	l1.display();
    System.out.println("Total Employee Record In Database is : "+iRet);      
	*/

     Scanner sobj=new Scanner(System.in);
      
	System.out.println("-------------------------------------------------------------------------------------------------------------\n");
	System.out.println("-------------------Employee Database Management System using Doubly Linked List---------------------\n");

	while(choice!=0) //while(choice != 0)//for better readability
	{
		System.out.println("-------------------------------------------------------------------------------------------------------------\n");
		System.out.println("1: Insert First Employee");
		System.out.println("2: Insert Last Employee");
		System.out.println("3: Insert Employee At Position");
		System.out.println("4: Delete First Employee");
		System.out.println("5: Delete Last Employee");
		System.out.println("6: Delete Employee At Position");
		System.out.println("7: Display the Employee Details of Employees in the Company");
		System.out.println("8: Count number of Employees in a Company");
		System.out.println("9: SearchBy");
		System.out.println("10: Minimum Salary");
		System.out.println("11: Maximum Salary");
		System.out.println("12: Minimum Age");
		System.out.println("13: Maximum Age");
		System.out.println("14: Search Name With Starting letter");
		System.out.println("15: Search Name With Endining letter");
		System.out.println("0: Exit");

		System.out.println("----------------------------------------------------------------\n");

		System.out.println("Enter your choice\n");
		choice=sobj.nextInt();

		System.out.println("----------------------------------------------------------------\n");

		switch(choice)
		{
			case 1:
				System.out.println("............Enter the Employee Details:...........\n");
				System.out.print("\n 1:Enter EMP_ID: ");
				 iNo=sobj.nextInt();

			
				  sobj.nextLine();
				System.out.print("\n 2:Enter Employee Name: ");
				 Name=sobj.nextLine();
			     
				 
				
				System.out.print("\n 3:Enter Employee Age: ");
				 age=sobj.nextInt();
				
				System.out.print("\n 4:Enter Employee Salary:");
				 salary=sobj.nextFloat();
				sobj.nextLine();
				
				System.out.print("\n 5:Enter Employee Gender: ");
				 gender=sobj.nextLine();

				System.out.print("\n 6:Enter Employee City: ");
				city=sobj.nextLine();

				System.out.print("\n 7:Enter Employee Designation: ");
			     designation=sobj.nextLine();
				
				
				l1.insertFirst(iNo,age,Name,salary,gender,city,designation);
				break;

			case 2:
				System.out.println("............Enter the Employee Details:...........\n");
				System.out.print("\n 1:Enter EMP_ID: ");
				 iNo=sobj.nextInt();

			
				  sobj.nextLine();
				System.out.print("\n 2:Enter Employee Name: ");
				 Name=sobj.nextLine();
			     
				 
				
				System.out.print("\n 3:Enter Employee Age: ");
				 age=sobj.nextInt();
				
				System.out.print("\n 4:Enter Employee Salary:");
				 salary=sobj.nextFloat();
				sobj.nextLine();
				
				System.out.print("\n 5:Enter Employee Gender: ");
				 gender=sobj.nextLine();

				System.out.print("\n 6:Enter Employee City: ");
				city=sobj.nextLine();

				System.out.print("\n 7:Enter Employee Designation: ");
			     designation=sobj.nextLine();
				
				l1.insertLast(iNo,age,Name,salary,gender,city,designation);
				break;


			case 3:
				System.out.println("............Enter the Employee Details:...........\n");
				
				System.out.print("\n 1:Enter EMP_ID: ");
				 iNo=sobj.nextInt();

			
				  sobj.nextLine();
				System.out.print("\n 2:Enter Employee Name: ");
				 Name=sobj.nextLine();
			     
				 
				
				System.out.print("\n 3:Enter Employee Age: ");
				 age=sobj.nextInt();
				
				System.out.print("\n 4:Enter Employee Salary:");
				 salary=sobj.nextFloat();
				sobj.nextLine();
				
				System.out.print("\n 5:Enter Employee Gender: ");
				 gender=sobj.nextLine();

				System.out.print("\n 6:Enter Employee City: ");
				city=sobj.nextLine();

				System.out.print("\n 7:Enter Employee Designation: ");
			     designation=sobj.nextLine();
				
				System.out.print("\n Enter Position you want to Add at database: ");
				int pos=sobj.nextInt();

				l1.insertAtPos(iNo,age,Name,salary,gender,city,designation,pos);
				break;


			case 4:
				l1.deleteFirst();
				break;

			case 5:
				l1.deleteLast();
				break;

			case 6:
			
				System.out.println("\n Enter Position:\n");
				int iPlace=sobj.nextInt();
				l1.deleteAtPos(iPlace);
				break;

			case 7:
				l1.display();
				break;

			case 8:
				iRet = l1.count();
				System.out.println("The Count of Employees in the Linked List is: " +iRet);
				break;

			 case 9:
				System.out.println("Select from Search By:");
				while(choice1!=0)
				{
					System.out.println("1. Search by  Employee id");
					System.out.println("2. Search by  Employee Name");
					System.out.println("3. Search by  Employee City");
					System.out.println("4. Search by  Employee Salary");
					System.out.println("5. Search by  Employee Designation");
					System.out.println("6. Search by  Employee Gender");
					System.out.println("7. Search by  Employee Age");
					System.out.println("0. Exit");

					System.out.println("Enter your choice\n");
					choice1=sobj.nextInt();

					switch(choice1)
					{
						case 1:
							System.out.println("Enter Employee id you want to search\n");
							int id=sobj.nextInt();
							l1.SearchByID(id);
							break;
						
						case 2:
						    System.out.println("Enter Employee Name you want to search\n");
							sobj.nextLine();
						   	String sName=sobj.nextLine();
							l1.SearchByName(sName);
							break;
						
						case 3:
							
							System.out.println("Enter Employee's City Name you want to search\n");
							String cName1=sobj.nextLine();
							l1.SearchByCity(cName1);
							break;
						
						case 4:
						
                                System.out.println("Enter Employee Salary you want to search\n");
								float fsalary=sobj.nextFloat();
								
								
								while(choice2!=0)
                                { 
							        System.out.println("Enter a salary and choice you want to search\n");

									System.out.println("1:Grater salaries amount than : "+fsalary);
                                    System.out.println("2:Less salaries amount than :  "+fsalary);
                                    System.out.println("3:salaries amount Equal  to :  "+fsalary);
                                    System.out.println("0:exit\n");
									
									System.out.println("Enter your choice\n");
					                choice2=sobj.nextInt();
								
								switch(choice2)
								{
                                     case 1:
                                     l1.SearchGrtSalary(fsalary);
                                     break;
                                     case 2:
                                     l1.SearchLesSalary(fsalary);
                                     break;
                                     case 3:
                                     l1.SearchEqaSalary(fsalary);
                                     break;
                                     case 0:
                                     break;
								 }
                                }
								break;
						case 5:
							
							System.out.println("Enter Employee's Designation you want to search\n");
							String cName2=sobj.nextLine();
							l1.SearchByDesignation(cName2);
							break;
						
						case 6:
							
							System.out.println("Enter Employee's Gender you want to search\n");
							String cName3=sobj.nextLine();
							l1.SearchByGender(cName3);
							break;

						case 7:
								System.out.println("Enter Employee Age you want to search\n");
							    int iAge=sobj.nextInt();
								l1.SearchByAge(iAge);
								break;
                         
						case 0:
							System.out.println("Thank You for SearchBy Operation\n");
							break;

						default:
							System.out.println("Wrong Choice\n");
							break;
					}
				}
				break;
          
			
			 case 10:
				float iRet1 =l1.MinimumSalary();
				System.out.println("Minimum Salary of an Employee is " +iRet1);
				break;

			case 11:
				float iRet2 =l1.MaximumSalary();
				System.out.println("Maximum Salary of an Employee is "+iRet2);
				break;

			case 12:
				int iRet3 = l1.MinimumAge();
				System.out.println("Minimum Age of an Employee is :"+iRet3);
				break;

			case 13:
				int iRet4 = l1.MaximumAge();
				System.out.println("Maximum Age of an Employee is :"+iRet4);
				break;

		     case 14:
				
				System.out.println("Enter starting letter of Employee Name that you want to search :");
				char letter=sobj.next().charAt(0);

			    l1.Like(letter);
				
				break;

			case 15:
				
				System.out.println("Enter ending letter of Employee Name that you want to search :\n");
				char letter1=sobj.next().charAt(0);
                l1.Like1(letter1);
				
				break;
          
		   
			case 0:
				System.out.println("Thank You for using the Application\n");
				break;

			default:
				System.out.println("Wrong Choice\n");
				break;
		}
	}

}
}