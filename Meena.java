/*import java.util.Scanner;
public class Meena {
    static void sumOfDigits(int num)
    {
        if(num<10){
            System.out.println(num);
        }
        else{
            int r;
            while(num>=10){
                int sum=0
                while(num>0)
                {
                r=num%10;
                num=num/10;
                sum=sum+r;
                }
                num=sum; 
            }

            
            
            System.out.println(num);
        }
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sumOfDigits(n);
   } 
}*/


import java.util.Scanner;
class Meena{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the type of screening if premier 1 or normal 2:");
        int scrtype=sc.nextInt();
        int p=sc.nextInt();
        int c=sc.nextInt();
        int result;
        if(scrtype==1){
            result=(p*350)+(c*300);

        }
        else{
            result=(p*150)+(c*100);
        }
        double price;
        double gst=(((result/100)*7.5)*2f);
        price=result+gst;
        System.out.println("price is:"+price);

    }   
}