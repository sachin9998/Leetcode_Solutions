class Solution(object):
    def subtractProductAndSum(self, n):
        """
        :type n: int
        :rtype: int
        """
        sub = 0
        prod = 1 

        while(n > 0):
            last = n % 10
            sub += last
            prod = prod * last;
            n = n // 10
        
        return prod - sub