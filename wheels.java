import java.util.*;
public class wheels {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int v=sc.nextInt();
    int w=sc.nextInt();
    int t,f;
    f=(w-2*v)/2;
    t=(v-f);
   System.out.println("fw "+f);
   System.out.println("tw "+t);
  }
}
