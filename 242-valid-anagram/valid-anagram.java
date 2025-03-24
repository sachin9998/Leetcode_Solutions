class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        int check[] = new int[26];
        
        for(int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i) - 'a';
            check[ch]++;
        }

        for(int j = 0; j < t.length(); j++) {
            int ch = t.charAt(j) - 'a';
            check[ch]--;
        }

        for(int x : check) {
            if(x != 0) {
                return false;
            }
        }

        return true;
    }
}