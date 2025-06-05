class Solution {
    public String reverseWords(String s) {
        // s = s.trim();

        // StringBuilder sb = new StringBuilder();
        // Stack<String> stack = new Stack<>();
    
        // for(int i = 0; i < s.length(); i++) {
        //     if(s.charAt(i) != ' ') {
        //         sb.append(s.charAt(i));
        //     } else if(s.charAt(i) == ' ' && sb.length() > 0) {
        //         stack.push(sb.toString());
        //         sb.setLength(0);
    
        //         while(i + 1 < s.length() && s.charAt(i + 1) == ' ') {
        //             i++;
        //         }
        //     }
        // }
    
        // if (sb.length() > 0) {
        //     stack.push(sb.toString());
        // }
    
        // StringBuilder ans = new StringBuilder();
        // while(!stack.isEmpty()) {
        //     ans.append(stack.pop());
        //     if(!stack.isEmpty()) {
        //         ans.append(" ");
        //     }
        // }
    
        // return ans.toString();


        StringBuilder sb = new StringBuilder();
        int j = s.length();

        for(int i = s.length()-2; i >= -1; i--) {

            if(i != -1 && s.charAt(i) != ' ') {
                continue;
            }

            String substr = s.substring(i+1, j);

            if(!substr.isBlank()) {
                sb.append(substr).append(' ');
            }

           j = i;
        }

        return sb.toString().trim();
    }
}