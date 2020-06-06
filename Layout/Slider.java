
package swing.Layout;

import java.awt.*;


  
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slider extends JFrame implements ChangeListener {
    private Container C;
    private JLabel L1,L2,L3;
    private JButton B1,B2,B3;
    private JSlider JS1,JS2,JS3;
    private JTextField JT1,JT2,JT3;
    private JPanel JTA;
    
    Slider(){
    C=this.getContentPane();
    C.setLayout(null);
    C.setBackground(Color.cyan);
    L1=new JLabel("RED");
    L1.setBounds(10,40,40,60);
    L1.setOpaque(true);
    L1.setBackground(Color.RED);
    C.add(L1);
    JS1=new JSlider(0,255,0);//initial value,maximum value,strat value
    JS1.setMinorTickSpacing(5);
    JS1.setMajorTickSpacing(50);
    JS1.setPaintTicks(true);
    JS1.setPaintLabels(true);
    JS1.setBounds(80,40,200,60);
    JS1.setBackground(Color.RED);
    C.add(JS1);
    
    JT1=new JTextField();
    JT1.setBounds(300,40,60,60);
    JT1.setBackground(Color.RED);
    C.add(JT1);
    
    L2=new JLabel("Yellow");
    L2.setBounds(10,120,40,60);
    L2.setOpaque(true);
    L2.setBackground(Color.YELLOW);
    C.add(L2);
    JS2=new JSlider(0,255,0);//initial value,maximum value,strat value
    JS2.setMinorTickSpacing(5);
    JS2.setMajorTickSpacing(50);
    JS2.setPaintTicks(true);
    JS2.setPaintLabels(true);
    JS2.setBounds(80,120,200,60);
    JS2.setBackground(Color.YELLOW);
    C.add(JS2);
    
    JT2=new JTextField();
    JT2.setBounds(300,120,60,60);
    JT2.setBackground(Color.YELLOW);
    C.add(JT2);
    
    L3=new JLabel("Black");
    L3.setBounds(10,200,40,60);
    L3.setOpaque(true);
    L3.setBackground(Color.BLACK);
    L3.setForeground(Color.WHITE);
    C.add(L3);
    JS3=new JSlider(0,255,0);//initial value,maximum value,strat value
    JS3.setMinorTickSpacing(5);
    JS3.setMajorTickSpacing(50);
    JS3.setPaintTicks(true);
    JS3.setPaintLabels(true);
    JS3.setBounds(80,200,200,60);
    JS3.setBackground(Color.BLACK);
    JS3.setForeground(Color.WHITE);
    C.add(JS3);
    
    JT3=new JTextField();
    JT3.setBounds(300,200,60,60);
    JT3.setBackground(Color.BLACK);
    JT3.setForeground(Color.WHITE);
    C.add(JT3);


    JTA=new JPanel();
    JTA.setBounds(400,90,150,150);
    JTA.setBackground(Color.PINK);
    C.add(JTA);
    
    JS1.addChangeListener(this);
    JS2.addChangeListener(this);
    JS3.addChangeListener(this);
    
    
    }
    @Override
   public void stateChanged(ChangeEvent e){
   
   int R=JS1.getValue();
   int Y=JS2.getValue();
   int B=JS3.getValue();
   JT1.setText(""+R);
   JT2.setText(""+Y);
   JT3.setText(""+B);
   
  Color cl=new Color(R,Y,B);
  JTA.setBackground(cl);
   }
    
   
    
    public static void main(String[] args) {
        Slider S=new Slider();
        S.setVisible(true);
        S.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        S.setTitle("JSlider Example");
        S.setBounds(15,15,600,400);
        
        
        
    }
}
