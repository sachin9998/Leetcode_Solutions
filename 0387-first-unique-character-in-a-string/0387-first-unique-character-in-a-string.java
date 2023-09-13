class Solution {
    public int firstUniqChar(String s) {
        // Base case...
        if(s.length() == 0)  return -1;
        
        // Track count of each char
        int[] store = new int[26];

        for(char ch : s.toCharArray()){
            store[ch - 'a']++;     
        }

        // Check if char exists and its count = 1
        for(int idx = 0; idx < s.length(); idx++){
            if(store[s.charAt(idx) - 'a'] == 1){
                return idx;
            }
        }
        return -1;      // if no character appeared exactly once...
    }
}