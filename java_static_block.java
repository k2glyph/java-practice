import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	static int B;
static int H;
static boolean flag=false;
static{
    Scanner scan = new Scanner(System.in);    
    B = scan.nextInt();
    H = scan.nextInt();
    try {
        if(B<=0 || H<=0)
            throw new Exception("Breadth and height must be positive");
        flag=true; 
    }catch(Exception ex) {
        System.out.println(ex);
    }
    
}
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

