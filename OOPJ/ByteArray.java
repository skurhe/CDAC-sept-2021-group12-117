public class ByteArray{
public static void main(String args[])
{
String s="Siddheshwar";
byte a[]=s.getBytes();

for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
  
//char b[]=new char[5];
char b[]=s.getChars(1,3,6,9,11);
for(int i=0;i<5;i++)
{
System.out.println(b[i]);
}



}
}