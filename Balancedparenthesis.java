import java.util.Stack;
import java.util.Scanner;
public class Balancedparenthesis {
    static boolean isbalanced(String str){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='[' || ch=='{' || ch=='('){
                stack.push(str.charAt(i));
            }
            else{
                if(!stack.empty()){
                    if(stack.peek()=='[' && str.charAt(i)==']'){
                        stack.pop();
                    }
                    else if(stack.peek()=='(' && str.charAt(i)==')'){
                        stack.pop();
                    }
                    else if(stack.peek()=='{' && str.charAt(i)=='}'){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return stack.empty();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(isbalanced(str)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
