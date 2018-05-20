import java.util.*;
import java.text.*;

public class Solution {
    
    public static String getAmount(String language, String country, double amount) {
        Locale locale=new Locale(language, country);
        Currency currency = Currency.getInstance(locale);
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        String payment=currencyFormatter.format(amount);
        return payment;
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        String us= getAmount("en", "US", payment);
        String india= getAmount("en", "IN", payment);
        String china= getAmount("zh", "CN", payment);
        String france= getAmount("fr", "FR", payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
