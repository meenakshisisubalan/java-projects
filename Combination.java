/*import java.util.Scanner;
class Combination{
    static int fact(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    static int combination(int n, int r){
        return fact(n)/(fact(n-r)*fact(r));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int result=combination(n,r);
        System.out.println(result);
        sc.close();
    }
}*/
// pascal triangle
import java.util.Scanner;
class Combination{
    static int combi(int n,int r){
        if(n==r || r==0){
            return 1;
        }
        else{
            return combi(n-1,r)+combi(n-1,r-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int result=combi(n,r);
        System.out.println(result);
    }
}