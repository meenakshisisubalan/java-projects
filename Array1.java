import java.util.Scanner;
public class Array1 {
    static void entryexit(int[] entry, int[] exit){
        int sum=0,r;
        int n=entry.length;
        for(int i=0;i<n;i++){
            sum=sum+entry[i];
            for(int j=i;j<=i;j++){
                r=sum-exit[j];

            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] entry=new int[size];
        int[] exit=new int[size];
        for(int i=0;i<size;i++){
            entry[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            exit[i]=sc.nextInt();
        }
        entryexit(entry,exit);

    }
}
