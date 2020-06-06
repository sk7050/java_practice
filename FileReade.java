
package Filesystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileReade {
    public static void main(String[] args) {
        try {
            File Student =new File("C:/Users/sk705/Desktop/Sk/Student.xlsx");
            Scanner Scan=new Scanner(Student);
            while(Scan.hasNext()){
            String ID=Scan.next();
            String Name=Scan.next();
            
                System.out.println("ID:"+ID+"\n"+"&"+"\n"+"Name:"+Name+"\n");
            }
            Scan.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileReade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
