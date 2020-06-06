package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComBobox extends JFrame {

    private Container C;
    private String[] S = {"C", "C++", "Java", "Paython"};
    private int F;
    private JComboBox JB;
    private JButton J;
    private JTextField T;
    private JLabel L;

    ComBobox() {

        C = this.getContentPane();
        C.setLayout(null);
        C.setBackground(Color.yellow);

        JComboBox JB = new JComboBox(S);
        JB.setBounds(100, 50, 100, 60);
        JB.setEditable(true);
        JB.addItem("php");
        JB.removeItem("C");
        JB.setSelectedItem("C++");
        F = JB.getItemCount();
        C.add(JB);

        
        
        JTextField T=new JTextField();
        T.setBounds(220, 50,150,30);
        T.setText(+F+" "+"Items are Added");
        C.add(T);
        JLabel L=new JLabel();
        L.setBounds(100, 160, 100, 30);
        C.add(L);
        
        JButton J = new JButton();
        J.setBounds(100, 110, 100, 30);
        J.setText("ENTER");
        //J.addActionListener(this);
        C.add(J);
        
J.addActionListener(new ActionListener(){

 @Override
 public void actionPerformed(ActionEvent e) {
String Data=JB.getSelectedItem().toString();
L.setText(Data);
 }
});
    }
    




    
    public static void main(String[] args) {
        ComBobox CB = new ComBobox();
        CB.setVisible(true);
        CB.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CB.setBounds(10,50,500,500);
        CB.setTitle("COMBOBOX");
    }
}
