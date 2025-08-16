import java.util.Scanner;

public class BinarySearch {
    static int search(int[] arr,int key){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]==key){
                System.out.println("found");
                return mid;
            }
            if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println("not found");
        return -1;

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
