
package Exception;

public class Calculator {
    double X,Y;
    double SUM;
    
    Calculator(double X,double Y){
    this.X=X;
    this.Y=Y;
    }
    void Sum (){
    SUM=X+Y;
    
        System.out.println("Some of two numbers:"+SUM);
    }
    
    
    
}
