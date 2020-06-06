package swing.Jframe;

import javax.swing.JFrame;

public class Jframe {

    public static void main(String[] args) {
        JFrame A = new JFrame();
        A.setVisible(true);
        A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        A.setSize(300,300);
       //A.setLocationRelativeTo(null); two method are in mathod that is setBounds
        //A.setLocation(200,50);
        A.setBounds(200,50,300,300);
        A.setTitle("Information Panel");
    }
    
}
