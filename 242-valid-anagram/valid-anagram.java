class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        // Convert Strings into array
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        System.out.println(s1);
        System.out.println(s2);

        return Arrays.equals(s1, s2); 
    }
}