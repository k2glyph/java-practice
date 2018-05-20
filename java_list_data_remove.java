import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length=scan.nextInt();
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<length;i++) {
            l.add(scan.nextInt());    
        }
        scan.nextLine();
        int queries= scan.nextInt();
        for(int i=0;i<queries;i++) {
            String query=scan.next();
            if(query.equals("Insert")) {
                int index=scan.nextInt();
                int value=scan.nextInt();
                l.add(index, value);
            } 
            if(query.equals("Delete")) {
                int index=scan.nextInt();
                l.remove(index);
            } 
        }
        scan.close();
        for(int i=0;i<l.size();i++) {
            System.out.print(l.get(i)+" ");
        }
        
    }
}
