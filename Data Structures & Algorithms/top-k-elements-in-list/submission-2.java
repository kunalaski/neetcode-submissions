class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] freqList = new ArrayList[nums.length+1];
        
        freqMap.forEach((key, value) -> {
             if(freqList[value] == null) freqList[value] = new ArrayList<>();
             freqList[value].add(key);
        });
        int[] res = new int[k];
        int j = 0;
        for (int i = freqList.length-1; i>=0; i--) {
            if(freqList[i] != null) {
                for(int val : freqList[i]) {
                    if(j>=k) return res;
                    res[j] = val;
                    j++;
                }
            }
        }

        return res;
    }
}
