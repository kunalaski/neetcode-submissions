class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int a = 0;
        int b = 1;
        int aCnt = 0;
        int bCnt = 0;
        for (int num : nums) {
            if (num == a) aCnt++;
            else if (num == b) bCnt++;
            else if (aCnt == 0) {
                a = num;
                aCnt++;
            }
            else if (bCnt == 0) {
                b = num;
                bCnt++;
            }
            else {
                aCnt--;
                bCnt--;
            }
        }

        List<Integer> result = new ArrayList<>();
        aCnt = 0;
        bCnt = 0;
        for (int i : nums) {
            if (i == a) aCnt++;
            else if (i == b) bCnt++;
        }
        if(aCnt > nums.length/3) result.add(a);
        if(bCnt > nums.length/3) result.add(b);
        return result;

    }
}