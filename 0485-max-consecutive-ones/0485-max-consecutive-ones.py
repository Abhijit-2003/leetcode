class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        count = 0
        max_ones = 0

        for num in nums :
            if num > 0 :
                count += 1
                max_ones = max(max_ones, count)
            else :
                count = 0

        return max_ones