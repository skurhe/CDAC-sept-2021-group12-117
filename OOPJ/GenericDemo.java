class MyGen <T>
{
T ob;
MyGen(T ob)
{
this.ob=ob;
}
 
T getOb()
{
return ob;
}
}
class GenericDemo
{
public static void main(String args[])
{
MyGen<Integer> obj1=new MyGen<Integer>(100);

int a=obj1.getOb();

System.out.println(a);



}


}