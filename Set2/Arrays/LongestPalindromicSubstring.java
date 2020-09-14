package Arrays;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if(s.length()==0) return "";
        //"babad"
        int len = s.length();
        int end = 0, start = 0;
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = i; j >= 0; j--) {
                boolean check = s.charAt(i) == s.charAt(j);
                if (i == j)
                    dp[i][j] = true;
                 else if (i - j == 1)
                    dp[i][j] = check;
                else if (check && dp[i - 1][j + 1])
                    dp[i][j] = dp[i - 1][j + 1];

                if (dp[i][j] && i - j > end - start) {
                    start = j;
                    end = i;
                }
            }
        }
        return s.substring(start, end + 1);
    }
}
