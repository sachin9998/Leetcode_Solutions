class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """

        if x < 0:
            return False

        temp = x
        num = 0
    
        while x > 0:
            last = x % 10
            num = last + num * 10
            print("checking num", num)
            x = x // 10

        return temp == num