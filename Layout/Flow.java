

package swing.Layout;

import java.awt.*;
import javax.swing.*;

public class Flow extends JFrame {
    private Container C;
    private JPanel JP1,JP2;
    private FlowLayout BL1;
    private JButton B[],B1[];
    private BoxLayout BOX;       
    
    Flow(){
    
    C=this.getContentPane();
    C.setBackground(Color.yellow);
    C.setLayout(null);
    BL1=new FlowLayout(FlowLayout.LEFT);
    
    JP1=new JPanel();
    
    JP1.setBounds(10,10,200,100);
    JP1.setBackground(Color.BLUE);
    JP1.setLayout(BL1);
    C.add(JP1);
    JP2=new JPanel();
    JP2.setBackground(Color.RED);
    JP2.setBounds(230,10,150,100);
    BOX=new BoxLayout(JP2,BoxLayout.LINE_AXIS);
    C.add(JP2);
    
    JButton B[]=new JButton[10];
    for(int i=0;i<=9;i++){
    B[i]=new JButton(""+i);
 JP1.add(B[i]);
    
    }
    JButton B1[]=new JButton[5];
    for(int i=0;i<=4;i++){
    B1[i]=new JButton(""+i);
 JP2.add(B1[i]);
    
    }
        }
    
    
    
      
    public static void main(String[] args) {
        Flow BY=new Flow();
        BY.setVisible(true);
        BY.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BY.setBounds(10,10,400,500);
        BY.setTitle("Layout Example");
    }
    
}
