class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        if(ransomNote.length() > magazine.length()) {
            return false;
        }
        
        int check[] = new int[26];

        for(int i = 0; i < magazine.length(); i++) {
            int curr = magazine.charAt(i) - 'a';
            check[curr]++;
        }

        boolean ans = true;

        for(int i = 0; i < ransomNote.length(); i++) {

            int curr = ransomNote.charAt(i) - 'a';

            if(check[curr] == 0) {
                return false;
            }

            check[curr]--;
        }

        return ans;
    }
}