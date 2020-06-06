package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RB extends JFrame implements ActionListener{

    private JRadioButton rb1, rb2;
    private ButtonGroup BG;
    private Container C;

    RB() {
        
        C = getContentPane();
        C.setBackground(Color.yellow);
        C.setLayout(null);
        
        BG=new ButtonGroup();
        rb1 = new JRadioButton("Mail");
        rb1.setBounds(50, 50, 80, 50);
        rb1.setBackground(Color.RED);
        rb2 = new JRadioButton("Femail");
        rb2.setBounds(150, 50, 80, 50);
        C.add(rb1);
        C.add(rb2);
        BG.add(rb1);BG.add(rb2);
        rb1.addActionListener(this);
        rb2.addActionListener(this);
    }    
    @Override
    public void actionPerformed(ActionEvent e){
    
    if(rb1.isSelected()){
    JOptionPane.showMessageDialog(null,"you selected Mail");
    }
    if(rb2.isSelected()){
    JOptionPane.showMessageDialog(null,"you Selected Femail");
    
    }
    
    }
    
    public static void main(String[] args) {
        RB R = new RB();
        R.setVisible(true);
        R.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        R.setBounds(100, 50, 400, 300);
        R.setTitle("RadioButton");
        
    }
}
