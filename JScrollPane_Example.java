import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
public class JScrollPane_Example {
public static void main(String[] args) {
JFrame frame = new JFrame();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JPanel panel = new JPanel();
panel.setLayout(new FlowLayout());
JTextArea tArea = new JTextArea(10,10);
JScrollPane scrollPane = new JScrollPane(tArea);
panel.add(scrollPane);
frame.setContentPane(panel);
frame.setSize(300,300);
frame.setLocationByPlatform(true);
frame.setVisible(true);
}
}
