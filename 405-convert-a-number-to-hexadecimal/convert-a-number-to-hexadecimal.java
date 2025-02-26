
class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";

        // Hexadecimal characters map
        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder hex = new StringBuilder();

        // Process all 8 hex digits of a 32-bit number
        while (num != 0) {
            int last4Bits = num & 15;          // Get last 4 bits
            System.out.println(last4Bits);
            hex.append(hexChars[last4Bits]);  // Convert to hex and append
            System.out.println(hexChars[10]);
            num >>>= 4;                       // Unsigned right shift by 4 bits
        }

        System.out.println(hex);
        return hex.reverse().toString(); 
    }
}
