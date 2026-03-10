class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n = len(nums)
        sum = (n * (n + 1)) / 2
        nums_sum = 0

        for num in nums:
            nums_sum += num

        return int(sum - nums_sum)