
package swing.Layout;

import java.awt.*;
import javax.swing.*;

public class Border extends JFrame {
    private Container C;
    private JPanel JP1,JP2;
    private BorderLayout BL1;
    private JButton B1,B2,B3,B4,B5;
            
    
    Border(){
    
    C=this.getContentPane();
    C.setBackground(Color.yellow);
    C.setLayout(null);
    BL1=new BorderLayout(2,3);
    JP1=new JPanel();
    JP1.setBounds(10,10,200,200);
    JP1.setBackground(Color.BLUE);
    JP1.setLayout(BL1);
    C.add(JP1);
    JButton B1=new JButton("1");
 JButton B2=new JButton("2");
 JButton B3=new JButton("3");
 JButton B4=new JButton("4");
 JButton B5=new JButton("Enter");
 
     
    
    JP1.add(B1,BorderLayout.NORTH);
    JP1.add(B2,BorderLayout.SOUTH);
    JP1.add(B3,BorderLayout.EAST);
    JP1.add(B4,BorderLayout.WEST);
    JP1.add(B5,BorderLayout.CENTER);
    
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
      
    public static void main(String[] args) {
        Border BY=new Border();
        BY.setVisible(true);
        BY.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BY.setBounds(10,10,400,500);
        BY.setTitle("Layout Example");
    }
    
}
