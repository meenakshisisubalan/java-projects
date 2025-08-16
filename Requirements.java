/*import java.util.*;
public class Requirements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        for(int i=a;i<=b;i++){
            int n=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    n++;
                }
                
            }
            if(n==4){
                c++;
            }
        }
        System.out.println(c);
    }
}
*/

//problem2
/*import java.util.*;
public class Requirements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        if(mark>100){
            System.out.println("Wrong entry");
        }
        else if(mark>90 && mark<=100){
            System.out.println("A");
        }
        else if(mark>80 && mark<=90){
            System.out.println("B");
        }
        else if(mark>70 && mark<=80){
            System.out.println("C");
        }
        else if(mark>60 && mark<=70){
            System.out.println("D");
        }
        else if(mark>50 && mark<=60){
            System.out.println("E");
        }
        else{
            System.out.println("RA");
        }
    }
}*/

//problem3

/*import java.util.*;
public class Requirements{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        double h=sc.nextDouble();
        double bmi;
        bmi=w/(h*h);
        System.out.println("BMI: " + bmi);
        if(bmi<18.5){
            System.out.println("underweight");
        }
        else if(bmi>=18.5 && bmi <=24.9){
            System.out.println("Normal weight");
        }
        else if(bmi>=25 && bmi<=29.9){
            System.out.println("over weight");
        }
        else{
            System.out.println("obesity");
        }
    }
}*/

//problem4
/*import java.util.*;
public class Requirements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int p=sc.nextInt();
        int c=sc.nextInt();
        int total;
        boolean b=true;
        if(m<=0 || m>=100){
            System.out.println("invalid number");
            b=false;
        }
        if(p<=0 || p>=100){
            System.out.println("invalid number");
            b=false;
        }
        if(c<=0 || c>=100){
            System.out.println("invalid number");
            b=false;
        }
        total=m+p+c;
        if(b){
            System.out.println(m +" "+ p +" " + c);
        if(m>=60 && p>=50 && c>=40 && total>=200){
            System.out.println("Congratulations! You are eligible for admission  ");
        }
        else{
            System.out.println("Sorry! You are not eligible for admission ");
        }
        }
    }
}*/

//problem5

/*import java.util.*;
public class Requirements{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int maths=sc.nextInt();
        int physics=sc.nextInt();
        int chemistry=sc.nextInt();
        int biology=sc.nextInt();
        int computer=sc.nextInt();
        int total=maths+physics+chemistry+biology+computer;
        double result;
        result=(total /5.0f);
        System.out.printf("%.2f " ,result);
        if(result>=90){
            System.out.println("A");
        }
        else if(result>=80){
            System.out.println("B");
        }
        else if(result>=70){
            System.out.println("C");
        }
        else if(result>=60){
            System.out.println("D");
        }
        else if(result>=40){
            System.out.println("E");
        }
        else{
            System.out.println("F");
        }


    }
}*/

//problem6