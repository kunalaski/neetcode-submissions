class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int limit = word1.length() < word2.length() ? word1.length() : word2.length();
        int w1 = 0;
        boolean flag = true;
        while(w1<limit) {
            if (flag) {
                ans.append(word1.charAt(w1));
                flag = false;
            } else {
                ans.append(word2.charAt(w1));
                flag = true;
                w1++;
            }
        }

        ans.append(word1.length() < word2.length() ? word2.substring(limit, word2.length()) : word1.substring(limit, word1.length()));
        return ans.toString();
    }
}