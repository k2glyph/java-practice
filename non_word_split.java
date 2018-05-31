import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] split=s.split("[\\W]+");
        System.out.println(split.length);
        for(String a: split) {
            System.out.println(a);    
        }
        scan.close();
    }
}

