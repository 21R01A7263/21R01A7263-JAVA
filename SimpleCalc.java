import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*	
<applet code="Calc" height=300 width=300>
</applet>
*/
public class SimpleCalc extends Applet implements ActionListener
{
    TextField tf;
	double arg=0;
	String op="=";
	boolean start=true;
	public void init()
	{
		setLayout(new BorderLayout());
		tf=new TextField("0");
		add(tf,BorderLayout.NORTH);
		Panel p=new Panel();
		p.setLayout(new GridLayout(4,4));
		String buttons="123/456*789-0.+=";
		for(int i=0;i<buttons.length();i++)
		{
			Button b=new Button(buttons.substring(i,i+1));
			p.add(b);
			b.addActionListener(this);
		}
		add(p);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();
		if('0'<=s.charAt(0)&&s.charAt(0)<='9'||s.equals("."))
		{
			if(start)
			tf.setText(s);
			else
			tf.setText(tf.getText()+s);
			start=false;
		}
		else
		{
			calcu(Double.parseDouble(tf.getText()));
			op=s;
			start=true;
		}	
	}
	public void calcu(double n)
	{
		if(op.equals("+"))
		arg+=n;
		else
		if(op.equals("-"))
		arg-=n;
		else
                if(op.equals("*"))
		arg*=n;
		else
		if(op.equals("/"))
		{
		try{
		        arg/=n;
		    }
		   catch(ArithmeticException e)
		  {
		   tf.setText("Arithmetic Exception");
		  }
	 	}
		else
		if(op.equals("="))
		arg=n;
		tf.setText(""+arg);
	}}

