from typing import List
import sys;


class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        min_price = sys.maxsize
        max_profit = 0
        for price in prices:
            max_profit = max(max_profit, price - min_price)
            min_price = min(min_price, price)
        
        return max_profit

def main():
    solution = Solution()
    print(solution.maxProfit([7,1,5,3,6,4]))

if __name__ == '__main__':
    main()