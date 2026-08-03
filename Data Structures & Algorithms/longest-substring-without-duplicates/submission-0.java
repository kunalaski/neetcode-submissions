class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        int start = 0;
        int len = 0;
        for(int i=0; i<s.length(); i++) {
            Integer pos = charMap.get(s.charAt(i));
            if(pos != null && pos >= start) {
                len = Math.max(len, i-start);
                start = pos+1;
            }
            charMap.put(s.charAt(i), i);
        }
        return Math.max(len, s.length()-start);
    }
}
