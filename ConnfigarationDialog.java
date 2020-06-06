
package swing;

import javax.swing.JOptionPane;

public class ConnfigarationDialog {
    public static void main(String[] args) {
        int i=JOptionPane.showConfirmDialog(null,"Do you Want to Quit?","Confirm Message",JOptionPane.YES_NO_OPTION);
        
        if(i==JOptionPane.YES_OPTION){
        
        System.exit(0);
        
        }
    else{
            System.out.println("You Clicked");

}
    
    }
}
