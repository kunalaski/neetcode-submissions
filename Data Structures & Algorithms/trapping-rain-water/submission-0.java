class Solution {
    public int trap(int[] height) {
        int water = 0;
        int left = 0;
        int right = height.length-1;
        int maxLeft = height[0];
        int maxRight = height[right];
        while (left<right) {
            if(maxLeft<maxRight) {
                left++;
                if(maxLeft<=height[left]) {
                    maxLeft = height[left];
                } else {
                    water += maxLeft-height[left];
                }
            } else {
                right--;
                if(maxRight<=height[right]) {
                    maxRight = height[right];
                } else {
                    water += maxRight-height[right];
                }
            }
        }
        return water;
    }
}
