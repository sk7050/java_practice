package swing.Login;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame {

    private JLabel JL1, JL2;
    private JTextField JT1, JT2;
    private JPasswordField JP1;
    private JButton JB1, JB2;
    private Container C;
    private Font F;

    Login() {

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400, 30, 400, 400);
        setTitle("Information Panel");

        C = this.getContentPane();
        C.setLayout(null);
        C.setBackground(Color.PINK);
        F = new Font("Arial", Font.BOLD, 16);

        JL1 = new JLabel();
        JL2 = new JLabel();
        JT1 = new JTextField();
        JT2 = new JTextField();
        JP1 = new JPasswordField();
        JB1 = new JButton();
        JB2 = new JButton();

        C.add(JL1);
        C.add(JL2);
        C.add(JT1);
        C.add(JT2);
        C.add(JP1);
        C.add(JB1);
        C.add(JB2);

        JL1.setFont(F);
        JL1.setForeground(Color.WHITE);
        JL1.setText(" User Name:");
        JL1.setBounds(50, 50, 100, 30);
        JL1.setOpaque(true);
        JL1.setBackground(Color.BLACK);

        JT1.setFont(F);
        JT1.setForeground(Color.BLACK);
        JT1.setBounds(180, 50, 150, 30);
        JT1.setBackground(Color.yellow);

        JL2.setFont(F);
        JL2.setForeground(Color.WHITE);
        JL2.setText("Password:");
        JL2.setBounds(50, 100, 100, 30);
        JL2.setOpaque(true);
        JL2.setBackground(Color.BLACK);

        JP1.setFont(F);
        JP1.setForeground(Color.BLACK);
        JP1.setBounds(180, 100, 150, 30);
        JP1.setBackground(Color.yellow);
        JP1.setEchoChar('#');

        JB1.setText("L0GIN");
        JB1.setBounds(180, 150, 70, 30);

        JB2.setText("CLEAR");
        JB2.setBounds(260, 150, 80, 30);

        set();

    }

    public void set() {
        A a = new A();
        JB2.addActionListener(a);
        JB1.addActionListener(a);
    }

    class A implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == JB2) {
                JT1.setText("");
                JP1.setText("");

            } else {
                if (JT1.getText().equals("sk7050") && JP1.getText().equals("01750088353")) {
                    JOptionPane.showMessageDialog(null, "Sucessfully Logedin");
                } else {
                    JOptionPane.showMessageDialog(null, "INVALIED usename or password");
                }
            }

        }

    }

    public static void main(String[] args) {
        Login L = new Login();
    }

}
