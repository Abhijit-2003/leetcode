class Solution {
    public String reverseWords(String s) {
        s = s.trim();

        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>();
    
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
            } else if(s.charAt(i) == ' ' && sb.length() > 0) {
                stack.push(sb.toString());
                sb.setLength(0);
                // skip multiple spaces
                while(i + 1 < s.length() && s.charAt(i + 1) == ' ') {
                    i++;
                }
            }
        }
    
        if (sb.length() > 0) {
            stack.push(sb.toString());
        }
    
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()) {
            ans.append(stack.pop());
            if(!stack.isEmpty()) {
                ans.append(" ");
            }
        }
    
        return ans.toString();
    }
}