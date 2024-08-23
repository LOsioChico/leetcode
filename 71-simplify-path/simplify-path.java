import java.util.*;

public class Solution {
    public String simplifyPath(String path) {
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack();

        for(String p : path.split("/")){
            if(p.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            } else if(!p.isEmpty() && !p.equals(".")){
                stack.push(p);
            }
        }

        for(String s : stack){
            sb.append("/");
            sb.append(s);
        }

        return sb.length() == 0 ? "/" : sb.toString();
    }
}
