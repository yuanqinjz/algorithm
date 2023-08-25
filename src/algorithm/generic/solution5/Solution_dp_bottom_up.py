'''
This is the bottom up solution.
Build a table which record a substring(i, j) is palindrom
So row means start of substring i, 
col mean end of substring j.
Here i and j are inclusive.
'''
class Solution:
    def longestPalindrome(self, s: str) -> str:
        str_len = len(s)
        cache = [[None for i in range(str_len)] for j in range(str_len)]
        max_len = -1
        index = (0, 0)
        for row in reversed(range(str_len)):
            for col in range(row, str_len):
                if row == col :
                    cache[row][col] = True
                elif s[row] == s[col]:
                    if col - row == 1 :
                        cache[row][col] = True
                    else :
                        cache[row][col] = cache[row + 1][col - 1]
                else:
                    cache[row][col] = False

                if cache[row][col] and (col - row + 1) > max_len:
                    max_len = col - row + 1
                    index = (row, col)
        return s[index[0] : index[1] + 1]


def main():
    solution = Solution()
    print(solution.longestPalindrome('abaab'))

if __name__ == '__main__':
    main()