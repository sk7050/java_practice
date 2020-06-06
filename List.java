
package Link;

import java.util.LinkedList;

public class List {
    public static void main(String[] args) {
        LinkedList<Student> L=new LinkedList<Student>();
        Student S1=new Student("Faisal","BSC",3388);
        Student S2=new Student("Shaikh","BSC",209);
        Student S3=new Student("Abu","BSC",102);
        L.add(S1);
        L.add(S2);
        L.add(S3);
        
        for (Student S:L ){
        
            System.out.println("Name:"+S.Name+"\n"+"Class:"+S.Class+"\n"+"ID:"+S.ID+"\n");
        
        }
    }
}
