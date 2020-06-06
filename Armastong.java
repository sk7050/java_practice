
package armastong;

import java.util.Scanner;
import java.lang.Math;

public class Armastong {

    
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
       int i,j,n,temp,f=0,sum=0;
       
        System.out.print("please input how many disigets:" );
        n=input.nextInt();
        int []number=new int[n];
        System.out.print("please input desigts:");
       for( i=0;i<n;i++){
           
           number[i]=input.nextInt();
          sum=sum*10+number[i];
       }
        temp=sum;       
       System.out.println("\n"+"input number is="+temp+""); 
       for( i=0;i<n;i++){
       j=temp%10;
       f=f+(int)Math.pow(j, n);
       temp=temp/10;
       }
       System.out.println("\n"+ "**** number="+f+"");
    if(sum==f)
            System.out.println("the number is armstong number");
    else{
        System.out.println("the number is not armstong number");
        
    }
    
    }
      
}
