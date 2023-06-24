import java.applet.*;
import java.awt.*;
/*<applet code="SimpleApplet" height=300 width=300>
</applet>*/
public class SimpleMessage extends Applet{
	public void paint(Graphics g)
	{
		g.setColor(Color.pink);
		setBackground(Color.yellow);
		g.drawString("HI APPLET Program",80,150);
}
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
