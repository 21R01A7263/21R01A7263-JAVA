import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code=Fact width=500 height=500> </applet>*/
public class ComputeFactValue extends Applet implements ActionListener
{
	Button b1,b2;
	Label l1,l2;
    	TextField tf1,tf2;
	public void init()
	{        
        		b1=new Button("COMPUTE");
        		b1.addActionListener(this);
        		b2=new Button("CLEAR");
        		b2.addActionListener(this);
        		tf1=new TextField(20);
        		tf2=new TextField(20);
        		l1=new Label("NUMBER");
        		l2=new Label("RESULT");
 		add(l1); 
		add(tf1);
       		add(l2); 
		add(tf2);
		add(b1); 
		add(b2);
    	}
    	public void actionPerformed(ActionEvent e)
    {
      		if(e.getSource()==b1)
      		{
       			int a=Integer.parseInt(tf1.getText());
       			int fact=1;
       			for(int i=1;i<=a;i++)
         			fact*=i;
       			tf2.setText(""+fact);
      		}
      		else
      		{
        			tf1.setText("");
        			tf2.setText("");
      		}   }   }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
