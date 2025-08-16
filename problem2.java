// if steps is even jump half steps if it is odd hen jump one step
import java.util.*;
public class problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int steps=sc.nextInt();
        int count=0;
        while(steps>0)
        {
            
            if(steps%2==0){
                steps=steps/2;
            }
            else{
                steps=steps-1;
            }
            count++;

        }
        System.out.println(count);
        sc.close();
    }
    
}
