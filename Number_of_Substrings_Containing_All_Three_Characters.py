class Solution:
    def numberOfSubstrings(self, s: str) -> int:
        count = { 'a': 0, 'b': 0, 'c': 0 }
        left = 0
        result = 0

        for right in range(len(s)):
            count[s[right]] += 1

            while all(count[ch] > 0 for ch in 'abc'): 
                count[s[left]] -= 1
                left += 1  

            result += left  
        return result
s = "abcabc"

solution = Solution()
print(solution.numberOfSubstrings(s))


# Example 1:
# Input: s = "abcabc"
# Output: 10

# Example 2:
# Input: s = "aaacb"
# Output: 3
# Example 3:

# Input: s = "abc"
# Output: 1
 