import java.util.Scanner;
class Exercise1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder result=new StringBuilder();
        for(char c : str.toCharArray())
        {
            if (c >= 'a' && c <= 'z') {
                // Wrap for lowercase letters
                result.append((char) ((c - 'a' + 1) % 26 + 'a'));
            } else if (c >= 'A' && c <= 'Z') {
                // Wrap for uppercase letters
                result.append((char) ((c - 'A' + 1) % 26 + 'A'));
            } else {
                // For non-alphabetic characters, keep them unchanged
                result.append(c);
            }
        }
        System.out.println(result);
    }
}
