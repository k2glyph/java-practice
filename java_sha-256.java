import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;
public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException{
        Scanner scan = new Scanner(System.in);
        String convertTo=scan.next();
        
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] encodedHash = digest.digest(convertTo.getBytes(StandardCharsets.UTF_8));
        StringBuffer hexString = new StringBuffer();
        for (int i=0; i<encodedHash.length;i++) {
            String hex = Integer.toHexString(0xff&encodedHash[i]);
            if(hex.length()==1) hexString.append('0');
            hexString.append(hex);
        }
        System.out.println(hexString.toString());
    }
}