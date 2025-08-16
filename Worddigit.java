import java.util.*;
public class Worddigit
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int num=0;
		for(int i=0;i<str.length();i++)
		{
		    char ch=str.charAt(i);
		    if(ch>='0' && ch<='9')
		    {
		        num=num*10+(ch-'0');
		    }
		}
		System.out.print(num);
	}
}