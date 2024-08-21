import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if(stack.isEmpty()){
                return false;
            } else {
                char peek = stack.pop();
                if(c == '}' && peek != '{'){
                    return false;
                }
                if(c == ']' && peek != '['){
                    return false;
                }
                if(c == ')' && peek != '('){
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}