class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        ans = [0] * len(nums)

        counter = 0
        for num in nums :
            if num > 0:
                ans[counter] = num
                counter += 2

        counter2 = 1
        for num in nums :
            if num < 0 :
                ans[counter2] = num
                counter2 += 2

        return ans