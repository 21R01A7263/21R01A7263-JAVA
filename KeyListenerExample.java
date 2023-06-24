import java.awt.*;
import java.awt.event.*;
public class KeyListenerExample extends Frame implements KeyListener{
    Label l;
    TextArea area;
    KeyListenerExample(){
        l=new Label();
        l.setBounds(20,50,100,20);
        area=new TextArea();
        area.setBounds(20,80,300,300);
        area.addKeyListener(this);
        add(l);
        add(area);
     this.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
     });
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public void keyPressed(KeyEvent e) {
       l.setText("key Pressed");
}
public void keyReleased(KeyEvent e){
   l.setText("Key Released");
}
public void keyTyped(KeyEvent e) {
   l.setText("Key Typed");
}
public static void main(String[] args)
{
new KeyListenerExample();
}
}