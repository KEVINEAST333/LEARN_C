package sword_point_offer;

import java.util.Scanner;
import java.util.Stack;

//左右括号匹配
public class isValid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()) {
            String str = scanner.nextLine();
            System.out.println(isValid(str));
        }

    }
    public static boolean isValid(String s) {
        if(s == null) {
            return true;
        }
        char [] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0;i < s.length();i++) {
            if(chars[i] == '(') {
                stack.push(')');
            }
            else if(chars[i] == '[') {
                stack.push(']');
            }
            else if(chars[i] == '{') {
                stack.push('}');
            } else if(stack.isEmpty() ||chars[i] != stack.pop()){
                return false;
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
