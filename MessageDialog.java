
package swing;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MessageDialog {
    public static void main(String[] args) {
        ImageIcon Icon=new ImageIcon("anu pic.jpg");
        JOptionPane.showMessageDialog(null, "Wrong Password ","Warning",JOptionPane.PLAIN_MESSAGE,Icon);
        
    }
}
/*0--->JOptionPane.ERROR_MESSAGE--->Error ICON-x
1----->JOptionPane.INFORMATION_MESSAGE--I icon
-1----->JOptionPane.PLAN_MESSAGE---NO icon
2------>JOptionPane.WARNING_MESSAGE--Yello ICON
3------->JOptionPane.Question_MESSAGE--? ICON
*/