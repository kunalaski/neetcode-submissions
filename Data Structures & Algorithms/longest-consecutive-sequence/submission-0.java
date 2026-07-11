class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int i:nums) {
            numSet.add(i);
        }
        int count = 0;
        int i=0;
        while(i<nums.length) {
            if(!numSet.contains(nums[i]-1)) {
                int curr =  nums[i];
                int currSum = 1;
                while(numSet.contains(curr+1)) {
                    currSum++;
                    curr++;
                }
                count = Math.max(currSum, count);
            }
            i++;
        }
        return count;
    }
}
