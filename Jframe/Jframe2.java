
package swing.Jframe;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Jframe2 extends JFrame {
    private ImageIcon Icon;
    private Container c;
    
    
    
    
    
    Jframe2(){
        
    setVisible(true);
    setDefaultCloseOperation(Jframe2.EXIT_ON_CLOSE);
    setBounds(200,50,300,300);
    setTitle("Information Panel");
    c=this.getContentPane();
    c.setBackground(Color.RED);
    
    
    ICO();
    
    }
    void ICO(){
    Icon=new ImageIcon("anu pic.jpg");
    this.setIconImage(Icon.getImage());
    
    }
    
    public static void main(String[] args) {
        Jframe2 A=new Jframe2();
       
    }
    
}
