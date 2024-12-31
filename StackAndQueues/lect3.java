package StackAndQueues;

import java.util.*;

public class lect3 {
    public String infixtoPostFix(String s) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        StringBuilder sb = new StringBuilder();

        while (i < s.length()) {

            if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                while (st.isEmpty() == false && st.peek() != '(') {
                    sb.append(st.pop());
                }
                st.pop();
            } else if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                while (st.isEmpty() == false && st.peek() != '(') {
                    sb.append(st.pop());
                }
                st.push(s.charAt(i));
            } else if (s.charAt(i) == '*' || s.charAt(i) == '/') {
                while (st.isEmpty() == false && (st.peek() == '*' || st.peek() == '/')) {
                    sb.append(st.pop());
                }
                st.push(s.charAt(i));
            } else {
                sb.append(s.charAt(i));
            }
        }
        while (st.isEmpty() == false) {
            sb.append(st.pop());
        }
        return sb.toString();
    }
}
