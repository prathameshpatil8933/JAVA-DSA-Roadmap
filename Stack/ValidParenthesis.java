//Link : https://leetcode.com/problems/valid-parentheses/description/ 
//Brute Force 
class Solution {
    public boolean isValid(String s) {
    StringBuilder sb = new StringBuilder(s);
        boolean found;
        do{
            found=false;
            int i=0;
            while(i<sb.length()-1){
                String pair=sb.substring(i,i+2);
            if (pair.equals("()") || pair.equals("[]") || pair.equals("{}")) {
                sb.delete(i,i+2);
                found=true;
                break;
            }
            i++;
            }



        }while(found);
        
    return sb.length()==0;
    }
}

//Optimized Approach
class Solution {
public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) { // c = current character
        if (c == '(' || c == '[' || c == '{') {
            stack.push(c);
        } else {
            // KILL 1: Closing bracket with empty stack
            if (stack.isEmpty()) return false; 
            
            char top = stack.pop();
            // KILL 2: Type mismatch
            if ((c == ')' && top != '(') || 
                (c == ']' && top != '[') || 
                (c == '}' && top != '{')) {
                return false;
            }
        }
    }
    // KILL 3: Unclosed opening brackets
    return stack.isEmpty(); 
}
}
