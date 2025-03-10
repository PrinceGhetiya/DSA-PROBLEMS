class Solution {
    public long countOfSubstrings(String word, int k) {
      int[][] freq = new int[2][128];
        freq[0]['a'] = 1;
        freq[0]['e'] = 1;
        freq[0]['i'] = 1;
        freq[0]['o'] = 1;
        freq[0]['u'] = 1;
        
        long response = 0;
        int current = 0, vowels = 0, extraleft = 0;
        for (int right = 0, left = 0; right < word.length(); right++) {
            if (freq[0][word.charAt(right)] == 1) {
                if (++freq[1][word.charAt(right)] == 1) {
                    vowels++;
                }
            } else {
                current++;
            }
            while (current > k) {
                if (freq[0][word.charAt(left)] == 1) {
                    if (--freq[1][word.charAt(left)] == 0) {
                        vowels--;
                    }
                } else {
                    current--;
                }
                left++;
                extraleft = 0;
            }
            while (vowels == 5 && current == k && left < right && freq[0][word.charAt(left)] == 1
                    && freq[1][word.charAt(left)] > 1) {
                extraleft++;
                freq[1][word.charAt(left)]--;
                left++;
            }
            if (vowels == 5 && current == k) {
                response += extraleft + 1;
            }
        }
        
        return response;
    }
}