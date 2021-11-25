class MygenericDemo
{
int a,b;

   MygenericDemo()
   {
     a=0;
     b=0;
    }
   MygenericDemo(int a,int b)
   {
     this.a=a;
     this.b=b;

    }

    int getSum()
      {
     int sum=a+b;
      return sum;
     }
}
 public class G1
{
   public static void main(String args[])
{
MygenericDemo obj1=new MygenericDemo(10,12);

int sum=obj1.getSum();

System.out.println(sum);






} 
}