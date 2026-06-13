class Solution {
    public int majorityElement(int[] nums) {
     int freq = 0;
     int maj = -1;
     for(int i=0; i<nums.length; i++) {
        if(freq == 0) {
            maj = nums[i];
        }
        if(nums[i] == maj) {
            freq += 1;
        } else {
            freq -= 1;
        }
    }
    return maj;   
    }
}