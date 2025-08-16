import java.util.*;
public class Lemonade {
    static boolean lemonshop(int[] arr){
        int f=0,ten=0;
        int m=0;
       int cash=0,r=0;
       for(int i=0;i<arr.length;i++){
          if(arr[i]==5){
            f++;
            cash+=arr[i];
         }
         else if(arr[i]==10){
            ten++;
            cash+=arr[i];
            if(f>0){
                f--;
                cash-=5;
            }
            else{
                return false;
            }
         }
         else{
             m++;
             cash+=arr[i];
              if(f>0 && ten>0){
                f--;
                ten--;
                cash-=15;            
              }
              else{
                return false;
              }
            }
        }
        return true;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
    boolean result=lemonshop(arr);
    System.out.println(result);
       

    }
}
