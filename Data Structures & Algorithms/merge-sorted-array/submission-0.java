class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0) return;
        if(m==0) {
            int i=0;
            for (int num : nums2) {
                nums1[i] = num;
                i++;
            }
            return;
        }
        int i = nums1.length-1;
        m--;
        n--;
        while(n>=0 && m>=0) {
            if(nums1[m]>nums2[n]) {
                nums1[i] = nums1[m];
                m--;
            } else {
                nums1[i] = nums2[n];
                n--;
            }
            i--;
        }
        while(n>=0) {
            nums1[i] = nums2[n];
            i--;
            n--;
        }
    }
}