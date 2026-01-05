class Solution {
    public boolean isPalindrome(int x) {
        int copy = x;
        int reverse = 0;
        if(x == 0) {
            return true;
        }
        for(int i = 0; x>0; i++) {
            int lastDigit = x%10;
            x /= 10;
            reverse = reverse * 10 + lastDigit;
        }
        if(reverse == copy) {
            return true;
        }
        return false;
    }
}