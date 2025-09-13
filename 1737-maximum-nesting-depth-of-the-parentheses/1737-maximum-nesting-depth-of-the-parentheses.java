class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int max = 0;

        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                stack.push('(');
            } else if(ch == ')') {
                stack.pop();
            }
            max = Math.max(max, stack.size());
        }

        return max;
    }
}