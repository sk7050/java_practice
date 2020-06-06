
package fibonacci;

import java.util.Scanner;


public class Fibonacci {

    public static void main(String[] args) {
     Scanner input=new Scanner(System.in); 
     int n,i,j,fib;
     int f0=0;
     int f1=1;
     System.out.print("how many febonacci ");
        n=input.nextInt();
         System.out.print(f0+"  "+f1);
        for(i=3;i<=n;i++){
            fib=f0+f1;
            System.out.print("  "+fib+"  ");
            f0=f1;
            f1=fib;
    }
    }
    
}
