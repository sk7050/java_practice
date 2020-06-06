
import java.util.Arrays;
import java.util.Scanner;


public class ArrySorting {
    public static void main(String[] args) {
        int N;
        Scanner X=new Scanner(System.in);
        System.out.print("how maney noumber you want to sort:");
        N=X.nextInt();
        int [] A= new int[N];
        for(int i=0;i<N;i++){
            System.out.printf("A[%d]=",i);
            A[i]=X.nextInt();
        }
        Arrays.sort(A);
        System.out.print("Assending Short A=");
        for(int i=0;i<N;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println("");
        System.out.print("Desinding Short A=");
        for(int j=N-1;j>=0;j--){
            System.out.print(A[j]+" ");
        }
        System.out.println("");
    }   
    
 
}
