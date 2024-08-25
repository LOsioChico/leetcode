class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack();

        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && c == '*'){
                stack.pop();
            } else if (c != '*') {
                stack.push(c);
            }
        }

        StringBuilder result = new StringBuilder();

        for(char c : stack){
            result.append(c);
        }

        return result.toString();
    }
}