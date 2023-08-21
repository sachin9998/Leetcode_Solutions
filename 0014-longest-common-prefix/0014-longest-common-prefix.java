class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        // Sorting strs array
        Arrays.sort(strs); 

        // Comparing first and last string from the given array
        String str1 = strs[0];
        String str2 = strs[strs.length - 1];
        int index = 0;

        while(str1.length() > index && str2.length() > index) {
            if(str1.charAt(index) == str2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }

        String ans = str1.substring(0, index);
        return ans;
    }
}