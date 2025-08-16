import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EndofLine {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        while(sc.hasNextLine()){
            System.out.println(i + " " + sc.nextLine());
            i++;
        }
    }
}
// hasNextLine is used to seperate a string after end of the line and anf hasNext is used to seperate via space 
//For Lines: Use hasNextLine() to check for more lines and nextLine() to read the line.
//For Tokens: Use hasNext() to check for tokens and next() to retrieve the next token.