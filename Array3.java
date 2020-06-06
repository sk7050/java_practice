
package arrylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Array3 {
    
    public static void main(String[] args) {
        ArrayList<String> Name =new ArrayList<>();
        Name.add("Faisal");
        Name.add("trina");
        Name.add("Mohona");
        Name.add("Naser");
        Iterator i=Name.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        
    }
}
