
package swing.Layout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Jtabbedpane extends JFrame implements ActionListener{
private Container C;
private JTabbedPane JTBP;
private JTextField TF1,TF2,TF3,TF4,TF5;
    private  JButton JB1;
    private  JButton JB2;
    private  JButton JB3;
   
private JButton JB4,JB5,JB6,JB7;
private JLabel JL1,JL2,JL3,JL4,JL5;
private JPanel JP1,JP2,JP3,JP4,JP5;
private JTable TA;
private  DefaultTableModel tableModel ;
private JScrollPane JS;
private String []columns={"Names","ID","Deg","Salary"};
private String []rows=new String[4];
Jtabbedpane(){
C=this.getContentPane();
C.setBackground(Color.cyan);
C.setLayout(null);


//JTabbedPane use for many interfase at one plase 
JTBP=new JTabbedPane();
JTBP.setBounds(40,40,1000,600);
C.add(JTBP);

JP1=new JPanel();
JP1.setBackground(Color.LIGHT_GRAY);
JP2=new JPanel();
JP2.setBackground(Color.pink);
JP3=new JPanel();
JP3.setBackground(Color.ORANGE);
JP4=new JPanel();
JP4.setLayout(null);
JP4.setBackground(Color.yellow);
JP5=new JPanel();
JP5.setLayout(null);
JP5.setBackground(Color.MAGENTA);

JTBP.addTab("Home",JP1);
JTBP.addTab("Service Monitoring",JP2);
JTBP.addTab("Stoke Management",JP3);
JTBP.addTab("User Interface",JP4);
JTBP.addTab("User Interface",JP4);
JTBP.addTab("employee management ",JP5);//Jtable


//jtable
JL1=new JLabel("Name");
JL1.setBounds(20,20,100,40);

TF1=new JTextField ();
TF1.setBounds(60,22,200,30);
JB1=new JButton("ADD");
JB1.setBounds(300,22,100,30);

JL2=new JLabel("ID");
JL2.setBounds(20,60,100,40);
TF2=new JTextField ();
TF2.setBounds(60,62,200,30);
JB2=new JButton("UPDATE");
JB2.setBounds(300,62,100,30);
JL3=new JLabel("Desig");
JL3.setBounds(20,100,100,40);
TF3=new JTextField ();
TF3.setBounds(60,102,200,30);
JB3=new JButton("DELET");
JB3.setBounds(300,102,100,30);
JL4=new JLabel("Salary");
JL4.setBounds(20,140,100,40);
TF4=new JTextField ();
TF4.setBounds(60,142,200,30);
JB4=new JButton("CLEAR");
JB4.setBounds(300,142,100,30);



JP5.add(JL1);
JP5.add(TF1);
JP5.add(JB1);
JP5.add(JL2);
JP5.add(TF2);
JP5.add(JB2);
JP5.add(JL3);
JP5.add(TF3);
JP5.add(JB3);
JP5.add(JL4);
JP5.add(TF4);
JP5.add(JB4);

TA=new JTable();
JS=new JScrollPane(TA);
JS.setBounds(360,260,600,300);
JP5.add(JS);
        
tableModel=new DefaultTableModel();
tableModel.setColumnIdentifiers(columns);
TA.setModel(tableModel);
TA.setEnabled(true);
TA.setSelectionBackground(Color.yellow);




JB1.addActionListener(this);
JB4.addActionListener(this);
JB3.addActionListener(this);
TA.addMouseListener(new MouseAdapter(){

@Override
public void mouseClicked(MouseEvent e){


int d =TA.getSelectedRow();

TF1.setText(tableModel.getValueAt(d, 0).toString());
TF2.setText(tableModel.getValueAt(d, 1).toString());
TF3.setText(tableModel.getValueAt(d, 2).toString());
TF4.setText(tableModel.getValueAt(d, 3).toString());
}






});







JB2.addActionListener(this);
}


@Override
public void actionPerformed(ActionEvent e){
if (e.getSource()==JB1){

rows[0]=TF1.getText();
rows[1]=TF2.getText();
rows[2]=TF3.getText();
rows[3]=TF4.getText();
tableModel.addRow(rows);
}
else if(e.getSource()==JB4){
TF1.setText("");
TF2.setText("");
TF3.setText("");
TF4.setText("");
}

else if(e.getSource()==JB3){
int d =TA.getSelectedRow();
if(d>0){
tableModel.removeRow(d);
}
else{JOptionPane.showMessageDialog(null,"any row don't slect");}
}

else if(e.getSource()==JB2){


tableModel.setValueAt(TF1.getText(),TA.getSelectedRow(), 0);
tableModel.setValueAt(TF2.getText(), TA.getSelectedRow(), 1);
tableModel.setValueAt(TF3.getText(), TA.getSelectedRow(), 2);
tableModel.setValueAt(TF4.getText(), TA.getSelectedRow(), 3);


}


}








    public static void main(String[] args) {
        Jtabbedpane JT=new Jtabbedpane();
        JT.setVisible(true);
        JT.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JT.setTitle("Business Process Management Software");
        JT.setBounds(20,20,1330,700);
        JT.setResizable(true);
    }
    
}
