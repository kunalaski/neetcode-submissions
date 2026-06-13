class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> strMap = new HashMap<>();

        for (String str : strs) {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            strMap.computeIfAbsent(Arrays.toString(charArr), k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(strMap.values());
    }
}
