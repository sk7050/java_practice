
package arrylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArryList {

    
    public static void main(String[] args) {
ArrayList<String> Name =new ArrayList<String>();
ArrayList<Integer>ID= new ArrayList<>();
ArrayList<Integer> number= new ArrayList<>();

        System.out.print("Name:");
        Scanner N=new Scanner(System.in);
        Scanner I=new Scanner(System.in);
        String A,B;
        int C,D,E;
        A=N.nextLine();
        System.out.print("ID:");
        C=I.nextInt();
        System.out.print("mobile no:");
        E=I.nextInt();
       
      Name.add(A);
      ID.add(C);
      number.add(E);
        
                
        System.out.println("Student Name"+Name);;
        System.out.println("Studen ID-"+ID);
        System.out.println("Studen phone number-"+number);
    }
    
}
