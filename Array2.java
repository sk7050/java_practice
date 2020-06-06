
package arrylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Array2 {
    public static void main(String[] args) {
        ArrayList<Integer> ID=new ArrayList<>();
        ID.add(12);
        ID.add(10);
        ID.add(30);
        for(int X:ID){
            System.out.println(X);
          /* Iterator M=ID.iterator();
           while(M.hasNext()){
           
               System.out.println(M.next());
           }
        */
          }
          boolean con=ID.contains(60);
            System.out.println(con);
    
    }
   
}
