/*import java.util.Arrays;
import java.util.Scanner;
class Sample {
    static void Evenodd(int[] arr){
        int size=arr.length;
        int even=0;
        int odd=1;
        int[] array=new int[size];
        for(int num:arr){
            if(num%2==0 && even<size){
                array[even]=num;
                even+=2;
            }
            else if(num%2 ==1 && odd<size){
                array[odd]=num;
                odd+=2;
            }
        }    
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Evenodd(arr);
    }
}*/
