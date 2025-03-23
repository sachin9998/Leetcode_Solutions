class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> count = new HashMap<>();

        for (char x : s.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        // Decreasing frquency 
        for(char x: t.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) - 1);
        }

        // Check if any char has non
        for(int val : count.values()) {
            if(val != 0) {
                return false;
            }
        }
        
        return true;
    }
}