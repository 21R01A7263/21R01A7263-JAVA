import java.io.*;
import java.util.*;
public class HashTable
{
    public static void main(String args[]) throws IOException
    {
       Hashtable<String,String> ht=new Hashtable<String,String>();
       String s1,s2;
	Scanner s = new Scanner(new FileReader("YOUR TEXT FILE PATH"));
	while(s.hasNext())
	{
	s1=s.next();
	s2=s.next();
	ht.put(s1,s2);
	}
	DataInputStream dis=new DataInputStream(System.in);
	System.out.print("Enter Name: ");
	String name=dis.readLine();
	name=(String)name.trim();
	String phoneNo=ht.get(name);
	if(phoneNo!=null)
	{
		System.out.println(name+" : "+phoneNo);

		}
		else
		{
			System.out.println("Not Found");
		}}}