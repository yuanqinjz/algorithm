class Solution:
    def longestPalindrome(self, s: str) -> str:
        max_len = 1
        left = len(s) - 1
        right = len(s) - 1
        for i in range(len(s) - 1):
            start, end = self.extendFrom(s, i)
            if end - start + 1 > max_len:
                max_len = end - start + 1
                left, right = (start, end)
        return s[left:(right + 1)]
    
    def extendFrom(self, s: str, i: int):
        if s[i] == s[i + 1]:
            as_left_middle = self.extend(s, i, i + 1)
        else:
            as_left_middle = (i, i)
        as_middle = self.extend(s, i, i)
        if as_left_middle[1] - as_left_middle[0] + 1 > as_middle[1] - as_middle[0] + 1:
            return as_left_middle
        else:
            return as_middle

    def extend(self, s: str, i: int, j: int):
        left = i
        right = j
        while left > 0 and right < len(s) - 1:
            if s[left - 1] == s[right + 1]:
                left = left - 1
                right = right + 1
            else:
                break
        return (left, right)

def main():
    solution = Solution()
    print(solution.longestPalindrome('abaab'))

if __name__ == '__main__':
    main()