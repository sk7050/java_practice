
package Filesystem;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Filewrite {
    public static void main(String[] args) {
        try {
            Scanner input =new Scanner(System.in);
            int n;
            String Name,ID;
            System.out.print("How manny Students:");
            n=input.nextInt();
            
            Formatter Student=new Formatter("C:/Users/sk705/Desktop/Sk/Student.xlsx");
            for(int i=0;i<n;i++){
                System.out.print("Input ID :");
                ;
            ID=input.next();
            System.out.print("input Name:");
            Name=input.next();
            Student.format("%s %s\r\n",ID,Name);
            
            
            }
            Student.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Filewrite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
