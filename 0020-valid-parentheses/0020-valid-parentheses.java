class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();

        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for(int i=0; i<s.length(); i++) {
            if(!stack.isEmpty() && map.containsKey(s.charAt(i))) {
                if(stack.peek() != map.get(s.charAt(i))) {
                    return false;
                } else {
                    stack.pop();
                }
            } else {
                stack.push(s.charAt(i));
            }
        }

        return stack.isEmpty();
    }
}