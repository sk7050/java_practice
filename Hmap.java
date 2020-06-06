
package Has;

import java.util.HashMap;

public class Hmap {
    public static void main(String[] args) {
        HashMap<Integer,String> Customer=new HashMap<>();
        Customer.put(01,"faisal");
        Customer.put(02,"Anu");
        Customer.put(03,"AK");
        
        System.out.println(Customer.get(01));
        System.out.println(Customer.size());
    }
}
