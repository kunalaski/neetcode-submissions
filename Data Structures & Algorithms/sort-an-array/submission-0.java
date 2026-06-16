class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length-1);
        return nums;
    }

    public void quickSort(int[] nums, int low, int high) {
        if(low<high) {
            int p = partition(nums, low, high);

            quickSort(nums, p+1, high);
            quickSort(nums, low, p-1);
        }
    }

    public int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low-1;
        
        for (int j=low; j<high; j++) {
            if(nums[j] < pivot) {
                i++;
                swap(nums, i, j);
            }
        }
        i++;
        swap(nums, i, high);
        return i;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}