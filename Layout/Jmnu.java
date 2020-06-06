
package swing.Layout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Jmnu extends JFrame implements ActionListener {
   private Container C;
   private JMenu edit,file,help;
   private JMenuBar menubar;
   private JMenuItem editItem,newItem,copyItem,pastItem;
   
    Jmnu(){
    
    C=this.getContentPane();
    C.setBackground(Color.yellow);
    menubar=new JMenuBar();
    menubar.setBackground(Color.MAGENTA);
    this.setJMenuBar(menubar);
    JMenu edit=new JMenu("edit");
    JMenu file=new JMenu("file");
    JMenu help=new JMenu("help");
    menubar.add(edit);
     menubar.add(file);
      menubar.add(help);
      
      newItem=new JMenuItem("new");
      editItem=new JMenuItem("edit");
      copyItem=new JMenuItem("copy");
      pastItem=new JMenuItem("past");
      file.add(newItem);
      file.add(editItem);
      file.add(copyItem);
      
      newItem.addActionListener(this);
      editItem.addActionListener(this);
      copyItem.addActionListener(this);
    }
    
   @Override
    public void actionPerformed(ActionEvent e){
    
    if(e.getSource()==newItem){
    JFrame New=new JFrame();
   New.setVisible(true);
   New.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    New.setTitle("NEW FILE");
    New.setBounds(20,30,300,200);
    
    }
    else if(e.getSource()==copyItem){
   
    }
    
    }
    
    
    public static void main(String[] args) {
        Jmnu JM=new Jmnu();
        JM.setVisible(true);
        JM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JM.setTitle("JMENU");
        
        JM.setBounds(30,20,300,600);
    }
  
    
}
