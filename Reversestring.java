//reverse a string using stack

/*import java.util.Stack;
import java.util.Scanner;
public class Reversestring {
    static String Stringreverse(String str){
        int n=str.length();
        Stack<Character> s=new Stack<>();
        StringBuilder result=new StringBuilder(n);
        for(int i=0;i<n;i++){
            s.push(str.charAt(i));
    
        }
        while(!s.isEmpty()){
            char ch=s.pop();
            result.append(ch);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println( Stringreverse(str));
        
    }
}*/


//reverse an array using stack
/*import java.util.Stack;
import java.util.Scanner;
public class Reversestring{
    static void Arrayreverse(int[] arr){
        Stack<Integer> s=new Stack<>();
        for(int num:arr){
                s.push(num);
        }
        for(int i=0;i<arr.length;i++){
                arr[i]=s.pop();
            
        }
    }
    static void printarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("original array:");
        printarray(arr);
        Arrayreverse(arr);
        System.out.println("reversed array");
        printarray(arr);

        
    }
}*/

//Given two strings string1 and string2, remove those characters from the first 
//string(string1) which are present in the second string(string2). 
//Both strings are different and contain only lowercase characters.
/*import java.util.Scanner;
import java.util.HashSet;
class Reversestring{
    static String reverse(String str1 , String str2){
        HashSet<Character> set=new HashSet<>();
        for(char ch:str2.toCharArray()){
            set.add(ch);
        }
        StringBuilder result=new StringBuilder();
        for(char ch:str1.toCharArray()){
            if(!set.contains(ch)){
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine().toLowerCase();
        String str2=sc.nextLine().toLowerCase();
        System.out.println(reverse(str1, str2));
        sc.close();
    }
}*/

//reverse the stack using queue

/*import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.io.*;
class Reversestring{
    
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        Queue<Integer> q=new LinkedList<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println("original Stack: " + s);
        while(s.isEmpty()==false){
            q.add(s.pop());
        }
        while(q.isEmpty()==false){
            s.push(q.remove());
        }
        System.out.println("reverse Stack: " + s);
    }
}*/

/*import java.util.Stack;
class Reversestring{
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        int n=stack.size();
        if(n%2==0){
            int a=n/2;
            int b=(n-1)/2;
            stack.remove(b);
            stack.remove(b);
        }
        else{
            int a=(n+1)/2;
            stack.remove(a);
        }
        System.out.println(stack);
    }
}*/

//reverse very word
/*import java.util.Stack;
class Reversestring{
    static void reverseWords(String str)
    {
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) != ' '){
                st.push(str.charAt(i));
            }
            else {
                while (st.empty() == false) {
                    System.out.print(st.pop());
                }
                System.out.print(" ");
            }
        }
        while (st.empty() == false) {
            System.out.print(st.pop());
        }
    }
    public static void main(String[] args) {
        String str = "Geeks for Geeks";
        reverseWords(str);
    }
}*/

//stack

import java.util.Scanner;
import java.util.Stack;
class Reversestring{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> s=new Stack<>();
        while(true){
            int n=sc.nextInt();
            if(n==1){
                int a=sc.nextInt();
                s.push(a);
                System.out.println(a + " is pushed into the stack");
            }
            else if(n==2){
                s.pop();
                System.out.println("pop successful");
            }
            else if(n==3){
                System.out.println(s);
            }
            else if(n==4){
                System.out.println("exit program");
                break;
            }
            else{
                System.out.println("invalid number");
            }
        }
        sc.close();
    }
}