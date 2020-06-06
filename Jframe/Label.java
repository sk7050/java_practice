package swing.Jframe;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Label extends JFrame {

    private Container C;
    private JLabel JL, JL1,JL2;
    private JTextField JT1,JT2;
    private JPasswordField JP1;
    private Font F;
    private ImageIcon Icon;

    Label(){
        Icon=new ImageIcon("anu pic1.jpg");
        setIconImage(Icon.getImage());
        JL = new JLabel();
        JL1 = new JLabel();
        JL2=new JLabel(Icon);
       
        JT2=new JTextField(); JT1=new JTextField();
        JP1=new JPasswordField();
        
        F = new Font("Arial", Font.BOLD, 12);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 50, 300, 300);
        setTitle("Information Panel");
     
        C = this.getContentPane();
        C.setLayout(null);
        C.setBackground(Color.YELLOW);
        C.add(JL);
        C.add(JL1);
        C.add(JL2);
        C.add(JT1);
        C.add(JT2);
        C.add(JP1);
 JL2.setBounds(10, 10,Icon.getIconHeight(),Icon.getIconWidth());
        JL.setFont(F);
        JL.setText("Input Name:");
        JL.setOpaque(true);
        JL.setBackground(Color.BLACK);
        JL.setBounds(50, 220, 100, 20);
JT1.setBounds(160, 220, 100, 20);
JT1.setHorizontalAlignment(JTextField.CENTER);
JP1.setBounds(160, 260, 100, 20);
JP1.setEchoChar('*');
        JL.setForeground(Color.yellow);
        JL.setToolTipText("Input Name");

        JL1.setFont(F);
        JL1.setText("Input Password:");
        JL1.setBounds(50, 260, 100, 20);
        JL1.setForeground(Color.WHITE);
        JL1.setOpaque(true);
        JL1.setBackground(Color.GREEN);
        
        
      set();  
     
     
  }
    public void set(){
    
        AC A=new AC();
        JT1.addActionListener(A);
        JP1.addActionListener(A);
        
    }
  
    class AC implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e)
    {
    if(e.getSource()==JT1){
    String S=JT1.getText();
    
    if(S.isEmpty()){
    
    JOptionPane.showMessageDialog(null,"Please Input Name");
    }
    else 
        JOptionPane.showMessageDialog(null,"Name:"+" "+S);
    }
    else {
    
    String S=JP1.getText();
    
    if(S.isEmpty()){
    
    JOptionPane.showMessageDialog(null,"Please input Password");
    }
    else 
        JOptionPane.showMessageDialog(null,"Password:"+" "+S);
    
    }
    }
    }
    public static void main(String[] args) {
        Label set = new Label();
        
    }

}
