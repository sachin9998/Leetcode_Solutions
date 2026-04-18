class Solution(object):
    def countDigits(self, num):
        """
        :type num: int
        :rtype: int
        """
        count = 0
        og = num

        while og > 0:
            last = og % 10

            print("last ", last)

            if last != 0 and num % last == 0:
                count += 1

            og //= 10

        return count
        