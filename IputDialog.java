
package swing;

import javax.swing.JOptionPane;

public class IputDialog {
    public static void main(String[] args) {
        String F_Name=JOptionPane.showInputDialog(null,"Enter Your Frist Name","Input",3);
        String S_Name=JOptionPane.showInputDialog(null,"Enter Your Second Name","Input",3);
        String Full_Name=F_Name+" "+S_Name;
        JOptionPane.showMessageDialog(null, Full_Name +"\n"+"Welcome to our Zone");
    }
    
}
