import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String reverseOf="";
        
        // first create reverse of string.
        char[] chars = A.toCharArray();
        for(int i=chars.length-1;i>=0;i--) {
            reverseOf +=chars[i];
        }
        if(A.equals(reverseOf)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}



