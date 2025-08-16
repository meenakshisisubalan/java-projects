import java.util.Scanner;
public class FindMaxMin {
    static void Maxmin(int[] arr){
        int start=0,mid;
        int end=arr.length-1;
        while(start<=end){
            mid=(start+end)/2;

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Maxmin(arr);
    }
}
