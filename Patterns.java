import java.util.Scanner;
class Patterns {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        int n=5;

        //pattern1
        /*for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*/
        //pattern2 right angle triangles
        /*for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //pattern3 reverse right angle triangle
        /*for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*/

        //pattern4
        /*for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/

        //patttern5

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }   
}
