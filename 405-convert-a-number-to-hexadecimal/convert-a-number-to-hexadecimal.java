
class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";

     
        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder hex = new StringBuilder();


        while (num != 0) {
            int last4Bits = num & 15;          
            System.out.println(last4Bits);
            hex.append(hexChars[last4Bits]);  
            System.out.println(hexChars[10]);
            num >>>= 4;                       // Unsigned right shift by 4 bits
        }

        System.out.println(hex);
        return hex.reverse().toString(); 
    }
}
