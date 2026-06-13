class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uni = new HashSet<>();
        for (int i=0; i<nums.length; i++) {
            if(uni.contains(nums[i]))
                return true;
            uni.add(nums[i]);
        }
        return false;
    }
}