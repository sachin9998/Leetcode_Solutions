class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }

        boolean ans = false;
        int check = 0;
        int num = x;
        while(x > 0) {
            int digit = x % 10;
            check = check * 10 + digit;
            x = x / 10;
        }

        if(check == num) {
            return true;
        }

        return false;
    }
}