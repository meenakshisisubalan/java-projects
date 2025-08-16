public class Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt();
        int n=sc.nextInt();
        int r2=sc.nextInt();
        double x=sc.nextDouble();
        int totalhours=(int)Math.ceil(x/60);
        int totalprice;
        if(totalhours<=n)
        {
            totalprice=r1*totalhours;
        }
        else{
            totalprice=(r1*n)+(totalhours-n)*r2;
        }
        System.out.println(totalprice);
        sc.close();
    }
}


