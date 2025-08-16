import java.util.Scanner;
public class XOR
{
    public static void main(String[] args) 
    {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int c:arr){
            sum+=c;
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int result=arr[i]^arr[j];
                sum+=result;
            }
        }
        int r=arr[0]^arr[1];
        for(int i=2;i<n;i++){
            r=r^arr[i];
            sum+=r;
        }
        System.out.println(sum);
        sc.close();
    }
}
