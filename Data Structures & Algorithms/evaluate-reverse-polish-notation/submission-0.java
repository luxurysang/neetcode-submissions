class Solution {
    public int evalRPN(String[] tokens) {
        if (tokens == null || tokens.length == 0) {
            return -1;
        }

        int result = 0;
        Deque<Integer> strStack = new ArrayDeque<>();

        for (String s : tokens) {
             if ("+".equals(s) || "-".equals(s) || "*".equals(s) || "/".equals(s)) {
                if ("+".equals(s)) {
                    int temp = strStack.pop();
                    strStack.push(temp + strStack.pop());
                }
                if ("-".equals(s)) {
                    int temp = strStack.pop();
                     strStack.push(strStack.pop() - temp);
                }
                if ("*".equals(s)) {
                    int temp = strStack.pop();
                     strStack.push(strStack.pop() * temp);
                }
                if ("/".equals(s)) {
                    int temp = strStack.pop();
                     strStack.push(strStack.pop() / temp);
                }
            } else {
                strStack.push(Integer.parseInt(s));
            }

        }

        return !strStack.isEmpty() ? strStack.pop() : 0;

    }
}
