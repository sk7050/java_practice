
package swing.Layout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Card extends JFrame implements ActionListener {
    private Container C;
    private JPanel JP1,JP2;
    private CardLayout BL1;
    private JButton B1,B2,B3,B4,B5,B6,B7,B8;
    private JButton L1,L2;
            
    
    Card(){
    
    C=this.getContentPane();
    C.setBackground(Color.yellow);
    C.setLayout(null);
    BL1=new CardLayout(5,5);//row,colume,hgap,vgap
    JP1=new JPanel();
    JP1.setBounds(10,10,300,300);
    JP1.setBackground(Color.BLUE);
    JP1.setLayout(BL1);
    C.add(JP1);
    L1=new JButton("Next");
    L1.setBounds(10,330,100,60);
    C.add(L1);
    L2=new JButton("Previous");
    L2.setBounds(200,330,100,60);
    C.add(L2);
    JButton B1=new JButton("1");
 JButton B2=new JButton("2");
 JButton B3=new JButton("3");
 JButton B4=new JButton("4");
 JButton B5=new JButton("5");
 JButton B6=new JButton("6");
 JButton B7=new JButton("7");
 JButton B8=new JButton("8");
 
     
    
    JP1.add(B1,"Frist");
    JP1.add(B2,"Second");
    JP1.add(B3,"Third");
    JP1.add(B4,"Forth");
    JP1.add(B5,"Fifth");
    JP1.add(B6,"Sixth");
    JP1.add(B7,"Seventh");
    JP1.add(B8,"Eight");
    BL1.show(JP1,"Eight");
    
    
    L1.addActionListener(this);
    L2.addActionListener(this);
    
    }
    @Override
    public void actionPerformed(ActionEvent e){
    if(e.getSource()==L1){
    BL1.next(JP1);
    }
    if(e.getSource()==L2){
    
    BL1.previous(JP1);
    }
    }
    
    
      
    public static void main(String[] args) {
        Card BY=new Card();
        BY.setVisible(true);
        BY.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BY.setBounds(10,10,400,500);
        BY.setTitle("Layout Example");
    }
    
}
