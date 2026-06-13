class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int[] ans = new int[2];

        for (int i=0; i<nums.length; i++) {
            int val = target - nums[i];
            if(numMap.get(val) != null) {
                ans[0] = numMap.get(val);
                ans[1] = i;
                break;
            }
            numMap.put(nums[i], i);
        }
        return ans;
    }
}
