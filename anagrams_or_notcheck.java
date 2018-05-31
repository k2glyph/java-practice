
import java.util.*;

public class Solution {

    static boolean isAnagram(String a, String b) {
        if (a == null || b == null || a.length() != b.length()) {
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        HashMap<Character, Integer> aFreq = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            Integer value;
            int j = (value = aFreq.get(a.charAt(i))) != null ? value : 0;
            j++;
            aFreq.put(a.charAt(i), j);
        }
        HashMap<Character, Integer> bFreq = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            Integer value;
            int j = (value = bFreq.get(b.charAt(i))) != null ? value : 0;
            j++;
            bFreq.put(b.charAt(i), j);
        }
        if (aFreq.equals(bFreq)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
