import java.util.Scanner;
public class LinearSearch {
    static void search(int[] arr,int key){
        int flag=0;
        for(int c:arr){
            if(c==key){
                flag=1;
            }
        }
        if(flag==1){
            System.out.println("element found");
        }
        else{
            System.out.println(" element not found");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        search(arr,key);
        sc.close();
    }
}
