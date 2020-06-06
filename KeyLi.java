package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyLi extends JFrame {

    private JTextField JT1, JT2;
    private JTextArea JA;
    private JLabel JL1, JL2, JL3;
    private JButton JB1, JB2;
    private Container C;
    private Font F1, F2, F3;
    private JPanel JP1, JP2, JP3, JP4, JP5, JP6;
    int total = 0;
    int A = 0;
    int E = 0;
    int I = 0;
    int O = 0;
    int U = 0;

    KeyLi() {

        C = this.getContentPane();
        C.setLayout(null);
        C.setBackground(Color.yellow);

        Font F1 = new Font("Lucida Console", Font.BOLD,9);
        Font F2 = new Font("Times New Roman", Font.BOLD, 30);
        Font F3 = new Font("Times New Roman", Font.BOLD, 18);
        JPanel JP1 = new JPanel();
        JP1.setBounds(05, 05, 375, 10);
        JP1.setBackground(Color.RED);
        C.add(JP1);

        JPanel JP2 = new JPanel();
        JP2.setBounds(05, 20, 375, 10);
        JP2.setBackground(Color.RED);
        C.add(JP2);

        JPanel JP3 = new JPanel();
        JP3.setBounds(05, 20, 10, 500);
        JP3.setBackground(Color.RED);
        C.add(JP3);

        JPanel JP4 = new JPanel();
        JP4.setBounds(370, 20, 10, 500);
        JP4.setBackground(Color.RED);
        C.add(JP4);

        JPanel JP5 = new JPanel();
        JP5.setBounds(05, 510, 375, 10);
        JP5.setBackground(Color.RED);
        C.add(JP5);

        JPanel JP6 = new JPanel();
        JP6.setBounds(05, 525, 375, 10);
        JP6.setBackground(Color.RED);
        C.add(JP6);

        JLabel JL2 = new JLabel();
        JL2.setText("VOWELS DISPLAY");
        JL2.setBounds(80, 190, 180, 20);
        JL2.setOpaque(true);
        JL2.setBackground(Color.MAGENTA);
        JL2.setForeground(Color.WHITE);
        JL2.setFont(F3);
        C.add(JL2);

        JTextArea JA = new JTextArea();
        JA.setBounds(40, 220, 300, 288);
        JA.setBackground(Color.BLACK);
        JA.setForeground(Color.WHITE);
        JA.setFont(F3);
        C.add(JA);

        JLabel JL1 = new JLabel();
        JL1.setText("HI Kids Please Input Text in BOX & Press SUBMIT Button");
        JL1.setBounds(14, 30, 360, 20);
        JL1.setOpaque(true);
        JL1.setBackground(Color.CYAN);
        JL1.setForeground(Color.BLUE);
        JL1.setFont(F1);
        C.add(JL1);

        JTextField JT1 = new JTextField();
        JT1.setBounds(16, 60, 355, 80);
        JT1.setBackground(Color.PINK);
        JT1.setForeground(Color.BLUE);
        JT1.setFont(F2);
        C.add(JT1);

        JButton JB1 = new JButton("SUBMIT");
        JB1.setBounds(100, 140, 80, 30);
        C.add(JB1);

        JButton JB2 = new JButton("CLEAR");
        JB2.setBounds(180, 140, 80, 30);
        C.add(JB2);

        JT1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {

                if (ke.getSource() == JT1) {

                    if (ke.VK_A == ke.getKeyCode()) {
                        A++;
                        total++;
                    }
                    if (ke.VK_E == ke.getKeyCode()) {
                        E++;
                        total++;
                    }
                    if (ke.VK_I == ke.getKeyCode()) {
                        I++;
                        total++;
                    }

                }

            }

            @Override
            public void keyReleased(KeyEvent ke) {
                if (ke.VK_O == ke.getKeyCode()) {
                    O++;
                    total++;
                }
                if (ke.VK_U == ke.getKeyCode()) {
                    U++;
                    total++;
                }
                JB1.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JA.setText("Total Number of Vowel:" + " " + total + "\n" + "Total Number of A:" + " " + A + "\n" + "Total Number of E:" + " " + E + "\n" + "Total Number of I:" + " " + I + "\n" + "Total Number of O:" + " " + O + "\n" + "Total Number of U:" + " " + U + "\n");
                    }
                });

            }

        }
        );

        JB2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JT1.setText("");
                JA.setText("");
                total = 0;
                A = 0;
                E = 0;
                I = 0;
                O = 0;
                U = 0;

            }
        });

    }

    public static void main(String[] args) {
        KeyLi K = new KeyLi();
        K.setVisible(true);
        K.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        K.setBounds(10, 20, 400, 600);
        K.setTitle("vowels Counter");
    }
}
