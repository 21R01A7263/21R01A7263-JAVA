import javax.swing.*;  
    import javax.swing.tree.DefaultMutableTreeNode;  
    public class JTree_Example 
{  
    JFrame f;  
    JTree_Example(){  
        f=new JFrame();   
        DefaultMutableTreeNode style=new DefaultMutableTreeNode("Style");  
        DefaultMutableTreeNode color=new DefaultMutableTreeNode("color");  
        DefaultMutableTreeNode font=new DefaultMutableTreeNode("font");  
        style.add(color);  
        style.add(font);  
        DefaultMutableTreeNode red=new DefaultMutableTreeNode("red");  
        DefaultMutableTreeNode blue=new DefaultMutableTreeNode("blue");  
        DefaultMutableTreeNode green=new DefaultMutableTreeNode("green");  
        color.add(red); 
        color.add(blue); 
        color.add(green);      
        JTree jt=new JTree(style);  
        f.add(jt);  
        f.setSize(250,250);  
        f.setVisible(true);  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
    public static void main(String[] args) {  
        new JTree_Example();  
    }
} 
