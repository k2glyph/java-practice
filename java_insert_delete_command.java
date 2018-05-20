import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length=scan.nextInt();
        int[] l = new int[20];
        for(int i=0;i<length;i++) {
            l[i]=scan.nextInt();
        }
        int queries= scan.nextInt();
        for(int i=0;i<queries;i++) {
            String query=scan.next();
            if(query.equals("Insert")) {
                int index=scan.nextInt();
                int value=scan.nextInt();
                l[index]=value;
            } 
            if(query.equals("Delete")) {
                int index=scan.nextInt();
                for(int j=index;j<length;j++) {
                        l[j]=l[j+1];
                }
            } 
        }
        for(int i=0;i<length;i++) {
            System.out.print(l[i]+" ");
        }
        
    }
}
