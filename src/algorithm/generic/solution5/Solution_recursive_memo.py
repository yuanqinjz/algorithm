class Solution:    
    def longestPalindrome(self, s: str) -> str:
        max_length = -1
        left = 0
        right = 0
        memo = [ [None for i in range(len(s))] for j in range(len(s))]
        for i in range(len(s)):
            for j in range(i, len(s)):
                isPalindromSubstr = self.isPalindrom(s, i, j, memo)
                if isPalindromSubstr:
                    if max_length < (j - i) + 1 :
                        max_length = (j - i) + 1
                        left = i
                        right = j        
        return s[left:(right + 1)]

    def isPalindrom(self, s: str, start: int, end: int, memo) -> bool:
        res = False
        if (end - start) == 0:
            res = True
        elif s[start] == s[end]:
            if (end - start) == 1:
                res = True
            else:
                if memo[start][end] is not None:
                    res = memo[start][end]
                else:
                    res = self.isPalindrom(s, start + 1, end - 1, memo)
        else:
            res = False
        
        memo[start][end] = res
        return res



def main():
    solution = Solution()
    print(solution.longestPalindrome('abaab'))

if __name__ == '__main__':
    main()