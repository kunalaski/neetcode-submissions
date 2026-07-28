class Solution {
    public int maxArea(int[] heights) {
        if(heights.length <= 1) return 0;
        int left = 0;
        int right = heights.length-1;
        int maxArea = Integer.MIN_VALUE;
        while(left<right) {

            int min = Math.min(heights[left], heights[right]);
            int area = min * (right - left);
            maxArea = Math.max(maxArea, area);
            if(heights[left]>heights[right]) right--;
            else left++;
        }
        return maxArea;
    }
}
