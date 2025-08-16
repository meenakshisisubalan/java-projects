import java.util.*;
public class sreeja{
    static int minimum(int[] arr){
        int value;
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min<arr[i]){
                min=arr[i];
                value=i;
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        minimum(arr);
        int value;
        int max=arr[value+1];
        for(int j=value+1;j<n;j++){
            if(max<arr[j]){
                max=arr[j];
                }
        }
       int c=max-min;
        System.out.println(c);
    }
}
