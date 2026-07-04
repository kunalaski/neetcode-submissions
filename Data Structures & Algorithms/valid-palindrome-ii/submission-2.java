class Solution {
    public boolean validPalindrome(String s) {
        int right = s.length()-1;
        int left = 0;
        while(left<right) {
            if(s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s.substring(left + 1, right+1)) || isPalindrome(s.substring(left, right));
            }

            left++;
            right--;
        }
        return true;

    }

    private static boolean isPalindrome(String s) {
        int right = s.length()-1;
        int left = 0;
        while(left<right) {
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;

    }
}