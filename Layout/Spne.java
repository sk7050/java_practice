
package swing.Layout;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Spne extends JFrame implements ChangeListener {
   private Container C;
    private JLabel L1,L2,L3;
    private JSpinner JSP;
   Spne(){
   C=this.getContentPane();
    C.setLayout(null);
    C.setBackground(Color.cyan);
   
   SpinnerNumberModel Value=new SpinnerNumberModel(10,0,30,5);//(intail value,min value,Max value,incrsing/decresing value)
   JSP=new JSpinner(Value);
   JSP.setBounds(10,20,30,50);
   C.add(JSP);
   
   L1=new JLabel("value is set to :10");
   L1.setBounds(20,60,150,60);
   C.add(L1);
   
   
   JSP.addChangeListener(this);
   }  
    
   @Override
    public void stateChanged(ChangeEvent e){
   
    L1.setText("value is set to :"+JSP.getValue());
    
    }
    
    
    
    
    public static void main(String[] args) {
        Spne S=new Spne();
        
        S.setVisible(true);
        S.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        S.setTitle("JSlider Example");
        S.setBounds(15,15,600,400);
        
    }
       
}
