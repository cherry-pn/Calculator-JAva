package InputOutput;
import java.util.Scanner;

public class Input {
    
    public double getInput(){
        double value=0;
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        value = Input.nextDouble();
        return value;
    }
    
    public double getvalue(double value){
        return value;
    }
}
