
package Filesystem;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreatFile {
    public static void main(String[] args) {
        
   
        try {
            
            File Creat1;
            File Creat2;
            Creat1=new File("C:/Users/sk705/Desktop/Sk/Sk.text");
            Creat2=new File("C:/Users/sk705/Desktop/Sk/Anu.text");
            Creat1.createNewFile();
            Creat2.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(CreatFile.class.getName()).log(Level.SEVERE, null, ex);
        }
}
 }