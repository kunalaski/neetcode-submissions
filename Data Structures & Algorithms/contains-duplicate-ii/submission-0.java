class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> placeMap = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            Integer pos = placeMap.get(nums[i]);
            if(pos != null && pos>=(i-k)) return true;

            placeMap.put(nums[i], i);
        }
        return false;
    }
}