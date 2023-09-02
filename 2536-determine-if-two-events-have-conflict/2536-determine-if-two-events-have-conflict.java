class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        
        if (event1 == null || event2 == null)
            return false;
        
        Integer e1Start = Integer.parseInt(event1[0].replace(":",""));
        Integer e1End = Integer.parseInt(event1[1].replace(":",""));
        Integer e2Start = Integer.parseInt(event2[0].replace(":",""));
        Integer e2End = Integer.parseInt(event2[1].replace(":",""));
        
        if (e2End < e1Start)
            return false;
        if (e1End >= e2Start)
            return true;
        
        return false;
    }
}