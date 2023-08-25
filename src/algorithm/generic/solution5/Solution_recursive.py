'''
https://leetcode.com/problems/longest-palindromic-substring
This is recursive version without memo, which has performance issue.
'''
class Solution:
    def longestPalindrome(self, s: str) -> str:
        max_length = -1
        left = 0
        right = 0
        for i in range(len(s)):
            for j in range(i, len(s)):
                isPalindromSubstr = self.isPalindrom(s, i, j)
                if isPalindromSubstr:
                    if max_length < (j - i) + 1 :
                        max_length = (j - i) + 1
                        left = i
                        right = j        
        return s[left:(right+1)]

    def isPalindrom(self, s: str, start: int, end: int) -> bool:
        res = False
        if (end - start) == 0:
            res = True
        elif s[start] == s[end]:
            if (end - start) == 1:
                res = True
            else:
                res = self.isPalindrom(s, start + 1, end - 1)
        else:
            res = False
        return res

def main():
    solution = Solution()
    print(solution.longestPalindrome('abaab'))

if __name__ == '__main__':
    main()