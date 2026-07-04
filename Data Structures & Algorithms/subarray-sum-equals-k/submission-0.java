class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> sumMap = new HashMap<>();
        sumMap.put(0, 1);
        int sum = 0;
        for(int num : nums) {
            sum += num;
            count += sumMap.getOrDefault(sum-k, 0);
            sumMap.merge(sum, 1, Integer::sum);
        }
        return count;

    }
}