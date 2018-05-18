import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    // Complete the braces function below.
    static String[] braces(String[] values) {
        boolean isBigOpen=false;
        boolean isCurlyOpen=false;
        boolean isSmallOpen=false;
        System.out.println(values);
        String[] valuesReturn = new String[values.length];
        int j=0;
        for(String value: values) {
            char[] val= value.toCharArray();
            int first=0;
            for(int i=0;i<val.length;i++) {
                if(val[i]=='[') {
                    if(val[i+1] == ']' ||val[val.length-first-1] != ']') {
                        isBigOpen=true;
                        break;
                    }
                }
                if(val[i]=='{') {
                    if(val[i+1] == '}' ||val[val.length-first-1] != '}') {
                        isCurlyOpen=true;
                        break;
                    }
                }
                if(val[i]=='(') {
                    if(val[i+1] == ')' ||val[val.length-first-1] != ')') {
                        isSmallOpen=true;
                        break;
                    }
                }
                first++;
                if(val[i]=='[') isBigOpen=true;
                if(val[i]=='{') isCurlyOpen=true;
                if(val[i]=='(') isSmallOpen=true;
                if(isBigOpen && val[i]==']') isBigOpen=false;
                if(isCurlyOpen && val[i]=='}') isCurlyOpen=false;
                if(isSmallOpen && val[i]==')') isSmallOpen=false;
                int middle=(int)(Math.floor(val.length / 2)); 
                if(val.length % 2==0) middle--;
                if((val[middle]=='[' && val[middle+1]!=']')) isBigOpen=true;
                if((val[middle]=='(' && val[middle+1]!=')')) isSmallOpen=true;
                if((val[middle]=='{' && val[middle+1]!='}')) isCurlyOpen=true;
            }
            int middle=(int)(Math.floor(val.length / 2)); 
            if(val.length % 2==0) middle--;
            if((val[middle]=='[' && val[middle+1]!=']')) isBigOpen=true;
            if((val[middle]=='(' && val[middle+1]!=')')) isSmallOpen=true;
            if((val[middle]=='{' && val[middle+1]!='}')) isCurlyOpen=true;
            
            if(isBigOpen || isCurlyOpen|| isSmallOpen){ valuesReturn[j]="NO";}
            else { valuesReturn[j]="YES"; }
            j++;
        }
        
        return valuesReturn;
    }

 private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int valuesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] values = new String[valuesCount];

        for (int i = 0; i < valuesCount; i++) {
            String valuesItem = scanner.nextLine();
            values[i] = valuesItem;
        }

        String[] res = braces(values);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(res[i]);

            if (i != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
