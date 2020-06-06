
package swing;

import java.awt.Color;
import javax.swing.*;

public class RadioButton extends JFrame {
  
    
    RadioButton(){
      
    JRadioButton J1=new JRadioButton("A) Male");    
JRadioButton J2=new JRadioButton("B) Female");
   J1.setBounds(75,50,100,30);
   J1.setBackground(Color.yellow);
   J2.setBounds(75,100,100,30); 
    
   ButtonGroup br=new ButtonGroup();
   br.add(J1);
  br.add(J2);
  add(J1);add(J2);
   
setVisible(true); 
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(30,50,300,300);    
    

    
    }
    
    
    

    public static void main(String[] args) {
       new RadioButton();
        
        
        
    }
    
}
