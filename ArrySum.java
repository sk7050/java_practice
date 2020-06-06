
import java.util.Scanner;


public class ArrySum {
    public static void main(String[] args) {
        int i,j,n,m,k=0;
        Scanner X=new Scanner(System.in);
        System.out.print("matrix size (Number of rows):");
        n=X.nextInt();
        System.out.print("matrix size (Number of coloums):");
        m=X.nextInt();
        int [][] A=new int[n][m]; 
       
       
        //input matrix elements
        for(i=0;i<n;i++){
        for(j=0;j<m; j++){
            System.out.printf("A[%d][%d]=", i,j);
           A[i][j]=X.nextInt();
          
         }
            }
        //print matrix elements
        System.out.println("Matrix A=");
        for(i=0;i<n;i++){
        for(j=0;j<m; j++){
            System.out.print(" "+A[i][j]);   
         }
            System.out.println("");
            }
        //sum of digonals
        System.out.print("Sum of Diagonal=");
        for(i=0;i<n;i++){
        for(j=0;j<m; j++){
          if(i==j){
          k=k+A[i][j];
             
          }
          
         }
          
           }
       
        System.out.print(k);
        System.out.println("");
        k=0;
        
        
        //sum of upper elements
        System.out.print("Sum of upper elements=");
        for(i=0;i<n;i++){
        for(j=0;j<m; j++){
          if(i<j){
          k=k+A[i][j];
             
          }
          
         }
          
           }
        System.out.print(k);
        System.out.println("");
        k=0;
         //sum of lower elements
        System.out.print("Sum of lower elements=");
        for(i=0;i<n;i++){
        for(j=0;j<m; j++){
          if(i>j){
          k=k+A[i][j];
             
          }
          
         }
          
           }
        System.out.print(k);
        System.out.println("");

    }
    
}
