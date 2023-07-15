import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
public class DisplayTable
{
	public static void main(String[] args) 
	{
	JFrame f = new JFrame("FILE READING EXAMPLE");
		try 
		{
		Scanner st=new Scanner(new FileReader("YOUR FILE PATH"));
                        st.useDelimiter("\\s*,\\s*");
			while(st.hasNext())
{
				f.add(new Label(st.next()));
			f.setLayout(new GridLayout(6,2));
				f.setSize(400,200);
				f.setVisible(true);
			}
		} 
		 catch (Exception ex)
		{
			System.out.println("Error reading file ");
		} 
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
