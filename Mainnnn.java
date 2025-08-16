import java.util.*;
public class Mainnnn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=sc.nextInt();
        char ch;
        StringBuilder result=new StringBuilder(str.length());
        for(char c:str.toCharArray()){
            if(c>='a' && c<='z')
            {
                result.append((char)((c-'a'+n)%26+'a'));
            }
            else if(c>='A' && c<='Z'){
                result.append((char)((c-'A'+n)%26+'A'));
            }

        }
        System.out.println(result);
    }
}
