import java.util.Scanner;
class JavaCoreProblems{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //armstrong number
        /*int n=sc.nextInt();
        int ori_num=n;
        int sum=0,c=0;
        int temp=n;
        while(n>0){
            temp/=10;
            c++;
        }
        temp=n;
        while(n>0 ){
            int r=n%10;
            sum+=Math.pow(r,c);
            n=n/10;
        }
        if(ori_num==sum){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not armstrong");
        }*/

        //perfect number
        /*int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
           if(n%i==0){
             sum+=i;
           }
        }
        if(sum==n){
            System.out.println("perfect");
        }
        else{
            System.out.println("not perfect");
        }*/

        //prime number
        /*int n=sc.nextInt();
        int c=0;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==1){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }*/
        //palindrome number
        /*int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }*/

        //factorial
        /*int n=sc.nextInt();
        int sum=1;
        for(int i=1;i<=n;i++){
            sum=sum*i;
        }
        System.out.println("Factorail:"+sum);*/

        //reverse a number
        /*int n=sc.nextInt();
        int sum=0;
        int temp=n;
        while(n>0){
            int r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        System.out.println(sum);*/
        //sum of digits
        /*int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=sum+r;
            n/=10;
        }
        System.out.println(sum);*/
        //count of digits
        /*int n=sc.nextInt();
        int temp=n,c=0;
        while(temp>0){
            temp/=10;
            c++;
        }
        System.out.println(c);*/

        //fibonacci series
        /*int n=sc.nextInt();
        int a=0,b=1,c;
        System.out.println(a);
        System.out.println(b);
        for(int i=3;i<n;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }*/

        //greastest common divisor and least common multiple
        //lcm=a*b/gcd(a,b)
        /*int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a*b;
        while(b>0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println(a);
        int lcm=c/a;
        System.out.println(lcm);*/

        //display all prime numbers from 1 to n
        

        
        
    }
}