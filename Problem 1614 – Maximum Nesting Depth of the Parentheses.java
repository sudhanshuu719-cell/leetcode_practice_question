class Solution {
    public int maxDepth(String s) {
        int currentDepth = 0;
        int maxNested = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                currentDepth++;
                if (currentDepth > maxNested) {
                    maxNested = currentDepth;
                }
            } else if (c == ')') {
                currentDepth--;
            }
        }
        return maxNested;
    }
}
