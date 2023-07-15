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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
