package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCB extends JFrame implements ItemListener{

    private Container C;
    private JCheckBox Ch, Java, MySql;
    private ButtonGroup BG;
    private JLabel L;

    JCB() {
        
        C = this.getContentPane();
        C.setLayout(null);
        C.setBackground(Color.yellow);
        
        Ch = new JCheckBox("C++");
        Java = new JCheckBox("Java");
        MySql = new JCheckBox("MySql");
        Ch.setBounds(100, 40, 100, 30);
        C.add(Ch);
        Java.setBounds(100, 80, 100, 30);
        C.add(Java);
        MySql.setBounds(100, 120, 100, 30);
        C.add(MySql);
        L=new JLabel("you haven't selected anything");
        L.setBounds(100,160,300,30);
        C.add(L);
        BG = new ButtonGroup();
        BG.add(Ch);
        BG.add(Java);
        BG.add(MySql);
        Ch.addItemListener(this);
        Java.addItemListener(this);
        MySql.addItemListener(this);
        
    }    
    
    
    @Override
    public void itemStateChanged(ItemEvent e ){
    if(Ch.isSelected()){
    L.setText("C++ is Slected");
    }
    
    else if(Java.isSelected()){
    L.setText("Java is Slected");
    }
    else if(MySql.isSelected()){
    L.setText("MySql is Slected");
    
    }
     
    }
    public static void main(String[] args) {
        
        JCB CB = new JCB();
        CB.setVisible(true);
        CB.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CB.setBounds(960, 50, 400, 600);
        CB.setTitle("Check Box");
        
    }
}
