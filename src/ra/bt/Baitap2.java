package ra.bt;

import java.util.Scanner;
import java.util.Stack;

public class Baitap2 {
    // duyệt va loc ca dấu ngoặc
    // ngoặc mở : ( { [
    // ngoặc dóng: ) } ]

    public static void main(String[] args) {

        System.out.println("Nhâp vào chuoi can kiem tra");
        String str = new Scanner(System.in).nextLine();
        System.out.println(checkValidString(str));
    }
    public  static  boolean checkValidString(String string){
        // cách 1 : chia 2 stack
        Stack<Character> stack = new Stack<>();
//        Stack<Character> stack2 = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i)=='('||string.charAt(i)=='{'||string.charAt(i)=='['){
                stack.push(string.charAt(i));
            }
            if (string.charAt(i)==')'||string.charAt(i)=='}'||string.charAt(i)==']'){
               if (stack.empty()) {
                   return false;
               }
               if (!checkMatch(stack.pop(),string.charAt(i))) {
                   return false;
               }
            }
        }
        return stack.empty();

    }
    public static boolean checkMatch(char ch1, char ch2){
        switch (ch1){
            case '(':
                if (ch2==')')
                    return true;
                break;
            case '{':
                if (ch2=='}')
                    return true;
                break;
            case '[':
                if (ch2==']')
                    return true;
                break;
        }
        return false;
    }
}
