class Solution {
    public boolean isPalindrome(String s) {
        boolean ans = false;

        s = s.toLowerCase();
        // System.out.println(s);
        
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))) {
                str.append(s.charAt(i));
            }
        }
        System.out.println(str);

        int start = 0;
        int end = str.length() - 1;

        while(start <= end) {
            if(str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }
        
        return true;
    }
}