
import java.util.*;

class Solution {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            char[] arr = input.toCharArray();

            Stack<Character> box = new Stack<>();
            for (int i = 0; i < arr.length; i++) {
                if (!box.isEmpty()) {
                    switch (arr[i]) {
                        case '}':
                            if(box.peek()=='{') {
                                box.pop();
                            }
                            break;
                        case ')':
                            if(box.peek()=='(') {
                                box.pop();
                            }
                            break;
                        case ']':
                            if(box.peek()=='[') {
                                box.pop();
                            }
                            break;
                        default:
                            box.push(arr[i]);
                    }
                } else {
                    box.push(arr[i]);
                }
            }
            System.out.println(box.isEmpty());
        }

    }
}

