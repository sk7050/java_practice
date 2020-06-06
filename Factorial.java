
package factorial;

import java.util.Scanner;


public class Factorial {
 public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int b,n,c,a=1;
        System.out.print("input any number and press enter");
        n=input.nextInt();
       
        for(c=n;c<=n; c--){
           if(c==0 )
               break;
               a=a*c;}
            System.out.println(a);
        
        
 }
    
}
