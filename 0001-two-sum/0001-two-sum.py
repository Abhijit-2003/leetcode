class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # Brute Force Approch

        # n = len(nums)

        # for i in range(n) :
        #     for j in range(i+1, n) :
        #         if (nums[i] + nums[j]) == target :
        #             return list([i, j])
        
        # return list()

        # Optimal Solution 

        n = len(nums)
        d = {}

        for i in range(n) :
            need = target - nums[i]

            if need in d :
                return list([d.get(need), i])
            else :
                d[nums[i]] = i

        return list()