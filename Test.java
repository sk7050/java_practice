
package Exception;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
     int count=0;   
    while(count!=1){
        Scanner in=new Scanner(System.in);
        System.out.print("please input two noumber for sum:");
        Calculator Cl;
        try{
        Cl=new Input(in.nextDouble(),in.nextDouble());
        Cl.Sum();
        count++;
        }catch(Exception e){
   System.out.println("You Enterd rowng Number"+"\n"+"Please input Valid numbere = " + e);
  }
        
    }
    
              
            
      
}
}