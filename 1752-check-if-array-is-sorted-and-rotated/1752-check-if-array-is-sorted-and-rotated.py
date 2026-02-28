class Solution:
    def check(self, nums: List[int]) -> bool:
        counter = 0

        for i in range(1, len(nums)) :
            if nums[i] < nums[i-1] :
                counter+= 1

        if nums[len(nums) - 1] > nums[0] : counter+=1

        print(counter)
        return counter <= 1