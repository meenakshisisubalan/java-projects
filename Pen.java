
import java.util.*;
public class Pen {
    static int string(String input){
        int a=0,d=0;
        char[] c=input.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]=='#'){
                a++;
            }
            else if(c[i]=='*'){
                d++;
            }
        }
        if(a==d){
            return 0;
        }
        else if(d>a){
            return d-a; 
        }
        else{
            return d-a;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int result=string(input);
        System.out.println(result);
        sc.close();
    }
}
