class Solution {
    public void reverseString(char[] s) {
        for(int i = 0; i < s.length / 2; i++){
            char tempChar = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = tempChar;
        } 
    }
}