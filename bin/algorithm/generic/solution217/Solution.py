from typing import List

class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        existMap = {}
        for num in nums:
            if num in existMap:
                return True
            existMap[num] = True
        return False

def main():
    solution = Solution()
    print(solution.containsDuplicate([7,1,5,3,6,3,4]))

if __name__ == '__main__':
    main()