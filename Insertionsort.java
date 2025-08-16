import java.util.Scanner;
public class Insertionsort {
    static void insertionsort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            // Shift elements of arr[0..i-1], that are greater than temp, to one position ahead
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        for(int c:arr){
            System.out.print(c+ " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        insertionsort(arr);
    }
}
