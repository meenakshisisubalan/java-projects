import java.util.Scanner;
public class Sunday {
    static int dayscount(String day , int days){
        int remainingdays=0, c=1;
        switch(day.toLowerCase()){
            case "monday":
                days=days-6;
                while(days>=7){
                    days=days-7;
                    c++;
                
                }
                break;
            case "tuesday":
                days=days-5;
                while(days>=7){
                    days=days-7;
                    c++;
                }
                break;
            case "wednesday":
                days=days-4;
                while(days>=7){
                    days=days-7;
                    c++;
                }
                break;
            case "thursday":
                days=days-3;
                while(days>=7){
                    days=days-7;
                    c++;
                }
                break;
            case "friday":
                days=days-2;
                while(days>=7){
                    days=days-7;
                    c++;
                }
                break;
            case "saturday":
                days=days-1;
                while(days>=7){
                    days=days-7;
                    c++;
                }
                break;
            default:
                while(days>=7){
                    days=days-7;
                    c++;
                }
                break;
        
        }
        return c;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String day=sc.nextLine();
        int days=sc.nextInt();
        int a=dayscount(day,days);
        System.out.println(a);
    }
}
 