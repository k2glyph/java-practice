import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws ArithmeticException, InputMismatchException {
        Scanner scan = new Scanner(System.in);
        int x;
        int y;
        try {
            x=scan.nextInt();
            y=scan.nextInt();
        }catch(InputMismatchException ex) {
            System.out.println("java.util.InputMismatchException");
            return;
        }
        try {
            int result = x/y;
            System.out.println(result);
        }catch(ArithmeticException ex) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}
