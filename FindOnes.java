import java.util.Scanner;
public class FindOnes {
    static int zeros(int n){
        if(n==0){
            return n;
        }
        else{
            return (n%2)+zeros(n/2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=zeros(n);
        System.out.println(ans);
        /*int r,c=0;
        while(n>0){
            r=n%2;
            n=n/2;
            if(r==1){
                c++;
            }
        }
        System.out.println("no of one's are:"+c);*/
    }
}
