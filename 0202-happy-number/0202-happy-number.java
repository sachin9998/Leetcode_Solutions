class Solution {
    public boolean isHappy(int n) {

        int fast = n;
        int slow = n;

        //while loop is not used here because initially slow and 
        //fast pointer will be equal only, so the loop won't run.
        
        do {
            //slow moving one step ahead and fast moving two steps ahead
            slow = square(slow);
            fast = square(square(fast));
        } while (slow != fast);

        // if a cycle exists, then the number is not a happy number
        // and slow will have a value other than 1   
        if(slow == 1) {
            return true;
        }
        
        return false; 
    }

    // Finding Squares of the digits of a number
    public int square(int n) {

        int ans = 0;
        while(n > 0) {
            int digit = n % 10;
            ans = ans + digit * digit;
            n /= 10;
        }

        return ans;
    }
}