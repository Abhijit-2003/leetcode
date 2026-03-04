class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        freq_map = dict()

        for num in nums :
            if num in freq_map.keys() :
                freq_map[num] = freq_map[num] + 1
            else :
                freq_map[num] = 1
        
        majority_element = 0
        max_count = 0
        for key, val in freq_map.items() :
            if val > max_count :
                majority_element = key
                max_count = val

        return majority_element