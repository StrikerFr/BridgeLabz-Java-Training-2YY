package Arrays.Leetcode;

import java.util.*;

public class Leetcode_20 {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='('||c=='{'||c=='[') st.push(c);
            else{
                if(st.isEmpty()) return false;
                char top = st.pop();
                if((c==')'&&top!='(')||
                        (c=='}'&&top!='{')||
                        (c==']'&&top!='['))
                    return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Leetcode_20 solution = new Leetcode_20();
        String s = "()[]{}";
        System.out.println("Is valid: " + solution.isValid(s));
    }
}
