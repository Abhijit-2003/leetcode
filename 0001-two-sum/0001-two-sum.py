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
        freq_map = {}

        for i in range(n) :
            x = target - nums[i]

            if x in freq_map :
                return list([freq_map[x], i])
            else :
                freq_map[nums[i]] = i


        return list()