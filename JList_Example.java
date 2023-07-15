import javax.swing.*;  
    public class JList_Example
    {  
         JList_Example(){  
            JFrame f= new JFrame();  
            DefaultListModel<String> l1 = new DefaultListModel<>();  
              l1.addElement("Item1");  
              l1.addElement("Item2");  
              l1.addElement("Item3");  
              l1.addElement("Item4");  
              JList<String> list = new JList<>(l1);  
              list.setBounds(100,100, 75,75);  
              f.add(list);  
              f.setSize(400,400);  
              f.setLayout(null);  
              f.setVisible(true);  
              f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         }  
   
 public static void main(String args[])  
        {  
       new JList_Example();  
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
