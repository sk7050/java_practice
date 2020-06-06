
package swing.Layout;

import java.awt.*;
import javax.swing.*;

public class Grid extends JFrame {
    private Container C;
    private JPanel JP1,JP2;
    private GridLayout BL1;
    private JButton B1,B2,B3,B4,B5,B6,B7,B8;
            
    
    Grid(){
    
    C=this.getContentPane();
    C.setBackground(Color.yellow);
    C.setLayout(null);
    BL1=new GridLayout(3,3,4,4);//row,colume,hgap,vgap
    JP1=new JPanel();
    JP1.setBounds(10,10,400,400);
    JP1.setBackground(Color.BLUE);
    JP1.setLayout(BL1);
    C.add(JP1);
    JButton B1=new JButton("1");
 JButton B2=new JButton("2");
 JButton B3=new JButton("3");
 JButton B4=new JButton("4");
 JButton B5=new JButton("5");
 JButton B6=new JButton("6");
 JButton B7=new JButton("7");
 JButton B8=new JButton("8");
 
     
    
    JP1.add(B1);
    JP1.add(B2);
    JP1.add(B3);
    JP1.add(B4);
    JP1.add(B5);
    JP1.add(B6);
    JP1.add(B7);
    JP1.add(B8);
    
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
      
    public static void main(String[] args) {
        Grid BY=new Grid();
        BY.setVisible(true);
        BY.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BY.setBounds(10,10,400,500);
        BY.setTitle("Layout Example");
    }
    
}
