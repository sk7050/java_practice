package swing.Login;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Multiplication extends JFrame {

    private Container C;
    private JLabel L1, L2, L3, L4;
    private JTextField TF1, TF2, TF3, TF4;
    private JTextArea TA;
    private ImageIcon II;
    private Font F, F1, F2;
    private JButton JB1;

    Multiplication() {

        //for Container 
        C = this.getContentPane();
        C.setLayout(null);
        C.setBackground(Color.yellow);
        //for Font
        F = new Font("Arial", Font.BOLD, 16);
        F1 = new Font("Arial", Font.BOLD, 14);
        //for Image Icon
        II = new ImageIcon("Multiplication.JPG");
        //for Label1
        L1 = new JLabel(II);
        C.add(L1);
        L1.setBounds(1, 1, 382, 200);

        //for Label2
        L2 = new JLabel();
        L2.setFont(F);
        L2.setForeground(Color.BLUE);
        L2.setText("Multiplication Game");
        L2.setBounds(100, 180, 300, 100);
        C.add(L2);

        //for Label3
        L3 = new JLabel();
        L3.setFont(F1);
        L3.setForeground(Color.BLACK);
        L3.setBounds(1, 220, 400, 80);
        L3.setText("Hi kids please put any number in bOX :");
        C.add(L3);

        //for TF1
        TF1 = new JTextField();
        TF1.setFont(F);
        TF1.setHorizontalAlignment(JTextField.CENTER);
        TF1.setForeground(Color.RED);
        TF1.setBackground(Color.cyan);
        TF1.setBounds(280, 230, 60, 60);
        C.add(TF1);

        // for Label4
        L2 = new JLabel();
        L2.setFont(F);
        L2.setForeground(Color.black);
        L2.setText("Multiplication Table");
        L2.setBounds(100, 260, 300, 100);
        C.add(L2);

        //for  TA
        TA = new JTextArea();
        TA.setFont(F);
        TA.setBackground(Color.BLACK);
        TA.setForeground(Color.WHITE);
        TA.setBounds(80, 330, 200, 250);
        C.add(TA);

        //fot JB1\
        JB1 = new JButton("Clear");
        JB1.setText("CLEAR");
        JB1.setBounds(280, 290, 80, 30);
        C.add(JB1);

        //action event
        TF1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (TF1.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "please put any number");

                } else {
                    int num = Integer.parseInt(TF1.getText());
                    for (int i = 1; i <= 10; i++) {
                        int result = num * i;
                        String r = String.valueOf(result);
                        String n = String.valueOf(num);
                        String I = String.valueOf(i);
                        TA.append(n + "  " + "X" + " " + I + "------------------->" + r + "\n");

                    }

                }

            }

        }
        );
        JB1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                TF1.setText("");
                TA.setText("");
            }

        }
        );

    }

    public static void main(String[] args) {

        Multiplication M = new Multiplication();
        M.setVisible(true);
        M.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        M.setBounds(50, 30, 400, 700);
        M.setTitle("Multiplication Game for Kids");

    }

}
