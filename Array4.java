
package arrylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Array4 {
    public static void main(String[] args) {
        ArrayList<String> Name =new ArrayList<String>();
       Name.add("Shaikh Abu Faisal");
       Name.add("Shahrin Shabnam");
       Name.add("Md.Masum Ahmed");
       Name.add("Kazi Minhaj Bappy");
       
       for(String i:Name){
           System.out.println(i);
       }
        System.out.println("Before update: "+Name.get(1));
        Name.set(1, "Anu");
        
        System.out.println("After update:"+Name+"\n");
        for(String i:Name){
           System.out.println(i);
       }
        System.out.println(Name.isEmpty()); 
         System.out.println(Name.contains("Shahrin Shabnam"));
        System.out.println("The index of Anu is:"+Name.indexOf("Anu"));
        System.out.println("");
        
        Collections.sort(Name);
        System.out.println("Assinding sort:"+"\n");
        for(String i:Name){
           System.out.println(i);
       }
       Collections.sort(Name,Collections.reverseOrder());
        System.out.println("");
       System.out.println("Dssinding sort:"+"\n");
      for(String i:Name){
           System.out.println(i);
    }
    
    
}
}